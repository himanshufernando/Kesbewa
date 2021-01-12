package tkhub.project.kesbewa.viewmodels.cart

import android.content.Context
import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.*
import androidx.navigation.Navigation
import com.google.firebase.database.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import tkhub.project.kesbewa.Kesbewa
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.db.AppDatabase
import tkhub.project.kesbewa.data.db.OrderDao
import tkhub.project.kesbewa.data.model.CartItem
import tkhub.project.kesbewa.data.model.NetworkError
import tkhub.project.kesbewa.data.model.PromoCode
import tkhub.project.kesbewa.data.responsmodel.CartResult
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.repo.CartRepo
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import java.lang.Exception


class CartViewModel(dataDao: OrderDao, context: Context) : ViewModel() {

    var mContext = context
    var repo = CartRepo(dataDao, mContext)

    var myRef: DatabaseReference? = null
    var database: FirebaseDatabase? = null

    var textItemCount = ObservableField<String>()
    var textSubTotal = ObservableField<String>()


    private val _getCartItem = MutableLiveData<Int>()
    val getCartItem: LiveData<Int> = _getCartItem

    private val _setRemoveCartItem = MutableLiveData<CartItem>()
    private val setRemoveCartItem: LiveData<CartItem> = _setRemoveCartItem

    private val _setUpdateCartItem = MutableLiveData<CartItem>()
    private val setUpdateCartItem: LiveData<CartItem> = _setUpdateCartItem

    private val _itemCountUpdateStatus = MutableLiveData<Int>()
    val itemCountUpdateStatus: LiveData<Int> = _itemCountUpdateStatus

    private val _subtotalUpdateStatus = MutableLiveData<Int>()
    val subtotalUpdateStatus: LiveData<Int> = _subtotalUpdateStatus

    private val _cityListUpdateStatus = MutableLiveData<Int>()
    val cityListUpdateStatus: LiveData<Int> = _cityListUpdateStatus

    private val _deliveryAddresUpdateStatus = MutableLiveData<NetworkError>()
    val deliveryAddresUpdateStatus: LiveData<NetworkError> = _deliveryAddresUpdateStatus


    private val _noteUpdateStatus = MutableLiveData<String>()
    val noteUpdateStatus: LiveData<String> = _noteUpdateStatus

    private val _orderUpdateStatus = MutableLiveData<NetworkError>()
    val orderUpdateStatus: LiveData<NetworkError> = _orderUpdateStatus


    private val _checkPromocodeCall = MutableLiveData<String>()
    val checkPromocodeCall: LiveData<String> = _checkPromocodeCall

    private val _checkPromocodeUseageCall = MutableLiveData<String>()
    val checkPromocodeUseageCall: LiveData<String> = _checkPromocodeUseageCall


    var promocodeProgress = ObservableField<Boolean>()
    var promocodeBtnVisibility = ObservableField<Boolean>()

