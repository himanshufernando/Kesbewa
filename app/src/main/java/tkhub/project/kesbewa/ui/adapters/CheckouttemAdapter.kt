package tkhub.project.kesbewa.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import tkhub.project.kesbewa.data.model.CartItem
import tkhub.project.kesbewa.databinding.ListviewProductsCheckoutBinding


class CheckouttemAdapter : ListAdapter<CartItem, RecyclerView.ViewHolder>(CheckOutItemDiffCallback()) {


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val cartitem = getItem(position)
        (holder as CheckOutItemViewHolder).bind(cartitem)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CheckOutItemViewHolder(ListviewProductsCheckoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    class CheckOutItemViewHolder(private val binding: ListviewProductsCheckoutBinding ) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(cart: CartItem) {
            binding.apply { cartitem = cart
                executePendingBindings()
            }

        }
    }




}

private class CheckOutItemDiffCallback : DiffUtil.ItemCallback<CartItem>() {
    override fun areItemsTheSame(oldItem: CartItem, newItem: CartItem): Boolean {
        return oldItem.pro_id == newItem.pro_id
    }
    override fun areContentsTheSame(oldItem: CartItem, newItem: CartItem): Boolean {
        return oldItem == newItem
    }
}