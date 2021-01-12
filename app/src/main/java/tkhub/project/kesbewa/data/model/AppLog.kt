package tkhub.project.kesbewa.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AppLog(

    var log_code: String?,
    var log: String?,
    var androidID: String?


) : Parcelable {
    constructor() : this("",
        "",""
    )

}
