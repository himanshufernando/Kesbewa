package tkhub.project.kesbewa.repo

import android.animation.ValueAnimator
import android.app.Activity
import android.content.pm.PackageManager
import android.os.Build
import androidx.lifecycle.MutableLiveData
import com.google.firebase.database.*
import com.google.firebase.database.ktx.getValue
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import tkhub.orderject.kesbewa.data.model.Order
import tkhub.project.kesbewa.Kesbewa
import tkhub.project.kesbewa.data.db.OrderDao
import tkhub.project.kesbewa.data.model.*
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.services.network.InternetConnection
import java.util.*
import java.util.regex.Pattern
import kotlin.collections.ArrayList

class HomeRepo(val dataDao: OrderDao) {


    var database: FirebaseDatabase? = FirebaseDatabase.getInstance()
    var productRef: DatabaseReference? = database?.getReference("Products")
    var productImagesRef: DatabaseReference? = database?.getReference("ProductImages")
    var userRef: DatabaseReference? = database?.getReference("User")
    var orderConfigRef: DatabaseReference? = database?.getReference("OrderConfig")
    var appPref = AppPrefs

    var databaseEmptyRef = database?.reference



    suspend fun getOrderConfig() {
        orderConfigRef?.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val post = dataSnapshot.getValue(OrderConfigLog::class.java)
                if (post != null) {
                    appPref.setOrderConfigPrefs(Kesbewa.applicationContext(),post)
                }
            }

