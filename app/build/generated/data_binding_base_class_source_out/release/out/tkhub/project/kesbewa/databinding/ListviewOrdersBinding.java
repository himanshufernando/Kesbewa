// Generated by data binding compiler. Do not edit!
package tkhub.project.kesbewa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Deprecated;
import java.lang.Object;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.data.model.OrderRespons;

public abstract class ListviewOrdersBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView appCompatTextView10;

  @NonNull
  public final AppCompatTextView appCompatTextView15;

  @NonNull
  public final AppCompatTextView appCompatTextView155;

  @NonNull
  public final AppCompatTextView appCompatTextView3;

  @NonNull
  public final AppCompatTextView appCompatTextView4;

  @NonNull
  public final AppCompatTextView appCompatTextView5;

  @NonNull
  public final AppCompatTextView appCompatTextView6;

  @NonNull
  public final AppCompatTextView appCompatTextView66;

  @NonNull
  public final AppCompatTextView appCompatTextView7;

  @NonNull
  public final AppCompatTextView appCompatTextView77;

  @NonNull
  public final AppCompatTextView appCompatTextView8;

  @NonNull
  public final AppCompatTextView appCompatTextView9;

  @NonNull
  public final CardView cardViewDealerToVisits;

  @NonNull
  public final ConstraintLayout constraintLayout9;

  @NonNull
  public final Guideline guideline1;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final AppCompatImageView imageView2;

  @NonNull
  public final ImageView imageViewCurrentConfirm;

  @NonNull
  public final AppCompatImageView imageViewCurrentDeliverd;

  @NonNull
  public final AppCompatImageView imageViewCurrentPacking;

  @NonNull
  public final AppCompatImageView imageViewCurrentTransit;

  @NonNull
  public final RecyclerView recyclerViewOrderItems;

  @NonNull
  public final View view1;

  @Bindable
  protected View.OnClickListener mClickListener;

  @Bindable
  protected OrderRespons mOrderitems;

  protected ListviewOrdersBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatTextView appCompatTextView10, AppCompatTextView appCompatTextView15,
      AppCompatTextView appCompatTextView155, AppCompatTextView appCompatTextView3,
      AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5,
      AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView66,
      AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView77,
      AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9,
      CardView cardViewDealerToVisits, ConstraintLayout constraintLayout9, Guideline guideline1,
      Guideline guideline2, Guideline guideline3, AppCompatImageView imageView2,
      ImageView imageViewCurrentConfirm, AppCompatImageView imageViewCurrentDeliverd,
      AppCompatImageView imageViewCurrentPacking, AppCompatImageView imageViewCurrentTransit,
      RecyclerView recyclerViewOrderItems, View view1) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appCompatTextView10 = appCompatTextView10;
    this.appCompatTextView15 = appCompatTextView15;
    this.appCompatTextView155 = appCompatTextView155;
    this.appCompatTextView3 = appCompatTextView3;
    this.appCompatTextView4 = appCompatTextView4;
    this.appCompatTextView5 = appCompatTextView5;
    this.appCompatTextView6 = appCompatTextView6;
    this.appCompatTextView66 = appCompatTextView66;
    this.appCompatTextView7 = appCompatTextView7;
    this.appCompatTextView77 = appCompatTextView77;
    this.appCompatTextView8 = appCompatTextView8;
    this.appCompatTextView9 = appCompatTextView9;
    this.cardViewDealerToVisits = cardViewDealerToVisits;
    this.constraintLayout9 = constraintLayout9;
    this.guideline1 = guideline1;
    this.guideline2 = guideline2;
    this.guideline3 = guideline3;
    this.imageView2 = imageView2;
    this.imageViewCurrentConfirm = imageViewCurrentConfirm;
    this.imageViewCurrentDeliverd = imageViewCurrentDeliverd;
    this.imageViewCurrentPacking = imageViewCurrentPacking;
    this.imageViewCurrentTransit = imageViewCurrentTransit;
    this.recyclerViewOrderItems = recyclerViewOrderItems;
    this.view1 = view1;
  }

  public abstract void setClickListener(@Nullable View.OnClickListener clickListener);

  @Nullable
  public View.OnClickListener getClickListener() {
    return mClickListener;
  }

  public abstract void setOrderitems(@Nullable OrderRespons orderitems);

  @Nullable
  public OrderRespons getOrderitems() {
    return mOrderitems;
  }

  @NonNull
  public static ListviewOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.listview_orders, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListviewOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListviewOrdersBinding>inflateInternal(inflater, R.layout.listview_orders, root, attachToRoot, component);
  }

  @NonNull
  public static ListviewOrdersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.listview_orders, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListviewOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListviewOrdersBinding>inflateInternal(inflater, R.layout.listview_orders, null, false, component);
  }

  public static ListviewOrdersBinding bind(@NonNull View view) {
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
  public static ListviewOrdersBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListviewOrdersBinding)bind(component, view, R.layout.listview_orders);
  }
}
