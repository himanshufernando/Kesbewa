package tkhub.project.kesbewa.ui.fragment


import android.content.DialogInterface
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment

import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import kotlinx.android.synthetic.main.fragment_login.view.*
import tkhub.project.kesbewa.Kesbewa
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.model.NetworkError
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.databinding.FragmentLoginBinding
import tkhub.project.kesbewa.services.Perfrences.AppPrefs

import tkhub.project.kesbewa.ui.activity.home.HomeActivity
import tkhub.project.kesbewa.viewmodels.login.LoginViewModel
import tkhub.project.kesbewa.viewmodels.login.RegistorViewModel


/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment(), View.OnClickListener {

    lateinit var binding: FragmentLoginBinding
    private val viewmodel: LoginViewModel by viewModels { LoginViewModel.LiveDataVMFactory }
    var isPasswordShow = false
    var alertDialog: AlertDialog? = null

    lateinit var mGoogleSignInClient: GoogleSignInClient


    companion object {
        const val RC_SIGN_IN = 44
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        binding.loginBindingView = viewmodel

        AppPrefs.setIntKeyValuePrefs(context!!, AppPrefs.KEY_FRAGMENT_ID, 2)


        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()

        mGoogleSignInClient = GoogleSignIn.getClient(requireContext(), gso)


        binding.root.textview_forgetpassword.setOnClickListener(this)
        binding.root.constraintLayout_google.setOnClickListener(this)
        binding.root.txt_btn_login.setOnClickListener(this)
        binding.root.ll_password_show_hide.setOnClickListener(this)





        (activity as HomeActivity).removeDrawer()



        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        trasperat()

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.textview_forgetpassword -> {
                if (!viewmodel.passwordResetCodeResponse.hasObservers()) {
                    resetObserver()
                }
                viewmodel.password_reset()
            }
            R.id.constraintLayout_google -> {

                (activity as HomeActivity).progressStatus(true)
                val signInIntent = mGoogleSignInClient.signInIntent
                activity?.startActivityForResult(signInIntent, RC_SIGN_IN)
            }
            R.id.txt_btn_login -> {
                if (!viewmodel.loginServiceResponse.hasObservers()) {
                    loginObserver()
                }
                viewmodel.login()
            }

            R.id.ll_password_show_hide -> {
                if (isPasswordShow) {
                    binding.root.editText_password.transformationMethod =
                        PasswordTransformationMethod.getInstance()
                    isPasswordShow = false
                    binding.root.iv_password_showhide.setImageResource(R.drawable.ic_pw_hide)
                } else {
                    binding.root.editText_password.transformationMethod =
                        HideReturnsTransformationMethod.getInstance()
                    isPasswordShow = true
                    binding.root.iv_password_showhide.setImageResource(R.drawable.ic_pw_show)
                }
            }

        }
    }


    override fun onStop() {
        viewmodel.loginServiceResponse.removeObservers(viewLifecycleOwner)
        viewmodel.passwordResetCodeResponse.removeObservers(viewLifecycleOwner)
        super.onStop()
    }

    private fun loginObserver() {
        viewmodel.loginServiceResponse.observe(viewLifecycleOwner, Observer {
            when(it){
                is KesbewaResult.Success ->{
                    Toast.makeText(context, it.data.errorMessage, Toast.LENGTH_SHORT).show()
                    NavHostFragment.findNavController(this).navigate(R.id.fragment_home)
                }
                is KesbewaResult.ExceptionError.ExError -> {
                    Toast.makeText(context, it.exception.message, Toast.LENGTH_SHORT).show()
                }
                is KesbewaResult.LogicError.LogError -> {
                    Toast.makeText(context, it.exception.errorMessage, Toast.LENGTH_SHORT).show()
                    setErrorUI(it.exception)
                }

            }
        })


    }



    private fun resetObserver() {
        viewmodel.passwordResetCodeResponse.observe(viewLifecycleOwner, Observer {
            when (it) {
                is KesbewaResult.Success -> {
                    if (it.data.errorCode == AppPrefs.SUCCESS_PASSWORD_RESET_CODE) {
                        val bundle = bundleOf("userid" to it.data.errorData)
                        NavHostFragment.findNavController(this).navigate(R.id.fragment_passwordreset,bundle)
                    }
                    Toast.makeText(context, it.data.errorMessage, Toast.LENGTH_SHORT).show()
                }
                is KesbewaResult.ExceptionError.ExError -> {
                    Toast.makeText(context, it.exception.message, Toast.LENGTH_SHORT).show()
                }
                is KesbewaResult.LogicError.LogError -> {
                    Toast.makeText(context, it.exception.errorMessage, Toast.LENGTH_SHORT).show()
                    setErrorUI(it.exception)
                }
            }
        })
    }

    private fun trasperat() {
        if (Build.VERSION.SDK_INT in 19..20) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true)
        }
        if (Build.VERSION.SDK_INT >= 19) {
            activity?.window!!.decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false)
            activity?.window!!.statusBarColor = Color.TRANSPARENT
        }
    }

    private fun setWindowFlag(bits: Int, on: Boolean) {
        val win = activity?.window
        val winParams = win?.attributes
        if (on) {
            winParams!!.flags = winParams.flags or bits
        } else {
            winParams!!.flags = winParams.flags and bits.inv()
        }
        win.attributes = winParams
    }

    private fun setErrorUI(respond: NetworkError) {
        when (respond.errorCode) {
            "PN" -> binding.root.editText_loginnumber.error = respond.errorMessage
            "LOGGEDFAIL" -> {
                errorUseLogin(respond)
            }

        }
    }


    private fun errorUseLogin(networkError: NetworkError) {
        if (alertDialog != null) {
            if (alertDialog!!.isShowing) {
                alertDialog!!.dismiss()
            }
        }
        alertDialog = activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle(networkError.errorTitle)
            builder.setMessage(networkError.errorMessage)
            builder.setCancelable(true)
            builder.apply {
                setPositiveButton("OK", DialogInterface.OnClickListener { _, _ ->
                    return@OnClickListener
                })
            }
            builder.create()
            builder.show()

        } ?: throw IllegalStateException("Activity cannot be null")
    }
    
}


