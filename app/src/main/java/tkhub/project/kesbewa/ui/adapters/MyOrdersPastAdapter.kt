package tkhub.project.kesbewa.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import tkhub.project.kesbewa.data.model.OrderRespons
import tkhub.project.kesbewa.databinding.ListviewOrdersBinding
import tkhub.project.kesbewa.databinding.ListviewOrdersPastBinding


class MyOrdersPastAdapter : ListAdapter<OrderRespons,RecyclerView.ViewHolder>(OrdersPastItemDiffCallback()) {

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val orderItem = getItem(position)
        (holder as OrdersItemViewHolder).bind(orderItem)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return OrdersItemViewHolder(ListviewOrdersPastBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }
    class OrdersItemViewHolder(private val binding: ListviewOrdersPastBinding ) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(orderRespons: OrderRespons) {
            binding.apply { pastorderitems = orderRespons
                executePendingBindings()
            }

        }
    }
}

private class OrdersPastItemDiffCallback : DiffUtil.ItemCallback<OrderRespons>() {
    override fun areItemsTheSame(oldItem: OrderRespons, newItem: OrderRespons): Boolean {
        return oldItem.order_code == newItem.order_code
    }
    override fun areContentsTheSame(oldItem: OrderRespons, newItem: OrderRespons): Boolean {
        return oldItem == newItem
    }
}