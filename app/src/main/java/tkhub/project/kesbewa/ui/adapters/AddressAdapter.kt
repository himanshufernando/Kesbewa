package tkhub.project.kesbewa.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import tkhub.project.kesbewa.data.model.DeliveryAddress
import tkhub.project.kesbewa.databinding.ListviewAddressBinding


class AddressAdapter : ListAdapter<DeliveryAddress, RecyclerView.ViewHolder>(AddressItemDiffCallback()) {

    lateinit var mClickListener: ClickListener
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val addressitem = getItem(position)
        (holder as AddressItemViewHolder).bind(addressitem)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return AddressItemViewHolder(ListviewAddressBinding.inflate(LayoutInflater.from(parent.context), parent, false),mClickListener)
    }
    fun setOnItemClickListener(aClickListener: ClickListener) {
        mClickListener = aClickListener
    }
    interface ClickListener {
        fun onClick(addressitemsellect: DeliveryAddress, aView: View)
    }
    class AddressItemViewHolder(private val binding: ListviewAddressBinding ,var mClickListener: ClickListener ) :

        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener { binding.addresItem?.let { selectedProduct ->
                mClickListener.onClick(selectedProduct,it)
            } }
        }
        fun bind(deliveryAddress: DeliveryAddress) {
            binding.apply { addresItem = deliveryAddress
                executePendingBindings()
            }

        }
    }




}

private class AddressItemDiffCallback : DiffUtil.ItemCallback<DeliveryAddress>() {
    override fun areItemsTheSame(oldItem: DeliveryAddress, newItem: DeliveryAddress): Boolean {
        return oldItem.address_id == newItem.address_id
    }
    override fun areContentsTheSame(oldItem: DeliveryAddress, newItem: DeliveryAddress): Boolean {
        return oldItem == newItem
    }
}