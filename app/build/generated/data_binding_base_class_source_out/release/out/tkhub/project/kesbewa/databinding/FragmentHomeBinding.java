// Generated by data binding compiler. Do not edit!
package tkhub.project.kesbewa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.ticker.TickerView;
import java.lang.Deprecated;
import java.lang.Object;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.viewmodels.home.HomeViewModel;

public abstract class FragmentHomeBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatEditText autoCompleteTextView;

  @NonNull
  public final ConstraintLayout constraintLayoutCartHome;

  @NonNull
  public final ConstraintLayout constraintLayoutLoadingGuestusersave;

  @NonNull
  public final ConstraintLayout constraintlayout1;

  @NonNull
  public final AppCompatImageView imageView55;

  @NonNull
  public final AppCompatImageView imageViewSearchIcon;

  @NonNull
  public final AppCompatImageView imageviewNavigation;

  @NonNull
  public final RecyclerView recyclerViewProducts;

  @NonNull
  public final RelativeLayout relativelayoutSerach;

  @NonNull
  public final AppCompatTextView textView;

  @NonNull
  public final TickerView textViewCartCount;

  @Bindable
  protected HomeViewModel mProducts;

  protected FragmentHomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatEditText autoCompleteTextView, ConstraintLayout constraintLayoutCartHome,
      ConstraintLayout constraintLayoutLoadingGuestusersave, ConstraintLayout constraintlayout1,
      AppCompatImageView imageView55, AppCompatImageView imageViewSearchIcon,
      AppCompatImageView imageviewNavigation, RecyclerView recyclerViewProducts,
      RelativeLayout relativelayoutSerach, AppCompatTextView textView,
      TickerView textViewCartCount) {
    super(_bindingComponent, _root, _localFieldCount);
    this.autoCompleteTextView = autoCompleteTextView;
    this.constraintLayoutCartHome = constraintLayoutCartHome;
    this.constraintLayoutLoadingGuestusersave = constraintLayoutLoadingGuestusersave;
    this.constraintlayout1 = constraintlayout1;
    this.imageView55 = imageView55;
    this.imageViewSearchIcon = imageViewSearchIcon;
    this.imageviewNavigation = imageviewNavigation;
    this.recyclerViewProducts = recyclerViewProducts;
    this.relativelayoutSerach = relativelayoutSerach;
    this.textView = textView;
    this.textViewCartCount = textViewCartCount;
  }

  public abstract void setProducts(@Nullable HomeViewModel products);

  @Nullable
  public HomeViewModel getProducts() {
    return mProducts;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, null, false, component);
  }

  public static FragmentHomeBinding bind(@NonNull View view) {
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
  public static FragmentHomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentHomeBinding)bind(component, view, R.layout.fragment_home);
  }
}
