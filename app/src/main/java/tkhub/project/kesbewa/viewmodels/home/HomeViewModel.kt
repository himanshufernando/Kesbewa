package tkhub.project.kesbewa.viewmodels.home

import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.databinding.ObservableField
import androidx.lifecycle.*
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import tkhub.project.kesbewa.Kesbewa
import tkhub.project.kesbewa.data.db.AppDatabase
import tkhub.project.kesbewa.data.db.OrderDao
import tkhub.project.kesbewa.data.model.*
import tkhub.project.kesbewa.repo.HomeRepo
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.data.responsmodel.OrderResult
import tkhub.project.kesbewa.services.Perfrences.AppPrefs

class HomeViewModel(dataDao: OrderDao, context: Context) : ViewModel() {


    var mContext = context
    var repo = HomeRepo(dataDao)


    var textProductName = ObservableField<String>()
    var textProductPrice = ObservableField<String>()
    var textProductDetails = ObservableField<String>()
    var textProductQty = ObservableField<String>()
    var textProductCode = ObservableField<String>()


    var totalAmount = ObservableField<String>()
    var textCartCount = ObservableField<String>()
    val isCartVisible = ObservableField<Boolean>()


    var isProductLoaderVisible = ObservableField<Boolean>()
    var isProductDetailsLoaderVisible= ObservableField<Boolean>()

    val productSelectedQty: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val selectedProduct: MutableLiveData<Products> by lazy { MutableLiveData<Products>() }


    private val _userPreferencesProducts = MutableLiveData<String>()
    val userPreferencesProducts: LiveData<String> = _userPreferencesProducts

    private val _totalQty = MutableLiveData<Int>()
    val totalQty: LiveData<Int> = _totalQty


    private val _addToCartStatus = MutableLiveData<Int>()
    val addToCartStatus: LiveData<Int> = _addToCartStatus

    private val _productSizeUpdate = MutableLiveData<ProductSize>()
    val productSizeUpdate: LiveData<ProductSize> = _productSizeUpdate

    private val _cartCountUpdateStatus = MutableLiveData<Int>()
    val cartCountUpdateStatus: LiveData<Int> = _cartCountUpdateStatus

    private val _userTypeCheckStatus = MutableLiveData<Int>()
    val userTypeCheckStatus: LiveData<Int> = _userTypeCheckStatus


    private val _getProducts = MutableLiveData<Int>()
    val getProducts: LiveData<Int> = _getProducts

    private val _getProductsColor = MutableLiveData<Long>()
    val getProductsColor: LiveData<Long> = _getProductsColor


    private val _getProductsSize = MutableLiveData<Long>()
    val getProductsSize: LiveData<Long> = _getProductsSize

    private val _getProductsImages = MutableLiveData<Long>()
    val getProductsImages: LiveData<Long> = _getProductsImages


    private val _deleteAllUpdateStatus = MutableLiveData<Int>()
    val deleteAllUpdateStatus: LiveData<Int> = _deleteAllUpdateStatus

    private val _validateGoogleSignInCall = MutableLiveData<User>()
    val validateGoogleSignInCall: LiveData<User> = _validateGoogleSignInCall


    private val _checkPush = MutableLiveData<Int>()
    val checkPush: LiveData<Int> = _checkPush



    var totValue = 0.0

    init {
        totalAmount.set("0.0")
        productSelectedQty.value = 0
        _cartCountUpdateStatus.value = 55
        isProductLoaderVisible.set(true)
    }



     suspend fun getOrderConfig(){
         repo.getOrderConfig()
    }





    fun callGetProduct(){
        _getProducts.value =(1..1000).random()
    }
    fun callGetProductColor(proid : Long){
        _getProductsColor.value =proid
    }

    fun callGetProductSize(proid : Long){
        _getProductsSize.value =proid
    }

    fun callGetProductImages(proid : Long){
        _getProductsImages.value =proid
    }