            override fun onCancelled(error: DatabaseError) {

            }
        })


    }



    suspend fun getProductsImages(proID: Long): Flow<ArrayList<ProductImage>?> = callbackFlow {
        var productImages = ArrayList<ProductImage>()

        val query: Query = productImagesRef!!.orderByChild("pro_id").equalTo(proID.toString())
        query.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                var count = 1
                for (postSnapshot in dataSnapshot.children) {
                    val post = postSnapshot.getValue(ProductImage::class.java)
                    post?.item_tot_count = dataSnapshot.childrenCount.toInt()
                    post?.item_count = count

                    productImages.add(post!!)
                    count++
                }
                offer(productImages)
            }
            override fun onCancelled(error: DatabaseError) {
                offer(null)
            }
        })

        awaitClose { this.cancel() }
    }


    suspend fun getProductsSize(proID: Long): Flow<ArrayList<ProductSize>?> = callbackFlow {
        var productSize = ArrayList<ProductSize>()
        val ref =
            database?.getReference("Products")!!.child(proID.toString()).child("size")
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (postSnapshot in dataSnapshot.children) {
                    val post = postSnapshot.getValue(ProductSize::class.java)
                    if (post?.isAvailable!!) {
                        productSize.add(post)
                    }
                }
                offer(productSize)


            }

            override fun onCancelled(error: DatabaseError) {
                offer(null)

            }
        })

        awaitClose { this.cancel() }
    }


    suspend fun getProductsColor(proID: Long): Flow<ArrayList<ProductColor>?> = callbackFlow {
        var productColor = ArrayList<ProductColor>()
        val ref = database?.getReference("Products")!!.child(proID.toString()).child("color")
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                productColor.clear()
                for (postSnapshot in dataSnapshot.children) {
                    val post = postSnapshot.getValue(ProductColor::class.java)
                    if (post?.isAvailable!!) {
                        productColor.add(post)
                    }
                }
                offer(productColor)

            }

            override fun onCancelled(error: DatabaseError) {
                offer(null)

            }
        })

        awaitClose { this.cancel() }
    }


    suspend fun getProducts(): Flow<ArrayList<Products>?> = callbackFlow {
        var productList = ArrayList<Products>()

        productRef?.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (postSnapshot in dataSnapshot.children) {
                    val post = postSnapshot.getValue(Products::class.java)
                    productList.add(post!!)
                }
                offer(productList)

            }

            override fun onCancelled(error: DatabaseError) {
                offer(null)
            }
        })


        awaitClose { this.cancel() }
    }

    suspend fun getProductFilter(list: MutableLiveData<ArrayList<Products>>,searchName: String): ArrayList<Products> {
        var resultProductList = ArrayList<Products>()
        if ((searchName.isEmpty()) || (searchName == "all") || (searchName == "")) {
            resultProductList = list.value!!
        } else {
            for (pro in list.value!!) {
                val pattern = Pattern.compile(searchName, Pattern.CASE_INSENSITIVE)
                val matcher = pattern.matcher(pro.pro_name.toString())
                if (matcher.lookingAt()) {
                    resultProductList.add(pro)
                }

                val matcherMake = pattern.matcher(pro.pro_make.toString())
                if (matcherMake.lookingAt()) {
                    resultProductList.add(pro)
                }

                val matcherPrice = pattern.matcher(pro.pro_price.toString())
                if (matcherPrice.lookingAt()) {
                    resultProductList.add(pro)
                }

            }
            resultProductList.distinctBy { it.pro_id }
        }
        return resultProductList

    }


    suspend fun calculateTotal(qty: Int, price: Double): Double {
        return qty * price
    }

    suspend fun addtocart(
        pro: Products?,
        proSize: ProductSize?,
        proColour: ProductColor?,
        qty: Int?,
        total: Double?,
        actionStatus: Int
    ): Order {
        val order = Order()
        val errorOrder = NetworkError()

        errorOrder.errorStatus = true
        errorOrder.errorTitle = "Error"
        errorOrder.activityActionStatus = actionStatus
        if (pro == null) {
            errorOrder.errorMessage = "Please go back and select the product again !"
        } else if (proSize == null) {
            errorOrder.errorMessage = "Please select the Size!"
        } else if (proColour == null) {
            errorOrder.errorMessage = "Please select the Color!"
        } else if (qty == 0) {
            errorOrder.errorMessage = "Please add the quantity!"
        } else {
            val checkItemAviablity =
                dataDao.checkItemAlreadyAdded(pro.pro_id!!, proSize.size!!, proColour.color_code!!)
            if (checkItemAviablity != 0) {
                errorOrder.errorStatus = true
                errorOrder.errorMessage = "This item is already added!"
            } else {
                errorOrder.errorStatus = false


                var key = genarateUniqCode()
                println("aaaaa key :" + key)

                val cartItem = CartItem(
                    key,
                    pro.pro_id,
                    pro.pro_name,
                    proSize.price,
                    proSize.size,
                    pro.pro_cover_img,
                    proColour.color_name,
                    proColour.color_code,
                    qty,
                    total,
                    true,
                    pro.pro_code
                )
                dataDao.insertCart(cartItem)
            }
        }
        order.error = errorOrder
        return order
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

    suspend fun getCartCount(): Int {
        return dataDao.getCartCount()
    }

    suspend fun deleteAllCart() {
        dataDao.deleteAll()
    }

    suspend fun validateGoogleDetails(user: User): Flow<NetworkError> = callbackFlow {
        userRef?.keepSynced(false)
        var errorSaveUser = NetworkError()

        when {
            (AppPrefs.checkValidString(user.user_email!!)) -> {
                errorSaveUser.errorMessage = "We are unable find email address !"
                errorSaveUser.errorCode = appPref.ERROR_EMAIL_EMPTY
                offer(errorSaveUser)
            }

            (!InternetConnection.checkInternetConnection()) -> {
                offer(appPref.errorNoInternet())
            }
            else -> {
                val query: Query = userRef?.orderByChild("user_email")!!.equalTo(user.user_email!!)
                query.addListenerForSingleValueEvent(object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        if (dataSnapshot.childrenCount == 0L) {
                            errorSaveUser.errorCode = appPref.SUCCESS_VERIFY_GOOGLE
                            offer(errorSaveUser)

                        } else {
                            dataSnapshot.children.forEach {it
                                var logUser = it.getValue(User::class.java)!!

                                if(logUser.user_google){
                                    if (logUser.user_name.isNullOrEmpty()) {
                                        offer(appPref.errorSomethingWentWrong())
                                        return
                                    }else{
                                        var pushid = AppPrefs.getStringKeyValuePrefs(Kesbewa.applicationContext(), AppPrefs.KEY_PUSH_TOKEN)
                                        AppPrefs.setUserPrefs(Kesbewa.applicationContext(), AppPrefs.KEY_USER, logUser)
                                        databaseEmptyRef!!.child("User").child(logUser.user_id!!).child("push_id").setValue(pushid)
                                        errorSaveUser.errorMessage = "You are successfully logged in !"
                                        errorSaveUser.errorCode = appPref.SUCCESS_LOGGING
                                        offer(errorSaveUser)
                                        return
                                    }
                                }else{
                                    var pushid = AppPrefs.getStringKeyValuePrefs(Kesbewa.applicationContext(), AppPrefs.KEY_PUSH_TOKEN)
                                    AppPrefs.setUserPrefs(Kesbewa.applicationContext(), AppPrefs.KEY_USER, logUser)
                                    databaseEmptyRef!!.child("User").child(logUser.user_id!!).child("push_id").setValue(pushid)
                                    databaseEmptyRef!!.child("User").child(logUser.user_id!!).child("user_google").setValue(true)
                                    databaseEmptyRef!!.child("User").child(logUser.user_id!!).child("user_google_id").setValue(user.user_google_id)
                                    databaseEmptyRef!!.child("User").child(logUser.user_id!!).child("user_login").setValue("")

                                    errorSaveUser.errorMessage = "You are successfully logged in !"
                                    errorSaveUser.errorCode = appPref.SUCCESS_LOGGING
                                    offer(errorSaveUser)

                                 //   errorSaveUser.errorMessage = "You are already registered in manually, Please log in !"
                                  //  errorSaveUser.errorCode = appPref.ERROR_MANUALLY_LOGGED
                                  //  offer(errorSaveUser)
                                    return
                                }

                            }
                            errorSaveUser.errorMessage = "You have account for this mobile number please login !"
                            errorSaveUser.errorCode = AppPrefs.ERROR_ACCOUNT_ALREADY_EXISTS
                            offer(errorSaveUser)
                            return
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        offer(appPref.errorSomethingWentWrong())
                    }
                })

            }
        }

        awaitClose { this.cancel() }
    }

    suspend fun checkPushID(id : Int) : Flow<NetworkError> = callbackFlow {
        userRef?.keepSynced(false)
        var errorSaveUser = NetworkError()
        var user = AppPrefs.getUserPrefs(Kesbewa.applicationContext(), AppPrefs.KEY_USER)

        when {
            (user == null) -> {
                offer(errorSaveUser)
            }
            (!InternetConnection.checkInternetConnection()) -> {
                offer(errorSaveUser)
            }
            else -> {
                val query: Query = userRef?.orderByChild("user_phone")!!.equalTo(user.user_phone)
                query.addListenerForSingleValueEvent(object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        if (dataSnapshot.childrenCount == 0L) {
                        } else {
                            dataSnapshot.children.forEach {it
                                var logUser = it.getValue(User::class.java)!!
                                var pushid = AppPrefs.getStringKeyValuePrefs(Kesbewa.applicationContext(), AppPrefs.KEY_PUSH_TOKEN)

                                if(logUser.push_id == pushid){
                                }else{
                                    databaseEmptyRef!!.child("User").child(logUser.user_id!!).child("push_id").setValue(pushid)
                                }



                            }

                            return
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {

                    }
                })

            }
        }

        awaitClose { this.cancel()
        }
    }



}