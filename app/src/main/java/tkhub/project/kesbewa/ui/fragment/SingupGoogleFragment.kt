package tkhub.project.kesbewa.ui.fragment

import android.app.Activity
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.fragment_login.view.*
import kotlinx.android.synthetic.main.fragment_singup_google.view.*
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.model.NetworkError
import tkhub.project.kesbewa.data.model.User
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.databinding.FragmentLoginBinding
import tkhub.project.kesbewa.databinding.FragmentSingupGoogleBinding
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.viewmodels.login.RegistorViewModel


class SingupGoogleFragment : Fragment() {

    lateinit var binding: FragmentSingupGoogleBinding
    private val viewmodel: RegistorViewModel by viewModels { RegistorViewModel.LiveDataVMFactory }
    var alertDialog: AlertDialog? = null
    lateinit var user: User
    lateinit var dialogTermsConditions: Dialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_singup_google, container, false)
        binding.singupGoogleBindingView = viewmodel

        user = arguments?.getParcelable<User>("googleUser")!!
        binding.user = user
        viewmodel.googleUserDetails.value = user

        AppPrefs.setIntKeyValuePrefs(context!!, AppPrefs.KEY_FRAGMENT_ID, 10)

        binding.root.txt_btn_complete.setOnClickListener {
            if (!viewmodel.googleUserRegisterResponse.hasObservers()) {
                googleUserRegisterObserver()
            }
            viewmodel.googlesignin()
        }

        binding.root.txt_terms_conditions.setOnClickListener {
            if (::dialogTermsConditions.isInitialized) {
                if (!dialogTermsConditions.isShowing) { dialogTermsConditions.show() }
            } else { showDialogTermsConditions() }


        }


        return binding.root
    }

    override fun onStop() {
        viewmodel.googleUserRegisterResponse.removeObservers(viewLifecycleOwner)
        super.onStop()
    }

    private fun googleUserRegisterObserver() {
        viewmodel.googleUserRegisterResponse.observe(viewLifecycleOwner, Observer {
            when (it) {
                is KesbewaResult.Success -> {
                    if (it.data.errorCode == AppPrefs.SUCCESS_USER_SAVE) {
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
    private fun showDialogTermsConditions() {
        dialogTermsConditions = Dialog(context as Activity)
        dialogTermsConditions.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialogTermsConditions.window!!.setBackgroundDrawableResource(android.R.color.transparent)
        dialogTermsConditions.setContentView(R.layout.dialog_terms)
        dialogTermsConditions.setCancelable(true)
        dialogTermsConditions.show()

    }
}