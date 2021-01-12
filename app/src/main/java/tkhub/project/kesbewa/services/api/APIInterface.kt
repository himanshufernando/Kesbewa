
package tkhub.project.kesbewa.services.api


import okhttp3.HttpUrl
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Url
import tkhub.project.kesbewa.data.model.Predictions
import tkhub.project.kesbewa.data.model.googlePlaceDetails.GooglePlaceDetails

import java.util.concurrent.TimeUnit


interface APIInterface {

    @GET
    suspend fun getPlaces(@Url url:String): Predictions

    @GET
    suspend fun getPlacesDetails(@Url url:String): GooglePlaceDetails



    companion object {
        val baseUrl = "https://maps.googleapis.com/maps/api/place/"
        fun create(): APIInterface = create(baseUrl.toHttpUrlOrNull()!!)
        fun create(httpUrl: HttpUrl): APIInterface {
            val client = OkHttpClient.Builder()
                .connectTimeout(100, TimeUnit.SECONDS)
                .readTimeout(100, TimeUnit.SECONDS)
                .build()
            return Retrofit.Builder()
                .baseUrl(httpUrl)
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(APIInterface::class.java)

        }



    }


}
