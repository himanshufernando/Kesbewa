package tkhub.project.kesbewa.data.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class FinalCheckoutAmount (
    var id: Long,
    var itemCount: Int,
    var discount: String,
    var deliveryCharges: Double,
    var subtotal:Double,
    var needtoPay: Double,
    var promoType: String,
    var delivery: String,
    var promoCode: String,
    var promo: PromoCode

) : Parcelable { constructor(): this(0,0 ,"",0.0,0.0,0.0,"","","",PromoCode())

}