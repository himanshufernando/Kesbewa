package tkhub.project.kesbewa.ui.fragment

import android.app.Activity
import android.app.Dialog
import android.content.DialogInterface
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.*
import android.view.animation.AnimationUtils
import android.view.inputmethod.EditorInfo
import android.widget.MediaController
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.observe
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.youtube.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import kotlinx.android.synthetic.main.dialog_bottomsheet_cart.view.*
import kotlinx.android.synthetic.main.dialog_quantity.*
import kotlinx.android.synthetic.main.fragment_product_detail.view.*
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.model.*
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.data.responsmodel.OrderResult
import tkhub.project.kesbewa.databinding.DialogQuantityBinding
import tkhub.project.kesbewa.databinding.FragmentProductDetailBinding
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.services.network.InternetConnection
import tkhub.project.kesbewa.ui.activity.home.HomeActivity
import tkhub.project.kesbewa.ui.adapters.ProductsColorAdapter
import tkhub.project.kesbewa.ui.adapters.ProductsImagesAdapter
import tkhub.project.kesbewa.ui.adapters.ProductsLargeImagesAdapter
import tkhub.project.kesbewa.ui.adapters.ProductsSizeAdapter
import tkhub.project.kesbewa.viewmodels.home.HomeViewModel
import java.util.*


/**
 * A simple [Fragment] subclass.
 */
class ProductDetailFragment : Fragment() {

    var alertDialog: AlertDialog? = null
    var singUpDialog: AlertDialog? = null

    val adapter = ProductsImagesAdapter()
    val adapterSize = ProductsSizeAdapter()
    val adapterColor = ProductsColorAdapter()

    val adapterLargeImages = ProductsLargeImagesAdapter()

    lateinit var media: MediaController

    lateinit var binding: FragmentProductDetailBinding
    lateinit var bindingQtyDialog: DialogQuantityBinding


    lateinit var dialogStockProductQty: Dialog

    private val viewmodel: HomeViewModel by viewModels { HomeViewModel.LiveDataVMFactory }
    lateinit var selectedProdect: Products


