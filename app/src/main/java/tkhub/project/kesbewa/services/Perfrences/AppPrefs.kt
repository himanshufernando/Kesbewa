package tkhub.project.kesbewa.services.Perfrences

import android.app.Activity
import android.content.Context
import android.provider.Settings
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.gson.Gson
import tkhub.orderject.kesbewa.data.model.Order
import tkhub.project.kesbewa.Kesbewa
import tkhub.project.kesbewa.data.model.*
import java.util.*
import java.util.regex.Pattern

object AppPrefs {

    const val PREFNAME = "kesbewapref"

    const val KEY_SHOWCASE = "showcase"

    const val KEY_SPLASH_STATUS = "splash_status"
  //  const val KEY_USER_ID = "user_id"
    const val KEY_ORDER = "order_details"
    const val KEY_ADDTOCARTACTIONSTATUS = "add_to_cat_status"
    const val KEY_FRAGMENT_ID = "fragment_id"
    const val KEY_PUSH_TOKEN = "push_token"
    const val KEY_CURRENT_LOCATION = "current_location"
    const val KEY_MANUAL_LOCATION = "manual_location"
    //const val KEY_GUEST_USER_ID = "guest_user_id"
    const val KEY_SELECTED_USER_ADDERSS = "selected_user_address"
    const val KEY_SELECTED_PROMO = "selected_promo"
    const val KEY_USER = "user"
    const val KEY_GUEST_USER = "guest_user"
    const val KEY_DELIVERY_CHARGES = "delivery_charges"



    const val KEY_DISPATCH_STORE = "STORE"
    const val KEY_DISPATCH_DELIVERY = "DELIVERY"

    const val KEY_DISPATCH_NEGOMBO = "NEGOMBO"
    const val KEY_DISPATCH_KADAWATHA = "KADAWATHA"
    const val KEY_DISPATCH_COLOMBO = "COLOMBO"

    const val KEY_PUSH_TOKEN_PUBLISH = "Push_token_publish"
    const val KEY_ORDER_CONFIG = "Order_Config"



    //Error Code
    const val ERROR_USER_NAME_EMPTY = "UE"
    const val ERROR_PHONE_NUMBER_EMPTY = "PE"
    const val ERROR_EMAIL_EMPTY = "EE"
    const val ERROR_NIC_EMPTY = "NICE"
    const val ERROR_PASSWORD_EMPTY = "PWE"
    const val ERROR_PASSWORD_INVALID = "PWI"
    const val ERROR_PASSWORD_NOT_MATCH = "PWNM"
    const val ERROR_INTERNET = "IC"
    const val ERROR_SOMETHING_WENT_WRONG = "SW"
    const val ERROR_ACCOUNT_ALREADY_EXISTS = "AAE"

    const val ERROR_INCORRECT_LOGIN = "LOGGEDFAIL"
    const val ERROR_EMPTY_CART = "EC"
    const val ERROR_EMPTY_ADDRESS = "EA"
    const val ERROR_ORDER_NOT_SUCCESSFULLY = "OE"

    const val ERROR_EMPTY_ADDRESS_NUMBER = "EAN"
    const val ERROR_EMPTY_LOCATION = "LOC"
    const val ERROR_EMPTY_STREET_ADDRESS = "ESA"
    const val ERROR_EMPTY_CITY = "ECITY"
    const val ERROR_EMPTY_DISTRICT = "ED"
    const val ERROR_EMPTY_ZIP_CODE = "ZC"
    const val ERROR_INVALID_ZIP_CODE= "ZC"
    const val ERROR_EMPTY_CITYLIST = "ECITYLIST"
    const val ERROR_USERNAME_CHARACTERS_VIOLATION = "ESNCV"
    const val ERROR_MANUALLY_LOGGED = "EML"
    const val ERROR_NO_ACCOUNT = "ENA"
    const val ERROR_SIGN_USING_GOOGLE = "ESUG"
    const val ERROR_EMPTY_PASSWORD_RESET_CODE= "EEPRC"
    const val ERROR_NOT_RECEIVED_PASSWORD_RESET_REQUESTED= "ENRPRR"
    const val ERROR_INVALID_RESET_CODE= "EIRC"
    const val ERROR_PASSWORD_RESET_CODE_EXPIRED= "EPRCE"
    const val ERROR_PROMOCODE_INVALID= "EPI"
    const val ERROR_EMPTY_PROMOCODE = "EECODE"
    const val ERROR_EMPTY_DISPATCH_TYPE = "EEDT"
    const val ERROR_EMPTY_STORE_LOCATION = "EESL"
    const val ERROR_DISABLE_PICKUP = "EDP"
    const val ERROR_DISABLE_DELIVERY = "EDD"

