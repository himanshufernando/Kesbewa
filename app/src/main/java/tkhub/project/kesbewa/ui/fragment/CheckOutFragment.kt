package tkhub.project.kesbewa.ui.fragment

import android.app.Activity
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import kotlinx.android.synthetic.main.fragment_check_out.view.*
import androidx.lifecycle.observe
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.dialog_note.*
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.fragment_check_out.view.imageview_navigation
import kotlinx.coroutines.flow.collect
import tkhub.project.kesbewa.Kesbewa
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.model.CartItem
import tkhub.project.kesbewa.data.model.NetworkError
import tkhub.project.kesbewa.data.responsmodel.CartResult
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.databinding.FragmentCheckOutBinding
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.ui.activity.home.HomeActivity
import tkhub.project.kesbewa.ui.adapters.CheckouttemAdapter
import tkhub.project.kesbewa.viewmodels.cart.CartViewModel
import tkhub.project.kesbewa.viewmodels.checkout.CheckoutViewModel

/**
 * A simple [Fragment] subclass.
 */
class CheckOutFragment : Fragment() {


    lateinit var binding: FragmentCheckOutBinding
    private val viewmodel: CheckoutViewModel by viewModels { CheckoutViewModel.LiveDataVMFactory }

    private val adapter = CheckouttemAdapter()
    var alertDialogError: AlertDialog? = null
    var alertDialogSuccess: AlertDialog? = null
    lateinit var dialogAddNote: Dialog

    var appPrefs = AppPrefs


