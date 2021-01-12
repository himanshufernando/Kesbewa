package tkhub.project.kesbewa.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import tkhub.project.kesbewa.data.model.Products
import tkhub.project.kesbewa.databinding.ListviewProductsBinding



class ProductsAdapter : ListAdapter<Products, RecyclerView.ViewHolder>(ProductDiffCallback()) {
    lateinit var mClickListener: ClickListener
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val product = getItem(position)
        (holder as ProductsViewHolder).bind(product)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProductsViewHolder(ListviewProductsBinding.inflate(LayoutInflater.from(parent.context), parent, false),mClickListener)
    }
    fun setOnItemClickListener(aClickListener: ClickListener) {
        mClickListener = aClickListener
    }
    interface ClickListener {
        fun onClick(selectedProduct: Products, aView: View)
    }
    class ProductsViewHolder(private val binding: ListviewProductsBinding ,var mClickListener: ClickListener ) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener { binding.item?.let { selectedProduct -> mClickListener.onClick(selectedProduct,it) } }
        }
        fun bind(products: Products) {
            binding.apply { item = products
                executePendingBindings()
            }

        }
    }




}

private class ProductDiffCallback : DiffUtil.ItemCallback<Products>() {
    override fun areItemsTheSame(oldItem: Products, newItem: Products): Boolean {
        return oldItem.pro_id == newItem.pro_id
    }
    override fun areContentsTheSame(oldItem: Products, newItem: Products): Boolean {
        return oldItem == newItem
    }
}