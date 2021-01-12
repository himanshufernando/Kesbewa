package tkhub.project.kesbewa.ui.activity.home


import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.core.os.bundleOf
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.observe
import androidx.navigation.NavController
import androidx.navigation.Navigation
import coil.ImageLoader
import coil.api.load
import coil.request.LoadRequest
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException

import com.google.android.material.navigation.NavigationView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.item_navigation.*
import kotlinx.android.synthetic.main.nav_header.view.*
import tkhub.project.kesbewa.Kesbewa
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.services.Perfrences.LocationSettings
import tkhub.project.kesbewa.ui.fragment.AddressFragment
import tkhub.project.kesbewa.ui.fragment.LoginFragment
import tkhub.project.kesbewa.viewmodels.home.HomeViewModel

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.messaging.FirebaseMessaging
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import tkhub.project.kesbewa.data.model.*
import java.util.*

class HomeActivity : FragmentActivity(), LocationSettings, View.OnClickListener {


    private val viewmodel: HomeViewModel by viewModels { HomeViewModel.LiveDataVMFactory }


    lateinit var locationSettings: LocationSettings
    lateinit var navView: NavigationView
    lateinit var drawerLayout: DrawerLayout
    var alertDialog: AlertDialog? = null
    var alertDialogExit: AlertDialog? = null
    lateinit var frgmentView: View

    lateinit var account: GoogleSignInAccount
    var navController: NavController? = null
    var appPrefs = AppPrefs

    lateinit var mGoogleSignInClient: GoogleSignInClient

    private lateinit var orderConfigJob: Job

    companion object {
        private const val REQUEST_PERMISSIONS_PHONE_STATE_CODE = 55
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setSoftInputMode(
            WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN
        )
        setContentView(R.layout.activity_home)
        navView = nav_view
        drawerLayout = drawer_layout

        navController = Navigation.findNavController(this, R.id.nav_host_fragment)


        llmyorders.setOnClickListener(this)
        llhome.setOnClickListener(this)
        ll_logout.setOnClickListener(this)
        llabout.setOnClickListener(this)
        llmyprofile.setOnClickListener(this)
        ll_register.setOnClickListener(this)


        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()


        mGoogleSignInClient = GoogleSignIn.getClient(this, gso)




        viewmodel.validateGoogleSignInResponse.observe(this) { respons ->
            when (respons) {
                is KesbewaResult.Success -> {
                    progressStatus(false)
                    var user = User().apply {
                        user_name = if (account.displayName.isNullOrEmpty()) {
                            account.givenName
                        } else {
                            account.displayName
                        }
                        user_email = account.email
                        user_id = account.id
                        user_google_id = account.id!!
                        user_pro_pic = account.photoUrl.toString()
                    }
                    val bundle = bundleOf("googleUser" to user)
                    navController?.navigate(R.id.fragment_signupGoogle, bundle)

                }
                is KesbewaResult.ExceptionError.ExError -> {
                    progressStatus(false)
                    Toast.makeText(this, respons.exception.message, Toast.LENGTH_SHORT).show()
                }
                is KesbewaResult.LogicError.LogError -> {
                    progressStatus(false)
                    mGoogleSignInClient.revokeAccess()
                    if (respons.exception.errorCode == appPrefs.SUCCESS_LOGGING) {
                        navController?.navigate(R.id.fragment_home)
                    }
                    Toast.makeText(this, respons.exception.errorMessage, Toast.LENGTH_SHORT).show()
                }
            }

        }



        viewmodel.deleteAllItemcheckOut.observe(this) { response ->
            navController?.navigate(R.id.fragment_login)

        }


        drawerLayout.addDrawerListener(object : DrawerLayout.DrawerListener {
            override fun onDrawerStateChanged(p0: Int) {
                setUiForDrawerOpen()
            }

            override fun onDrawerSlide(p0: View, p1: Float) {

            }

            override fun onDrawerClosed(p0: View) {

            }

            override fun onDrawerOpened(p0: View) {

            }
        })

    }

