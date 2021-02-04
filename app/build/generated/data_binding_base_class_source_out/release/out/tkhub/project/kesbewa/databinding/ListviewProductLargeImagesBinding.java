// Generated by data binding compiler. Do not edit!
package tkhub.project.kesbewa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.tuyenmonkey.mkloader.MKLoader;
import java.lang.Deprecated;
import java.lang.Object;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.data.model.ProductImage;

public abstract class ListviewProductLargeImagesBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clProImageRight;

  @NonNull
  public final AppCompatImageView imageViewProductImage;

  @NonNull
  public final AppCompatImageView imageViewProductImageBackground;

  @NonNull
  public final MKLoader mkloaderItemproduct;

  @NonNull
  public final AppCompatTextView txt1;

  @Bindable
  protected View.OnClickListener mClickListener;

  @Bindable
  protected View.OnScrollChangeListener mScrollChangeListener;

  @Bindable
  protected ProductImage mItem;

  protected ListviewProductLargeImagesBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ConstraintLayout clProImageRight,
      AppCompatImageView imageViewProductImage, AppCompatImageView imageViewProductImageBackground,
      MKLoader mkloaderItemproduct, AppCompatTextView txt1) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clProImageRight = clProImageRight;
    this.imageViewProductImage = imageViewProductImage;
    this.imageViewProductImageBackground = imageViewProductImageBackground;
    this.mkloaderItemproduct = mkloaderItemproduct;
    this.txt1 = txt1;
  }

  public abstract void setClickListener(@Nullable View.OnClickListener clickListener);

  @Nullable
  public View.OnClickListener getClickListener() {
    return mClickListener;
  }

  public abstract void setScrollChangeListener(
      @Nullable View.OnScrollChangeListener scrollChangeListener);

  @Nullable
  public View.OnScrollChangeListener getScrollChangeListener() {
    return mScrollChangeListener;
  }

  public abstract void setItem(@Nullable ProductImage item);

  @Nullable
  public ProductImage getItem() {
    return mItem;
  }

  @NonNull
  public static ListviewProductLargeImagesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.listview_product_large_images, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListviewProductLargeImagesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListviewProductLargeImagesBinding>inflateInternal(inflater, R.layout.listview_product_large_images, root, attachToRoot, component);
  }

  @NonNull
  public static ListviewProductLargeImagesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.listview_product_large_images, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListviewProductLargeImagesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListviewProductLargeImagesBinding>inflateInternal(inflater, R.layout.listview_product_large_images, null, false, component);
  }

  public static ListviewProductLargeImagesBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ListviewProductLargeImagesBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ListviewProductLargeImagesBinding)bind(component, view, R.layout.listview_product_large_images);
  }
}
