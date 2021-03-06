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
import java.lang.Deprecated;
import java.lang.Object;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.data.model.User;
import tkhub.project.kesbewa.viewmodels.login.RegistorViewModel;

public abstract class FragmentSingupGoogleBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintLayout4;

  @NonNull
  public final ConstraintLayout constraintLayout5;

  @NonNull
  public final ConstraintLayout constraintLayoutLoadingGuestusersave;

  @NonNull
  public final AppCompatEditText edittext1;

  @NonNull
  public final AppCompatEditText edittext2;

  @NonNull
  public final AppCompatEditText edittext3;

  @NonNull
  public final AppCompatEditText edittext4;

  @NonNull
  public final AppCompatImageView imageviewNavigation;

  @NonNull
  public final AppCompatTextView textView;

  @NonNull
  public final AppCompatTextView textview2;

  @NonNull
  public final AppCompatTextView textview3;

  @NonNull
  public final AppCompatTextView textview4;

  @NonNull
  public final AppCompatTextView textviewGuestName;

  @NonNull
  public final AppCompatTextView txt65;

  @NonNull
  public final AppCompatTextView txtBtnComplete;

  @NonNull
  public final AppCompatTextView txtTermsConditions;

  @NonNull
  public final View view1;

  @NonNull
  public final View view2;

  @NonNull
  public final View view3;

  @NonNull
  public final ConstraintLayout view6;

  @Bindable
  protected User mUser;

  @Bindable
  protected RegistorViewModel mSingupGoogleBindingView;

  protected FragmentSingupGoogleBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5,
      ConstraintLayout constraintLayoutLoadingGuestusersave, AppCompatEditText edittext1,
      AppCompatEditText edittext2, AppCompatEditText edittext3, AppCompatEditText edittext4,
      AppCompatImageView imageviewNavigation, AppCompatTextView textView,
      AppCompatTextView textview2, AppCompatTextView textview3, AppCompatTextView textview4,
      AppCompatTextView textviewGuestName, AppCompatTextView txt65,
      AppCompatTextView txtBtnComplete, AppCompatTextView txtTermsConditions, View view1,
      View view2, View view3, ConstraintLayout view6) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintLayout4 = constraintLayout4;
    this.constraintLayout5 = constraintLayout5;
    this.constraintLayoutLoadingGuestusersave = constraintLayoutLoadingGuestusersave;
    this.edittext1 = edittext1;
    this.edittext2 = edittext2;
    this.edittext3 = edittext3;
    this.edittext4 = edittext4;
    this.imageviewNavigation = imageviewNavigation;
    this.textView = textView;
    this.textview2 = textview2;
    this.textview3 = textview3;
    this.textview4 = textview4;
    this.textviewGuestName = textviewGuestName;
    this.txt65 = txt65;
    this.txtBtnComplete = txtBtnComplete;
    this.txtTermsConditions = txtTermsConditions;
    this.view1 = view1;
    this.view2 = view2;
    this.view3 = view3;
    this.view6 = view6;
  }

  public abstract void setUser(@Nullable User user);

  @Nullable
  public User getUser() {
    return mUser;
  }

  public abstract void setSingupGoogleBindingView(
      @Nullable RegistorViewModel singup_google_binding_view);

  @Nullable
  public RegistorViewModel getSingupGoogleBindingView() {
    return mSingupGoogleBindingView;
  }

  @NonNull
  public static FragmentSingupGoogleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_singup_google, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSingupGoogleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSingupGoogleBinding>inflateInternal(inflater, R.layout.fragment_singup_google, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSingupGoogleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_singup_google, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSingupGoogleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSingupGoogleBinding>inflateInternal(inflater, R.layout.fragment_singup_google, null, false, component);
  }

  public static FragmentSingupGoogleBinding bind(@NonNull View view) {
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
  public static FragmentSingupGoogleBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSingupGoogleBinding)bind(component, view, R.layout.fragment_singup_google);
  }
}
