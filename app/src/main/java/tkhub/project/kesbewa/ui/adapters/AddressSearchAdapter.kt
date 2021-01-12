package tkhub.project.kesbewa.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import tkhub.project.kesbewa.data.model.GooglePlace

import tkhub.project.kesbewa.databinding.ListviewSearchAddressBinding


class AddressSearchAdapter : ListAdapter<GooglePlace, RecyclerView.ViewHolder>(AddressSearchDiffCallback()) {

    lateinit var mClickListener: ClickListener
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val addressitem = getItem(position)
        (holder as AddressItemViewHolder).bind(addressitem)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return AddressItemViewHolder(ListviewSearchAddressBinding.inflate(LayoutInflater.from(parent.context), parent, false),mClickListener)
    }
    fun setOnItemClickListener(aClickListener: ClickListener) {
        mClickListener = aClickListener
    }
    interface ClickListener {
        fun onClick(googlePlace: GooglePlace, aView: View)
    }
    class AddressItemViewHolder(private val binding: ListviewSearchAddressBinding ,var mClickListener: ClickListener ) :

        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener { binding.addresItem?.let { selectedProduct ->
                mClickListener.onClick(selectedProduct,it)
            } }
        }
        fun bind(googlePlace: GooglePlace) {
            binding.apply { addresItem = googlePlace
                executePendingBindings()
            }

        }
    }




}

private class AddressSearchDiffCallback : DiffUtil.ItemCallback<GooglePlace>() {
    override fun areItemsTheSame(oldItem: GooglePlace, newItem: GooglePlace): Boolean {
        return oldItem.id == newItem.id
    }
    override fun areContentsTheSame(oldItem: GooglePlace, newItem: GooglePlace): Boolean {
        return oldItem == newItem
    }
}