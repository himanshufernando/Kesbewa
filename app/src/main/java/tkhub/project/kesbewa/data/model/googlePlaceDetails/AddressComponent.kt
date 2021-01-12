package tkhub.project.kesbewa.data.model.googlePlaceDetails

import com.google.gson.annotations.SerializedName

data class AddressComponent(
    @SerializedName("long_name")
    var long_name: String,
    @SerializedName("short_name")
    var short_name: String
){
    constructor() : this("", ""
    )
}