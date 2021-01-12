package tkhub.project.kesbewa.data.model


data class Zone (
    var id: Long,
    var area: String,
    var delivery_time: String,
    var delivery_charges: Double
) {

    constructor(): this(0,"","",0.0 )

}
