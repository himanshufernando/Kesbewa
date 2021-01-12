package tkhub.project.kesbewa.ui.adapters

import android.graphics.Color
import android.graphics.Paint
import android.os.Build
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import coil.transform.BlurTransformation
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import tkhub.project.kesbewa.Kesbewa
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.model.*
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import kotlin.math.roundToInt
import java.text.SimpleDateFormat
import java.util.*


object CustomBindingAdapter {

    @BindingAdapter("setSoldOut")
    @JvmStatic
    fun setSoldOut(view: ImageView, status: Boolean) {
        if (status) {
            view.visibility = View.VISIBLE
        } else {
            view.visibility = View.GONE
        }

    }


    @BindingAdapter("pro_cover_img")
    @JvmStatic
    fun pro_cover_img(view: ImageView, pro: Products) {
        view.visibility = View.VISIBLE
        try {
            if (pro.sold_out) {
                Glide.with(Kesbewa.applicationContext())
                    .load(R.drawable.ic_soldout)
                    .apply(RequestOptions.centerCropTransform())
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .error(R.drawable.ic_no_image)
                    .into(view)
            } else {


                Glide.with(Kesbewa.applicationContext())
                    .load(pro.pro_cover_img)
                    .apply(RequestOptions.centerCropTransform())
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .error(R.drawable.ic_no_image)
                    .dontAnimate()
                    .into(view)

            }

        } catch (ex: Exception) {

            Glide.with(Kesbewa.applicationContext())
                .load(R.drawable.ic_no_image)
                .error(R.drawable.ic_no_image)

                .into(view)

        }

    }


    @BindingAdapter("img_url")
    @JvmStatic
    fun img_url(view: ImageView, pro_img: String?) {

        try {
            Glide.with(Kesbewa.applicationContext())
                .load(pro_img)
                .format(DecodeFormat.PREFER_RGB_565)
                .apply(RequestOptions.centerCropTransform())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .error(R.drawable.ic_no_image)
                .into(view)

        } catch (e: Exception) {
            Glide.with(Kesbewa.applicationContext())
                .load(R.drawable.ic_no_image)
                .error(R.drawable.ic_no_image)
                .into(view)

        }

    }

    @BindingAdapter("img_product_galary")
    @JvmStatic
    fun img_product_galary(view: ImageView, pro_img: String?) {

        try {
            Glide.with(Kesbewa.applicationContext())
                .load(pro_img)
                .format(DecodeFormat.PREFER_RGB_565)
                .apply(RequestOptions.centerCropTransform())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .error(R.drawable.ic_no_image)
                .into(view)

        } catch (e: Exception) {
            Glide.with(Kesbewa.applicationContext())
                .load(R.drawable.ic_no_image)
                .error(R.drawable.ic_no_image)
                .into(view)

        }

    }


    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
    @BindingAdapter("img_url_cover")
    @JvmStatic
    fun img_url_cover(view: ImageView, pro_img: String?) {
        try {
            view.scaleType = ImageView.ScaleType.CENTER_CROP
            view.load(pro_img) {
                error(R.drawable.bluerback)
                transformations(BlurTransformation(Kesbewa.applicationContext(), 25f))
            }
        } catch (e: Exception) {
            view.scaleType = ImageView.ScaleType.CENTER_CROP
            view.load(R.drawable.bluerback) {
                transformations(BlurTransformation(Kesbewa.applicationContext(), 25f))
            }
        }

    }

    @BindingAdapter("color_code")
    @JvmStatic
    fun color_code(view: ConstraintLayout, color: String?) {
        view.setBackgroundColor(Color.parseColor("#$color"))
    }


    @BindingAdapter("color_code_border")
    @JvmStatic
    fun color_code_border(view: ConstraintLayout, color: String?) {
        if (color.equals("FFFFFF", true)) {
            view.setBackgroundColor(Color.parseColor("#000000"))
        } else {
            view.setBackgroundColor(Color.parseColor("#$color"))
        }

    }

