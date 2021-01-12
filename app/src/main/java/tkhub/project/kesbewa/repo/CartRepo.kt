package tkhub.project.kesbewa.repo

import android.content.Context
import com.google.firebase.database.*

import com.google.gson.stream.JsonReader
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow

import tkhub.project.kesbewa.data.model.Zone
import tkhub.project.kesbewa.Kesbewa
import tkhub.project.kesbewa.data.db.OrderDao
import tkhub.project.kesbewa.data.model.*
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.services.network.InternetConnection
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class CartRepo(val dataDao: OrderDao, context: Context) {

    var mContext = context
    var database: FirebaseDatabase? = FirebaseDatabase.getInstance()
    var addresRef: DatabaseReference? = database?.getReference("Address")
    var orderRef: DatabaseReference? = database?.getReference("KOrders")
    var deliveryrRef: DatabaseReference? = database?.getReference("Zone")
    var promoCodeRef: DatabaseReference? = database?.getReference("PromoCodes")
    var promoCodeUseRef: DatabaseReference? = database?.getReference("PromoCodesUse")


    var appPref = AppPrefs


    suspend fun getCartItems(): List<CartItem> {
        return dataDao.getCartItems()
    }

    fun currentDate(): String? {
        return SimpleDateFormat("EEEE, dd MMM yyyy").format(Calendar.getInstance().time)
    }

    suspend fun processOrder(
        orderDetails: OrderRespons,
        promoCodeType: String
    ): Flow<NetworkError> = callbackFlow {

        var finalUser = AppPrefs.getUserPrefs(mContext!!, AppPrefs.KEY_USER)
        var prmo = PromoCode()
        var finalAddress = AppPrefs.getSelectAdressMaunalKeyValuePrefs(
            mContext!!,
            AppPrefs.KEY_SELECTED_USER_ADDERSS
        )

        var orderError = NetworkError()

        orderDetails.order_id = ""
        orderDetails.order_user_id = finalUser.user_id.toString()
        orderDetails.order_android_id = appPref.getAndroidid()
        orderDetails.order_date = 44454
        orderDetails.order_promo_code = prmo.promocode
        orderDetails.order_promo_code_id = prmo.promocode_id
        orderDetails.order_payment_type_code = "CD"
        orderDetails.order_payment_type = "cash on delivery"
        orderDetails.order_status = "0"
        orderDetails.order_status_code = 0
        orderDetails.delivery_address = finalAddress
        orderDetails.user = finalUser



        when {
            orderDetails.itemlist.isNullOrEmpty() -> {
                orderError.errorTitle = "Empty Cart"
                orderError.errorMessage = "Please add at least one item ! "
                orderError.errorCode = appPref.ERROR_EMPTY_CART
                offer(orderError)

            }
            orderDetails.order_dispatch_type.isNullOrEmpty() -> {
                orderError.errorTitle = "Dispatch"
                orderError.errorMessage = "Please select dispatch type "
                orderError.errorCode = appPref.ERROR_EMPTY_DISPATCH_TYPE
                offer(orderError)

            }
            ((orderDetails.order_dispatch_type == appPref.KEY_DISPATCH_DELIVERY) && (finalAddress.address_id.equals(
                ""
            )).or(finalAddress.address_id.isNullOrEmpty())) -> {
                orderError.errorTitle = "Empty Address"
                orderError.errorMessage = "Please add delivery address ! "
                orderError.errorCode = appPref.ERROR_EMPTY_ADDRESS
                offer(orderError)

            }
            ((orderDetails.order_dispatch_type == appPref.KEY_DISPATCH_STORE) && (orderDetails.order_store_location == "").or(
                orderDetails.order_store_location.isNullOrEmpty()
            )) -> {

                orderError.errorTitle = "Empty Store"
                orderError.errorMessage = "Please select the store to pickup !! "
                orderError.errorCode = appPref.ERROR_EMPTY_STORE_LOCATION
                offer(orderError)

            }
            ((orderDetails.order_dispatch_type == appPref.KEY_DISPATCH_DELIVERY) && (!finalAddress.address_id.isNullOrEmpty()) && (orderDetails.order_delivery_chargers == 0.0)) -> {
                offer(appPref.errorSomethingWentWrong())
            }
            (orderDetails.order_total_price.toString() == "").or(
                orderDetails.order_total_price.toString().isNullOrEmpty()
            ) -> {
                offer(appPref.errorSomethingWentWrong())
            }
            (!InternetConnection.checkInternetConnection()) -> {
                offer(appPref.errorNoInternet())
            }

            else -> {

                var promocode =
                    AppPrefs.getSelectPromoKeyValuePrefs(mContext, AppPrefs.KEY_SELECTED_PROMO)
                if (promocode.promocode.isNullOrEmpty()) {

                    orderRef?.addListenerForSingleValueEvent(object : ValueEventListener {
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            val value = dataSnapshot.childrenCount
                            var usercode = finalUser.user_code
                            var delimiter = "-"
                            val parts = usercode?.split(delimiter)
                            var orderCode =
                                "O" + value.toString() + (parts?.get(0)) + "-" + ((1..1000).random()
                                    .toString())
                            orderDetails.order_code = orderCode


                            var unxId = genarateUniqCode()
                            orderDetails.order_id = unxId.toString()

                            if (orderDetails.order_dispatch_type == appPref.KEY_DISPATCH_STORE) {
                                orderDetails.delivery_address = DeliveryAddress()
                                orderDetails.order_delivery_chargers = 0.0
                            } else {
                                orderDetails.order_store_location = ""
                            }


                            orderRef?.child(unxId.toString())?.setValue(orderDetails)

                            orderError.errorTitle = "Successful"
                            orderError.errorMessage = "Your order has been placed successfully !"
                            orderError.errorCode = appPref.SUCCESS_ORDER_SUCCESSFULLY
                            offer(orderError)

                        }

                        override fun onCancelled(error: DatabaseError) {
                            var unxId = genarateUniqCode()
                            orderDetails.order_code =
                                appPref.genarateUniqOrderCode(finalUser.user_code!!)
                            orderDetails.order_id = unxId.toString()
                            orderRef?.child(unxId.toString())?.setValue(orderDetails)
                            orderError.errorTitle = "Successful"
                            orderError.errorMessage = "Your order has been placed successfully !"
                            orderError.errorCode = appPref.SUCCESS_ORDER_SUCCESSFULLY
                            offer(orderError)

                        }
                    })


                } else {
                    val query: Query =
                        promoCodeUseRef?.orderByChild("code")!!.equalTo(promocode.promocode)
                    query?.addListenerForSingleValueEvent(object : ValueEventListener {
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            if (dataSnapshot.childrenCount == 0L) {
                                orderRef?.addListenerForSingleValueEvent(object :
                                    ValueEventListener {
                                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                                        val value = dataSnapshot.childrenCount
                                        var usercode = finalUser.user_code
                                        var delimiter = "-"
                                        val parts = usercode?.split(delimiter)
                                        var orderCode =
                                            "O" + value.toString() + (parts?.get(0)) + "-" + ((1..1000).random()
                                                .toString())
                                        orderDetails.order_code = orderCode


                                        if (promoCodeType == "Promo code not validate for pickeup !") {

                                        } else {
                                            orderDetails.order_promo_code = promocode.promocode
                                            orderDetails.order_promo_code_id = promocode.promocode_id
                                            orderDetails.order_promo = promocode
                                        }




                                        var unxId = genarateUniqCode()
                                        orderDetails.order_id = unxId.toString()

                                        if (orderDetails.order_dispatch_type == appPref.KEY_DISPATCH_STORE) {
                                            orderDetails.delivery_address = DeliveryAddress()
                                            orderDetails.order_delivery_chargers = 0.0
                                        } else {
                                            orderDetails.order_store_location = ""
                                        }


                                        orderRef?.child(unxId.toString())?.setValue(orderDetails)

                                        orderError.errorTitle = "Successful"
                                        orderError.errorMessage =
                                            "Your order has been placed successfully !"
                                        orderError.errorCode = appPref.SUCCESS_ORDER_SUCCESSFULLY
                                        offer(orderError)
                                    }

                                    override fun onCancelled(error: DatabaseError) {
                                        var unxId = genarateUniqCode()
                                        orderDetails.order_code =
                                            appPref.genarateUniqOrderCode(finalUser.user_code!!)
                                        orderDetails.order_id = unxId.toString()
                                        orderRef?.child(unxId.toString())?.setValue(orderDetails)
                                        orderError.errorTitle = "Successful"
                                        orderError.errorMessage =
                                            "Your order has been placed successfully !"
                                        orderError.errorCode = appPref.SUCCESS_ORDER_SUCCESSFULLY
                                        offer(orderError)

                                    }
                                })

                            } else {
                                var promo = PromoCode()
                                AppPrefs.setSelectPromoKeyValuePrefs(
                                    mContext,
                                    AppPrefs.KEY_SELECTED_PROMO,
                                    promo
                                )
                                orderError.errorMessage =
                                    "Your promo code is already use, Please try again !"
                                orderError.errorCode = appPref.ERROR_PROMOCODE_INVALID
                                offer(orderError)
                            }
                        }

                        override fun onCancelled(error: DatabaseError) {
                            offer(orderError)
                        }
                    })

                }
            }
        }
        awaitClose { this.cancel() }
    }

    fun genarateUniqCode(): Long {
        val c: Calendar = Calendar.getInstance()
        var numberFromTime =
            c.get(Calendar.DATE).toString() +
                    c.get(Calendar.HOUR).toString() +
                    c.get(Calendar.MINUTE).toString() +
                    c.get(Calendar.SECOND).toString() +
                    c.get(Calendar.MILLISECOND).toString() + ((1..100000).random()).toString()

        return numberFromTime.toLong()
    }


    suspend fun getDeliveryAddress(): Flow<DeliveryAddress?> = callbackFlow {
        var user = AppPrefs.getUserPrefs(mContext!!, AppPrefs.KEY_USER)
        val query: Query = addresRef?.orderByChild("user_id")!!.equalTo(user.user_id)
        query?.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                var post = DeliveryAddress()
                for (postSnapshot in dataSnapshot.children) {
                    post = postSnapshot.getValue(DeliveryAddress::class.java)!!
                }
                if (post.address_id != "") {
                    AppPrefs.setSelectAdressManualKeyValuePrefs(
                        mContext!!,
                        AppPrefs.KEY_SELECTED_USER_ADDERSS,
                        post
                    )
                } else {

                }

                offer(post)
            }

            override fun onCancelled(error: DatabaseError) {
                offer(null)
            }
        })


        awaitClose { this.cancel() }
    }


    suspend fun removeCartItems(item: CartItem): NetworkError {
        val respond = NetworkError()
        if (item.pro_id == null) {
            respond.errorStatus = true
            respond.errorTitle = "Removing Error"
            respond.errorMessage = "Item removing fail,Please try again"
        } else {
            item.cartStatus = false
            dataDao.updateCart(item)
            dataDao.deleteCart(item)
            respond.errorStatus = false
            respond.errorTitle = "Removing Success"
            respond.errorMessage = "Item removing success"
        }
        return respond
    }

    suspend fun updateCartItems(item: CartItem): NetworkError {

        val respond = NetworkError()
        if (item.pro_id == null) {
            respond.errorStatus = true
            respond.errorTitle = "Adding Error"
            respond.errorMessage = "Quantity adding fail,Please try again"
        } else {
            dataDao.updateTour(item.cart_id!!, item.pro_total_qty!!, item.pro_total_price!!)
            respond.errorStatus = false
            respond.errorTitle = "Adding Success"
            respond.errorMessage = "Quantity adding success"
        }
        return respond
    }

    suspend fun getItemCount(): Int {
        return dataDao.getQuantityTotal()
    }

    suspend fun getSubTotal(): Double {
        return dataDao.getSubTotal()
    }

    suspend fun getCartCount(): Int {
        return dataDao.getCartCount()
    }


    suspend fun getCityList(): List<City_v2> {

        return getCitys()

    }

    suspend fun calculateTotal(): FinalCheckoutAmount {

        var _needtopay = 0.0
        var _itemcount = 0
        var _subtotal = 0.0
        var _discount = "0.00"
        var _promoCodeType = ""
        var _deliveryCharge = 0.0
        var _delivery = ""

        _itemcount = dataDao.getCartCount()
        _subtotal = dataDao.getSubTotal()

        var _promocode = AppPrefs.getSelectPromoKeyValuePrefs(mContext, AppPrefs.KEY_SELECTED_PROMO)
        _deliveryCharge = AppPrefs.getDeliveryChargesPrefs(mContext).toDouble()

        when {
            _promocode.promocode_value <= 0.0 -> {
                _needtopay = _subtotal + _deliveryCharge
                _discount = "0.00"
            }
            _promocode.promocode_type_code == "" -> {
                _needtopay = _subtotal + _deliveryCharge
                _discount = "0.00"
            }
            _promocode.promocode_type_code == "TD" -> {
                if (_deliveryCharge <= 0.0) {
                    _needtopay = _subtotal + _deliveryCharge
                    _discount = "0.00"
                    _promoCodeType = "Promo code not validate for pickeup!"
                } else {
                    _needtopay = _subtotal + _deliveryCharge
                    var dis = (_needtopay * (_promocode.promocode_value) / 100)
                    _needtopay -= dis
                    _discount = ("%.2f".format(dis))
                    _promoCodeType =
                        (_promocode.promocode_value).toString() + "% off from Total value !"
                }

            }
            _promocode.promocode_type_code == "VW" -> {
                var dis = _promocode.promocode_value
                _needtopay = _subtotal + _deliveryCharge
                _needtopay -= dis
                _discount = ("%.2f".format(dis))
                _promoCodeType =
                    (_promocode.promocode_value).toString() + "LKR off from Total value !"


            }
            _promocode.promocode_type_code == "DD" -> {
                var dis = (_deliveryCharge * (_promocode.promocode_value) / 100)
                _delivery = dis.toString()
                _needtopay = _subtotal + dis
                _discount = ("%.2f".format(dis))
                _promoCodeType =
                    (_promocode.promocode_value).toString() + "% off from delivery charge !"
            }
            _promocode.promocode_type_code == "DVW" -> {
                if (_deliveryCharge <= 0.0) {
                    _needtopay = _subtotal + _deliveryCharge
                    _discount = "0.00"
                    _promoCodeType = "Promo code not validate for pickeup !"
                } else {
                    var dis = (_deliveryCharge - (_promocode.promocode_value))
                    _delivery = dis.toString()
                    _needtopay = _subtotal + dis
                    _discount = ("%.2f".format(dis))
                    _promoCodeType =
                        (_promocode.promocode_value).toString() + "LKR off from delivery charge !"
                }


            }
        }




        var finalAmount = FinalCheckoutAmount().apply {
            itemCount = _itemcount
            discount = _discount
            deliveryCharges = _deliveryCharge
            subtotal = _subtotal
            needtoPay = _needtopay
            promoType = _promoCodeType
            delivery = _delivery
            promoCode = _promocode.promocode
            promo = _promocode

        }


        return finalAmount
    }


    fun getDistrictFromCity(City: String): String {

        var disId = "5"


        var clist = getCitys()

        for (city in clist) {
            if (city.name_en == City) {
                disId = city.district_id
                break
            }

        }
        var dis = ""
        when (disId) {
            "1" -> dis = "Ampara"
            "2" -> dis = "Anuradhapura"
            "3" -> dis = "Badulla"
            "4" -> dis = "Batticaloa"
            "5" -> dis = "Colombo"
            "6" -> dis = "Galle"
            "7" -> dis = "Gampaha"
            "8" -> dis = "Hambantota"
            "9" -> dis = "Jaffna"
            "10" -> dis = "Kalutara"
            "11" -> dis = "Kandy"
            "12" -> dis = "Kegalle"
            "13" -> dis = "Kilinochchi"
            "14" -> dis = "Kurunegala"
            "15" -> dis = "Mannar"
            "16" -> dis = "Matale"
            "17" -> dis = "Matara"
            "18" -> dis = "Monaragala"
            "19" -> dis = "Mullaitivu"
            "20" -> dis = "Nuwara Eliya"
            "21" -> dis = "Polonnaruwa"
            "22" -> dis = "Puttalam"
            "23" -> dis = "Ratnapura"
            "24" -> dis = "Trincomalee"
            "25" -> dis = "Vavuniya"
        }

        return dis
    }

    fun getProvinceFromDistricts(districts: String): String {
        var pro = ""
        if ((districts == "Jaffna") || (districts == "Kilinochchi") || (districts == "Mannar") || (districts == "Mullaitivu") || (districts == "Vavuniya")) {
            pro = "Northern"
        } else if ((districts == "Puttalam") || (districts == "Kurunegala")) {
            pro = "North Western"
        } else if ((districts == "Gampaha") || (districts == "Colombo") || (districts == "Kalutara")) {
            pro = "Western"
        } else if ((districts == "Anuradhapura") || (districts == "Polonnaruwa")) {
            pro = "North Central"
        } else if ((districts == "Matale") || (districts == "Kandy") || (districts == "Nuwara Eliya")) {
            pro = "Central"
        } else if ((districts == "Kegalle") || (districts == "Ratnapura")) {
            pro = "Sabaragamuwa"
        } else if ((districts == "Trincomalee") || (districts == "Batticaloa") || (districts == "Ampara")) {
            pro = "Eastern"
        } else if ((districts == "Badulla") || (districts == "Moneragala")) {
            pro = "Uva"
        } else if ((districts == "Hambantota") || (districts == "Matara") || (districts == "Galle")) {
            pro = "Southern"
        }
        return pro
    }


    fun validateZipCode(cityList: List<City_v2>, code: String, city: String): Boolean {
        var result = false
        for (ci in cityList) {
            if (ci.name_en == city) {
                if (ci.postcode == code) {
                    result = true
                    return result
                }
            } else {
                false
            }
        }
        return result
    }


    suspend fun deleteAllCart() {
        dataDao.deleteAll()
    }


    suspend fun getDelivery(): Flow<Double> = callbackFlow {
        var deliveryCharges = 100.0
        var finalAddress = AppPrefs.getSelectAdressMaunalKeyValuePrefs(
            mContext!!,
            AppPrefs.KEY_SELECTED_USER_ADDERSS
        )

        if (finalAddress.address_id.toString().isEmpty()) {
            deliveryCharges = 00.00
        } else {
            deliveryCharges = 110.00
        }

        var zone = "0"

        var layocitylist: List<City_v2> = getCitys()



        for (city in layocitylist) {
            if (city.name_en == finalAddress.user_address_city) {
                zone = city.area
                break
            }

        }


        deliveryrRef?.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                dataSnapshot.children.forEach {
                    var post = Zone().apply {
                        id = it.child("id").value.toString().toLong()
                        area = it.child("area").value.toString()
                        delivery_time = it.child("delivery_time").value.toString()
                        delivery_charges = it.child("delivery_charges").value.toString().toDouble()

                    }
                    if (post.area == zone) {
                        deliveryCharges = post.delivery_charges
                    }

                }


                offer(deliveryCharges)
            }

            override fun onCancelled(error: DatabaseError) {
                offer(deliveryCharges)
            }
        })

        awaitClose { this.cancel() }
    }


    suspend fun checkPromocode(code: String): Flow<NetworkError> = callbackFlow {
        var erorr = NetworkError()
        when {
            (AppPrefs.checkValidString(code)) -> {
                erorr.errorMessage = "Enter promo code !"
                erorr.errorCode = appPref.ERROR_EMPTY_PROMOCODE
                AppPrefs.setSelectPromoKeyValuePrefs(
                    mContext,
                    AppPrefs.KEY_SELECTED_PROMO,
                    PromoCode()
                )

                offer(erorr)
            }
            (!InternetConnection.checkInternetConnection()) -> {
                offer(appPref.errorNoInternet())
            }
            else -> {
                val query: Query = promoCodeUseRef?.orderByChild("code")!!.equalTo(code)
                query?.addListenerForSingleValueEvent(object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        if (dataSnapshot.childrenCount == 0L) {
                            erorr.errorMessage = "Valid promo code !"
                            erorr.errorCode = appPref.SUCCESS_PROMOCODE_VALID
                            AppPrefs.setSelectPromoKeyValuePrefs(
                                mContext,
                                AppPrefs.KEY_SELECTED_PROMO,
                                PromoCode()
                            )

                            offer(erorr)

                        } else {
                            erorr.errorMessage = "Invalid promo code, Please try again !"
                            erorr.errorCode = appPref.ERROR_PROMOCODE_INVALID
                            AppPrefs.setSelectPromoKeyValuePrefs(
                                mContext,
                                AppPrefs.KEY_SELECTED_PROMO,
                                PromoCode()
                            )
                            offer(erorr)
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        offer(erorr)
                    }
                })


            }
        }
        awaitClose { this.cancel() }
    }

    suspend fun checkPromocodeUseage(code: String): Flow<NetworkError> = callbackFlow {
        var erorr = NetworkError()

        var sub = dataDao.getSubTotal()

        val query: Query = promoCodeRef?.orderByChild("promocode")!!.equalTo(code)
        query?.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if (dataSnapshot.childrenCount == 0L) {
                    erorr.errorMessage = "Invalid promo code, Please try again !"
                    erorr.errorCode = appPref.ERROR_PROMOCODE_INVALID
                    AppPrefs.setSelectPromoKeyValuePrefs(
                        mContext,
                        AppPrefs.KEY_SELECTED_PROMO,
                        PromoCode()
                    )
                    offer(erorr)

                } else {

                    var promoCode = PromoCode()
                    dataSnapshot.children.forEach {
                        it
                        promoCode = it.getValue(PromoCode::class.java)!!
                    }

                    if (!promoCode.promocode_validate) {
                        erorr.errorMessage = "Invalid promo code, Please try again !"
                        erorr.errorCode = appPref.ERROR_PROMOCODE_INVALID
                        AppPrefs.setSelectPromoKeyValuePrefs(
                            mContext, AppPrefs.KEY_SELECTED_PROMO,
                            PromoCode()
                        )

                    } else {
                        if (sub >= 1000) {
                            erorr.errorMessage = "Valid promo code !"
                            erorr.errorCode = appPref.SUCCESS_PROMOCODE_VALID
                            AppPrefs.setSelectPromoKeyValuePrefs(
                                mContext,
                                AppPrefs.KEY_SELECTED_PROMO,
                                promoCode
                            )

                            offer(erorr)

                        } else {
                            erorr.errorMessage =
                                "Invalid promo code,Minimum total must above 1000 Rs !"
                            erorr.errorCode = appPref.ERROR_PROMOCODE_INVALID
                            AppPrefs.setSelectPromoKeyValuePrefs(
                                mContext, AppPrefs.KEY_SELECTED_PROMO,
                                PromoCode()
                            )

                            offer(erorr)
                        }

                    }
                }
            }

            override fun onCancelled(error: DatabaseError) {
                offer(erorr)
            }
        })
        awaitClose { this.cancel() }
    }

    fun getCitys(): List<City_v2> {
        var citylist: ArrayList<City_v2> = ArrayList<City_v2>()
        Kesbewa.applicationContext().assets.open("cities_v2.json").use { inputStream ->
            JsonReader(inputStream.reader()).use { reader ->
                reader.beginArray()
                while (reader.hasNext()) {
                    var _id: String = ""
                    var _district_id: String = ""
                    var _name_en: String = ""
                    var _postcode: String = ""
                    var _latitude: String = ""
                    var _longitude: String = ""
                    var _area: String = ""
                    reader.beginObject()
                    while (reader.hasNext()) {
                        val name = reader.nextName()
                        when (name) {
                            "id" -> {
                                _id = reader.nextString()
                            }
                            "district_id" -> {
                                _district_id = reader.nextString()
                            }
                            "name_en" -> {
                                _name_en = reader.nextString()
                            }
                            "postcode" -> {
                                _postcode = reader.nextString()
                            }
                            "latitude" -> {
                                _latitude = reader.nextString()
                            }
                            "longitude" -> {
                                _longitude = reader.nextString()
                            }
                            "area" -> {
                                _area = reader.nextString()
                            }
                            else -> {
                                reader.skipValue()
                            }
                        }
                    }
                    reader.endObject()
                    var city = City_v2().apply {
                        id = _id
                        district_id = _district_id
                        name_en = _name_en
                        postcode = _postcode
                        latitude = _latitude
                        longitude = _longitude
                        area = _area

                    }
                    citylist.add(city)
                }
                reader.endArray()
                return citylist as List<City_v2>
            }
        }
    }

}