    //success code
    const val SUCCESS_USER_SAVE = "USERSAVESUCCESS"
    const val SUCCESS_LOGGING = "LOGGED"
    const val SUCCESS_ORDER_SUCCESSFULLY = "OS"
    const val SUCCESS_ADDRESS_SAVE_SUCCESSFULLY = "ADDRESSSAVESUCCESS"
    const val SUCCESS_USER_UPDATE = "USERUPDATESUCCESS"
    const val SUCCESS_VERIFY_GOOGLE = "GOOGLEVERIFYSUCCESS"
    const val SUCCESS_PASSWORD_RESET_CODE = "SPRC"
    const val SUCCESS_PASSWORD_RESET = "SPR"
    const val SUCCESS_PROMOCODE_VALID = "SPCV"






    fun setShowCaseVisibilityPrefs(ctx: Context, value: Int) {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE) ?: return
        with(sharedPref.edit()) {
            putInt(KEY_SHOWCASE, value)
            commit()
        }
    }

    fun getShowCaseVisibilityPrefs(ctx: Context): Int {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE)
        return sharedPref.getInt(KEY_SHOWCASE, 0)
    }





    fun setOrderConfigPrefs(ctx: Context, value: OrderConfigLog) {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE) ?: return
        with(sharedPref.edit()) {
            putString(KEY_ORDER_CONFIG, Gson().toJson(value))
            commit()
        }
    }

    fun getOrderConfigPrefs(ctx: Context): OrderConfigLog {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE)
        var defConfig = OrderConfigLog()

        return if(sharedPref.getString(KEY_ORDER_CONFIG, null)==null){
            defConfig
        }else{
            Gson().fromJson(sharedPref.getString(KEY_ORDER_CONFIG, null), OrderConfigLog::class.java)
        }

    }





    fun setPushTokenPublishPrefs(ctx: Context, status: Boolean) {
        val sharedPref = ctx.getSharedPreferences(PREFNAME, Context.MODE_PRIVATE) ?: return
        with(sharedPref.edit()) {
            putBoolean(KEY_PUSH_TOKEN_PUBLISH, status)
            commit()
        }
    }

    fun getPushTokenPublishPrefs(ctx: Context): Boolean {
        val sharedPref = ctx.getSharedPreferences(PREFNAME, Context.MODE_PRIVATE)
        return sharedPref.getBoolean(KEY_PUSH_TOKEN_PUBLISH, true)
    }

    fun setDeliveryChargesPrefs(ctx: Context, value: Float) {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE) ?: return
        with(sharedPref.edit()) {
            putFloat(KEY_DELIVERY_CHARGES, value)
            commit()
        }
    }

    fun getDeliveryChargesPrefs(ctx: Context): Float {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE)
        return sharedPref.getFloat(KEY_DELIVERY_CHARGES, 0.0F)
    }





    fun setUserPrefs(ctx: Context, key: String, value: User) {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE) ?: return
        with(sharedPref.edit()) {
            putString(key, Gson().toJson(value))
            commit()
        }
    }

    fun getUserPrefs(ctx: Context, key: String): User {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE)
        var defUser = User()

        if(sharedPref.getString(key, null)==null){
            return defUser
        }else{
            return Gson().fromJson(sharedPref.getString(key, null), User::class.java)
        }

    }



    fun setSelectPromoKeyValuePrefs(ctx: Context, key: String, value: PromoCode) {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE) ?: return
        with(sharedPref.edit()) {
            putString(key, Gson().toJson(value))
            commit()
        }
    }

    fun getSelectPromoKeyValuePrefs(ctx: Context, key: String): PromoCode {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE)
        var defPromo = PromoCode()

        if(sharedPref.getString(key, null)==null){
            return defPromo
        }else{
            return Gson().fromJson(sharedPref.getString(key, null), PromoCode::class.java)
        }

    }


    fun setSelectAdressManualKeyValuePrefs(ctx: Context, key: String, value: DeliveryAddress) {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE) ?: return
        with(sharedPref.edit()) {
            putString(key, Gson().toJson(value))
            commit()
        }
    }

    fun getSelectAdressMaunalKeyValuePrefs(ctx: Context, key: String): DeliveryAddress {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE)
        var defAdders = DeliveryAddress()

        if(sharedPref.getString(key, null)==null){
            return defAdders
        }else{
            return Gson().fromJson(sharedPref.getString(key, null), DeliveryAddress::class.java)
        }

    }


    fun setLocationManualKeyValuePrefs(ctx: Context, key: String, value: ManualLocation) {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE) ?: return
        with(sharedPref.edit()) {
            putString(key, Gson().toJson(value))
            commit()
        }
    }

    fun getLocationMaunalKeyValuePrefs(ctx: Context, key: String): ManualLocation {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE)
        var defLocation = ManualLocation()

        if(sharedPref.getString(key, null)==null){
            return defLocation
        }else{
            return Gson().fromJson(sharedPref.getString(key, null), ManualLocation::class.java)
        }

    }

    fun setLocationKeyValuePrefs(ctx: Context, key: String, value: CurrentLocation) {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE) ?: return
        with(sharedPref.edit()) {
            putString(key, Gson().toJson(value))
            commit()
        }
    }

    fun getLocationKeyValuePrefs(ctx: Context, key: String): CurrentLocation {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE)
        return Gson().fromJson(sharedPref.getString(key, null), CurrentLocation::class.java)

    }

    fun setIntKeyValuePrefs(ctx: Context, key: String, value: Int) {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE) ?: return
        with(sharedPref.edit()) {
            putInt(key, value)
            commit()
        }
    }

    fun getIntKeyValuePrefs(ctx: Context, key: String): Int {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE)
        return sharedPref.getInt(key, 0)
    }



    fun setStringKeyValuePrefs(ctx: Context, key: String, value: String) {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE) ?: return
        with(sharedPref.edit()) {
            putString(key, value)
            commit()
        }
    }

    fun getStringKeyValuePrefs(ctx: Context, key: String): String {
        val sharedPref = ctx.getSharedPreferences(PREFNAME,Context.MODE_PRIVATE)
        return sharedPref.getString(key,"0").toString()
    }

    fun setOrderValuePrefs(activity: Activity, key: String, value: Order) {
        val sharedPref = activity.getPreferences(Context.MODE_PRIVATE) ?: return
        with(sharedPref.edit()) {
            putString(key, Gson().toJson(value))
            commit()
        }
    }

    fun getCartValuePrefs(activity: Activity, key: String): Order {
        val sharedPref = activity.getPreferences(Context.MODE_PRIVATE)
        val response = sharedPref.getString(key, null).toString()
        return Gson().fromJson(response, Order::class.java)
    }

    fun genarateUniqOrderCode(code: String): String {
        var delimiter = "-"
        val parts =code?.split(delimiter)
        return "O"+((1..100).random()).toString()+ parts[0]+((1..100).random()).toString()
    }



  /*  fun genarateUniqCode(): Long {
        val c: Calendar = Calendar.getInstance()
        var numberFromTime =
            c.get(Calendar.MONTH).toString() +
                    c.get(Calendar.DATE).toString() +
                    c.get(Calendar.YEAR).toString() +
                    c.get(Calendar.HOUR).toString() +
                    c.get(Calendar.MINUTE).toString() +
                    c.get(Calendar.SECOND).toString() +
                    c.get(Calendar.MILLISECOND).toString() + ((1..1000).random()).toString()

        return numberFromTime.toLong()
    }*/

    fun validateNIC(nic: String): Boolean {
        return when {
            nic.isNullOrEmpty() -> {
                false
            }
            nic.length == 12 -> {
                val c: Calendar = Calendar.getInstance()
                ((c.get(Calendar.YEAR).toString().toInt()) - (nic.substring(0, 4).toString()
                    .toInt())) > 15
            }
            nic.length == 10 -> {
                if (nic.substring(0, 8).matches(("[0-9]+").toRegex())) {
                    (nic[9].toString().equals("V", true)) || (nic[9].toString().equals("X", true))
                } else {
                    false
                }
            }
            else -> {
                false
            }
        }
    }

    fun validateEmailAddress(email: String): Boolean {
        return Pattern.compile(
            "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]|[\\w-]{2,}))@"
                    + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                    + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9]))|"
                    + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$"
        ).matcher(email).matches()
    }

    fun checkValidString(st: String): Boolean {
        if ((st.isNullOrEmpty()) || (st== "null")) {
            return true
        }
        return false
    }


    fun getAndroidid():String{
        return Settings.Secure.getString(Kesbewa.applicationContext().contentResolver, Settings.Secure.ANDROID_ID)
    }

    fun encrypPassword(key : String):String{
        var count  = 1
        var encriptordpassword = ""
        for(element in  key.reversed()){
            val remainder = count % 3
            if((count % 3)==0){
                encriptordpassword += element.toInt()
            }else{
                encriptordpassword += element
            }
            count++
        }
        return encriptordpassword.reversed()
    }


    fun errorSomethingWentWrong() : NetworkError{
        return NetworkError(0,this.ERROR_SOMETHING_WENT_WRONG,"Something went wrong please try again !","Error",false,0)
    }
    fun errorNoInternet() : NetworkError{
        return NetworkError(0,this.ERROR_INTERNET,"No internet access please check your connection and retry !","Internet",false,0)
    }
}