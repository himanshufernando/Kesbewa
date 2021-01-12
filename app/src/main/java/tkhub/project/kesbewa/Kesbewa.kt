package tkhub.project.kesbewa

import android.content.Context
import androidx.multidex.MultiDexApplication
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.messaging.FirebaseMessaging
import tkhub.project.kesbewa.services.Perfrences.LocationSettings

class Kesbewa : MultiDexApplication() {



    companion object {
        private var instance: Kesbewa? = null
        private var locationSettings: LocationSettings? = null

        fun applicationContext(): Context {
            return instance!!.applicationContext
        }
        fun setLocationSettingsListener(locationsettings: LocationSettings) {
            locationSettings = locationsettings
        }

        fun getLocationSettingsListener(): LocationSettings? {
            return locationSettings
        }


    }

    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()
        val context: Context = Kesbewa.applicationContext()
        FirebaseMessaging.getInstance().isAutoInitEnabled = true


       /* FirebaseMessaging.getInstance().isAutoInitEnabled = true
        val options: FirebaseOptions = FirebaseOptions.Builder()
            .setApplicationId("1:160346732169:android:f2fd461167dd63cdc4b858") // Required for Analytics.
            .setProjectId("kesbewa-33ecc") // Required for Firebase Installations.
            .setApiKey("AIzaSyAPVoVkhgDi2joZfw06Ua7RTn1BkMpxUcc") // Required for Auth.
            .build()
        FirebaseApp.initializeApp(this, options, "kesbewa")*/
    }


}