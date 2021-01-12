package tkhub.project.kesbewa.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import tkhub.project.kesbewa.data.model.ProductSize
import tkhub.project.kesbewa.databinding.ListviewProductSizeBinding



class ProductsSizeAdapter : ListAdapter<ProductSize, RecyclerView.ViewHolder>(ProductSizeDiffCallback()) {
    lateinit var mClickListener: ClickListener
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val product = getItem(position)
        (holder as ProductsSizeViewHolder).bind(product)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProductsSizeViewHolder(ListviewProductSizeBinding.inflate(LayoutInflater.from(parent.context), parent, false),mClickListener)
    }
    fun setOnItemClickListener(aClickListener: ClickListener) {
        mClickListener = aClickListener
    }
    interface ClickListener {
        fun onClick(selectedSizeProduct: ProductSize, aView: View)
    }
    class ProductsSizeViewHolder(private val binding: ListviewProductSizeBinding ,var mClickListener: ClickListener ) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener { binding.item?.let { selectedProduct -> mClickListener.onClick(selectedProduct,it) } }
        }
        fun bind(products: ProductSize) {
            binding.apply { item = products
                executePendingBindings()
            }

        }
    }




}

private class ProductSizeDiffCallback : DiffUtil.ItemCallback<ProductSize>() {
    override fun areItemsTheSame(oldItem: ProductSize, newItem: ProductSize): Boolean {
        return oldItem.size == newItem.size
    }
    override fun areContentsTheSame(oldItem: ProductSize, newItem: ProductSize): Boolean {
        return oldItem == newItem
    }
}