package tkhub.project.kesbewa.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import tkhub.project.kesbewa.data.model.OrderRespons
import tkhub.project.kesbewa.databinding.ListviewOrdersBinding


 class MyOrdersCurrentAdapter : ListAdapter<OrderRespons,RecyclerView.ViewHolder>(OrdersItemDiffCallback()) {

    lateinit var mClickListener: ClickListener

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val orderItem = getItem(position)
        (holder as OrdersItemViewHolder).bind(orderItem)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return OrdersItemViewHolder(ListviewOrdersBinding.inflate(LayoutInflater.from(parent.context), parent, false),mClickListener)
    }
    fun setOnItemClickListener(aClickListener: ClickListener) {
        mClickListener = aClickListener
    }
    interface ClickListener {
        fun onClick(orderRespons: OrderRespons, aView: View)
    }
    class OrdersItemViewHolder(private val binding: ListviewOrdersBinding ,var mClickListener: ClickListener ) :

        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener { binding.orderitems?.let { selectedProduct ->
                mClickListener.onClick(selectedProduct,it)
            } }
        }
        fun bind(deliveryAddress: OrderRespons) {
            binding.apply { orderitems = deliveryAddress
                executePendingBindings()
            }

        }
    }

}

private class OrdersItemDiffCallback : DiffUtil.ItemCallback<OrderRespons>() {
    override fun areItemsTheSame(oldItem: OrderRespons, newItem: OrderRespons): Boolean {
        return oldItem.order_code == newItem.order_code
    }
    override fun areContentsTheSame(oldItem: OrderRespons, newItem: OrderRespons): Boolean {
        return oldItem == newItem
    }
}