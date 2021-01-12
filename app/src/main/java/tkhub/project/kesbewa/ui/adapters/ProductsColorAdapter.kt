package tkhub.project.kesbewa.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import tkhub.project.kesbewa.data.model.ProductColor
import tkhub.project.kesbewa.databinding.ListviewProductColorBinding




class ProductsColorAdapter : ListAdapter<ProductColor, RecyclerView.ViewHolder>(ProductColorDiffCallback()) {
    lateinit var mClickListener: ClickListener
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val product = getItem(position)
        (holder as ProductsColorViewHolder).bind(product)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProductsColorViewHolder(ListviewProductColorBinding.inflate(LayoutInflater.from(parent.context), parent, false),mClickListener)
    }
    fun setOnItemClickListener(aClickListener: ClickListener) {
        mClickListener = aClickListener
    }
    interface ClickListener {
        fun onClick(selectedColorProduct: ProductColor, aView: View)
    }
    class ProductsColorViewHolder(private val binding: ListviewProductColorBinding ,var mClickListener: ClickListener ) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener { binding.item?.let { selectedProduct -> mClickListener.onClick(selectedProduct,it) } }
        }
        fun bind(products: ProductColor) {
            binding.apply { item = products
                executePendingBindings()
            }

        }
    }




}

private class ProductColorDiffCallback : DiffUtil.ItemCallback<ProductColor>() {
    override fun areItemsTheSame(oldItem: ProductColor, newItem: ProductColor): Boolean {
        return oldItem.color_code == newItem.color_code
    }
    override fun areContentsTheSame(oldItem: ProductColor, newItem: ProductColor): Boolean {
        return oldItem == newItem
    }
}