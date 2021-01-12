package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoginBindingImpl extends FragmentLoginBinding implements tkhub.project.kesbewa.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout99, 6);
        sViewsWithIds.put(R.id.imageView2, 7);
        sViewsWithIds.put(R.id.constraintLayout8, 8);
        sViewsWithIds.put(R.id.constraintLayout, 9);
        sViewsWithIds.put(R.id.ll_password_show_hide, 10);
        sViewsWithIds.put(R.id.iv_password_showhide, 11);
        sViewsWithIds.put(R.id.divider_8, 12);
        sViewsWithIds.put(R.id.textview_forgetpassword, 13);
        sViewsWithIds.put(R.id.txt_btn_login, 14);
        sViewsWithIds.put(R.id.constraintLayout_google, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editTextLoginnumberandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginBindingView.editTextLoginNumber.getValue()
            //         is loginBindingView.editTextLoginNumber.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextLoginnumber);
            // localize variables for thread safety
            // loginBindingView.editTextLoginNumber != null
            boolean loginBindingViewEditTextLoginNumberJavaLangObjectNull = false;
            // loginBindingView
            tkhub.project.kesbewa.viewmodels.login.LoginViewModel loginBindingView = mLoginBindingView;
            // loginBindingView.editTextLoginNumber
            androidx.lifecycle.MutableLiveData<java.lang.String> loginBindingViewEditTextLoginNumber = null;
            // loginBindingView.editTextLoginNumber.getValue()
            java.lang.String loginBindingViewEditTextLoginNumberGetValue = null;
            // loginBindingView != null
            boolean loginBindingViewJavaLangObjectNull = false;



            loginBindingViewJavaLangObjectNull = (loginBindingView) != (null);
            if (loginBindingViewJavaLangObjectNull) {


                loginBindingViewEditTextLoginNumber = loginBindingView.getEditTextLoginNumber();

                loginBindingViewEditTextLoginNumberJavaLangObjectNull = (loginBindingViewEditTextLoginNumber) != (null);
                if (loginBindingViewEditTextLoginNumberJavaLangObjectNull) {




                    loginBindingViewEditTextLoginNumber.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTextPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginBindingView.editTextLoginPassword.getValue()
            //         is loginBindingView.editTextLoginPassword.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextPassword);
            // localize variables for thread safety
            // loginBindingView.editTextLoginPassword != null
            boolean loginBindingViewEditTextLoginPasswordJavaLangObjectNull = false;
            // loginBindingView
            tkhub.project.kesbewa.viewmodels.login.LoginViewModel loginBindingView = mLoginBindingView;
            // loginBindingView.editTextLoginPassword
            androidx.lifecycle.MutableLiveData<java.lang.String> loginBindingViewEditTextLoginPassword = null;
            // loginBindingView.editTextLoginPassword.getValue()
            java.lang.String loginBindingViewEditTextLoginPasswordGetValue = null;
            // loginBindingView != null
            boolean loginBindingViewJavaLangObjectNull = false;



            loginBindingViewJavaLangObjectNull = (loginBindingView) != (null);
            if (loginBindingViewJavaLangObjectNull) {


                loginBindingViewEditTextLoginPassword = loginBindingView.getEditTextLoginPassword();

                loginBindingViewEditTextLoginPasswordJavaLangObjectNull = (loginBindingViewEditTextLoginPassword) != (null);
                if (loginBindingViewEditTextLoginPasswordJavaLangObjectNull) {




                    loginBindingViewEditTextLoginPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.view.View) bindings[12]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[1]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[2]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.RelativeLayout) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            );
        this.constraintLayout5.setTag(null);
        this.constraintLayout6.setTag(null);
        this.constraintLayoutLoadingGuestusersave.setTag(null);
        this.editTextLoginnumber.setTag(null);
        this.editTextPassword.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new tkhub.project.kesbewa.generated.callback.OnClickListener(this, 2);
        mCallback5 = new tkhub.project.kesbewa.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.loginBindingView == variableId) {
            setLoginBindingView((tkhub.project.kesbewa.viewmodels.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginBindingView(@Nullable tkhub.project.kesbewa.viewmodels.login.LoginViewModel LoginBindingView) {
        this.mLoginBindingView = LoginBindingView;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.loginBindingView);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoginBindingViewIsLoginVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeLoginBindingViewEditTextLoginNumber((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeLoginBindingViewEditTextLoginPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoginBindingViewIsLoginVisible(androidx.databinding.ObservableField<java.lang.Boolean> LoginBindingViewIsLoginVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginBindingViewEditTextLoginNumber(androidx.lifecycle.MutableLiveData<java.lang.String> LoginBindingViewEditTextLoginNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginBindingViewEditTextLoginPassword(androidx.lifecycle.MutableLiveData<java.lang.String> LoginBindingViewEditTextLoginPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean androidxDatabindingViewDataBindingSafeUnboxLoginBindingViewIsLoginVisibleGet = false;
        int loginBindingViewIsLoginVisibleViewVISIBLEViewGONE = 0;
        java.lang.String loginBindingViewEditTextLoginPasswordGetValue = null;
        java.lang.Boolean loginBindingViewIsLoginVisibleGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> loginBindingViewIsLoginVisible = null;
        tkhub.project.kesbewa.viewmodels.login.LoginViewModel loginBindingView = mLoginBindingView;
        androidx.lifecycle.MutableLiveData<java.lang.String> loginBindingViewEditTextLoginNumber = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> loginBindingViewEditTextLoginPassword = null;
        java.lang.String loginBindingViewEditTextLoginNumberGetValue = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (loginBindingView != null) {
                        // read loginBindingView.isLoginVisible
                        loginBindingViewIsLoginVisible = loginBindingView.isLoginVisible();
                    }
                    updateRegistration(0, loginBindingViewIsLoginVisible);


                    if (loginBindingViewIsLoginVisible != null) {
                        // read loginBindingView.isLoginVisible.get()
                        loginBindingViewIsLoginVisibleGet = loginBindingViewIsLoginVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(loginBindingView.isLoginVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxLoginBindingViewIsLoginVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(loginBindingViewIsLoginVisibleGet);
                if((dirtyFlags & 0x19L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxLoginBindingViewIsLoginVisibleGet) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(loginBindingView.isLoginVisible.get()) ? View.VISIBLE : View.GONE
                    loginBindingViewIsLoginVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxLoginBindingViewIsLoginVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (loginBindingView != null) {
                        // read loginBindingView.editTextLoginNumber
                        loginBindingViewEditTextLoginNumber = loginBindingView.getEditTextLoginNumber();
                    }
                    updateLiveDataRegistration(1, loginBindingViewEditTextLoginNumber);


                    if (loginBindingViewEditTextLoginNumber != null) {
                        // read loginBindingView.editTextLoginNumber.getValue()
                        loginBindingViewEditTextLoginNumberGetValue = loginBindingViewEditTextLoginNumber.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (loginBindingView != null) {
                        // read loginBindingView.editTextLoginPassword
                        loginBindingViewEditTextLoginPassword = loginBindingView.getEditTextLoginPassword();
                    }
                    updateLiveDataRegistration(2, loginBindingViewEditTextLoginPassword);


                    if (loginBindingViewEditTextLoginPassword != null) {
                        // read loginBindingView.editTextLoginPassword.getValue()
                        loginBindingViewEditTextLoginPasswordGetValue = loginBindingViewEditTextLoginPassword.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.constraintLayout5.setOnClickListener(mCallback5);
            this.constraintLayout6.setOnClickListener(mCallback6);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextLoginnumber, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextLoginnumberandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextPasswordandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.constraintLayoutLoadingGuestusersave.setVisibility(loginBindingViewIsLoginVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextLoginnumber, loginBindingViewEditTextLoginNumberGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextPassword, loginBindingViewEditTextLoginPasswordGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // loginBindingView
                tkhub.project.kesbewa.viewmodels.login.LoginViewModel loginBindingView = mLoginBindingView;
                // loginBindingView != null
                boolean loginBindingViewJavaLangObjectNull = false;



                loginBindingViewJavaLangObjectNull = (loginBindingView) != (null);
                if (loginBindingViewJavaLangObjectNull) {



                    loginBindingView.goToGusetUser(callbackArg_0);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // loginBindingView
                tkhub.project.kesbewa.viewmodels.login.LoginViewModel loginBindingView = mLoginBindingView;
                // loginBindingView != null
                boolean loginBindingViewJavaLangObjectNull = false;



                loginBindingViewJavaLangObjectNull = (loginBindingView) != (null);
                if (loginBindingViewJavaLangObjectNull) {



                    loginBindingView.goToRegistor(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loginBindingView.isLoginVisible
        flag 1 (0x2L): loginBindingView.editTextLoginNumber
        flag 2 (0x3L): loginBindingView.editTextLoginPassword
        flag 3 (0x4L): loginBindingView
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(loginBindingView.isLoginVisible.get()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(loginBindingView.isLoginVisible.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}