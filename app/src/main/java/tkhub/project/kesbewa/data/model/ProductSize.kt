package tkhub.project.kesbewa.data.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
 data class ProductSize (
    var size: String = "",
    var price: Double = 0.0,
    var isAvailable : Boolean = true
) : Parcelable {

}