    var dispatch : String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_check_out, container, false)
        binding.checkout = viewmodel

        (activity as HomeActivity).setDrawer()
        binding.root.imageview_navigation.setOnClickListener {
            (activity as HomeActivity).openDrawer()
        }

        binding.root.recyclerView_checkout_items.adapter = adapter


        viewmodel.noteUpdateStatus.observe(this) { res ->
            binding.root.textview_titel_usernote.text = res
        }

        binding.root.imageview_note.setOnClickListener {
            if (::dialogAddNote.isInitialized) {
                if (!dialogAddNote.isShowing) {
                    dialogAddNote.show()
                }
            } else {
                addNote()
            }

        }


        viewmodel.deleteAllItemcheckOut.observe(this) { res ->
            successAlertDialog()
        }



        binding.root.txt_btn_confirm.setOnClickListener {
            if (!viewmodel.orderProcessResponse.hasObservers()) {
                orderProcessObserver()
            }
            viewmodel.orderProcess()
        }



        val dispatchType = Observer<String> { type ->
            dispatch = type
            if(dispatch == appPrefs.KEY_DISPATCH_DELIVERY){
                if (!viewmodel.userDeliveryAddress.hasObservers()) {
                    userDeliveryAddressObserver()
                }
                viewmodel.getDeliveryAddress()

                if (!viewmodel.deliveryChargesResponse.hasObservers()) {
                    deliveryChargesObserver()
                }
                viewmodel.callDeliveryCharges()
            }
        }

        viewmodel.dispatchType.observe(viewLifecycleOwner, dispatchType)

        return binding.root
    }


    override fun onResume() {
        super.onResume()

        binding.root.delivery.isChecked
     /*   var orderConfig = appPrefs.getOrderConfigPrefs(requireContext())

        if(orderConfig.order_pickup!!){
            binding.root.store.visibility = View.VISIBLE
        }else{
            binding.root.store.visibility = View.GONE
            binding.root.delivery.isChecked
        }*/






        appPrefs.setDeliveryChargesPrefs(requireContext(),0.0f)
        if (alertDialogError != null) {
            if (alertDialogError!!.isShowing) {
                alertDialogError!!.dismiss()
            }
        }


        if (!viewmodel.cartItemscheckOut.hasObservers()) {
            cartItemscheckOutObserver()
        }
        viewmodel.getItemInCart()


        if (!viewmodel.calculateFinalTotalCallResponse.hasObservers()) {
            calculateFinalTotalCallResponseObserver()
        }
        viewmodel.calculateFinalTotal()


        viewmodel.dispatchAvailability.observe(viewLifecycleOwner, Observer {it
              if(it.errorMessage.isNotEmpty()){
                  errorAlertDialog(it)
              }


        })



    }

    override fun onStop() {
        viewmodel.orderProcessResponse.removeObservers(viewLifecycleOwner)
        viewmodel.cartItemscheckOut.removeObservers(viewLifecycleOwner)
        viewmodel.dispatchAvailability.removeObservers(viewLifecycleOwner)
        viewmodel.orderUpdateStatus.removeObservers(viewLifecycleOwner)
        viewmodel.userDeliveryAddress.removeObservers(viewLifecycleOwner)
        viewmodel.deliveryChargesResponse.removeObservers(viewLifecycleOwner)


        // new
        viewmodel.calculateFinalTotalCallResponse.removeObservers(viewLifecycleOwner)
        super.onStop()
    }


    private fun cartItemscheckOutObserver() {
        viewmodel.cartItemscheckOut.observe(viewLifecycleOwner, Observer {
            adapter.notifyDataSetChanged()
            when (it) {
                is CartResult.Success -> {
                    adapter.submitList(it.data)
                }
                is CartResult.Empty -> {

                }
            }
        })

    }

    private fun calculateFinalTotalCallResponseObserver() {
        viewmodel.calculateFinalTotalCallResponse.observe(viewLifecycleOwner, Observer {
            try {
                when (it) {
                    is KesbewaResult.Success -> {

                    }
                    is KesbewaResult.ExceptionError.ExError -> {
                        Toast.makeText(context, it.exception.message, Toast.LENGTH_SHORT)
                            .show()
                    }
                    is KesbewaResult.LogicError.LogError -> {
                        Toast.makeText(context, it.exception.errorMessage, Toast.LENGTH_SHORT)
                            .show()

                    }
                }

            } catch (ex: Exception) {
                viewmodel.clearAllOrderData()
            }

        })
    }


    private fun orderProcessObserver() {
        viewmodel.orderProcessResponse.observe(viewLifecycleOwner, Observer {
            try {
                when (it) {
                    is KesbewaResult.Success -> {
                        Toast.makeText(context, it.data.errorMessage, Toast.LENGTH_SHORT)
                            .show()
                        viewmodel.clearAllOrderData()
                    }
                    is KesbewaResult.ExceptionError.ExError -> {
                        Toast.makeText(context, it.exception.message, Toast.LENGTH_SHORT)
                            .show()
                    }
                    is KesbewaResult.LogicError.LogError -> {
                        if(it.exception.errorCode == appPrefs.ERROR_SOMETHING_WENT_WRONG){
                            if (!viewmodel.calculateFinalTotalCallResponse.hasObservers()) {
                                calculateFinalTotalCallResponseObserver()
                            }
                            viewmodel.calculateFinalTotal()
                        }
                        Toast.makeText(context, it.exception.errorMessage, Toast.LENGTH_SHORT)
                            .show()

                    }
                }

            } catch (ex: Exception) {
                viewmodel.clearAllOrderData()
            }

        })
    }



    private fun userDeliveryAddressObserver() {
        viewmodel.userDeliveryAddress.observe(viewLifecycleOwner, Observer {
            when (it) {
                is KesbewaResult.ExceptionError.ExError -> {
                    Toast.makeText(
                        activity,
                        it.exception.message,
                        Toast.LENGTH_SHORT
                    ).show()
                }
                is KesbewaResult.LogicError.LogError -> {
                    errorAlertDialog(it.exception)
                }
            }

        })
    }

    private fun deliveryChargesObserver() {
        viewmodel.deliveryChargesResponse.observe(viewLifecycleOwner, Observer {
            appPrefs.setDeliveryChargesPrefs(requireContext(),it.toFloat())
            if (!viewmodel.calculateFinalTotalCallResponse.hasObservers()) {
                calculateFinalTotalCallResponseObserver()
            }
            viewmodel.calculateFinalTotal()

        })
    }



    private fun successAlertDialog() {

        if (alertDialogError != null) {
            if (alertDialogError!!.isShowing) {
                alertDialogError!!.dismiss()
            }
        }
        alertDialogError = activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle("Successful")
            builder.setMessage("Your order has been placed successfully !")
            builder.setCancelable(false)
            builder.apply {
                setPositiveButton(
                    R.string.ok,
                    DialogInterface.OnClickListener { _, _ ->
                        viewmodel.goToHome(binding.root)

                    })
            }
            builder.create()
            builder.show()

        } ?: throw IllegalStateException("Activity cannot be null")


    }

    private fun errorAlertDialog(networkError: NetworkError) {
        if (alertDialogError != null) {
            if (alertDialogError!!.isShowing) {
                alertDialogError!!.dismiss()
            }
        }
        alertDialogError = activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle(networkError.errorTitle)
            builder.setMessage(networkError.errorMessage)
            builder.setCancelable(true)
            builder.apply {
                setPositiveButton(
                    R.string.ok,
                    DialogInterface.OnClickListener { _, _ -> return@OnClickListener })
            }
            builder.create()
            builder.show()

        } ?: throw IllegalStateException("Activity cannot be null")
    }

    private fun addNote() {


        dialogAddNote = Dialog(context as Activity)
        dialogAddNote.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialogAddNote.window!!.setBackgroundDrawableResource(android.R.color.transparent)
        dialogAddNote.setContentView(R.layout.dialog_note)
        dialogAddNote.setCancelable(true)

        dialogAddNote.image_view_btn_add_qty.setOnClickListener() {
            dialogAddNote.dismiss()
        }

        dialogAddNote.editText_note.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                viewmodel.getNote(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
        })


    }

}