    @BindingAdapter("cart_image")
    @JvmStatic
    fun cart_img(view: ImageView, pro_cover_img: String?) {
        try {
            Glide.with(Kesbewa.applicationContext())
                .load(pro_cover_img)
                .apply(RequestOptions.centerCropTransform())
                .override(800, 800)
                .format(DecodeFormat.PREFER_RGB_565)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .error(R.drawable.ic_no_image)
                .placeholder(R.drawable.ic_no_image)
                .into(view)

        } catch (e: Exception) {
            Glide.with(Kesbewa.applicationContext())
                .load(R.drawable.ic_no_image)
                .error(R.drawable.ic_no_image)
                .into(view)

        }
    }


    @BindingAdapter("select_address")
    @JvmStatic
    fun select_address(view: ImageView, deliveryAddress: DeliveryAddress?) {
        view.scaleType = ImageView.ScaleType.CENTER_CROP
        if (deliveryAddress!!.user_isSelect) {
            view.load(R.drawable.ic_address_color)
        } else {
            view.load(R.drawable.ic_address_dark)
        }
    }

    @BindingAdapter("user_address_two")
    @JvmStatic
    fun user_address_two(view: AppCompatTextView, userAddressTwo: String?) {
        if ((userAddressTwo.isNullOrEmpty()) || (userAddressTwo == "null")) {
            view.visibility = View.GONE
        } else {
            view.visibility = View.VISIBLE
            view.text = userAddressTwo
        }

    }

    @BindingAdapter("setCurrentItems")
    @JvmStatic
    fun setCurrentItems(view: RecyclerView, cartItems: List<CartItem>?) {
        if (cartItems != null) {
            val historyAdapter = MyOrdersCurrentItemAdapter()
            view.adapter = historyAdapter
            historyAdapter.submitList(cartItems)
        } else {
            val historyAdapter = MyOrdersCurrentItemAdapter()
            view.adapter = historyAdapter
            historyAdapter.submitList(emptyList())

        }
    }

    @BindingAdapter("setStatusToConfirm")
    @JvmStatic
    fun setStatusToConfirm(view: ImageView, status: Int) {
        if (status >= 1) {
            view.load(R.drawable.ic_item_confirmed)
        } else {
            view.load(R.drawable.ic_item_confirmed_gry)
        }
    }

    @BindingAdapter("setStatusToPacking")
    @JvmStatic
    fun setStatusToPacking(view: ImageView, status: Int) {
        if (status >= 2) {
            view.load(R.drawable.ic_item_packing)
        } else {
            view.load(R.drawable.ic_item_packing_gry)
        }
    }

    @BindingAdapter("setStatusToTransit")
    @JvmStatic
    fun setStatusToTransit(view: ImageView, response: OrderRespons) {

        if (response.order_dispatch_type == "STORE") {
            if (response.order_status_code >= 7) {
                view.load(R.drawable.ic_item_delivered)
            } else {
                view.load(R.drawable.ic_item_delivered_gry)
            }
        } else {
            if (response.order_status_code >= 3) {
                view.load(R.drawable.ic_item_intransit)
            } else {
                view.load(R.drawable.ic_item_intransit_gry)
            }
        }

    }

    @BindingAdapter("setTextToTransit")
    @JvmStatic
    fun setTextToTransit(view: TextView, response: OrderRespons) {
        if (response.order_dispatch_type == "STORE") {
            view.text = "Ready"
        } else {
            view.text = "In Transit"
        }
    }

    @BindingAdapter("setStatusToDelivered")
    @JvmStatic
    fun setStatusToDelivered(view: ImageView, response: OrderRespons) {
        if (response.order_dispatch_type == "STORE") {
            view.visibility = View.GONE
        } else {
            if (response.order_status_code >= 4) {
                view.load(R.drawable.ic_item_delivered)
            } else {
                view.load(R.drawable.ic_item_delivered_gry)
            }
        }

    }


