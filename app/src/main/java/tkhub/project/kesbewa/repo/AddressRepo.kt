package tkhub.project.kesbewa.repo


import android.content.Context
import android.location.Location
import com.google.firebase.database.*
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import tkhub.project.kesbewa.data.model.*

import tkhub.project.kesbewa.data.model.googlePlaceDetails.GooglePlaceDetails
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.services.api.APIInterface
import tkhub.project.kesbewa.services.network.InternetConnection
import java.util.*
import kotlin.collections.ArrayList

class AddressRepo(context: Context,var client: APIInterface) {

    var mContext = context

    var database: FirebaseDatabase? = FirebaseDatabase.getInstance()
    var addresRef: DatabaseReference? = database?.getReference("Address")!!
    var appPrefs = AppPrefs


    suspend fun saveUserAddress(
        address: DeliveryAddress,
        location: Location?,
        cltylist: List<City_v2>?
    ): Flow<NetworkError?> = callbackFlow {
        var errorAddress = NetworkError()

        when {
            appPrefs.checkValidString(address.user_address_number) -> {
                errorAddress.errorMessage = "Enter your address number!"
                errorAddress.errorCode = appPrefs.ERROR_EMPTY_ADDRESS_NUMBER
                this.offer(errorAddress)

            }
            location == null -> {
                errorAddress.errorMessage = "We are having trouble to locate you !"
                errorAddress.errorCode = appPrefs.ERROR_EMPTY_LOCATION
                this.offer(errorAddress)

            }
            appPrefs.checkValidString(address.user_address_one) -> {
                errorAddress.errorMessage = "Enter your street address !"
                errorAddress.errorCode = appPrefs.ERROR_EMPTY_STREET_ADDRESS
                this.offer(errorAddress)

            }
            appPrefs.checkValidString(address.user_address_city) -> {
                errorAddress.errorMessage = "Select your city !"
                errorAddress.errorCode = appPrefs.ERROR_EMPTY_CITY
                this.offer(errorAddress)

            }
            address.user_address_district == "Select your district" -> {
                errorAddress.errorMessage = "Select your district !"
                errorAddress.errorCode = appPrefs.ERROR_EMPTY_DISTRICT
                this.offer(errorAddress)

            }
         /*   appPrefs.checkValidString(address.user_address_zip) -> {
                errorAddress.errorMessage = "Enter Zip Code !"
                errorAddress.errorCode = appPrefs.ERROR_EMPTY_ZIP_CODE
                this.offer(errorAddress)

            }*/
            cltylist == null -> {
                errorAddress.errorMessage = "Empty City list !"
                errorAddress.errorCode = appPrefs.ERROR_EMPTY_CITYLIST
                this.offer(errorAddress)

            }
           /* !validateZipCode(cltylist, address.user_address_zip, address.user_address_city) -> {
                errorAddress.errorMessage = "Enter valid Zip Code !"
                errorAddress.errorCode = appPrefs.ERROR_EMPTY_ZIP_CODE
                this.offer(errorAddress)

            }*/
            (!InternetConnection.checkInternetConnection()) -> {
                this.offer(appPrefs.errorNoInternet())

            }
            else -> {

                var unxId = genarateUniqCode()
                address.address_id = unxId.toString()
                addresRef?.child(unxId.toString())?.setValue(address)

                errorAddress.errorMessage = "New Address added successfully"
                errorAddress.errorCode = appPrefs.SUCCESS_ADDRESS_SAVE_SUCCESSFULLY
                offer(errorAddress)


            }
        }
        awaitClose { this.cancel() }
    }


    fun genarateUniqCode(): Long {
        val c: Calendar = Calendar.getInstance()
        var numberFromTime =
            c.get(Calendar.DATE).toString() +
                    c.get(Calendar.HOUR).toString() +
                    c.get(Calendar.MINUTE).toString() +
                    c.get(Calendar.SECOND).toString() +
                    c.get(Calendar.MILLISECOND).toString() + ((1..100000).random()).toString()

        return numberFromTime.toLong()
    }

    fun validateZipCode(cityList: List<City_v2>, code: String, city: String): Boolean {
        var result = false
        for (ci in cityList) {
            if (ci.name_en.equals(city)) {
                if (ci.postcode.equals(code)) {
                    result = true
                    return result
                }
            } else {
                false
            }
        }
        return result
    }

    suspend fun getUserAddress(): Flow<ArrayList<DeliveryAddress>?> = callbackFlow {
        var user = AppPrefs.getUserPrefs(mContext!!, AppPrefs.KEY_USER)
        val query: Query = addresRef?.orderByChild("user_id")!!.equalTo(user.user_id)

        query.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                var list = ArrayList<DeliveryAddress>()
                for (postSnapshot in dataSnapshot.children) {
                    val post = postSnapshot.getValue(DeliveryAddress::class.java)
                    list.add(post!!)
                }

                offer(list)

            }

            override fun onCancelled(error: DatabaseError) {
                offer(null)
            }

        })

        awaitClose { this.cancel() }

    }

    suspend fun getplaces(query: String): Predictions {
        var predictions= Predictions()
        predictions.status = appPrefs.ERROR_SOMETHING_WENT_WRONG
        when {
            !InternetConnection.checkInternetConnection()-> {
                predictions.status = appPrefs.ERROR_INTERNET
                return predictions
            }
            else -> {
                var fullUrl ="autocomplete/json?input="+query+"&key=AIzaSyCadvXU07bgvPrIPH93nb4gsR1NHkLvqoY&components=country:LK"
                predictions = client.getPlaces(fullUrl)
                return predictions
            }
        }
    }

    suspend fun getplacesDetails(placeid: String): GooglePlaceDetails {
        var googlePlaceDetails= GooglePlaceDetails()
        googlePlaceDetails.status = appPrefs.ERROR_SOMETHING_WENT_WRONG
        when {
            !InternetConnection.checkInternetConnection()-> {
                googlePlaceDetails.status = appPrefs.ERROR_INTERNET
                return googlePlaceDetails
            }
            else -> {
             //   https://maps.googleapis.com/maps/api/place/details/json?placeid=ChIJX4U5QK1b4joRZ5cyzk_eSik&key=AIzaSyC64yP9i7xjclQ0MTd64mC1BiP6ygbIwJM&fields=geometry,adr_address,formatted_address,place_id,utc_offset,address_components&components=country:LK
                  var fullUrl ="details/json?placeid="+placeid+"&key=AIzaSyCadvXU07bgvPrIPH93nb4gsR1NHkLvqoY&fields=geometry,adr_address,formatted_address,place_id,utc_offset,address_components&components=country:LK"
                googlePlaceDetails = client.getPlacesDetails(fullUrl)
                return googlePlaceDetails
            }
        }
    }



}