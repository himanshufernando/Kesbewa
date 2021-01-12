package tkhub.project.kesbewa.ui.fragment

import android.app.Activity
import android.app.Dialog
import android.content.DialogInterface
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.fragment_singup.view.*

import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.model.NetworkError
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.databinding.FragmentSingupBinding
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.ui.activity.home.HomeActivity
import tkhub.project.kesbewa.viewmodels.login.RegistorViewModel

/**
 * A simple [Fragment] subclass.
 */
class SingupFragment : Fragment(), View.OnClickListener {

    lateinit var binding: FragmentSingupBinding
    private val viewmodel: RegistorViewModel by viewModels { RegistorViewModel.LiveDataVMFactory }
    var appPref = AppPrefs

    var alertDialog: AlertDialog? = null
    var isPasswordShow = false
    var isConfrimPasswordShow = false

    lateinit var dialogTermsConditions: Dialog
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_singup, container, false)
        binding.singupBindingView = viewmodel



        AppPrefs.setIntKeyValuePrefs(context!!, AppPrefs.KEY_FRAGMENT_ID, 3)


        binding.root.txt_btn_reg.setOnClickListener(this)
        binding.root.txt_terms_conditions.setOnClickListener(this)
        binding.root.ll_con_password_show_hide.setOnClickListener(this)
        binding.root.ll_password_show_hide.setOnClickListener(this)


        (activity as HomeActivity).removeDrawer()




        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        trasperat()
    }

    override fun onStop() {
        viewmodel.userCode.removeObservers(viewLifecycleOwner)
        viewmodel.userSaveResponse.removeObservers(viewLifecycleOwner)
        super.onStop()
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.txt_btn_reg -> {
                if (!viewmodel.userCode.hasObservers()) {
                    userCodeObserver()
                }
                viewmodel.register()
            }
            R.id.txt_terms_conditions -> {
                if (::dialogTermsConditions.isInitialized) {
                    if (!dialogTermsConditions.isShowing) { dialogTermsConditions.show() }
                } else { showDialogTermsConditions() }
            }
            R.id.ll_con_password_show_hide -> {
                if (isConfrimPasswordShow) {
                    binding.root.edittext_7.transformationMethod =
                        PasswordTransformationMethod.getInstance()
                    isConfrimPasswordShow = false
                    binding.root.iv_con_password_showhide.setImageResource(R.drawable.ic_pw_hide)
                } else {
                    binding.root.edittext_7.transformationMethod =
                        HideReturnsTransformationMethod.getInstance()
                    isConfrimPasswordShow = true
                    binding.root.iv_con_password_showhide.setImageResource(R.drawable.ic_pw_show)
                }
            }
            R.id.ll_password_show_hide -> {
                if (isPasswordShow) {
                    binding.root.edittext_5.transformationMethod =
                        PasswordTransformationMethod.getInstance()
                    isPasswordShow = false
                    binding.root.iv_password_showhide.setImageResource(R.drawable.ic_pw_hide)
                } else {
                    binding.root.edittext_5.transformationMethod =
                        HideReturnsTransformationMethod.getInstance()
                    isPasswordShow = true
                    binding.root.iv_password_showhide.setImageResource(R.drawable.ic_pw_show)
                }
            }

        }


    }


    private fun userCodeObserver() {
        viewmodel.userCode.observe(viewLifecycleOwner, Observer {
            if (!viewmodel.userSaveResponse.hasObservers()) {
                registerObserver()
            }
            viewmodel.userRegister(it)
        })

    }

    private fun registerObserver() {
        viewmodel.userSaveResponse.observe(viewLifecycleOwner, Observer {
            when (it) {
                is KesbewaResult.Success -> {
                    if (it.data.errorCode == appPref.SUCCESS_USER_SAVE) {
                        NavHostFragment.findNavController(this).navigate(R.id.fragment_home)
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


    private fun setErrorUI(respond: NetworkError) {
        when (respond.errorCode) {
            appPref.ERROR_USER_NAME_EMPTY -> binding.root.edittext_1.error = respond.errorMessage
            appPref.ERROR_USERNAME_CHARACTERS_VIOLATION -> binding.root.edittext_1.error =
                respond.errorMessage
            appPref.ERROR_PASSWORD_EMPTY -> binding.root.edittext_5.error = respond.errorMessage
            appPref.ERROR_PASSWORD_INVALID -> binding.root.edittext_5.error = respond.errorMessage
            appPref.ERROR_EMAIL_EMPTY -> binding.root.edittext_3.error = respond.errorMessage

            appPref.ERROR_ACCOUNT_ALREADY_EXISTS -> {
                errorUseExisting(respond)
            }
        }
    }

    private fun errorUseExisting(networkError: NetworkError) {
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
                setPositiveButton("Login", DialogInterface.OnClickListener { _, _ ->
                    NavHostFragment.findNavController(requireParentFragment())
                        .navigate(R.id.fragmentRegisterToLogin)

                })
            }
            builder.create()
            builder.show()

        } ?: throw IllegalStateException("Activity cannot be null")
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

    private fun showDialogTermsConditions() {
        dialogTermsConditions = Dialog(context as Activity)
        dialogTermsConditions.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialogTermsConditions.window!!.setBackgroundDrawableResource(android.R.color.transparent)
        dialogTermsConditions.setContentView(R.layout.dialog_terms)
        dialogTermsConditions.setCancelable(true)
        dialogTermsConditions.show()

    }


}
