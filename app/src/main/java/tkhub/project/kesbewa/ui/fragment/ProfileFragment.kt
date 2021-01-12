package tkhub.project.kesbewa.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import kotlinx.android.synthetic.main.fragment_about.view.*
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.fragment_about.view.imageview_navigation
import kotlinx.android.synthetic.main.fragment_profile.view.*
import tkhub.project.kesbewa.databinding.FragmentProfileBinding
import tkhub.project.kesbewa.ui.activity.home.HomeActivity
import tkhub.project.kesbewa.viewmodels.address.AddressViewModel
import tkhub.project.kesbewa.viewmodels.profile.ProfileViewModel


class ProfileFragment : Fragment() {

    private val viewmodel: ProfileViewModel by viewModels { ProfileViewModel.LiveDataVMFactory }
    lateinit var binding: FragmentProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false)
        binding.profileViewModel = viewmodel


        binding.root.imageview_navigation.setOnClickListener {
            (activity as HomeActivity).openDrawer()
        }


        binding.root.textView_btn_profile_update.setOnClickListener {
            if (!viewmodel.updateProfileResponse.hasObservers()) {
                updateProfileObserver()
            }
            viewmodel.userUpdate()
        }


        return binding.root
    }

    override fun onStop() {
        viewmodel.updateProfileResponse.removeObservers(viewLifecycleOwner)
        super.onStop()
    }

    private fun updateProfileObserver() {
        viewmodel.updateProfileResponse.observe(viewLifecycleOwner, Observer {
            when(it){
                is KesbewaResult.Success ->{
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