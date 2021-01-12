package tkhub.project.kesbewa.ui.fragment

import android.app.Activity
import android.app.Dialog
import android.content.DialogInterface
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.GravityCompat
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.navigation.fragment.NavHostFragment
import coil.api.load
import coil.transform.CircleCropTransformation
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.dialog_quantity.*
import kotlinx.android.synthetic.main.fragment_cart.*
import kotlinx.android.synthetic.main.fragment_cart.view.*
import kotlinx.android.synthetic.main.fragment_cart.view.imageview_navigation
import kotlinx.android.synthetic.main.item_navigation.view.*
import kotlinx.android.synthetic.main.nav_header.view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.model.CartItem
import tkhub.project.kesbewa.data.model.NetworkError
import tkhub.project.kesbewa.data.responsmodel.CartResult
import tkhub.project.kesbewa.databinding.FragmentCartBinding
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.ui.activity.home.HomeActivity
import tkhub.project.kesbewa.ui.adapters.CartItemAdapter
import tkhub.project.kesbewa.viewmodels.cart.CartViewModel

class CartFragment : Fragment() {

    lateinit var binding: FragmentCartBinding
    private val viewmodel: CartViewModel by viewModels{ CartViewModel.LiveDataVMFactory }

    var alertDialog: AlertDialog? = null
    var singUpDialog: AlertDialog? = null

    private val adapter = CartItemAdapter()
    lateinit var dialogStockProductQty: Dialog

    lateinit var selectedCartItem : CartItem
    val activityScope = CoroutineScope(Dispatchers.Main)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_cart, container, false)
        trasperat()
        binding.cartDetails = viewmodel

        AppPrefs.setIntKeyValuePrefs(context!!, AppPrefs.KEY_FRAGMENT_ID, 6)

        (activity as HomeActivity).setDrawer()


        binding.root.imageview_navigation.setOnClickListener {
            (activity as HomeActivity).openDrawer()
        }

        binding.root.recyclerView_cart_items.adapter = adapter
        adapter.setOnItemClickListener(object : CartItemAdapter.ClickListener {
            override fun onClick(selectedProduct: CartItem, aView: View) {
                when (aView.id) {
                    R.id.textview_btn_addmore -> {
                        selectedCartItem = selectedProduct
                        if (::dialogStockProductQty.isInitialized) {
                            if (!dialogStockProductQty.isShowing) {
                                dialogStockProductQty.show()
                            }
                        } else {
                            dialogProductQty()
                        }
                    }
                    R.id.textview_btn_remove -> {
                        if (!viewmodel.removeCartItem.hasObservers()) {
                            removeCartObserver()
                        }
                       viewmodel.removeCart(selectedProduct)
                    }
                }
            }

        })





        viewmodel.itemCount.observe(this){count ->
            viewmodel.updateitemCountUI(count)
        }

        viewmodel.subtotal.observe(this){total ->
         viewmodel.updateSubTotalUI(total!!)
        }




        return binding.root
    }

    override fun onResume() {
        if (!viewmodel.cartItems.hasObservers()) {
            cartItemsObserver()
        }
        viewmodel.getCartItems()

        if (!viewmodel.userTypeCheckStatus.hasObservers()) {
            userTypeCheckObserver()
        }


        super.onResume()
    }

    override fun onStop() {
        viewmodel.cartItems.removeObservers(viewLifecycleOwner)
        viewmodel.removeCartItem.removeObservers(viewLifecycleOwner)
        viewmodel.updateCartItem.removeObservers(viewLifecycleOwner)
        viewmodel.userTypeCheckStatus.removeObservers(viewLifecycleOwner)

        super.onStop()
    }

    private fun cartItemsObserver() {

        viewmodel.cartItems.observe(viewLifecycleOwner, Observer {
            adapter.notifyDataSetChanged()
            when (it) {
                is CartResult.Success -> {
                    adapter.submitList(it.data, Runnable {
                        activityScope.launch {
                            delay(1500)
                            if(!binding.root.constraintLayout3.isVisible){
                                binding.root.constraintLayout3.visibility = View.VISIBLE
                            }
                            if(!binding.root.constraintLayout6.isVisible){
                                binding.root.constraintLayout6.visibility = View.VISIBLE
                            }
                        }
                    })
                }
                is CartResult.Empty -> {
                    Toast.makeText(
                        activity,
                        "No Cart Items",
                        Toast.LENGTH_LONG
                    ).show()
                    adapter.submitList(emptyList())
                    binding.root.constraintLayout3.visibility = View.GONE
                    binding.root.constraintLayout6.visibility = View.GONE
                }
            }
        })
    }

    private fun removeCartObserver(){
        viewmodel.removeCartItem.observe(viewLifecycleOwner, Observer {
            if(it.errorStatus){
                errorAlertDialog(it)
            }else{
                Toast.makeText(
                    activity,
                    it.errorMessage,
                    Toast.LENGTH_LONG
                ).show()
                adapter.notifyDataSetChanged()
                if (!viewmodel.cartItems.hasObservers()) {
                    cartItemsObserver()
                }
                viewmodel.getCartItems()
            }

        })

    }

    private fun updateCartObserver(){
        viewmodel.updateCartItem.observe(viewLifecycleOwner, Observer {
            if(it.errorStatus){
                errorAlertDialog(it)
            }else{

                if (!viewmodel.cartItems.hasObservers()) {
                    cartItemsObserver()
                }
                viewmodel.getCartItems()
                Toast.makeText(
                    activity,
                    it.errorMessage,
                    Toast.LENGTH_LONG
                ).show()
            }
        })
    }
    private fun userTypeCheckObserver(){
        viewmodel.userTypeCheckStatus.observe(viewLifecycleOwner, Observer {
            if(it==1){
                if (singUpDialog != null) {
                    if (singUpDialog!!.isShowing) {
                        singUpDialog!!.dismiss()
                    }
                }
                singUpDialog = activity?.let {
                    val builder = AlertDialog.Builder(it)
                    builder.setTitle("Sing Up")
                    builder.setMessage("Please sign up to complete your order !")
                    builder.setCancelable(false)
                    builder.apply {
                        setPositiveButton(
                            "SIGN UP",
                            DialogInterface.OnClickListener { _, _ ->

                                goToRegistor()
                                return@OnClickListener

                            })
                    }
                    builder.create()
                    builder.show()

                } ?: throw IllegalStateException("Activity cannot be null")
            }
        })
    }






    private fun goToRegistor(){
        NavHostFragment.findNavController(this).navigate(R.id.fragmentCartToSingUp)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        trasperat()
    }


    private fun errorAlertDialog(networkError: NetworkError) {
        if (alertDialog != null) {
            if (alertDialog!!.isShowing) {
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



    private fun dialogProductQty() {
        dialogStockProductQty = Dialog(context as Activity)
        dialogStockProductQty.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialogStockProductQty.window!!.setBackgroundDrawableResource(android.R.color.transparent)
        dialogStockProductQty.setContentView(R.layout.dialog_quantity)
        dialogStockProductQty.setCancelable(true)
        dialogStockProductQty.image_view_btn_add_qty.setOnClickListener() {

            var qty = dialogStockProductQty.editText_qty.text.toString().toInt()
            var tot = qty*selectedCartItem.pro_price!!

            selectedCartItem.pro_total_qty =  qty
            selectedCartItem.pro_total_price =tot

            if (!viewmodel.updateCartItem.hasObservers()) {
               updateCartObserver()
            }


            viewmodel.updateCart(selectedCartItem)

            dialogStockProductQty.dismiss()
        }
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