    override fun onResume() {
        super.onResume()



        if (!appPrefs.getPushTokenPublishPrefs(this)) {
            var saveToken = appPrefs.getStringKeyValuePrefs(this,appPrefs.KEY_PUSH_TOKEN)
            if(saveToken != "0"){
                if (!viewmodel.checkPushResponse.hasObservers()) {
                    checkPushObserver()
                }
                viewmodel.checkPush()
            }else{

                var database: FirebaseDatabase? = FirebaseDatabase.getInstance()
                var appLogRef: DatabaseReference? = database?.getReference("AppLog")

                FirebaseInstanceId.getInstance().instanceId.addOnCompleteListener(OnCompleteListener { task ->
                    if (!task.isSuccessful) {
                        var unxId = genarateUniqCode()
                        var applog = AppLog().apply {
                            log_code = "GG"
                            log = "Firebase messaging token unSuccessful " + task.exception
                            androidID =
                                Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID)
                        }
                        appLogRef?.child(unxId.toString())?.setValue(applog)
                        return@OnCompleteListener
                    }


                    val token = task.result?.token


                    token?.let {
                        appPrefs.setStringKeyValuePrefs(this, appPrefs.KEY_PUSH_TOKEN, it)
                    }
                    if (!viewmodel.checkPushResponse.hasObservers()) {
                        checkPushObserver()
                    }
                    viewmodel.checkPush()

                })

            }
        }



        orderConfigJob=lifecycleScope.launch {
            viewmodel.getOrderConfig()
        }


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


    override fun onPause() {
        super.onPause()

        viewmodel.checkPushResponse.removeObservers(this)

        if(::orderConfigJob.isInitialized){
            if(orderConfigJob!!.isActive){
                orderConfigJob!!.cancel()
            }
        }

    }

    override fun onStop() {
        if(::orderConfigJob.isInitialized){
            orderConfigJob!!.cancel()
        }
        viewmodel.checkPushResponse.removeObservers(this)

        super.onStop()
    }

