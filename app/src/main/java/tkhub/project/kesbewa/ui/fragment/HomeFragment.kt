package tkhub.project.kesbewa.ui.fragment


import android.app.Activity
import android.content.DialogInterface
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment


import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.fragment_home.view.imageview_navigation
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.model.NetworkError
import tkhub.project.kesbewa.data.model.Products
import tkhub.project.kesbewa.data.model.YoutubeVideoItem
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.databinding.FragmentHomeBinding
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.services.Perfrences.YoutubeConnector
import tkhub.project.kesbewa.services.network.InternetConnection
import tkhub.project.kesbewa.ui.activity.home.HomeActivity
import tkhub.project.kesbewa.ui.adapters.ProductsAdapter
import tkhub.project.kesbewa.viewmodels.home.HomeViewModel

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {


    var alertDialog: AlertDialog?= null

    lateinit var binding: FragmentHomeBinding
    private val viewmodel: HomeViewModel by viewModels{ HomeViewModel.LiveDataVMFactory }

    private val adapter = ProductsAdapter()

    lateinit var youtubeconnector: YoutubeConnector

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        binding.products = viewmodel

        AppPrefs.setIntKeyValuePrefs(context!!, AppPrefs.KEY_FRAGMENT_ID, 4)

        (activity as HomeActivity).setDrawer()


        binding.root.imageview_navigation.setOnClickListener {
            (activity as HomeActivity).openDrawer()
        }


        binding.root.recyclerView_products.adapter = adapter
        adapter.setOnItemClickListener(object : ProductsAdapter.ClickListener {
            override fun onClick(selectedProduct: Products, aView: View) {
                val bundle = bundleOf("Product" to selectedProduct)
                NavHostFragment.findNavController(requireParentFragment())
                    .navigate(R.id.fragmentProductToProductContent, bundle)

            }
        })



        binding.root.autoCompleteTextView.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
            }
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
            }
            override fun afterTextChanged(editable: Editable) {
             viewmodel.searchProducts(editable.toString())
            }
        })

        viewmodel.productList.observe(this) { value -> }

        viewmodel.filterdProductList.observe(viewLifecycleOwner){news ->
            news.onSuccess {it -> adapter.submitList(it)
            }
            news.onFailure {it }
        }
        viewmodel.updateCartCount()
        viewmodel.cartCount.observe(this){count ->
            viewmodel.updateCartCountUI(count)
        }

        youtubeconnector = YoutubeConnector()

    /*    GlobalScope.launch(Dispatchers.Default) {
            youtubeSearchFragment(youtubeconnector.search("Mage Hita"))
        }
*/



        return binding.root
    }
    private fun youtubeSearchFragment(searchlist: List<YoutubeVideoItem>) {
        activity?.runOnUiThread(java.lang.Runnable {

            println("ssssssssssssssssssssss searchlist : "+searchlist)


        })

    }



    override fun onResume() {
        super.onResume()

        if (!InternetConnection.checkInternetConnection()) {
            Toast.makeText(
                activity,
                "No internet connection, check your connection and try again.",
                Toast.LENGTH_LONG
            ).show()
        }

        if (!viewmodel.getProductResponse.hasObservers()) {
            getProductObserver()
        }
        viewmodel.callGetProduct()

    }

    override fun onStop() {
        viewmodel.getProductResponse.removeObservers(viewLifecycleOwner)

        super.onStop()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        trasperat()

    }

    fun getProductObserver(){
        viewmodel.getProductResponse.observe(viewLifecycleOwner, Observer {
            when (it) {
                is KesbewaResult.Success -> {
                    viewmodel.productList.value = it.data
                    var sort = it.data.sortBy { it.pro_sort }
                    println("ssssssssssssssssssssssssssssssssssssssssssss "+it.data)

                    adapter.submitList(it.data)
                }
                is KesbewaResult.ExceptionError.ExError -> {
                    Toast.makeText(
                        activity,
                        it.exception.message,
                        Toast.LENGTH_SHORT
                    ).show()
                }
                is KesbewaResult.LogicError.LogError -> {
                    errorAlertDialog(it.exception)
                }
            }

        })

    }




    private fun errorAlertDialog(networkError: NetworkError) {
        if(alertDialog!=null){
            if(alertDialog!!.isShowing){
                alertDialog!!.dismiss()
            }
        }
        alertDialog = activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle(networkError.errorTitle)
            builder.setMessage(networkError.errorMessage)
            builder.setCancelable(false)
            builder.apply {
                setPositiveButton(
                    R.string.ok,
                    DialogInterface.OnClickListener { _, _ -> return@OnClickListener })
            }
            builder.create()
            builder.show()

        } ?: throw IllegalStateException("Activity cannot be null")


    }


    private fun trasperat() {
        if (Build.VERSION.SDK_INT in 19..20) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true)
        }
        if (Build.VERSION.SDK_INT >= 19) {
            activity?.window!!.decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false)
            activity?.window!!.statusBarColor = Color.TRANSPARENT
        }
    }

    private fun setWindowFlag(bits: Int, on: Boolean) {
        val win = activity?.window
        val winParams = win?.attributes
        if (on) {
            winParams!!.flags = winParams.flags or bits
        } else {
            winParams!!.flags = winParams.flags and bits.inv()
        }
        win.attributes = winParams
    }



}
