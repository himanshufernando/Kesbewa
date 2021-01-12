package tkhub.project.kesbewa.data.model

import com.google.gson.annotations.SerializedName

data class GooglePlace (
    @SerializedName("description")
    var description :String,
    @SerializedName("id")
    var id :String,
    @SerializedName("place_id")
    var place_id :String,
    @SerializedName("reference")
    var reference : String
){
    constructor() : this("", "",
        "",""
    )
}