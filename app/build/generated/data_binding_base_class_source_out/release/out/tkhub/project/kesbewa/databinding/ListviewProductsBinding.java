// Generated by data binding compiler. Do not edit!
package tkhub.project.kesbewa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.tuyenmonkey.mkloader.MKLoader;
import java.lang.Deprecated;
import java.lang.Object;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.data.model.Products;

public abstract class ListviewProductsBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardViewDealerToVisits;

  @NonNull
  public final ConstraintLayout constraintlayout1;

  @NonNull
  public final AppCompatImageView imgHomeTeacher;

  @NonNull
  public final MKLoader mkloaderItemproduct;

  @NonNull
  public final RelativeLayout relativeLayoutCoverimage;

  @NonNull
  public final TextView textviewDiscount;

  @NonNull
  public final AppCompatTextView textviewHomeCode;

  @NonNull
  public final AppCompatTextView textviewHomePromake;

  @NonNull
  public final AppCompatTextView textviewHomeProname;

  @NonNull
  public final TextView textviewHomeRegprice;

  @NonNull
  public final TextView textviewHomeTeacherclass;

  @NonNull
  public final AppCompatTextView txt1;

  @Bindable
  protected View.OnClickListener mClickListener;

  @Bindable
  protected Products mItem;

  protected ListviewProductsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardViewDealerToVisits, ConstraintLayout constraintlayout1,
      AppCompatImageView imgHomeTeacher, MKLoader mkloaderItemproduct,
      RelativeLayout relativeLayoutCoverimage, TextView textviewDiscount,
      AppCompatTextView textviewHomeCode, AppCompatTextView textviewHomePromake,
      AppCompatTextView textviewHomeProname, TextView textviewHomeRegprice,
      TextView textviewHomeTeacherclass, AppCompatTextView txt1) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardViewDealerToVisits = cardViewDealerToVisits;
    this.constraintlayout1 = constraintlayout1;
    this.imgHomeTeacher = imgHomeTeacher;
    this.mkloaderItemproduct = mkloaderItemproduct;
    this.relativeLayoutCoverimage = relativeLayoutCoverimage;
    this.textviewDiscount = textviewDiscount;
    this.textviewHomeCode = textviewHomeCode;
    this.textviewHomePromake = textviewHomePromake;
    this.textviewHomeProname = textviewHomeProname;
    this.textviewHomeRegprice = textviewHomeRegprice;
    this.textviewHomeTeacherclass = textviewHomeTeacherclass;
    this.txt1 = txt1;
  }

  public abstract void setClickListener(@Nullable View.OnClickListener clickListener);

  @Nullable
  public View.OnClickListener getClickListener() {
    return mClickListener;
  }

  public abstract void setItem(@Nullable Products item);

  @Nullable
  public Products getItem() {
    return mItem;
  }

  @NonNull
  public static ListviewProductsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.listview_products, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListviewProductsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListviewProductsBinding>inflateInternal(inflater, R.layout.listview_products, root, attachToRoot, component);
  }

  @NonNull
  public static ListviewProductsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.listview_products, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListviewProductsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListviewProductsBinding>inflateInternal(inflater, R.layout.listview_products, null, false, component);
  }

  public static ListviewProductsBinding bind(@NonNull View view) {
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
  public static ListviewProductsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListviewProductsBinding)bind(component, view, R.layout.listview_products);
  }
}