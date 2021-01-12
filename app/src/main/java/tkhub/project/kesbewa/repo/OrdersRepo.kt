package tkhub.project.kesbewa.repo

import android.content.Context
import com.google.firebase.database.*
import com.google.gson.stream.JsonReader
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow

import tkhub.project.kesbewa.Kesbewa
import tkhub.project.kesbewa.data.db.OrderDao
import tkhub.project.kesbewa.data.model.*
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.services.network.InternetConnection
import java.util.*

class OrdersRepo( context: Context) {

    var mContext = context
    var database: FirebaseDatabase? = FirebaseDatabase.getInstance()
    var orderRef: DatabaseReference? = database?.getReference("KOrders")
    var appPref = AppPrefs



    suspend fun getUserOrders(): Flow<ArrayList<OrderRespons>?> = callbackFlow {
        var user = AppPrefs.getUserPrefs(mContext!!, AppPrefs.KEY_USER)

        val query: Query = orderRef?.orderByChild("order_user_id")!!.equalTo(user.user_id)
        query.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                var list = ArrayList<OrderRespons>()
                dataSnapshot.children.forEach {it
                    val post = it.getValue(OrderRespons::class.java)
                    list.add(post!!)

                }
                offer(list)

            }

            override fun onCancelled(error: DatabaseError) {
                offer(null)
            }
        })

        awaitClose { this.cancel() }

    }





}