    @BindingAdapter("setTextToDelivered")
    @JvmStatic
    fun setTextToDelivered(view: TextView, response: OrderRespons) {
        if (response.order_dispatch_type == "STORE") {
            view.text = ""
            view.visibility = View.GONE
        } else {
            view.text = "Delivered"
            view.visibility = View.VISIBLE
        }

    }


    @BindingAdapter("setDeliveredView")
    @JvmStatic
    fun setDeliveredView(view: View, response: OrderRespons) {
        if (response.order_dispatch_type == "STORE") {
            view.visibility = View.GONE
        } else {
            view.visibility = View.VISIBLE
        }

    }

    @BindingAdapter("setOrderHistoryItemImage")
    @JvmStatic
    fun setOrderHistoryItemImage(view: ImageView, pro_cover_img: String?) {
        try {
            Glide.with(Kesbewa.applicationContext())
                .load(pro_cover_img)
                .apply(RequestOptions.centerCropTransform())
                .override(800, 800)
                .format(DecodeFormat.PREFER_RGB_565)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .error(R.drawable.ic_no_image)
                .placeholder(R.drawable.ic_no_image)
                .into(view)

        } catch (e: Exception) {
            Glide.with(Kesbewa.applicationContext())
                .load(R.drawable.ic_no_image)
                .error(R.drawable.ic_no_image)
                .into(view)

        }
    }


    @BindingAdapter("setRejectStatus")
    @JvmStatic
    fun setRejectStatus(view: RelativeLayout, status: Int) {
        if (status == 6) {
            view.visibility = View.VISIBLE
        } else {
            view.visibility = View.GONE
        }
    }

    @BindingAdapter("setTimeStampToString")
    @JvmStatic
    fun setTimeStampToString(view: TextView, timeStamp: Long) {
        val sdf = SimpleDateFormat("dd MMM yyyy", Locale.US)
        view.text = sdf.format(timeStamp)
    }

    @BindingAdapter("setOrderDispatchDate")
    @JvmStatic
    fun setOrderDispatchDate(view: TextView, type: String) {
        if (type == "STORE") {
            view.text = "Your order will ready within 1 to 3 working days"
        } else {
            view.text = "Your order will delivered within 3 to 7 working days"
        }
    }


    @BindingAdapter("setOrderDispatchType")
    @JvmStatic
    fun setOrderDispatchType(view: TextView, response: OrderRespons) {
        if (response.order_dispatch_type == "STORE") {
            view.text =
                "Your order can pickup from " + response.order_store_location + " when it's ready"
        } else {

            var fulladdress =
                if (!AppPrefs.checkValidString(response.delivery_address.user_address_two!!)) {
                    (response.delivery_address.user_address_number + " ," + response.delivery_address.user_address_one + ", " + "\n"
                            + response.delivery_address.user_address_two + ", " + "\n"
                            + response.delivery_address.user_address_city + ", " + "\n"
                            + response.delivery_address.user_address_district)
                } else {
                    (response.delivery_address.user_address_number + " ," + response.delivery_address.user_address_one + ", " + "\n"
                            + response.delivery_address.user_address_city + ", " + "\n"
                            + response.delivery_address.user_address_district)
                }


            view.text = "Your order will delivered to $fulladdress"
        }
    }


    @BindingAdapter("setRegularPrice")
    @JvmStatic
    fun setRegularPrice(view: TextView, value: Products) {
        if (value.pro_price_regular != value.pro_price) {
            view.text = "${value.pro_price_regular} LKR"
            view.paintFlags = view.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
            view.visibility = View.VISIBLE
        } else {
            view.visibility = View.GONE
        }

    }

    @BindingAdapter("setRegularPriceDiscount")
    @JvmStatic
    fun setRegularPriceDiscount(view: TextView, value: Products) {
        if (value.pro_price_regular != value.pro_price) {

            var precentage =
                ((value.pro_price_regular - value.pro_price) / value.pro_price_regular) * 100

            view.text = precentage.toInt().toString()+"%"

            view.visibility = View.VISIBLE
        } else {
            view.visibility = View.GONE
        }

    }
}