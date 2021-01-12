package tkhub.project.kesbewa.data.model.googlePlaceDetails

import com.google.gson.annotations.SerializedName

data class GooglePlaceDetails(
    @SerializedName("result")
    var result: Result,
    @SerializedName("status")
    var status: String
){
    constructor() : this(Result(), ""
    )

}