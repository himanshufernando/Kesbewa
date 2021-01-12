package tkhub.project.kesbewa.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import tkhub.project.kesbewa.data.model.CartItem
import tkhub.project.kesbewa.data.model.DeliveryAddress
import tkhub.project.kesbewa.data.model.OrderRespons
import tkhub.project.kesbewa.databinding.ListviewAddressBinding
import tkhub.project.kesbewa.databinding.ListviewHistoryOrderItemBinding
import tkhub.project.kesbewa.databinding.ListviewOrdersBinding


class MyOrdersCurrentItemAdapter : ListAdapter<CartItem,RecyclerView.ViewHolder>(OrdersHistoryItemDiffCallback()) {
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val ordersitem = getItem(position)
        (holder as MyOrdersCurrentItemViewHolder).bind(ordersitem)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyOrdersCurrentItemViewHolder{
        return MyOrdersCurrentItemViewHolder(ListviewHistoryOrderItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }
    class MyOrdersCurrentItemViewHolder(private val binding: ListviewHistoryOrderItemBinding ) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(cartItem: CartItem) {
            binding.apply { orderitem = cartItem
                executePendingBindings()
            }
        }
    }
}
private class OrdersHistoryItemDiffCallback : DiffUtil.ItemCallback<CartItem>() {
    override fun areItemsTheSame(oldItem: CartItem, newItem: CartItem): Boolean {
        return oldItem.cart_id == newItem.cart_id
    }
    override fun areContentsTheSame(oldItem: CartItem, newItem: CartItem): Boolean {
        return oldItem == newItem
    }
}