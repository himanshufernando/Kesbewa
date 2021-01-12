// Generated by data binding compiler. Do not edit!
package tkhub.project.kesbewa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
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
import tkhub.project.kesbewa.viewmodels.cart.CartViewModel;

public abstract class FragmentPromoCodeBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final AppCompatEditText editTextQty;

  @NonNull
  public final AppCompatImageView imageViewBtnAddPromocode;

  @NonNull
  public final AppCompatImageView imageviewNavigation;

  @NonNull
  public final MKLoader progressbar;

  @NonNull
  public final AppCompatTextView textView;

  @NonNull
  public final AppCompatTextView textViewMsg;

  @Bindable
  protected CartViewModel mPromoBindingView;

  protected FragmentPromoCodeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraintLayout, AppCompatEditText editTextQty,
      AppCompatImageView imageViewBtnAddPromocode, AppCompatImageView imageviewNavigation,
      MKLoader progressbar, AppCompatTextView textView, AppCompatTextView textViewMsg) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintLayout = constraintLayout;
    this.editTextQty = editTextQty;
    this.imageViewBtnAddPromocode = imageViewBtnAddPromocode;
    this.imageviewNavigation = imageviewNavigation;
    this.progressbar = progressbar;
    this.textView = textView;
    this.textViewMsg = textViewMsg;
  }

  public abstract void setPromoBindingView(@Nullable CartViewModel promo_binding_view);

  @Nullable
  public CartViewModel getPromoBindingView() {
    return mPromoBindingView;
  }

  @NonNull
  public static FragmentPromoCodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_promo_code, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPromoCodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPromoCodeBinding>inflateInternal(inflater, R.layout.fragment_promo_code, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPromoCodeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_promo_code, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPromoCodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPromoCodeBinding>inflateInternal(inflater, R.layout.fragment_promo_code, null, false, component);
  }

  public static FragmentPromoCodeBinding bind(@NonNull View view) {
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
  public static FragmentPromoCodeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPromoCodeBinding)bind(component, view, R.layout.fragment_promo_code);
  }
}
