package tkhub.project.kesbewa.data.model.googlePlaceDetails

import com.google.gson.annotations.SerializedName

data class Geometry(
    @SerializedName("location")
    var location: Location
){
    constructor() : this(Location())
}