    fun checkPushObserver() {
        viewmodel.checkPushResponse.observe(this, Observer {
            when (it) {
                is KesbewaResult.Success -> {
                    appPrefs.setPushTokenPublishPrefs(this, true)
                }
                is KesbewaResult.ExceptionError.ExError -> {

                }
                is KesbewaResult.LogicError.LogError -> {

                }
                else -> {

                }
            }

        })

    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == AddressFragment.REQUEST_CHECK_SETTINGS) {
            try {
                locationSettings = Kesbewa.getLocationSettingsListener()!!
                locationSettings.onLocationSettingsResponse()
            } catch (ex: Exception) {

            }
        } else if (requestCode == LoginFragment.RC_SIGN_IN) {
            val task: Task<GoogleSignInAccount> = GoogleSignIn.getSignedInAccountFromIntent(data)
            handleSignInResult(task)
        }
    }


    @SuppressLint("MissingPermission")
    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            account = completedTask.getResult(ApiException::class.java)!!
            viewmodel.validateGoogleSignIn(account.email.toString(), account.id.toString())

        } catch (e: ApiException) {
            progressStatus(false)
            Toast.makeText(this, "Google Sign error please try again", Toast.LENGTH_SHORT).show()
        }
    }


    fun progressStatus(status: Boolean) {
        if (status) {
            cl_loading_main.visibility = View.VISIBLE
        } else {
            cl_loading_main.visibility = View.GONE
        }

    }

    // cl_loading_main
    override fun onLocationSettingsResponse() {

    }

    override fun onBackPressed() {
        var fragmetID = appPrefs.getIntKeyValuePrefs(this, appPrefs.KEY_FRAGMENT_ID)


        if ((fragmetID == 2) || (fragmetID == 4)) {

            if (alertDialog != null) {
                if (!alertDialog!!.isShowing) {
                    exitDialog()
                }
            } else {
                exitDialog()
            }
        }else if(fragmetID==11){
            finish()
        }
        else {
            super.onBackPressed()
        }
    }


    fun exitDialog() {

        alertDialogExit = this.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle("Exit")
            builder.setMessage("Do you want to Exit ?")
            builder.setCancelable(true)
            builder.apply {
                setPositiveButton(
                    "Yes",
                    DialogInterface.OnClickListener { _, _ ->
                        finish()
                    })

                setNegativeButton(
                    "No",
                    DialogInterface.OnClickListener { _, _ -> return@OnClickListener })
            }

            builder.create()
            builder.show()

        } ?: throw IllegalStateException("Activity cannot be null")


    }


    override fun onClick(v: View) {

        drawerLayout.closeDrawer(GravityCompat.START)
        when (v.id) {
            R.id.llmyorders -> {
                if (isUserSignIn()) {
                    navController?.navigate(R.id.fragment_myorders)
                } else {
                    Toast.makeText(
                        this,
                        "This Feature is not available for GUESTS",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            R.id.ll_logout -> {
                if (alertDialog != null) {
                    if (alertDialog!!.isShowing) {
                        alertDialog!!.dismiss()
                    }
                }

                alertDialog = this.let {
                    val builder = AlertDialog.Builder(it)
                    builder.setTitle("Log Out")
                    builder.setMessage("Do you want to logout ?")
                    builder.setCancelable(false)
                    builder.apply {
                        setPositiveButton(
                            "Yes",
                            DialogInterface.OnClickListener { _, _ -> logout() })

                        setNegativeButton(
                            "No",
                            DialogInterface.OnClickListener { _, _ -> return@OnClickListener })
                    }

                    builder.create()
                    builder.show()

                } ?: throw IllegalStateException("Activity cannot be null")
            }

            R.id.llhome -> navController?.navigate(R.id.fragment_home)
            R.id.llabout -> navController?.navigate(R.id.fragment_about)
            R.id.ll_register -> navController?.navigate(R.id.fragment_login)
            R.id.llmyprofile -> {
                if (isUserSignIn()) {
                    navController?.navigate(R.id.fragment_profile)
                } else {
                    Toast.makeText(
                        this,
                        "This Feature is not available for GUESTS",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }


        }

    }


    fun setDrawer() {

        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);

        var user = appPrefs.getUserPrefs(this, appPrefs.KEY_USER)
        if (user.user_name.equals("")) {
            if (navView.headerCount > 0) {
                val headerLayout: View = navView.getHeaderView(0)
                Glide.with(Kesbewa.applicationContext())
                    .load(R.drawable.ic_profile_users)
                    .error(R.drawable.ic_profile_users)
                    .apply(RequestOptions.centerCropTransform())
                    .into( headerLayout.imageView_profilelogo)
                headerLayout.textview_nav_username.visibility = View.GONE
            }


        } else {
            if (navView.headerCount > 0) {
                val headerLayout: View = navView.getHeaderView(0)
                headerLayout.textview_nav_username.text = user.user_name
                try {
                    Glide.with(this)
                        .load(user.user_pro_pic)
                        .centerCrop()
                        .apply(RequestOptions.circleCropTransform())

                        .error(R.drawable.ic_no_image)
                        .placeholder(R.drawable.ic_no_image)
                        .into(headerLayout.imageView_profilelogo)

                }catch (e : Exception){
                    Glide.with(Kesbewa.applicationContext())
                        .load(R.drawable.ic_no_image)
                        .error(R.drawable.ic_no_image)
                        .into(headerLayout.imageView_profilelogo)

                }

            }
        }
    }

    fun removeDrawer() {
        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
    }

    fun openDrawer() {
        hideKeyboard()
        setUiForDrawerOpen()
        drawerLayout.openDrawer(GravityCompat.START)
    }

    fun closeDrawer() {
        drawerLayout.closeDrawer(GravityCompat.START)
    }

    fun hideKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
    }


    fun setUiForDrawerOpen() {
        if (isUserSignIn()) {
            ll_register.visibility = View.GONE
            ll_logout.visibility = View.VISIBLE
        } else {
            ll_logout.visibility = View.GONE
            ll_register.visibility = View.VISIBLE
        }


    }

    fun isUserSignIn(): Boolean {
        return !appPrefs.getUserPrefs(this, appPrefs.KEY_USER).user_name.isNullOrEmpty()
    }

    fun logout() {
        appPrefs.setUserPrefs(this, appPrefs.KEY_USER, User())
        var manualLocation = ManualLocation(0.0, 0.0)
        appPrefs.setLocationManualKeyValuePrefs(
            this,
            appPrefs.KEY_MANUAL_LOCATION,
            manualLocation
        )
        var promo = PromoCode()
        appPrefs.setSelectPromoKeyValuePrefs(
            this,
            appPrefs.KEY_SELECTED_PROMO,
            promo
        )

        appPrefs.setSelectAdressManualKeyValuePrefs(
            this!!,
            appPrefs.KEY_SELECTED_USER_ADDERSS,
            DeliveryAddress()
        )

        viewmodel.deleteCart()

    }


}
