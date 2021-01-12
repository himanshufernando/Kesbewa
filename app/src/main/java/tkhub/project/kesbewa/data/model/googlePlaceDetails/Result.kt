package tkhub.project.kesbewa.data.model.googlePlaceDetails

import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("address_components")
    var address_components: List<AddressComponent>,
    @SerializedName("formatted_address")
    var formatted_address: String,
    @SerializedName("geometry")
    var geometry: Geometry
){

    constructor() : this(
        emptyList(), "",Geometry()
    )
}