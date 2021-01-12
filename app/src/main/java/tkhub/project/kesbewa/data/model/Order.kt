package tkhub.orderject.kesbewa.data.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import tkhub.project.kesbewa.data.model.CartItem
import tkhub.project.kesbewa.data.model.NetworkError


data class Order (
    var order_id: String?,
    var order_code: String?,
    var order_date: String?,
    var order_note: String?,
    var order_promo_code: String?,
    var order_subtotal_total: Double?,
    var order_total_qty: Int?,
    var order_total_price: Double?,
    var error : NetworkError?,
    var itemlist: List<CartItem>?

) {
    constructor() : this("", "0",
        "","", "",
        0.0, 0,0.0,NetworkError(),emptyList()
    )

}
