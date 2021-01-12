package tkhub.project.kesbewa.ui.fragment.nav.myorders

import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import kotlinx.android.synthetic.main.fragment_current_orders.view.*

import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.model.NetworkError
import tkhub.project.kesbewa.data.model.OrderRespons
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.services.network.InternetConnection
import tkhub.project.kesbewa.ui.adapters.MyOrdersCurrentAdapter
import tkhub.project.kesbewa.viewmodels.myorders.MyOrdersViewModel

/**
 * A simple [Fragment] subclass.
 */
class CurrentOrdersFragment : Fragment() {

    private val viewmodel: MyOrdersViewModel by viewModels{ MyOrdersViewModel.LiveDataVMFactory }
    lateinit var root: View
    var alertDialog: AlertDialog? = null
    private val adapter = MyOrdersCurrentAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_current_orders, container, false)

        if (!InternetConnection.checkInternetConnection()) {
            Toast.makeText(
                activity,
                "No internet connection, check your connection and try again.",
                Toast.LENGTH_LONG
            ).show()
        }

        root.recyclerView_myorders.adapter = adapter

        adapter.setOnItemClickListener(object : MyOrdersCurrentAdapter.ClickListener {
            override fun onClick(orderRespons: OrderRespons, aView: View) {

            }
        })


        viewmodel.userCurrentOrders.observe(this) { response ->
            root.constraintLayout_loading_orders.visibility = View.GONE
            when (response) {
                is KesbewaResult.Success -> {
                    var list =response.data.filter { u -> u.order_status_code != 6 }
                    if(list.isNullOrEmpty()){
                        root.textview_titel_1.visibility = View.VISIBLE
                    }else{
                        root.textview_titel_1.visibility = View.GONE
                    }
                    adapter.submitList(list.reversed())
                }
                is KesbewaResult.ExceptionError.ExError -> {
                    Toast.makeText(
                        activity,
                        response.exception.message,
                        Toast.LENGTH_SHORT
                    ).show()
                }
                is KesbewaResult.LogicError.LogError -> {
                    errorAlertDialog(response.exception)
                }
            }
        }


        return root
    }

    private fun errorAlertDialog(networkError: NetworkError) {
        if (alertDialog != null) {
            if (alertDialog!!.isShowing) {
                alertDialog!!.dismiss()
            }
        }
        alertDialog = activity?.let {
            val builder = androidx.appcompat.app.AlertDialog.Builder(it)
            builder.setTitle(networkError.errorTitle)
            builder.setMessage(networkError.errorMessage)
            builder.setCancelable(false)
            builder.apply {
                setPositiveButton(
                    R.string.ok,
                    DialogInterface.OnClickListener { _, _ -> return@OnClickListener })
            }
            builder.create()
            builder.show()

        } ?: throw IllegalStateException("Activity cannot be null")
    }


}
