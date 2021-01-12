package tkhub.project.kesbewa.data.model

import com.google.gson.annotations.SerializedName


data class DeliveryAddress (
    @SerializedName("address_id")
    var address_id: String?,
    @SerializedName("user_id")
    var user_id: String?,
    @SerializedName("user_code")
    var user_code: String?,
    @SerializedName("user_lat")
    var user_lat: Double?,
    @SerializedName("user_lon")
    var user_lon: Double?,
    @SerializedName("user_address_number")
    var user_address_number: String,
    @SerializedName("user_address_one")
    var user_address_one: String,
    @SerializedName("user_address_two")
    var user_address_two: String?,
    @SerializedName("user_address_city")
    var user_address_city: String,
    @SerializedName("user_address_district")
    var user_address_district: String?,
    @SerializedName("user_address_province")
    var user_address_province: String?,
    @SerializedName("user_address_zip")
    var user_address_zip: String,
    @SerializedName("user_isSelect")
    var user_isSelect :Boolean = false


) {
    constructor() : this("","",
        "", 0.0,0.0,"","","","","","",
        "",false
    )

}
