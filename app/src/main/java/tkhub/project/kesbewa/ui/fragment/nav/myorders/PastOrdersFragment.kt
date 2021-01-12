package tkhub.project.kesbewa.ui.fragment.nav.myorders

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
import kotlinx.android.synthetic.main.fragment_past_orders.view.*
import kotlinx.android.synthetic.main.fragment_past_orders.view.textview_titel_1

import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.ui.adapters.MyOrdersPastAdapter
import tkhub.project.kesbewa.viewmodels.myorders.MyOrdersViewModel

/**
 * A simple [Fragment] subclass.
 */
class PastOrdersFragment : Fragment() {

    private val viewmodel: MyOrdersViewModel by viewModels{ MyOrdersViewModel.LiveDataVMFactory }
    lateinit var root :View
    var alertDialog: AlertDialog? = null
    private val adapter = MyOrdersPastAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_past_orders, container, false)

        root.recyclerView_mypastorders.adapter = adapter


        viewmodel.userCurrentOrders.observe(this) { response ->
            when(response){
                is KesbewaResult.Success -> {
                    var list =response.data.filter { u -> u.order_status_code == 5 }
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
                is KesbewaResult.LogicError.LogError ->{
                   // errorAlertDialog(response.exception)
                }
            }
        }



        return root
    }

}
