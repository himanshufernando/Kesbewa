package tkhub.project.kesbewa.data.model.googlePlaceDetails

import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("lat")
    var lat: Double,
    @SerializedName("lng")
    var lng: Double
){
    constructor() : this(0.0, 0.0
    )

}