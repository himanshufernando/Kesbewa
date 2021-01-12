package tkhub.project.kesbewa.data.model




data class VersionRespons (
    var app_url: String,
    var version: String,
    var version_message: String,
    var version_code: Long,
    var critical : Long,
    var is_version_validate : Boolean,
    var special_image: String,
    var special_note: String,
    var special_note_critical: Long,
    var special_note_availability: Long



) {
    constructor() : this("","","",
        1,1,true,"","",0,0
    )

}