    val getProductImagesResponse = getProductsImages.switchMap {id->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {
                var proRes = repo.getProductsImages(id)
                proRes.collect { value ->
                    isProductDetailsLoaderVisible.set(false)
                    if (value == null) {
                        emit(KesbewaResult.LogicError.LogError(AppPrefs.errorSomethingWentWrong()))
                    } else {
                        emit(KesbewaResult.Success(value))
                    }
                }
            } catch (ex: Exception) {
                isProductDetailsLoaderVisible.set(false)
                emit(KesbewaResult.ExceptionError.ExError(ex))
            }
        }
    }



    val getProductSizeResponse = getProductsSize.switchMap {id->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {
                var proRes = repo.getProductsSize(id)
                proRes.collect { value ->
                    if (value == null) {
                        emit(KesbewaResult.LogicError.LogError(AppPrefs.errorSomethingWentWrong()))
                    } else {
                        emit(KesbewaResult.Success(value))
                    }
                }
            } catch (ex: Exception) {
                emit(KesbewaResult.ExceptionError.ExError(ex))
            }
        }
    }




    val getProductColorResponse = getProductsColor.switchMap {id->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {
                var proRes = repo.getProductsColor(id)
                proRes.collect { value ->
                    if (value == null) {
                        emit(KesbewaResult.LogicError.LogError(AppPrefs.errorSomethingWentWrong()))
                    } else {
                        emit(KesbewaResult.Success(value))
                    }
                }
            } catch (ex: Exception) {
                emit(KesbewaResult.ExceptionError.ExError(ex))
            }
        }
    }


    val getProductResponse = getProducts.switchMap {id->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {
                var proRes = repo.getProducts()
                proRes.collect { value ->
                    isProductLoaderVisible.set(false)
                    if (value == null) {
                        emit(KesbewaResult.LogicError.LogError(AppPrefs.errorSomethingWentWrong()))
                    } else {
                        emit(KesbewaResult.Success(value))
                    }
                }
            } catch (ex: Exception) {
                isProductLoaderVisible.set(false)
                emit(KesbewaResult.ExceptionError.ExError(ex))
            }
        }
    }


    fun setProductDetails(pro: Products) {
        isProductDetailsLoaderVisible.set(true)

        var discription = ""
        var delimiter = "~"
        val parts = pro.pro_description!!.split(delimiter)

        for (po in parts) {
            discription = "$discription* $po\n\n"
        }

        textProductDetails.set(discription)

        selectedProduct.value = pro

    }


    val productSelectedImage: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    val productList: MutableLiveData<ArrayList<Products>> by lazy {
        MutableLiveData<ArrayList<Products>>()
    }


    fun searchProducts(serachText: String) {
        _userPreferencesProducts.value = serachText
    }

    val filterdProductList = userPreferencesProducts.switchMap { id ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {
                emit(Result.success(repo.getProductFilter(productList, id)))
            } catch (ioException: Throwable) {
                emit(Result.failure(ioException))
            }
        }
    }


    val productSize: MutableLiveData<ArrayList<ProductSize>> by lazy {
        MutableLiveData<ArrayList<ProductSize>>()
    }


    val productColor: MutableLiveData<ArrayList<ProductColor>> by lazy {
        MutableLiveData<ArrayList<ProductColor>>()
    }

    val productSelectedColor: MutableLiveData<ProductColor> by lazy {
        MutableLiveData<ProductColor>()
    }

    fun updateProductSelectedSize(size: ProductSize) {
        _productSizeUpdate.value = size
        if (productSelectedQty.value == null) {
            _totalQty.value = 1
        } else {
            _totalQty.value = productSelectedQty.value
        }

    }


    fun quantityPlus() {
        if (productSelectedQty.value == null) {
            productSelectedQty.value = 1
        } else {
            var currentValue = productSelectedQty.value
            productSelectedQty.value = currentValue!! + 1
        }
        textProductQty.set(productSelectedQty.value.toString())
        _totalQty.value = productSelectedQty.value

    }

    fun quantityMinus() {
        if (productSelectedQty.value == null) {
            productSelectedQty.value = 0
        } else {
            if (productSelectedQty.value != 0) {
                var currentValue = productSelectedQty.value
                productSelectedQty.value = currentValue!! - 1
            }
        }
        _totalQty.value = productSelectedQty.value
        textProductQty.set(productSelectedQty.value.toString())

    }


    fun quantityAdd(qty: Int) {
        if (qty > 0) {
            productSelectedQty.value = qty
        }
        _totalQty.value = productSelectedQty.value
        textProductQty.set(productSelectedQty.value.toString())

    }

    val totalAmountUpdate = totalQty.switchMap { _ ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            totValue = if (productSizeUpdate.value == null) {
                repo.calculateTotal(
                    productSelectedQty.value.toString().toInt(),
                    selectedProduct.value?.pro_price!!
                )
            } else {
                repo.calculateTotal(
                    productSelectedQty.value.toString().toInt(),
                    productSizeUpdate.value?.price!!
                )
            }
            totalAmount.set(totValue.toString())
            emit(totValue)
        }
    }


    fun addToCart() {
        _addToCartStatus.value = (1..1000).random()
    }

    val addToCart = addToCartStatus.switchMap { status ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            val resultOrder = repo.addtocart(
                selectedProduct.value,
                productSizeUpdate.value,
                productSelectedColor.value,
                productSelectedQty.value,
                totalAmountUpdate.value,
                status
            )
            if (!resultOrder.error?.errorStatus!!) {
                emit(OrderResult.Success(resultOrder))
            } else {
                emit(OrderResult.Failure(resultOrder.error!!))
            }

        }
    }

    val cartCount = cartCountUpdateStatus.switchMap { _ ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            emit(repo.getCartCount())
        }
    }

    fun updateCartCountUI(count: Int) {
        if (count == 0) {
            isCartVisible.set(false)
        } else {
            isCartVisible.set(true)
        }
        textCartCount.set(count.toString())
    }

    fun updateCartCount() {
        _cartCountUpdateStatus.value = 1
    }


    fun goToCartUi(view: View) {
        if (cartCount.value == 0) {
            Toast.makeText(
                Kesbewa.applicationContext(),
                "Please add at least one item",
                Toast.LENGTH_LONG
            ).show()
        } else {
            Navigation.findNavController(view!!).navigate(R.id.fragmentProductToCart)
        }

    }






    fun deleteCart(){
        _deleteAllUpdateStatus.value = (1..1000).random()
    }



    val deleteAllItemcheckOut = deleteAllUpdateStatus.switchMap { cart ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            emit(repo.deleteAllCart())
        }
    }


     fun validateGoogleSignIn(mail: String,id : String){
         var gUser =User().apply {
             user_email = mail
             user_google_id = id

         }

        _validateGoogleSignInCall.value = gUser
    }

    val validateGoogleSignInResponse = validateGoogleSignInCall.switchMap { guser ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {
                var userRes = repo.validateGoogleDetails(guser)
                userRes.collect { value ->
                    if (value.errorCode == AppPrefs.SUCCESS_VERIFY_GOOGLE) {
                        emit(KesbewaResult.Success(value))
                    } else {
                        emit(KesbewaResult.LogicError.LogError(value))
                    }
                }
            } catch (ex: java.lang.Exception) {
                emit(KesbewaResult.ExceptionError.ExError(ex))
            }
        }
    }



    fun checkPush(){
        _checkPush.value = (1..1000).random()
    }

    val checkPushResponse = checkPush.switchMap { id ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {
                var userRes = repo.checkPushID(id)
                userRes.collect { value ->
                    emit(KesbewaResult.Success(value))
                }

            } catch (ex: java.lang.Exception) {
                emit(KesbewaResult.ExceptionError.ExError(ex))
            }
        }
    }


    object LiveDataVMFactory : ViewModelProvider.Factory {
        var app: Context = Kesbewa.applicationContext()
        private val dataDAO = AppDatabase.getInstance(app).orderDao()
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return HomeViewModel(dataDAO, app) as T

        }
    }

}