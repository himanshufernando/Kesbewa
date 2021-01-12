package tkhub.project.kesbewa.ui.activity.splash

import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window.FEATURE_NO_TITLE
import android.view.WindowManager
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.observe
import coil.ImageLoader
import coil.request.LoadRequest
import coil.size.Scale
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.messaging.FirebaseMessaging

import kotlinx.android.synthetic.main.dialog_version_note.*
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.model.NetworkError
import tkhub.project.kesbewa.data.model.VersionRespons
import tkhub.project.kesbewa.data.responsmodel.VersionResult
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.services.network.InternetConnection
import tkhub.project.kesbewa.ui.activity.home.HomeActivity
import tkhub.project.kesbewa.viewmodels.splash.SplashViewModel


class SplashActivity : FragmentActivity() {


    private val viewmodel: SplashViewModel by viewModels { SplashViewModel.LiveDataVMFactory }
    var alertDialog: AlertDialog? = null
    var alertVersionDialog: AlertDialog? = null
    lateinit var dialogSpecNote: Dialog

    lateinit var imageLoader: ImageLoader

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        trasperat()
        setContentView(R.layout.activity_splash)
        AppPrefs.setIntKeyValuePrefs(this, AppPrefs.KEY_FRAGMENT_ID, 1)

        FirebaseMessaging.getInstance().isAutoInitEnabled = true


        viewmodel.serverVersionResponse.observe(this) { response ->
            when (response) {
                is VersionResult.Continue -> {
                    var intent = Intent(this@SplashActivity, HomeActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                is VersionResult.ShowSpecialNote -> {
                    if (::dialogSpecNote.isInitialized) {
                        if (!dialogSpecNote.isShowing) {
                            dialogSpecNote.show()
                        }
                    } else {
                        specNote(response.data)
                    }
                }
                is VersionResult.ShowVersionMismatchDialog -> {
                    errorAlertVersionMismatchDialog(response.data)
                }
                is VersionResult.ExceptionError.ExError -> {
                    Toast.makeText(this, response.exception.message, Toast.LENGTH_SHORT).show()
                }

            }
        }

    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        if (::imageLoader.isInitialized) {
            imageLoader.shutdown()
        }
        super.onStop()
    }


    override fun onResume() {
        super.onResume()



        if (!InternetConnection.checkInternetConnection()) {
            errorAlertDialog(AppPrefs.errorNoInternet())
        }
        viewmodel.checkVersionMatch((1..1000).random())
    }


    private fun trasperat() {
        if (Build.VERSION.SDK_INT in 19..20) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true)
        }
        if (Build.VERSION.SDK_INT >= 19) {
            window.decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false)
            window.statusBarColor = Color.TRANSPARENT
        }
    }

    private fun setWindowFlag(bits: Int, on: Boolean) {
        val win = window
        val winParams = win.attributes
        if (on) {
            winParams.flags = winParams.flags or bits
        } else {
            winParams.flags = winParams.flags and bits.inv()
        }
        win.attributes = winParams
    }

    private fun errorAlertVersionMismatchDialog(versionRespons: VersionRespons) {
        if (alertVersionDialog != null) {
            if (alertVersionDialog!!.isShowing) {
                alertVersionDialog!!.dismiss()
            }
        }
        alertVersionDialog = this.let {
            val builder = androidx.appcompat.app.AlertDialog.Builder(it)
            builder.setTitle("App Update")
            builder.setMessage(versionRespons.version_message)
            builder.setCancelable(false)
            builder.apply {
                setPositiveButton(
                    "Update",
                    DialogInterface.OnClickListener { _, _ ->

                        val intent = Intent(Intent.ACTION_VIEW).apply {
                            data = Uri.parse(
                                versionRespons.app_url
                            )
                            setPackage("com.android.vending")
                        }
                        startActivity(intent)

                        return@OnClickListener
                    })
            }
            builder.create()
            builder.show()

        } ?: throw IllegalStateException("Activity cannot be null")
    }


    private fun errorAlertDialog(networkError: NetworkError) {
        if (alertDialog != null) {
            if (alertDialog!!.isShowing) {
                alertDialog!!.dismiss()
            }
        }
        alertDialog = this.let {
            val builder = androidx.appcompat.app.AlertDialog.Builder(it)
            builder.setTitle(networkError.errorTitle)
            builder.setMessage(networkError.errorMessage)
            builder.setCancelable(false)
            builder.apply {
                setPositiveButton(
                    R.string.ok,
                    DialogInterface.OnClickListener { _, _ ->

                        return@OnClickListener
                    })
            }
            builder.create()
            builder.show()

        } ?: throw IllegalStateException("Activity cannot be null")
    }


    private fun specNote(versionRespons: VersionRespons) {
        dialogSpecNote = Dialog(this)
        dialogSpecNote.requestWindowFeature(FEATURE_NO_TITLE)
        dialogSpecNote.window!!.setBackgroundDrawableResource(android.R.color.transparent)
        dialogSpecNote.setContentView(R.layout.dialog_version_note)
        dialogSpecNote.setCancelable(true)


        if (versionRespons.special_image.isNullOrEmpty()) {
            dialogSpecNote.textview_1.visibility = View.VISIBLE
            dialogSpecNote.imageview_specnote.visibility = View.GONE
            dialogSpecNote.textview_1.text = versionRespons.special_note
            dialogSpecNote.show()
        } else {
            dialogSpecNote.textview_1.visibility = View.GONE
            dialogSpecNote.imageview_specnote.visibility = View.VISIBLE

            imageLoader = ImageLoader.Builder(this)
                .availableMemoryPercentage(0.25)
                .crossfade(true)
                .build()

            val request = LoadRequest.Builder(this)
                .data(versionRespons.special_image)
                .target(
                    onStart = { placeholder ->

                    },
                    onSuccess = { result ->
                        dialogSpecNote.imageview_specnote.setImageDrawable(result)
                        dialogSpecNote.show()
                    },
                    onError = { error ->

                    }
                )
                .scale(Scale.FILL)
                .build()



            imageLoader.execute(request)


        }

        dialogSpecNote.textview_btn_respons.setOnClickListener() {

            if (versionRespons.special_note_critical == 1L) {
                dialogSpecNote.dismiss()
                this.finish()
            } else {
                var intent = Intent(this@SplashActivity, HomeActivity::class.java)
                startActivity(intent)
                finish()

            }

        }


    }


}
