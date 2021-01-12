package tkhub.project.kesbewa.ui.fragment

import android.app.Activity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.fragment_reset_password.view.*
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.databinding.FragmentLoginBinding
import tkhub.project.kesbewa.databinding.FragmentResetPasswordBinding
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.ui.activity.home.HomeActivity
import tkhub.project.kesbewa.viewmodels.login.RegistorViewModel
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.fragment_reset_password.view.imageview_navigation
import kotlinx.android.synthetic.main.fragment_singup.view.*


class ResetPasswordFragment : Fragment() ,View.OnClickListener{

    lateinit var binding: FragmentResetPasswordBinding
    private val viewmodel: RegistorViewModel by viewModels { RegistorViewModel.LiveDataVMFactory }
    var isPasswordShow = false
    var isConfrimPasswordShow = false
    var userId=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_reset_password, container, false)
        binding.resetBindingView = viewmodel
        (activity as HomeActivity).hideKeyboard()
        AppPrefs.setIntKeyValuePrefs(context!!, AppPrefs.KEY_FRAGMENT_ID, 9)

         userId = arguments?.getString("userid")!!


        binding.root.cl_bnt_reset.setOnClickListener (this)
        binding.root.imageview_navigation.setOnClickListener (this)
        binding.root.img_pass.setOnClickListener(this)
        binding.root.img_com.setOnClickListener(this)

        return binding.root
    }

    override fun onStop() {
        viewmodel.passwordResetResponse.removeObservers(viewLifecycleOwner)
        super.onStop()
    }

    override fun onClick(v: View) {
      when(v.id){
          R.id.imageview_navigation -> {
              (context as Activity).onBackPressed()
          }

          R.id.cl_bnt_reset -> {
              if (!viewmodel.passwordResetResponse.hasObservers()) {
                  passwordResetObserver()
              }
              viewmodel.passwordReset(userId)
          }

          R.id.img_com -> {
              if (isConfrimPasswordShow) {
                  binding.root.edittext_7.transformationMethod =
                      PasswordTransformationMethod.getInstance()
                  isConfrimPasswordShow = false
                  binding.root.img_com.setImageResource(R.drawable.ic_pw_hide)
              } else {
                  binding.root.edittext_7.transformationMethod =
                      HideReturnsTransformationMethod.getInstance()
                  isConfrimPasswordShow = true
                  binding.root.img_com.setImageResource(R.drawable.ic_pw_show)
              }
          }
          R.id.img_pass -> {
              if (isPasswordShow) {
                  binding.root.edittext_5.transformationMethod =
                      PasswordTransformationMethod.getInstance()
                  isPasswordShow = false
                  binding.root.img_pass.setImageResource(R.drawable.ic_pw_hide)
              } else {
                  binding.root.edittext_5.transformationMethod =
                      HideReturnsTransformationMethod.getInstance()
                  isPasswordShow = true
                  binding.root.img_pass.setImageResource(R.drawable.ic_pw_show)
              }
          }

      }


    }



    private fun passwordResetObserver() {
        viewmodel.passwordResetResponse.observe(viewLifecycleOwner, Observer {
            when(it){
                is KesbewaResult.Success ->{
                    if (it.data.errorCode == AppPrefs.SUCCESS_PASSWORD_RESET) {
                        NavHostFragment.findNavController(this).navigate(R.id.fragment_login)
                    }
                    Toast.makeText(context, it.data.errorMessage, Toast.LENGTH_SHORT).show()
                }
                is KesbewaResult.ExceptionError.ExError -> {
                    Toast.makeText(context, it.exception.message, Toast.LENGTH_SHORT).show()
                }
                is KesbewaResult.LogicError.LogError -> {
                    Toast.makeText(context, it.exception.errorMessage, Toast.LENGTH_SHORT).show()

                }

            }
        })
    }


}