package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSingupGoogleBindingImpl extends FragmentSingupGoogleBinding implements tkhub.project.kesbewa.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout4, 7);
        sViewsWithIds.put(R.id.textView, 8);
        sViewsWithIds.put(R.id.constraintLayout5, 9);
        sViewsWithIds.put(R.id.textview_guest_name, 10);
        sViewsWithIds.put(R.id.view_1, 11);
        sViewsWithIds.put(R.id.textview_3, 12);
        sViewsWithIds.put(R.id.view_3, 13);
        sViewsWithIds.put(R.id.textview_2, 14);
        sViewsWithIds.put(R.id.view_2, 15);
        sViewsWithIds.put(R.id.textview_4, 16);
        sViewsWithIds.put(R.id.view_6, 17);
        sViewsWithIds.put(R.id.txt_65, 18);
        sViewsWithIds.put(R.id.txt_terms_conditions, 19);
        sViewsWithIds.put(R.id.txt_btn_complete, 20);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edittext2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of singup_google_binding_view.editTextGoogleNumber.getValue()
            //         is singup_google_binding_view.editTextGoogleNumber.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edittext2);
            // localize variables for thread safety
            // singup_google_binding_view.editTextGoogleNumber
            androidx.lifecycle.MutableLiveData<java.lang.String> singupGoogleBindingViewEditTextGoogleNumber = null;
            // singup_google_binding_view.editTextGoogleNumber.getValue()
            java.lang.String singupGoogleBindingViewEditTextGoogleNumberGetValue = null;
            // singup_google_binding_view.editTextGoogleNumber != null
            boolean singupGoogleBindingViewEditTextGoogleNumberJavaLangObjectNull = false;
            // singup_google_binding_view
            tkhub.project.kesbewa.viewmodels.login.RegistorViewModel singupGoogleBindingView = mSingupGoogleBindingView;
            // singup_google_binding_view != null
            boolean singupGoogleBindingViewJavaLangObjectNull = false;



            singupGoogleBindingViewJavaLangObjectNull = (singupGoogleBindingView) != (null);
            if (singupGoogleBindingViewJavaLangObjectNull) {


                singupGoogleBindingViewEditTextGoogleNumber = singupGoogleBindingView.getEditTextGoogleNumber();

                singupGoogleBindingViewEditTextGoogleNumberJavaLangObjectNull = (singupGoogleBindingViewEditTextGoogleNumber) != (null);
                if (singupGoogleBindingViewEditTextGoogleNumberJavaLangObjectNull) {




                    singupGoogleBindingViewEditTextGoogleNumber.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edittext4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of singup_google_binding_view.editTextGoogleNic.getValue()
            //         is singup_google_binding_view.editTextGoogleNic.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edittext4);
            // localize variables for thread safety
            // singup_google_binding_view.editTextGoogleNic
            androidx.lifecycle.MutableLiveData<java.lang.String> singupGoogleBindingViewEditTextGoogleNic = null;
            // singup_google_binding_view
            tkhub.project.kesbewa.viewmodels.login.RegistorViewModel singupGoogleBindingView = mSingupGoogleBindingView;
            // singup_google_binding_view != null
            boolean singupGoogleBindingViewJavaLangObjectNull = false;
            // singup_google_binding_view.editTextGoogleNic != null
            boolean singupGoogleBindingViewEditTextGoogleNicJavaLangObjectNull = false;
            // singup_google_binding_view.editTextGoogleNic.getValue()
            java.lang.String singupGoogleBindingViewEditTextGoogleNicGetValue = null;



            singupGoogleBindingViewJavaLangObjectNull = (singupGoogleBindingView) != (null);
            if (singupGoogleBindingViewJavaLangObjectNull) {


                singupGoogleBindingViewEditTextGoogleNic = singupGoogleBindingView.getEditTextGoogleNic();

                singupGoogleBindingViewEditTextGoogleNicJavaLangObjectNull = (singupGoogleBindingViewEditTextGoogleNic) != (null);
                if (singupGoogleBindingViewEditTextGoogleNicJavaLangObjectNull) {




                    singupGoogleBindingViewEditTextGoogleNic.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentSingupGoogleBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private FragmentSingupGoogleBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[2]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[4]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[3]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[18]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[20]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[19]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            );
        this.constraintLayoutLoadingGuestusersave.setTag(null);
        this.edittext1.setTag(null);
        this.edittext2.setTag(null);
        this.edittext3.setTag(null);
        this.edittext4.setTag(null);
        this.imageviewNavigation.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new tkhub.project.kesbewa.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.singup_google_binding_view == variableId) {
            setSingupGoogleBindingView((tkhub.project.kesbewa.viewmodels.login.RegistorViewModel) variable);
        }
        else if (BR.user == variableId) {
            setUser((tkhub.project.kesbewa.data.model.User) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSingupGoogleBindingView(@Nullable tkhub.project.kesbewa.viewmodels.login.RegistorViewModel SingupGoogleBindingView) {
        this.mSingupGoogleBindingView = SingupGoogleBindingView;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.singup_google_binding_view);
        super.requestRebind();
    }
    public void setUser(@Nullable tkhub.project.kesbewa.data.model.User User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSingupGoogleBindingViewEditTextGoogleNumber((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeSingupGoogleBindingViewEditTextGoogleNic((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeSingupGoogleBindingViewGoogleSignInProgress((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSingupGoogleBindingViewEditTextGoogleNumber(androidx.lifecycle.MutableLiveData<java.lang.String> SingupGoogleBindingViewEditTextGoogleNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSingupGoogleBindingViewEditTextGoogleNic(androidx.lifecycle.MutableLiveData<java.lang.String> SingupGoogleBindingViewEditTextGoogleNic, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSingupGoogleBindingViewGoogleSignInProgress(androidx.databinding.ObservableField<java.lang.Boolean> SingupGoogleBindingViewGoogleSignInProgress, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.String> singupGoogleBindingViewEditTextGoogleNumber = null;
        java.lang.Boolean singupGoogleBindingViewGoogleSignInProgressGet = null;
        tkhub.project.kesbewa.viewmodels.login.RegistorViewModel singupGoogleBindingView = mSingupGoogleBindingView;
        java.lang.String singupGoogleBindingViewEditTextGoogleNicGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSingupGoogleBindingViewGoogleSignInProgressGet = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> singupGoogleBindingViewEditTextGoogleNic = null;
        int singupGoogleBindingViewGoogleSignInProgressViewVISIBLEViewGONE = 0;
        java.lang.String userUserEmail = null;
        tkhub.project.kesbewa.data.model.User user = mUser;
        java.lang.String singupGoogleBindingViewEditTextGoogleNumberGetValue = null;
        java.lang.String userUserName = null;
        androidx.databinding.ObservableField<java.lang.Boolean> singupGoogleBindingViewGoogleSignInProgress = null;

        if ((dirtyFlags & 0x2fL) != 0) {


            if ((dirtyFlags & 0x29L) != 0) {

                    if (singupGoogleBindingView != null) {
                        // read singup_google_binding_view.editTextGoogleNumber
                        singupGoogleBindingViewEditTextGoogleNumber = singupGoogleBindingView.getEditTextGoogleNumber();
                    }
                    updateLiveDataRegistration(0, singupGoogleBindingViewEditTextGoogleNumber);


                    if (singupGoogleBindingViewEditTextGoogleNumber != null) {
                        // read singup_google_binding_view.editTextGoogleNumber.getValue()
                        singupGoogleBindingViewEditTextGoogleNumberGetValue = singupGoogleBindingViewEditTextGoogleNumber.getValue();
                    }
            }
            if ((dirtyFlags & 0x2aL) != 0) {

                    if (singupGoogleBindingView != null) {
                        // read singup_google_binding_view.editTextGoogleNic
                        singupGoogleBindingViewEditTextGoogleNic = singupGoogleBindingView.getEditTextGoogleNic();
                    }
                    updateLiveDataRegistration(1, singupGoogleBindingViewEditTextGoogleNic);


                    if (singupGoogleBindingViewEditTextGoogleNic != null) {
                        // read singup_google_binding_view.editTextGoogleNic.getValue()
                        singupGoogleBindingViewEditTextGoogleNicGetValue = singupGoogleBindingViewEditTextGoogleNic.getValue();
                    }
            }
            if ((dirtyFlags & 0x2cL) != 0) {

                    if (singupGoogleBindingView != null) {
                        // read singup_google_binding_view.googleSignInProgress
                        singupGoogleBindingViewGoogleSignInProgress = singupGoogleBindingView.getGoogleSignInProgress();
                    }
                    updateRegistration(2, singupGoogleBindingViewGoogleSignInProgress);


                    if (singupGoogleBindingViewGoogleSignInProgress != null) {
                        // read singup_google_binding_view.googleSignInProgress.get()
                        singupGoogleBindingViewGoogleSignInProgressGet = singupGoogleBindingViewGoogleSignInProgress.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(singup_google_binding_view.googleSignInProgress.get())
                    androidxDatabindingViewDataBindingSafeUnboxSingupGoogleBindingViewGoogleSignInProgressGet = androidx.databinding.ViewDataBinding.safeUnbox(singupGoogleBindingViewGoogleSignInProgressGet);
                if((dirtyFlags & 0x2cL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxSingupGoogleBindingViewGoogleSignInProgressGet) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(singup_google_binding_view.googleSignInProgress.get()) ? View.VISIBLE : View.GONE
                    singupGoogleBindingViewGoogleSignInProgressViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSingupGoogleBindingViewGoogleSignInProgressGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0x30L) != 0) {



                if (user != null) {
                    // read user.user_email
                    userUserEmail = user.getUser_email();
                    // read user.user_name
                    userUserName = user.getUser_name();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            this.constraintLayoutLoadingGuestusersave.setVisibility(singupGoogleBindingViewGoogleSignInProgressViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittext1, userUserName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittext3, userUserEmail);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittext2, singupGoogleBindingViewEditTextGoogleNumberGetValue);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edittext2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edittext2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edittext4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edittext4androidTextAttrChanged);
            this.imageviewNavigation.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittext4, singupGoogleBindingViewEditTextGoogleNicGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // singup_google_binding_view
        tkhub.project.kesbewa.viewmodels.login.RegistorViewModel singupGoogleBindingView = mSingupGoogleBindingView;
        // singup_google_binding_view != null
        boolean singupGoogleBindingViewJavaLangObjectNull = false;



        singupGoogleBindingViewJavaLangObjectNull = (singupGoogleBindingView) != (null);
        if (singupGoogleBindingViewJavaLangObjectNull) {



            singupGoogleBindingView.backFromGoogleRegistorToLogin(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): singup_google_binding_view.editTextGoogleNumber
        flag 1 (0x2L): singup_google_binding_view.editTextGoogleNic
        flag 2 (0x3L): singup_google_binding_view.googleSignInProgress
        flag 3 (0x4L): singup_google_binding_view
        flag 4 (0x5L): user
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(singup_google_binding_view.googleSignInProgress.get()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(singup_google_binding_view.googleSignInProgress.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}