    var currentImageItem= 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        selectedProdect = arguments?.getParcelable<Products>("Product")!!
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_product_detail, container, false)
        binding.productDetails = viewmodel
        binding.product = selectedProdect



        AppPrefs.setIntKeyValuePrefs(context!!, AppPrefs.KEY_FRAGMENT_ID, 5)



        (activity as HomeActivity).setDrawer()
        binding.root.imageview_navigation.setOnClickListener {
            (activity as HomeActivity).openDrawer()
        }


        var bottomSheetBehavior = BottomSheetBehavior.from(binding.root.bottom_sheet_layout)

        binding.root.recyclerView_product_large_images.adapter = adapterLargeImages
           binding.root.recyclerView_product_images.adapter = adapter
        binding.root.recyclerView_product_size.adapter = adapterSize
        binding.root.recyclerView_product_color.adapter = adapterColor
        if (!InternetConnection.checkInternetConnection()) {
            Toast.makeText(
                activity,
                "No internet connection, check your connection and try again.",
                Toast.LENGTH_LONG
            ).show()
        }


        binding.root.fab_cart.setOnClickListener {

            if (viewmodel.selectedProduct.value?.sold_out!!) {
                Toast.makeText(
                    activity,
                    "Sorry this product is sold out.",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                if (bottomSheetBehavior.state != BottomSheetBehavior.STATE_EXPANDED) {
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED)
                } else {
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED)
                }
            }


        }

        viewmodel.productSelectedImage.observe(this) { value ->
            //   binding.root.imageView_product_image.scaleType = ImageView.ScaleType.CENTER_CROP
            // binding.root.imageView_product_image.load(value)

        }


        viewmodel.productSize.observe(this) { value ->
            addProductSize(value)
        }

        viewmodel.productColor.observe(this) { value ->
            addProductColor(value)
        }

        viewmodel.productSelectedColor.observe(this) { value ->
            if (!binding.root.constraint_layout_parent_selected_color.isVisible) {
                binding.root.constraint_layout_parent_selected_color.visibility = View.VISIBLE
            }
            if (value.color_code.equals("FFFFFF", true)) {
                binding.root.constraint_layout_parent_selected_color.setBackgroundColor(
                    Color.parseColor(
                        "#000000"
                    )
                )
            } else {
                binding.root.constraint_layout_parent_selected_color.setBackgroundColor(
                    Color.parseColor(
                        "#${value.color_code}"
                    )
                )
            }


            binding.root.constraint_layout_selected_color.setBackgroundColor(Color.parseColor("#${value.color_code}"))

        }

        binding.root.textview_qty_layout.setOnClickListener {
            if (::dialogStockProductQty.isInitialized) {
                if (!dialogStockProductQty.isShowing) {
                    dialogStockProductQty.show()
                }
            } else {
                dialogProductQty()
            }

        }

        viewmodel.productSizeUpdate.observe(this) { value ->
            if (!binding.root.constraint_layout_selected_size.isVisible) {
                binding.root.constraint_layout_selected_size.visibility = View.VISIBLE
            }
            binding.root.textview_selected_size.text = value.size!!.toUpperCase(Locale.ROOT)
        }



        viewmodel.totalAmountUpdate.observe(this) { amount ->
        }


        viewmodel.cartCount.observe(this) { count ->
            viewmodel.updateCartCountUI(count)
        }




        binding.root.textview_addtocart.setOnEditorActionListener { v, actionId, event ->
            actionId == EditorInfo.IME_ACTION_DONE
        }



        binding.root.textview_addtocart.setOnClickListener {
            if (!viewmodel.addToCart.hasObservers()) {
                addToCartObserver()
            }
            viewmodel.addToCart()
        }







        binding.root.recyclerView_product_large_images.addOnScrollListener(object :
            RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                var lastCompletelyVisibleItemPosition =
                    (recyclerView.layoutManager as LinearLayoutManager?)!!.findLastVisibleItemPosition()
                var listCount = adapterLargeImages.currentList.size
                currentImageItem= (lastCompletelyVisibleItemPosition + 1)
                if (currentImageItem == 1) {
                    binding.root.cl_pro_image_left.visibility = View.GONE
                } else if (currentImageItem == listCount) {
                    binding.root.cl_pro_image_right.visibility = View.GONE
                } else {
                    if (!binding.root.cl_pro_image_right.isVisible) {
                        binding.root.cl_pro_image_right.visibility = View.VISIBLE
                    }
                    if (!binding.root.cl_pro_image_left.isVisible) {
                        binding.root.cl_pro_image_left.visibility = View.VISIBLE
                    }
                }
            }
        })


        binding.root.cl_pro_image_right.setOnClickListener{
            binding.root.recyclerView_product_large_images.smoothScrollToPosition(currentImageItem)
        }
        binding.root.cl_pro_image_left.setOnClickListener{
            binding.root.recyclerView_product_large_images.smoothScrollToPosition(currentImageItem-2)
        }


        return binding.root

    }


    override fun onResume() {
        if (!viewmodel.userTypeCheckStatus.hasObservers()) {
            userTypeCheckObserver()
        }
        viewmodel.updateCartCount()


        viewmodel.setProductDetails(selectedProdect)
        viewmodel.productSelectedImage.value = selectedProdect.pro_cover_img.toString()




        if(selectedProdect.pro_video.isNullOrEmpty()){
            binding.root.rl_2.visibility = View.GONE
        }else{
            binding.root.rl_2.visibility = View.VISIBLE

            binding.root.youtube_player_view.addYouTubePlayerListener(object :
                AbstractYouTubePlayerListener() {
                fun onReady(youTubePlayer: YouTubePlayer) {
                    val videoId = "PA66nEJYaAU"
                    youTubePlayer.loadVideo(videoId, 0)
                }
            })

        }




        if (!viewmodel.getProductImagesResponse.hasObservers()) {
            getProductImagesbserver()
        }
        viewmodel.callGetProductImages(selectedProdect.pro_id!!)

        if (!viewmodel.getProductSizeResponse.hasObservers()) {
            getProductSizeObserver()
        }
        viewmodel.callGetProductSize(selectedProdect.pro_id!!)


        if (!viewmodel.getProductColorResponse.hasObservers()) {
            getProductColorObserver()
        }
        viewmodel.callGetProductColor(selectedProdect.pro_id!!)

        super.onResume()

    }

    override fun onStop() {
        viewmodel.addToCart.removeObservers(viewLifecycleOwner)
        viewmodel.userTypeCheckStatus.removeObservers(viewLifecycleOwner)
        viewmodel.getProductColorResponse.removeObservers(viewLifecycleOwner)
        viewmodel.getProductSizeResponse.removeObservers(viewLifecycleOwner)
        viewmodel.getProductImagesResponse.removeObservers(viewLifecycleOwner)


        super.onStop()
    }


    private fun addToCartObserver() {
        viewmodel.addToCart.observe(viewLifecycleOwner, Observer {
            when (it) {
                is OrderResult.Success -> {
                    Toast.makeText(
                        activity,
                        "Item added successfully",
                        Toast.LENGTH_LONG
                    ).show()
                    animation()
                    viewmodel.updateCartCount()
                }
                is OrderResult.Failure -> {
                    Toast.makeText(
                        activity,
                        it.error.errorMessage,
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        })
    }


    private fun userTypeCheckObserver() {

        viewmodel.userTypeCheckStatus.observe(viewLifecycleOwner, Observer {
            if (it == 1) {
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

    private fun getProductColorObserver() {
        viewmodel.getProductColorResponse.observe(viewLifecycleOwner, Observer {
            when (it) {
                is KesbewaResult.Success -> {
                    viewmodel.productColor.value = it.data
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


    private fun getProductSizeObserver() {
        viewmodel.getProductSizeResponse.observe(viewLifecycleOwner, Observer {
            when (it) {
                is KesbewaResult.Success -> {
                    viewmodel.productSize.value = it.data
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


    private fun getProductImagesbserver() {
        viewmodel.getProductImagesResponse.observe(viewLifecycleOwner, Observer {
            when (it) {
                is KesbewaResult.Success -> {
                    addProductDetailsToUI(it.data)
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


    private fun goToRegistor() {
        NavHostFragment.findNavController(this).navigate(R.id.fragmentProductToRegistor)
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

    private fun addProductDetailsToUI(productimageList: ArrayList<ProductImage>) {
          adapter.submitList(productimageList)
           adapter.setOnItemClickListener(object : ProductsImagesAdapter.ClickListener {
               override fun onClick(product: ProductImage, aView: View) {

               }
           })


        adapterLargeImages.submitList(productimageList)

    }


    private fun addProductSize(productSizeList: ArrayList<ProductSize>) {
        adapterSize.submitList(productSizeList)
        if(productSizeList.size==1){
            viewmodel.updateProductSelectedSize(productSizeList[0])
        }

        adapterSize.setOnItemClickListener(object : ProductsSizeAdapter.ClickListener {
            override fun onClick(selectedSizeProduct: ProductSize, aView: View) {
                viewmodel.updateProductSelectedSize(selectedSizeProduct)
            }
        })

    }

    private fun addProductColor(productColorList: ArrayList<ProductColor>) {
        adapterColor.submitList(productColorList)
        if(productColorList.size==1){
            viewmodel.productSelectedColor.value = productColorList[0]
        }

        adapterColor.setOnItemClickListener(object : ProductsColorAdapter.ClickListener {
            override fun onClick(selectedColorProduct: ProductColor, aView: View) {
                viewmodel.productSelectedColor.value = selectedColorProduct
            }
        })
    }

    private fun animation() {

        var shake = AnimationUtils.loadAnimation(activity, R.anim.shake)
        binding.root.imageView55.animation = shake

    }


    private fun dialogProductQty() {
        dialogStockProductQty = Dialog(context as Activity)
        dialogStockProductQty.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialogStockProductQty.window!!.setBackgroundDrawableResource(android.R.color.transparent)
        dialogStockProductQty.setContentView(R.layout.dialog_quantity)
        dialogStockProductQty.setCancelable(true)
        dialogStockProductQty.show()
        dialogStockProductQty.editText_qty.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                try {
                    viewmodel.quantityAdd(s.toString().toInt())
                } catch (numb: NumberFormatException) {
                }
            }
        })

        dialogStockProductQty.image_view_btn_add_qty.setOnClickListener { dialogStockProductQty.dismiss() }

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