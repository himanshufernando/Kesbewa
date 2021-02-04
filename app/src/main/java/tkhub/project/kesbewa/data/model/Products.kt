package tkhub.project.kesbewa.data.model

import android.os.Parcelable
import com.google.firebase.database.IgnoreExtraProperties
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@IgnoreExtraProperties
@Parcelize
data class Products (
    @SerializedName("pro_id")
    var pro_id: Long = 0,
    @SerializedName("pro_name")
    var pro_name: String = "",
    @SerializedName("pro_price")
    var pro_price: Double = 1.0,
    @SerializedName("pro_make")
    var pro_make: String = "",
    @SerializedName("pro_description")
    var pro_description: String= "",
    @SerializedName("pro_cover_img")
    var pro_cover_img: String= "",
    @SerializedName("pro_catagory")
    var pro_catagory: String= "",
    @SerializedName("pro_code")
    var pro_code: String= "",
    @SerializedName("sold_out")
    var sold_out: Boolean = false,
    @SerializedName("pro_sort")
    var pro_sort : Int= 0,
    @SerializedName("pro_video")
    var pro_video : String = "",
    @SerializedName("pro_note")
    var pro_note : String = "",
    @SerializedName("pro_price_regular")
    var pro_price_regular : Double = 1.0,
    @SerializedName("pro_weight")
    var pro_weight : Double = 1.0,
    @SerializedName("pro_stock")
    var pro_stock : Int = 0


) : Parcelable {
}