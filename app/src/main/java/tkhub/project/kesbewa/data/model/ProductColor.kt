package tkhub.project.kesbewa.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
@Parcelize
 data class ProductColor (
    var color_name: String = "",
    var color_code: String= "",
    var isAvailable : Boolean = true
) : Parcelable {

}