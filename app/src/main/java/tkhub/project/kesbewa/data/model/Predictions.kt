package tkhub.project.kesbewa.data.model

import com.google.gson.annotations.SerializedName


data class Predictions (
    @SerializedName("predictions")
    var predictions : ArrayList<GooglePlace>,
    @SerializedName("status")
    var status : String,
    @SerializedName("error_message")
    var error_message: String
){
    constructor() : this(ArrayList<GooglePlace>(), "0","")
}