package tkhub.project.kesbewa.ui.fragment

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import kotlinx.android.synthetic.main.fragment_promo_code.view.*
import androidx.lifecycle.Observer
import kotlinx.coroutines.flow.collect
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.databinding.FragmentPromoCodeBinding
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.ui.activity.home.HomeActivity
import tkhub.project.kesbewa.viewmodels.cart.CartViewModel

/**
 * A simple [Fragment] subclass.
 */
class PromoCodeFragment : Fragment() {


    lateinit var binding: FragmentPromoCodeBinding
    private val viewmodel: CartViewModel by viewModels{ CartViewModel.LiveDataVMFactory }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_promo_code, container, false)
        binding.promoBindingView = viewmodel


        (activity as HomeActivity).removeDrawer()
        binding.root.image_view_btn_add_promocode.setOnClickListener {
            if (!viewmodel.checkPromocodeResponse.hasObservers()) {
                checkPromocodeResponseObserver()
            }
            (activity as HomeActivity).hideKeyboard()
            viewmodel.checkPromoCode()
        }

        binding.root.imageview_navigation.setOnClickListener {
            (activity as HomeActivity).onBackPressed()
        }


        return binding.root
    }
    override fun onStop() {
        viewmodel.checkPromocodeResponse.removeObservers(viewLifecycleOwner)
        viewmodel.checkPromocodeUseageResponse.removeObservers(viewLifecycleOwner)

        super.onStop()
    }

    private fun checkPromocodeResponseObserver() {
        viewmodel.checkPromocodeResponse.observe(viewLifecycleOwner, Observer {
            when (it) {
                is KesbewaResult.Success -> {
                    if(it.data.errorCode==AppPrefs.SUCCESS_PROMOCODE_VALID){
                         if (!viewmodel.checkPromocodeUseageResponse.hasObservers()) {
                             checkPromocodeUseageResponseObserver()
                         }
                         viewmodel.checkPromoCodeUse()
                     }else{
                        Toast.makeText(
                            activity,
                            it.data.errorMessage,
                            Toast.LENGTH_SHORT
                        ).show()
                     }

                    viewmodel.setPromoTypeToUI()
                }
                is KesbewaResult.ExceptionError.ExError -> {
                    Toast.makeText(
                        activity,
                        it.exception.message,
                        Toast.LENGTH_SHORT
                    ).show()
                    viewmodel.setPromoTypeToUI()
                }
                is KesbewaResult.LogicError.LogError -> {
                    viewmodel.setPromoTypeToUI()
                    Toast.makeText(activity, it.exception.toString(), Toast.LENGTH_SHORT).show()
                }
            }
        })

    }

    private fun checkPromocodeUseageResponseObserver() {
        viewmodel.checkPromocodeUseageResponse.observe(viewLifecycleOwner, Observer {
            when (it) {
                is KesbewaResult.Success -> {
                    viewmodel.setPromoTypeToUI()
                    Toast.makeText(
                        activity,
                        it.data.errorMessage,
                        Toast.LENGTH_SHORT
                    ).show()

                }
                is KesbewaResult.ExceptionError.ExError -> {
                    viewmodel.setPromoTypeToUI()
                    Toast.makeText(activity, it.exception.message, Toast.LENGTH_SHORT).show()
                }
                is KesbewaResult.LogicError.LogError -> {
                    viewmodel.setPromoTypeToUI()
                    Toast.makeText(activity, it.exception.toString(), Toast.LENGTH_SHORT).show()

                }
            }
        })

    }




}
