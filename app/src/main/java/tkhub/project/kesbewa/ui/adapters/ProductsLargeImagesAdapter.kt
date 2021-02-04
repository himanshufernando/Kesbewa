package tkhub.project.kesbewa.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import tkhub.project.kesbewa.data.model.ProductImage
import tkhub.project.kesbewa.data.model.Products
import tkhub.project.kesbewa.databinding.ListviewProductImagesBinding
import tkhub.project.kesbewa.databinding.ListviewProductLargeImagesBinding
import tkhub.project.kesbewa.databinding.ListviewProductsBinding


class ProductsLargeImagesAdapter : ListAdapter<ProductImage, RecyclerView.ViewHolder>(ProductLargeImageDiffCallback()) {

    lateinit var mClickListener: ClickListener

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val proImages = getItem(position)
        (holder as ProductLargeImageViewHolder).bind(proImages)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProductLargeImageViewHolder(ListviewProductLargeImagesBinding.inflate(LayoutInflater.from(parent.context), parent, false),mClickListener)
    }
    fun setOnItemClickListener(aClickListener: ClickListener) {
        mClickListener = aClickListener
    }
    interface ClickListener {
        fun onClick(selectedProductImage: ProductImage, aView: View)
    }

    class ProductLargeImageViewHolder(private val binding: ListviewProductLargeImagesBinding,var mClickListener: ClickListener) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.setClickListener { binding.item?.let { selectedProduct -> mClickListener.onClick(selectedProduct,it) } }
        }
        fun bind(proimages: ProductImage) {
            binding.apply { item = proimages
                executePendingBindings()
            }
        }
    }
}

private class ProductLargeImageDiffCallback : DiffUtil.ItemCallback<ProductImage>() {
    override fun areItemsTheSame(oldItem: ProductImage, newItem: ProductImage): Boolean {
        return oldItem.img_id == newItem.img_id
    }
    override fun areContentsTheSame(oldItem: ProductImage, newItem: ProductImage): Boolean {
        return oldItem == newItem
    }
}