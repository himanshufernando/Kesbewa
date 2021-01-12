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
import tkhub.project.kesbewa.databinding.ListviewProductsBinding


class ProductsImagesAdapter : ListAdapter<ProductImage, RecyclerView.ViewHolder>(ProductImageDiffCallback()) {
    lateinit var mClickListener: ClickListener


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val proImages = getItem(position)
        (holder as ProductImageViewHolder).bind(proImages)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProductImageViewHolder(ListviewProductImagesBinding.inflate(LayoutInflater.from(parent.context), parent, false),mClickListener)
    }
    fun setOnItemClickListener(aClickListener: ClickListener) {
        mClickListener = aClickListener
    }
    interface ClickListener {
        fun onClick(productImage: ProductImage, aView: View)
    }


    class ProductImageViewHolder(private val binding: ListviewProductImagesBinding ,var mClickListener: ClickListener) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener {
                binding.item?.let {
                        proImage -> mClickListener.onClick(proImage,it)
                }
            }


        }
        fun bind(proimages: ProductImage) {
            binding.apply { item = proimages
                executePendingBindings()
            }

        }
    }
}

private class ProductImageDiffCallback : DiffUtil.ItemCallback<ProductImage>() {
    override fun areItemsTheSame(oldItem: ProductImage, newItem: ProductImage): Boolean {
        return oldItem.img_id == newItem.img_id
    }
    override fun areContentsTheSame(oldItem: ProductImage, newItem: ProductImage): Boolean {
        return oldItem == newItem
    }
}