    val deliveryCharges: MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()
    }

    val totalvalue: MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()
    }


    var textSelectedAddress = ObservableField<String>()
    var textDelivery = ObservableField<String>()
    var textcheckoutsubtotal = ObservableField<String>()
    var textDiscount = ObservableField<String>()
    var textNeedToPay = ObservableField<String>()
    var textCheckOutItemCount = ObservableField<String>()

    var textPromoCode = MutableLiveData<String>()
    var textPromotions = ObservableField<String>()


    val userCode: MutableLiveData<Long> by lazy {
        MutableLiveData<Long>()
    }


    val isUserSaveVisible = ObservableField<Boolean>()


    //order
    lateinit var cart: List<CartItem>

    init {
        _cityListUpdateStatus.value = 45
        database = FirebaseDatabase.getInstance()

        isUserSaveVisible.set(false)
        promocodeProgress.set(false)
        promocodeBtnVisibility.set(true)
    }


    fun getCartItems() {
        _getCartItem.value = (1..1000).random()
        _itemCountUpdateStatus.value = (1..1000).random()
        _subtotalUpdateStatus.value = (1..1000).random()
    }

    val cartItems = getCartItem.switchMap { status ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            cart = repo.getCartItems()
            if (cart.isEmpty()) {
                emit(CartResult.Empty())
            } else {
                emit(CartResult.Success(cart))
            }
        }
    }

    fun removeCart(cartItem: CartItem) {
        _setRemoveCartItem.value = cartItem
    }

    val removeCartItem = setRemoveCartItem.switchMap { cart ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            emit(repo.removeCartItems(cart))
        }
    }


    fun updateCart(cartItem: CartItem) {
        _setUpdateCartItem.value = cartItem
    }

    val updateCartItem = setUpdateCartItem.switchMap { cart ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            emit(repo.updateCartItems(cart))
        }
    }


    val itemCount = itemCountUpdateStatus.switchMap { _ ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            emit(repo.getCartCount())
        }
    }

    fun updateitemCountUI(count: Int) {
        textItemCount.set("Item ($count)")
    }

    val subtotal = subtotalUpdateStatus.switchMap { _ ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            var res = repo.getSubTotal()
            emit(res)
        }
    }

    fun updateSubTotalUI(tot: Double) {
        textSubTotal.set("LKR $tot")
    }


    private val _userTypeCheckStatus = MutableLiveData<Int>()
    val userTypeCheckStatus: LiveData<Int> = _userTypeCheckStatus


    fun goToCheckOut(view: View) {

        AppPrefs.setSelectPromoKeyValuePrefs(
            mContext, AppPrefs.KEY_SELECTED_PROMO,
            PromoCode()
        )

        if (AppPrefs.getUserPrefs(mContext!!, AppPrefs.KEY_USER).user_name.equals("")) {
            _userTypeCheckStatus.value = 1
        } else {
            Navigation.findNavController(view!!).navigate(R.id.fragmentCartToCheckOut)
        }
    }




    fun checkPromoCode() {
        promocodeProgress.set(true)
        promocodeBtnVisibility.set(false)
        _checkPromocodeCall.value = textPromoCode.value.toString()

    }

    val checkPromocodeResponse = checkPromocodeCall.switchMap { id ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {
                var userRes = repo.checkPromocode(id)
                userRes.collect { value ->
                    emit(KesbewaResult.Success(value))
                }
            } catch (ex: Exception) {
                promocodeProgress.set(false)
                promocodeBtnVisibility.set(true)
                emit(KesbewaResult.ExceptionError.ExError(ex))
            }
        }
    }

    fun checkPromoCodeUse() {
        promocodeProgress.set(true)
        promocodeBtnVisibility.set(false)
        _checkPromocodeUseageCall.value = textPromoCode.value.toString()

    }

    var checkPromocodeUseageResponse = checkPromocodeUseageCall.switchMap { id ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {
                var userRes = repo.checkPromocodeUseage(id)
                promocodeProgress.set(false)
                promocodeBtnVisibility.set(true)
                userRes.collect { value ->
                    emit(KesbewaResult.Success(value))
                }
            } catch (ex: Exception) {
                promocodeProgress.set(false)
                promocodeBtnVisibility.set(true)
                emit(KesbewaResult.ExceptionError.ExError(ex))
            }
        }
    }

    fun setPromoTypeToUI() {
        var promoCode =
            AppPrefs.getSelectPromoKeyValuePrefs(mContext, AppPrefs.KEY_SELECTED_PROMO)
        var promotion = ""
        when (promoCode.promocode_type_code) {
            "TD" -> {
                promotion = promoCode.promocode_value.toString() + " % discount from total value"
            }
            "VW" -> {
                promotion = promoCode.promocode_value.toString() + " rs wave off from total value"
            }
            "DD" -> {
                promotion =
                    promoCode.promocode_value.toString() + " % discount from delivery charges"
            }
            "DVW" -> {
                promotion =
                    promoCode.promocode_value.toString() + " rs wave off from delivery charges"
            }
        }

        textPromotions.set(promotion)

    }


    object LiveDataVMFactory : ViewModelProvider.Factory {
        var app: Context = Kesbewa.applicationContext()
        private val dataDAO = AppDatabase.getInstance(app).orderDao()
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return CartViewModel(dataDAO, app) as T

        }
    }

}