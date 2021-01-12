package tkhub.project.kesbewa.data.model

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


@Entity(tableName = "carttable")
data class CartItem (
    @PrimaryKey
    var cart_id: Long?,
    var pro_id: Long?,
    var pro_name: String?,
    var pro_price: Double?,
    var pro_size: String?,
    var pro_image: String?,
    var pro_colour: String?,
    var pro_colour_code: String?,
    var pro_total_qty: Int?,
    var pro_total_price: Double?,
    var cartStatus: Boolean?,
    var pro_code: String?
) {
    constructor() : this(0, 0,"",0.0,
        "","", "",
        "", 0,0.0,false,""
    )

}