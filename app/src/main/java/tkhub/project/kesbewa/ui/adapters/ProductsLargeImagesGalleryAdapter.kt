package tkhub.project.kesbewa.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import tkhub.project.kesbewa.data.model.ProductImage
import tkhub.project.kesbewa.data.model.Products
import tkhub.project.kesbewa.databinding.ListviewProductImageGalleryBinding
import tkhub.project.kesbewa.databinding.ListviewProductImagesBinding
import tkhub.project.kesbewa.databinding.ListviewProductLargeImagesBinding
import tkhub.project.kesbewa.databinding.ListviewProductsBinding


class ProductsLargeImagesGalleryAdapter : ListAdapter<ProductImage, RecyclerView.ViewHolder>(ProductLargeImageGalDiffCallback()) {



    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val proImages = getItem(position)
        (holder as ProductLargeImageGalViewHolder).bind(proImages)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProductLargeImageGalViewHolder(ListviewProductImageGalleryBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }


    class ProductLargeImageGalViewHolder(private val binding: ListviewProductImageGalleryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(proimages: ProductImage) {
            binding.apply { item = proimages
                executePendingBindings()
            }
        }
    }
}

private class ProductLargeImageGalDiffCallback : DiffUtil.ItemCallback<ProductImage>() {
    override fun areItemsTheSame(oldItem: ProductImage, newItem: ProductImage): Boolean {
        return oldItem.img_id == newItem.img_id
    }
    override fun areContentsTheSame(oldItem: ProductImage, newItem: ProductImage): Boolean {
        return oldItem == newItem
    }
}