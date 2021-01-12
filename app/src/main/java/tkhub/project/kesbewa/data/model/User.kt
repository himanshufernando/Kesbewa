package tkhub.project.kesbewa.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    var user_id: String?,
    var user_code: String?,
    var user_name: String?,
    var user_phone: String?,
    var user_email: String?,
    var user_nic: String?,
    var user_login: String?,
    var user_pro_pic: String?,
    var user_android_id: String?,
    var user_type: Long?,
    var push_id: String?,
    var user_confirm_password: String,
    var user_google : Boolean,
    var user_google_id: String

) : Parcelable {
    constructor() : this("",
        "", "",
        "", "", "",
        "", "","",0,"","",false,""
    )

}
