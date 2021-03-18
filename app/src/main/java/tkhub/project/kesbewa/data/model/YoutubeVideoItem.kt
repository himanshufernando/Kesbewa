package tkhub.project.kesbewa.data.model
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class YoutubeVideoItem (
    var id: Long,
    var title: String,
    var description: String,
    var thumbnailURL:String,
    var youtubeid : String,
    var channelName : String,
    var youtubeURL : String

) : Parcelable {
    constructor() : this(0, "",
        "","","0","",""
    )

}
