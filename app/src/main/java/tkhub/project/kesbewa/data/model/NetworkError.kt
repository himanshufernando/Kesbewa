package tkhub.project.kesbewa.data.model

class NetworkError ( var code: Int = 0,
                     var errorCode: String = "",
                     var errorMessage: String= "",
                     var errorTitle: String= "",
                     var errorStatus: Boolean= false,
                     var activityActionStatus: Int= 0,
                     var errorData: String= ""
                     ) {}