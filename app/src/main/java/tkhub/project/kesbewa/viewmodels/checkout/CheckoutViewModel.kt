package tkhub.project.kesbewa.viewmodels.checkout

import android.content.Context
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.databinding.ObservableField
import androidx.lifecycle.*
import androidx.navigation.Navigation
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import tkhub.project.kesbewa.data.model.Zone
import tkhub.project.kesbewa.Kesbewa
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.db.AppDatabase
import tkhub.project.kesbewa.data.db.OrderDao
import tkhub.project.kesbewa.data.model.*
import tkhub.project.kesbewa.data.responsmodel.CartResult
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.repo.CartRepo
import tkhub.project.kesbewa.services.Perfrences.AppPrefs


class CheckoutViewModel(dataDao: OrderDao, context: Context) : ViewModel() {

    var mContext = context
    var repo = CartRepo(dataDao, mContext)


    lateinit var cart: List<CartItem>

    private val _getCartItem = MutableLiveData<Int>()
    val getCartItem: LiveData<Int> = _getCartItem

    private val _subtotalUpdateStatus = MutableLiveData<Int>()
    val subtotalUpdateStatus: LiveData<Int> = _subtotalUpdateStatus

    private val _itemCountUpdateStatus = MutableLiveData<Int>()
    val itemCountUpdateStatus: LiveData<Int> = _itemCountUpdateStatus

    private val _noteUpdateStatus = MutableLiveData<String>()
    val noteUpdateStatus: LiveData<String> = _noteUpdateStatus


    private val _deleteAllUpdateStatus = MutableLiveData<Int>()
    val deleteAllUpdateStatus: LiveData<Int> = _deleteAllUpdateStatus

    private val _orderUpdateStatus = MutableLiveData<NetworkError>()
    val orderUpdateStatus: LiveData<NetworkError> = _orderUpdateStatus

    val isOrderProcessVisible = ObservableField<Boolean>()


    var textSelectedAddress = ObservableField<String>()
    var textDelivery = ObservableField<String>()
    var textcheckoutsubtotal = ObservableField<String>()
    var textDiscount = ObservableField<String>()
    var textNeedToPay = ObservableField<String>()
    var textCheckOutItemCount = ObservableField<String>()
    var textSelectedPromoCode = ObservableField<String>()
    var textPromoType = ObservableField<String>()


    var isDeliveryChargesTextVisible= ObservableField<Boolean>()
    var isDeliveryChargesVisible= ObservableField<Boolean>()

    var  isPromotionTextVisible = ObservableField<Boolean>()
    var  isPromotionVisible = ObservableField<Boolean>()

    var textPromoTypeColor = ObservableField<Int>()

    var textDispatchNote = ObservableField<String>()
    var isDispatchNoteVisible = ObservableField<Boolean>()



    var orderError = NetworkError()


    private val _getDeliveryAddress = MutableLiveData<Int>()
    val getDeliveryAddress: LiveData<Int> = _getDeliveryAddress

    private val _orderProcessCall = MutableLiveData<OrderRespons>()
    val orderProcessCall: LiveData<OrderRespons> = _orderProcessCall


    lateinit var layoutView: View
    var orderResponse = OrderRespons()


    private val _deliveryChargesCall = MutableLiveData<Int>()
    val deliveryChargesCall: LiveData<Int> = _deliveryChargesCall

    val delivery: MutableLiveData<ArrayList<Zone>> by lazy {
        MutableLiveData<ArrayList<Zone>>()
    }


