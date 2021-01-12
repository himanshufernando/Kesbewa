package tkhub.project.kesbewa.data.model

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class OrderRespons (
    var order_id: String = "",
    var order_code: String = "",
    var order_user_id: String = "",
    var order_android_id: String = "",
    var order_date: Long = 0,
    var order_note: String = "",
    var order_promo_code: String = "",
    var order_promo_code_id: Long= 0,
    var order_promo : PromoCode = PromoCode(),
    var order_payment_type_code: String = "",
    var order_payment_type: String = "",
    var order_total_qty: Int = 0,
    var order_discount: Double = 0.0,
    var order_subtotal_total: Double= 0.0,
    var order_total_price: Double= 0.0,
    var order_delivery_chargers: Double= 0.0,
    var order_status: String = "",
    var order_status_code: Int = 0,
    var order_status_note: String = "",
    var order_delivery_time: String = "",
    var delivery_address : DeliveryAddress = DeliveryAddress(),
    var user : User = User(),
    var itemlist: List<CartItem> = emptyList(),
    var order_dispatch_type : String = "",
    var order_store_location : String = ""

) {


}
