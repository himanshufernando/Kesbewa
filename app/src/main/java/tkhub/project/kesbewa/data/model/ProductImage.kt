package tkhub.project.kesbewa.data.model

import com.google.firebase.database.IgnoreExtraProperties
import com.google.gson.annotations.SerializedName

@IgnoreExtraProperties
data class ProductImage (
    @SerializedName("img_id")
    var img_id: Long = 0,
    @SerializedName("img_url")
    var img_url: String = "",
    @SerializedName("pro_id")
    var pro_id : String = "",
    @SerializedName("item_count")
    var item_count : Int = 0,
    @SerializedName("item_tot_count")
    var item_tot_count : Int =0
)
{

}