    val dispatchType: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    val storeLocation: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }



    val storeOptionVisible = ObservableField<Boolean>()
    val deliveryAddressVisible = ObservableField<Boolean>()

    var appPref = AppPrefs


    init {
        isOrderProcessVisible.set(false)
        storeOptionVisible.set(false)
        deliveryAddressVisible.set(false)

        isDispatchNoteVisible.set(false)

        textSelectedPromoCode.set("No Promo Code")
        dispatchType.value = ""
        storeLocation.value = ""
    }



    // new
    fun getItemInCart(){
        _getCartItem.value = (1..1000).random()

    }

    val cartItemscheckOut = getCartItem.switchMap { status ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            cart = repo.getCartItems()
            if (cart.isEmpty()) {
                emit(CartResult.Empty())
            } else {
                emit(CartResult.Success(cart))
            }
        }
    }


    fun getNote(note: String) {
        _noteUpdateStatus.value = note
    }


    fun getDeliveryAddress() {
        var address = AppPrefs.getSelectAdressMaunalKeyValuePrefs(
            mContext!!,
            AppPrefs.KEY_SELECTED_USER_ADDERSS
        )
        if (address.address_id.equals("")) {
            isOrderProcessVisible.set(true)
            _getDeliveryAddress.value = (1..1000).random()
        } else {
            var fulladdress = if (!AppPrefs.checkValidString(address.user_address_two!!)) {
                (address.user_address_number + " ," + address.user_address_one + ", " + "\n"
                        + address.user_address_two + ", " + "\n"
                        + address.user_address_city + ", " + "\n"
                        + address.user_address_district)
            } else {
                (address.user_address_number + " ," + address.user_address_one + ", " + "\n"
                        + address.user_address_city + ", " + "\n"
                        + address.user_address_district)
            }
            textSelectedAddress.set(fulladdress)
        }

    }

    val userDeliveryAddress = getDeliveryAddress.switchMap { cart ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {
                isOrderProcessVisible.set(false)
                var proRes = repo.getDeliveryAddress()
                proRes.collect { value ->
                    if (value == null) {
                        var errorGetProducts = NetworkError()
                        emit(KesbewaResult.LogicError.LogError(AppPrefs.errorSomethingWentWrong()))
                    } else {
                        if (value.address_id != "") {
                            var fulladdress =
                                if (!AppPrefs.checkValidString(value.user_address_two!!)) {
                                    (value.user_address_number + " ," + value.user_address_one + ", " + "\n"
                                            + value.user_address_two + ", " + "\n"
                                            + value.user_address_city + ", " + "\n"
                                            + value.user_address_district)
                                } else {
                                    (value.user_address_number + " ," + value.user_address_one + ", " + "\n"
                                            + value.user_address_city + ", " + "\n"
                                            + value.user_address_district)
                                }
                            textSelectedAddress.set(fulladdress)
                        }
                        emit(KesbewaResult.Success(value))
                    }
                }
            } catch (ex: Exception) {
                isOrderProcessVisible.set(false)
                emit(KesbewaResult.ExceptionError.ExError(ex))
            }

        }
    }



    private val _calculateFinalTotalCall = MutableLiveData<Int>()
    val calculateFinalTotalCall: LiveData<Int> = _calculateFinalTotalCall

    fun calculateFinalTotal() {
        isOrderProcessVisible.set(true)
        _calculateFinalTotalCall.value = (1..1000).random()

    }


    val  calculateFinalTotalCallResponse = calculateFinalTotalCall.switchMap { it ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {

                var value = repo.calculateTotal()
                setFinalTotalToUI(value)
                emit(KesbewaResult.Success(value))
                isOrderProcessVisible.set(false)
            } catch (ex: Exception) {
                emit(KesbewaResult.ExceptionError.ExError(ex))
                isOrderProcessVisible.set(false)
            }

        }
    }




    fun setFinalTotalToUI(finalCheckoutAmount: FinalCheckoutAmount){
        textDiscount.set(finalCheckoutAmount.discount)
        textcheckoutsubtotal.set("%.2f".format(finalCheckoutAmount.subtotal))
        textNeedToPay.set("%.2f".format(finalCheckoutAmount.needtoPay))
        textCheckOutItemCount.set(finalCheckoutAmount.itemCount.toString())



        var totKellow = 0
        for(item in cart){
            var itemkm = item.pro_weight!!* item.pro_total_qty!!
            totKellow = (totKellow+ itemkm).toInt()
        }

        var deliverChargesPerkellow  =0.0
        var additnalKg = totKellow/1000.toInt()


        if(additnalKg!=0){
            deliverChargesPerkellow = (additnalKg * 50).toDouble()
        }

      // var deliverChargesPerkellow = ((totKellow/1000).toInt()-1) * 50


        if( dispatchType.value == appPref.KEY_DISPATCH_STORE){
            isDeliveryChargesTextVisible.set(false)
            isDeliveryChargesVisible.set(false)

        }else{

            isDeliveryChargesTextVisible.set(true)
            isDeliveryChargesVisible.set(true)


            var delCharges = finalCheckoutAmount.deliveryCharges

            if(delCharges !=0.0){
                delCharges += deliverChargesPerkellow
            }


            textDelivery.set("%.2f".format(delCharges))
        }


        if(finalCheckoutAmount.promoType==""){
            isPromotionTextVisible.set(false)
            isPromotionVisible.set(false)
        }else{
            textPromoType.set(finalCheckoutAmount.promoType)
            isPromotionTextVisible.set(true)
            isPromotionVisible.set(true)

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {

                if(finalCheckoutAmount.promoType == "Promo code not validate for pickeup !"){
                    textPromoTypeColor.set(mContext.getColor(R.color.colorAccent))
                }else{
                    AppPrefs.setSelectPromoKeyValuePrefs(
                        mContext,
                        AppPrefs.KEY_SELECTED_PROMO,
                        finalCheckoutAmount.promo
                    )
                    textPromoTypeColor.set(mContext.getColor(R.color.textcolor1))

                }


            }


        }

        if(finalCheckoutAmount.promoCode == ""){
            textSelectedPromoCode.set("No Promo Code")
        }else{
            textSelectedPromoCode.set(finalCheckoutAmount.promoCode)
        }





    }


    fun orderProcess() {
        isOrderProcessVisible.set(true)
        orderResponse.order_note = noteUpdateStatus.value.toString()
        orderResponse.order_total_qty = textCheckOutItemCount.get().toString().toInt()
        orderResponse.order_discount = textDiscount.get().toString().toDouble()
        orderResponse.order_delivery_chargers = textDelivery.get().toString().toDouble()
        orderResponse.order_subtotal_total = textcheckoutsubtotal.get().toString().toDouble()
        orderResponse.order_total_price = textNeedToPay.get().toString().toDouble()
        orderResponse.itemlist = cart
        orderResponse.order_dispatch_type = dispatchType.value.toString()
        orderResponse.order_store_location =  storeLocation.value.toString()
        _orderProcessCall.value = orderResponse

    }


    val orderProcessResponse = orderProcessCall.switchMap { order ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {
                var orderRes = repo.processOrder(order,textPromoType.get().toString())

                orderRes.collect { value ->
                    if (value.errorCode == AppPrefs.SUCCESS_ORDER_SUCCESSFULLY) {
                        emit(KesbewaResult.Success(value))
                    } else {
                        emit(KesbewaResult.LogicError.LogError(value))
                    }
                    isOrderProcessVisible.set(false)
                }

            } catch (ex: Exception) {
                isOrderProcessVisible.set(false)
                emit(KesbewaResult.ExceptionError.ExError(ex))
            }

        }
    }


    fun clearAllOrderData() {
        var manualLocation = ManualLocation(0.0, 0.0)
        AppPrefs.setLocationManualKeyValuePrefs(
            mContext!!,
            AppPrefs.KEY_MANUAL_LOCATION,
            manualLocation
        )
        var promo = PromoCode()
        AppPrefs.setSelectPromoKeyValuePrefs(
            mContext!!,
            AppPrefs.KEY_SELECTED_PROMO,
            promo
        )

        _deleteAllUpdateStatus.value = (1..1000).random()

    }

    val deleteAllItemcheckOut = deleteAllUpdateStatus.switchMap { cart ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            emit(repo.deleteAllCart())
        }
    }


    fun goToPromoUi(view: View) {
        Navigation.findNavController(view!!).navigate(R.id.fragmentCartToPromo)
    }

    fun goToAddAddress(view: View) {
        Navigation.findNavController(view!!).navigate(R.id.fragmentCheckOutToAddress)
    }

    fun goToHome(view: View) {
        Navigation.findNavController(view).navigate(R.id.fragmentCheckOutToHome)
    }


    fun callDeliveryCharges() {
        isOrderProcessVisible.set(true)
        _deliveryChargesCall.value = (1..1000).random()

    }


    val deliveryChargesResponse = deliveryChargesCall.switchMap { cart ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            var res = repo.getDelivery()
            isOrderProcessVisible.set(false)
            res.collect { value ->
                emit(value)
            }
        }
    }


    val dispatchAvailability: MutableLiveData<NetworkError> by lazy {
        MutableLiveData<NetworkError>()
    }


    fun  onDispatchTypeChanged(radioGroup: RadioGroup, id: Int) {
        var orderConfig = AppPrefs.getOrderConfigPrefs(Kesbewa.applicationContext())
        if (id == R.id.store) {
            if(orderConfig.order_pickup!!){
                dispatchType.value = appPref.KEY_DISPATCH_STORE
                storeOptionVisible.set(true)
                deliveryAddressVisible.set(false)

                textDispatchNote.set("** Note : Your order will ready within 1 to 3 working days ")
                isDispatchNoteVisible.set(true)

                AppPrefs.setDeliveryChargesPrefs(Kesbewa.applicationContext(),0.0f)
                _calculateFinalTotalCall.value = (1..1000).random()

            }else{
                var orderError = NetworkError()
                orderError.errorTitle = "Disable"
                orderError.errorMessage = orderConfig.order_pickup_disable_reason
                orderError.errorCode = AppPrefs.ERROR_DISABLE_PICKUP
                radioGroup.check(R.id.delivery)

                dispatchAvailability.value = orderError
            }



        } else if(id == R.id.delivery) {

            if(orderConfig.order_delivery!!){

                dispatchType.value = appPref.KEY_DISPATCH_DELIVERY
                storeOptionVisible.set(false)
                deliveryAddressVisible.set(true)

                textDispatchNote.set("** Note : Your order will delivered within 3 to 7 working days ")
                isDispatchNoteVisible.set(true)

                AppPrefs.setDeliveryChargesPrefs(Kesbewa.applicationContext(),0.0f)
                _calculateFinalTotalCall.value = (1..1000).random()

            }else{
                var orderError = NetworkError()
                orderError.errorTitle = "Disable"
                orderError.errorMessage = orderConfig.order_delivery_disable_reason
                orderError.errorCode = AppPrefs.ERROR_DISABLE_DELIVERY
                radioGroup.check(R.id.store)
                dispatchAvailability.value = orderError
            }



        }


    }


    fun onStoreLocationChanged(radioGroup: RadioGroup, id: Int) {
        when (id) {
            R.id.negombo -> {
                storeLocation.value = appPref.KEY_DISPATCH_NEGOMBO
            }

        }

    }


    object LiveDataVMFactory : ViewModelProvider.Factory {
        var app: Context = Kesbewa.applicationContext()
        private val dataDAO = AppDatabase.getInstance(app).orderDao()
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return CheckoutViewModel(dataDAO, app) as T

        }
    }

}