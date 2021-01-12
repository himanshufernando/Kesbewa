package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSingupBindingImpl extends FragmentSingupBinding implements tkhub.project.kesbewa.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout4, 9);
        sViewsWithIds.put(R.id.textView, 10);
        sViewsWithIds.put(R.id.constraintLayout5, 11);
        sViewsWithIds.put(R.id.textview_guest_name, 12);
        sViewsWithIds.put(R.id.textview_guest_name_star, 13);
        sViewsWithIds.put(R.id.view_1, 14);
        sViewsWithIds.put(R.id.textview_2, 15);
        sViewsWithIds.put(R.id.textview_2_star, 16);
        sViewsWithIds.put(R.id.view_2, 17);
        sViewsWithIds.put(R.id.textview_3, 18);
        sViewsWithIds.put(R.id.textview_3_star, 19);
        sViewsWithIds.put(R.id.view_3, 20);
        sViewsWithIds.put(R.id.textview_5, 21);
        sViewsWithIds.put(R.id.ll_password_show_hide, 22);
        sViewsWithIds.put(R.id.iv_password_showhide, 23);
        sViewsWithIds.put(R.id.view_5, 24);
        sViewsWithIds.put(R.id.textview_7, 25);
        sViewsWithIds.put(R.id.ll_con_password_show_hide, 26);
        sViewsWithIds.put(R.id.iv_con_password_showhide, 27);
        sViewsWithIds.put(R.id.view_7, 28);
        sViewsWithIds.put(R.id.view_6, 29);
        sViewsWithIds.put(R.id.txt_65, 30);
        sViewsWithIds.put(R.id.txt_terms_conditions, 31);
        sViewsWithIds.put(R.id.txt_btn_reg, 32);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edittext1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of singupBindingView.editTextUserName.getValue()
            //         is singupBindingView.editTextUserName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edittext1);
            // localize variables for thread safety
            // singupBindingView != null
            boolean singupBindingViewJavaLangObjectNull = false;
            // singupBindingView.editTextUserName != null
            boolean singupBindingViewEditTextUserNameJavaLangObjectNull = false;
            // singupBindingView.editTextUserName
            androidx.lifecycle.MutableLiveData<java.lang.String> singupBindingViewEditTextUserName = null;
            // singupBindingView.editTextUserName.getValue()
            java.lang.String singupBindingViewEditTextUserNameGetValue = null;
            // singupBindingView
            tkhub.project.kesbewa.viewmodels.login.RegistorViewModel singupBindingView = mSingupBindingView;



            singupBindingViewJavaLangObjectNull = (singupBindingView) != (null);
            if (singupBindingViewJavaLangObjectNull) {


                singupBindingViewEditTextUserName = singupBindingView.getEditTextUserName();

                singupBindingViewEditTextUserNameJavaLangObjectNull = (singupBindingViewEditTextUserName) != (null);
                if (singupBindingViewEditTextUserNameJavaLangObjectNull) {




                    singupBindingViewEditTextUserName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edittext2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of singupBindingView.editTextNumber.getValue()
            //         is singupBindingView.editTextNumber.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edittext2);
            // localize variables for thread safety
            // singupBindingView != null
            boolean singupBindingViewJavaLangObjectNull = false;
            // singupBindingView.editTextNumber
            androidx.lifecycle.MutableLiveData<java.lang.String> singupBindingViewEditTextNumber = null;
            // singupBindingView.editTextNumber.getValue()
            java.lang.String singupBindingViewEditTextNumberGetValue = null;
            // singupBindingView
            tkhub.project.kesbewa.viewmodels.login.RegistorViewModel singupBindingView = mSingupBindingView;
            // singupBindingView.editTextNumber != null
            boolean singupBindingViewEditTextNumberJavaLangObjectNull = false;



            singupBindingViewJavaLangObjectNull = (singupBindingView) != (null);
            if (singupBindingViewJavaLangObjectNull) {


                singupBindingViewEditTextNumber = singupBindingView.getEditTextNumber();

                singupBindingViewEditTextNumberJavaLangObjectNull = (singupBindingViewEditTextNumber) != (null);
                if (singupBindingViewEditTextNumberJavaLangObjectNull) {




                    singupBindingViewEditTextNumber.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edittext3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of singupBindingView.editTextEmail.getValue()
            //         is singupBindingView.editTextEmail.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edittext3);
            // localize variables for thread safety
            // singupBindingView != null
            boolean singupBindingViewJavaLangObjectNull = false;
            // singupBindingView.editTextEmail.getValue()
            java.lang.String singupBindingViewEditTextEmailGetValue = null;
            // singupBindingView.editTextEmail != null
            boolean singupBindingViewEditTextEmailJavaLangObjectNull = false;
            // singupBindingView
            tkhub.project.kesbewa.viewmodels.login.RegistorViewModel singupBindingView = mSingupBindingView;
            // singupBindingView.editTextEmail
            androidx.lifecycle.MutableLiveData<java.lang.String> singupBindingViewEditTextEmail = null;



            singupBindingViewJavaLangObjectNull = (singupBindingView) != (null);
            if (singupBindingViewJavaLangObjectNull) {


                singupBindingViewEditTextEmail = singupBindingView.getEditTextEmail();

                singupBindingViewEditTextEmailJavaLangObjectNull = (singupBindingViewEditTextEmail) != (null);
                if (singupBindingViewEditTextEmailJavaLangObjectNull) {




                    singupBindingViewEditTextEmail.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edittext5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of singupBindingView.editTextPassword.getValue()
            //         is singupBindingView.editTextPassword.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edittext5);
            // localize variables for thread safety
            // singupBindingView != null
            boolean singupBindingViewJavaLangObjectNull = false;
            // singupBindingView.editTextPassword != null
            boolean singupBindingViewEditTextPasswordJavaLangObjectNull = false;
            // singupBindingView.editTextPassword
            androidx.lifecycle.MutableLiveData<java.lang.String> singupBindingViewEditTextPassword = null;
            // singupBindingView
            tkhub.project.kesbewa.viewmodels.login.RegistorViewModel singupBindingView = mSingupBindingView;
            // singupBindingView.editTextPassword.getValue()
            java.lang.String singupBindingViewEditTextPasswordGetValue = null;



            singupBindingViewJavaLangObjectNull = (singupBindingView) != (null);
            if (singupBindingViewJavaLangObjectNull) {


                singupBindingViewEditTextPassword = singupBindingView.getEditTextPassword();

                singupBindingViewEditTextPasswordJavaLangObjectNull = (singupBindingViewEditTextPassword) != (null);
                if (singupBindingViewEditTextPasswordJavaLangObjectNull) {




                    singupBindingViewEditTextPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edittext7androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of singupBindingView.editTextConPassword.getValue()
            //         is singupBindingView.editTextConPassword.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edittext7);
            // localize variables for thread safety
            // singupBindingView != null
            boolean singupBindingViewJavaLangObjectNull = false;
            // singupBindingView.editTextConPassword != null
            boolean singupBindingViewEditTextConPasswordJavaLangObjectNull = false;
            // singupBindingView.editTextConPassword
            androidx.lifecycle.MutableLiveData<java.lang.String> singupBindingViewEditTextConPassword = null;
            // singupBindingView.editTextConPassword.getValue()
            java.lang.String singupBindingViewEditTextConPasswordGetValue = null;
            // singupBindingView
            tkhub.project.kesbewa.viewmodels.login.RegistorViewModel singupBindingView = mSingupBindingView;



            singupBindingViewJavaLangObjectNull = (singupBindingView) != (null);
            if (singupBindingViewJavaLangObjectNull) {


                singupBindingViewEditTextConPassword = singupBindingView.getEditTextConPassword();

                singupBindingViewEditTextConPasswordJavaLangObjectNull = (singupBindingViewEditTextConPassword) != (null);
                if (singupBindingViewEditTextConPasswordJavaLangObjectNull) {




                    singupBindingViewEditTextConPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentSingupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }
    private FragmentSingupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[3]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[4]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[5]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[6]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.RelativeLayout) bindings[26]
            , (android.widget.RelativeLayout) bindings[22]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[15]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[18]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[19]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[21]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[25]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[30]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[32]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[31]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[17]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[24]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[29]
            , (android.view.View) bindings[28]
            );
        this.constraintLayoutLoadingGuestusersave.setTag(null);
        this.edittext1.setTag(null);
        this.edittext2.setTag(null);
        this.edittext3.setTag(null);
        this.edittext5.setTag(null);
        this.edittext7.setTag(null);
        this.imageviewNavigation.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewLogin.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new tkhub.project.kesbewa.generated.callback.OnClickListener(this, 1);
        mCallback10 = new tkhub.project.kesbewa.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        if (BR.singupBindingView == variableId) {
            setSingupBindingView((tkhub.project.kesbewa.viewmodels.login.RegistorViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSingupBindingView(@Nullable tkhub.project.kesbewa.viewmodels.login.RegistorViewModel SingupBindingView) {
        this.mSingupBindingView = SingupBindingView;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.singupBindingView);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSingupBindingViewEditTextPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeSingupBindingViewIsRegstorVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeSingupBindingViewEditTextNumber((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeSingupBindingViewEditTextUserName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeSingupBindingViewEditTextConPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeSingupBindingViewEditTextEmail((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSingupBindingViewEditTextPassword(androidx.lifecycle.MutableLiveData<java.lang.String> SingupBindingViewEditTextPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSingupBindingViewIsRegstorVisible(androidx.databinding.ObservableField<java.lang.Boolean> SingupBindingViewIsRegstorVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSingupBindingViewEditTextNumber(androidx.lifecycle.MutableLiveData<java.lang.String> SingupBindingViewEditTextNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSingupBindingViewEditTextUserName(androidx.lifecycle.MutableLiveData<java.lang.String> SingupBindingViewEditTextUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSingupBindingViewEditTextConPassword(androidx.lifecycle.MutableLiveData<java.lang.String> SingupBindingViewEditTextConPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSingupBindingViewEditTextEmail(androidx.lifecycle.MutableLiveData<java.lang.String> SingupBindingViewEditTextEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        androidx.lifecycle.MutableLiveData<java.lang.String> singupBindingViewEditTextPassword = null;
        java.lang.String singupBindingViewEditTextPasswordGetValue = null;
        java.lang.String singupBindingViewEditTextNumberGetValue = null;
        java.lang.String singupBindingViewEditTextConPasswordGetValue = null;
        tkhub.project.kesbewa.viewmodels.login.RegistorViewModel singupBindingView = mSingupBindingView;
        java.lang.String singupBindingViewEditTextEmailGetValue = null;
        androidx.databinding.ObservableField<java.lang.Boolean> singupBindingViewIsRegstorVisible = null;
        java.lang.String singupBindingViewEditTextUserNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> singupBindingViewEditTextNumber = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> singupBindingViewEditTextUserName = null;
        java.lang.Boolean singupBindingViewIsRegstorVisibleGet = null;
        int singupBindingViewIsRegstorVisibleViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxSingupBindingViewIsRegstorVisibleGet = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> singupBindingViewEditTextConPassword = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> singupBindingViewEditTextEmail = null;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (singupBindingView != null) {
                        // read singupBindingView.editTextPassword
                        singupBindingViewEditTextPassword = singupBindingView.getEditTextPassword();
                    }
                    updateLiveDataRegistration(0, singupBindingViewEditTextPassword);


                    if (singupBindingViewEditTextPassword != null) {
                        // read singupBindingView.editTextPassword.getValue()
                        singupBindingViewEditTextPasswordGetValue = singupBindingViewEditTextPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (singupBindingView != null) {
                        // read singupBindingView.isRegstorVisible
                        singupBindingViewIsRegstorVisible = singupBindingView.isRegstorVisible();
                    }
                    updateRegistration(1, singupBindingViewIsRegstorVisible);


                    if (singupBindingViewIsRegstorVisible != null) {
                        // read singupBindingView.isRegstorVisible.get()
                        singupBindingViewIsRegstorVisibleGet = singupBindingViewIsRegstorVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(singupBindingView.isRegstorVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxSingupBindingViewIsRegstorVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(singupBindingViewIsRegstorVisibleGet);
                if((dirtyFlags & 0xc2L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxSingupBindingViewIsRegstorVisibleGet) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(singupBindingView.isRegstorVisible.get()) ? View.VISIBLE : View.GONE
                    singupBindingViewIsRegstorVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSingupBindingViewIsRegstorVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (singupBindingView != null) {
                        // read singupBindingView.editTextNumber
                        singupBindingViewEditTextNumber = singupBindingView.getEditTextNumber();
                    }
                    updateLiveDataRegistration(2, singupBindingViewEditTextNumber);


                    if (singupBindingViewEditTextNumber != null) {
                        // read singupBindingView.editTextNumber.getValue()
                        singupBindingViewEditTextNumberGetValue = singupBindingViewEditTextNumber.getValue();
                    }
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (singupBindingView != null) {
                        // read singupBindingView.editTextUserName
                        singupBindingViewEditTextUserName = singupBindingView.getEditTextUserName();
                    }
                    updateLiveDataRegistration(3, singupBindingViewEditTextUserName);


                    if (singupBindingViewEditTextUserName != null) {
                        // read singupBindingView.editTextUserName.getValue()
                        singupBindingViewEditTextUserNameGetValue = singupBindingViewEditTextUserName.getValue();
                    }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (singupBindingView != null) {
                        // read singupBindingView.editTextConPassword
                        singupBindingViewEditTextConPassword = singupBindingView.getEditTextConPassword();
                    }
                    updateLiveDataRegistration(4, singupBindingViewEditTextConPassword);


                    if (singupBindingViewEditTextConPassword != null) {
                        // read singupBindingView.editTextConPassword.getValue()
                        singupBindingViewEditTextConPasswordGetValue = singupBindingViewEditTextConPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (singupBindingView != null) {
                        // read singupBindingView.editTextEmail
                        singupBindingViewEditTextEmail = singupBindingView.getEditTextEmail();
                    }
                    updateLiveDataRegistration(5, singupBindingViewEditTextEmail);


                    if (singupBindingViewEditTextEmail != null) {
                        // read singupBindingView.editTextEmail.getValue()
                        singupBindingViewEditTextEmailGetValue = singupBindingViewEditTextEmail.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            this.constraintLayoutLoadingGuestusersave.setVisibility(singupBindingViewIsRegstorVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittext1, singupBindingViewEditTextUserNameGetValue);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edittext1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edittext1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edittext2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edittext2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edittext3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edittext3androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edittext5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edittext5androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edittext7, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edittext7androidTextAttrChanged);
            this.imageviewNavigation.setOnClickListener(mCallback9);
            this.textViewLogin.setOnClickListener(mCallback10);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittext2, singupBindingViewEditTextNumberGetValue);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittext3, singupBindingViewEditTextEmailGetValue);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittext5, singupBindingViewEditTextPasswordGetValue);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittext7, singupBindingViewEditTextConPasswordGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // singupBindingView != null
                boolean singupBindingViewJavaLangObjectNull = false;
                // singupBindingView
                tkhub.project.kesbewa.viewmodels.login.RegistorViewModel singupBindingView = mSingupBindingView;



                singupBindingViewJavaLangObjectNull = (singupBindingView) != (null);
                if (singupBindingViewJavaLangObjectNull) {



                    singupBindingView.backFromRegistorToLogin(callbackArg_0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // singupBindingView != null
                boolean singupBindingViewJavaLangObjectNull = false;
                // singupBindingView
                tkhub.project.kesbewa.viewmodels.login.RegistorViewModel singupBindingView = mSingupBindingView;



                singupBindingViewJavaLangObjectNull = (singupBindingView) != (null);
                if (singupBindingViewJavaLangObjectNull) {



                    singupBindingView.registorToLogin(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): singupBindingView.editTextPassword
        flag 1 (0x2L): singupBindingView.isRegstorVisible
        flag 2 (0x3L): singupBindingView.editTextNumber
        flag 3 (0x4L): singupBindingView.editTextUserName
        flag 4 (0x5L): singupBindingView.editTextConPassword
        flag 5 (0x6L): singupBindingView.editTextEmail
        flag 6 (0x7L): singupBindingView
        flag 7 (0x8L): null
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(singupBindingView.isRegstorVisible.get()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(singupBindingView.isRegstorVisible.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}