package tkhub.orderject.kesbewa.data.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import tkhub.project.kesbewa.data.model.CartItem
import tkhub.project.kesbewa.data.model.NetworkError


data class Password (
    var code_id: String,
    var code: Long,
    var date: Long,
    var phone: String,
    var user: String,
    var user_email: String,
    var user_phone: String,
    var code_exp : Boolean

) {
    constructor() : this("",0, 0,
        "","","","",false
    )

}
