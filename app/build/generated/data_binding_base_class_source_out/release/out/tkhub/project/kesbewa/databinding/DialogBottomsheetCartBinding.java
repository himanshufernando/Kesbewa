// Generated by data binding compiler. Do not edit!
package tkhub.project.kesbewa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Deprecated;
import java.lang.Object;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.viewmodels.home.HomeViewModel;

public abstract class DialogBottomsheetCartBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout bottomSheetLayout;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final ConstraintLayout constraintLayout1;

  @NonNull
  public final ConstraintLayout constraintLayoutColor;

  @NonNull
  public final ConstraintLayout constraintLayoutParentSelectedColor;

  @NonNull
  public final ConstraintLayout constraintLayoutQuantity;

  @NonNull
  public final ConstraintLayout constraintLayoutSelectedColor;

  @NonNull
  public final ConstraintLayout constraintLayoutSelectedSize;

  @NonNull
  public final ConstraintLayout constraintLayoutTitel;

  @NonNull
  public final RecyclerView recyclerViewProductColor;

  @NonNull
  public final RecyclerView recyclerViewProductSize;

  @NonNull
  public final AppCompatTextView textView3;

  @NonNull
  public final AppCompatTextView textView4;

  @NonNull
  public final AppCompatTextView textView5;

  @NonNull
  public final AppCompatTextView textviewAddtocart;

  @NonNull
  public final ConstraintLayout textviewQtyLayout;

  @NonNull
  public final AppCompatTextView textviewSelectedSize;

  @Bindable
  protected HomeViewModel mProductdetailsbottomsheet;

  protected DialogBottomsheetCartBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout bottomSheetLayout, ConstraintLayout constraintLayout,
      ConstraintLayout constraintLayout1, ConstraintLayout constraintLayoutColor,
      ConstraintLayout constraintLayoutParentSelectedColor,
      ConstraintLayout constraintLayoutQuantity, ConstraintLayout constraintLayoutSelectedColor,
      ConstraintLayout constraintLayoutSelectedSize, ConstraintLayout constraintLayoutTitel,
      RecyclerView recyclerViewProductColor, RecyclerView recyclerViewProductSize,
      AppCompatTextView textView3, AppCompatTextView textView4, AppCompatTextView textView5,
      AppCompatTextView textviewAddtocart, ConstraintLayout textviewQtyLayout,
      AppCompatTextView textviewSelectedSize) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomSheetLayout = bottomSheetLayout;
    this.constraintLayout = constraintLayout;
    this.constraintLayout1 = constraintLayout1;
    this.constraintLayoutColor = constraintLayoutColor;
    this.constraintLayoutParentSelectedColor = constraintLayoutParentSelectedColor;
    this.constraintLayoutQuantity = constraintLayoutQuantity;
    this.constraintLayoutSelectedColor = constraintLayoutSelectedColor;
    this.constraintLayoutSelectedSize = constraintLayoutSelectedSize;
    this.constraintLayoutTitel = constraintLayoutTitel;
    this.recyclerViewProductColor = recyclerViewProductColor;
    this.recyclerViewProductSize = recyclerViewProductSize;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textviewAddtocart = textviewAddtocart;
    this.textviewQtyLayout = textviewQtyLayout;
    this.textviewSelectedSize = textviewSelectedSize;
  }

  public abstract void setProductdetailsbottomsheet(
      @Nullable HomeViewModel productdetailsbottomsheet);

  @Nullable
  public HomeViewModel getProductdetailsbottomsheet() {
    return mProductdetailsbottomsheet;
  }

  @NonNull
  public static DialogBottomsheetCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_bottomsheet_cart, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogBottomsheetCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogBottomsheetCartBinding>inflateInternal(inflater, R.layout.dialog_bottomsheet_cart, root, attachToRoot, component);
  }

  @NonNull
  public static DialogBottomsheetCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_bottomsheet_cart, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogBottomsheetCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogBottomsheetCartBinding>inflateInternal(inflater, R.layout.dialog_bottomsheet_cart, null, false, component);
  }

  public static DialogBottomsheetCartBinding bind(@NonNull View view) {
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
  public static DialogBottomsheetCartBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogBottomsheetCartBinding)bind(component, view, R.layout.dialog_bottomsheet_cart);
  }
}
