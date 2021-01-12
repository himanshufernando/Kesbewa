package tkhub.project.kesbewa.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PromoCode (
    var promocode_id: Long,
    var promo_type: Long,
    var promocode : String,
    var promocode_add_date: Long,
    var promocode_add_user: String,
    var promocode_type_code : String,
    var promocode_validate: Boolean,
    var promocode_value: Double
): Parcelable
{
    constructor(): this(0,0,"",0,"" ,"",true,0.0)
}