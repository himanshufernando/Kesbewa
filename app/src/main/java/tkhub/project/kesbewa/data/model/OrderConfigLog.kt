package tkhub.project.kesbewa.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class OrderConfigLog(
    var order_pickup: Boolean?,
    var order_pickup_disable_reason:String,
    var order_delivery: Boolean?,
    var order_delivery_disable_reason:String


) : Parcelable {
    constructor() : this(false,"",false,""
    )

}
