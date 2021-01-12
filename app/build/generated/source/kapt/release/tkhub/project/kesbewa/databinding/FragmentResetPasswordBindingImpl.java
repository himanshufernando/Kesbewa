package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentResetPasswordBindingImpl extends FragmentResetPasswordBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageview_navigation, 4);
        sViewsWithIds.put(R.id.textView, 5);
        sViewsWithIds.put(R.id.guideline_bottom, 6);
        sViewsWithIds.put(R.id.guideline_vertical_end, 7);
        sViewsWithIds.put(R.id.imageView, 8);
        sViewsWithIds.put(R.id.txt_7, 9);
        sViewsWithIds.put(R.id.textview_6, 10);
        sViewsWithIds.put(R.id.view_3, 11);
        sViewsWithIds.put(R.id.textview_5, 12);
        sViewsWithIds.put(R.id.ll_password_show_hide, 13);
        sViewsWithIds.put(R.id.img_pass, 14);
        sViewsWithIds.put(R.id.view_2, 15);
        sViewsWithIds.put(R.id.txt_1, 16);
        sViewsWithIds.put(R.id.ll_con_password_show_hide, 17);
        sViewsWithIds.put(R.id.img_com, 18);
        sViewsWithIds.put(R.id.view_1, 19);
        sViewsWithIds.put(R.id.cl_bnt_reset, 20);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edittextPwandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ResetBindingView.editTextResetPass.getValue()
            //         is ResetBindingView.editTextResetPass.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edittextPw);
            // localize variables for thread safety
            // ResetBindingView
            tkhub.project.kesbewa.viewmodels.login.RegistorViewModel resetBindingView = mResetBindingView;
            // ResetBindingView.editTextResetPass
            androidx.lifecycle.MutableLiveData<java.lang.String> resetBindingViewEditTextResetPass = null;
            // ResetBindingView.editTextResetPass != null
            boolean resetBindingViewEditTextResetPassJavaLangObjectNull = false;
            // ResetBindingView != null
            boolean resetBindingViewJavaLangObjectNull = false;
            // ResetBindingView.editTextResetPass.getValue()
            java.lang.String resetBindingViewEditTextResetPassGetValue = null;



            resetBindingViewJavaLangObjectNull = (resetBindingView) != (null);
            if (resetBindingViewJavaLangObjectNull) {


                resetBindingViewEditTextResetPass = resetBindingView.getEditTextResetPass();

                resetBindingViewEditTextResetPassJavaLangObjectNull = (resetBindingViewEditTextResetPass) != (null);
                if (resetBindingViewEditTextResetPassJavaLangObjectNull) {




                    resetBindingViewEditTextResetPass.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edittextPwConfrimandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ResetBindingView.editTextConPassword.getValue()
            //         is ResetBindingView.editTextConPassword.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edittextPwConfrim);
            // localize variables for thread safety
            // ResetBindingView.editTextConPassword.getValue()
            java.lang.String resetBindingViewEditTextConPasswordGetValue = null;
            // ResetBindingView
            tkhub.project.kesbewa.viewmodels.login.RegistorViewModel resetBindingView = mResetBindingView;
            // ResetBindingView.editTextConPassword
            androidx.lifecycle.MutableLiveData<java.lang.String> resetBindingViewEditTextConPassword = null;
            // ResetBindingView != null
            boolean resetBindingViewJavaLangObjectNull = false;
            // ResetBindingView.editTextConPassword != null
            boolean resetBindingViewEditTextConPasswordJavaLangObjectNull = false;



            resetBindingViewJavaLangObjectNull = (resetBindingView) != (null);
            if (resetBindingViewJavaLangObjectNull) {


                resetBindingViewEditTextConPassword = resetBindingView.getEditTextConPassword();

                resetBindingViewEditTextConPasswordJavaLangObjectNull = (resetBindingViewEditTextConPassword) != (null);
                if (resetBindingViewEditTextConPasswordJavaLangObjectNull) {




                    resetBindingViewEditTextConPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edittextResetCodeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ResetBindingView.editTextCode.getValue()
            //         is ResetBindingView.editTextCode.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edittextResetCode);
            // localize variables for thread safety
            // ResetBindingView.editTextCode
            androidx.lifecycle.MutableLiveData<java.lang.String> resetBindingViewEditTextCode = null;
            // ResetBindingView.editTextCode != null
            boolean resetBindingViewEditTextCodeJavaLangObjectNull = false;
            // ResetBindingView
            tkhub.project.kesbewa.viewmodels.login.RegistorViewModel resetBindingView = mResetBindingView;
            // ResetBindingView != null
            boolean resetBindingViewJavaLangObjectNull = false;
            // ResetBindingView.editTextCode.getValue()
            java.lang.String resetBindingViewEditTextCodeGetValue = null;



            resetBindingViewJavaLangObjectNull = (resetBindingView) != (null);
            if (resetBindingViewJavaLangObjectNull) {


                resetBindingViewEditTextCode = resetBindingView.getEditTextCode();

                resetBindingViewEditTextCodeJavaLangObjectNull = (resetBindingViewEditTextCode) != (null);
                if (resetBindingViewEditTextCodeJavaLangObjectNull) {




                    resetBindingViewEditTextCode.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentResetPasswordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private FragmentResetPasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.appcompat.widget.AppCompatTextView) bindings[20]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[2]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[3]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[1]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[18]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (android.widget.RelativeLayout) bindings[17]
            , (android.widget.RelativeLayout) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[11]
            );
        this.edittextPw.setTag(null);
        this.edittextPwConfrim.setTag(null);
        this.edittextResetCode.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.ResetBindingView == variableId) {
            setResetBindingView((tkhub.project.kesbewa.viewmodels.login.RegistorViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setResetBindingView(@Nullable tkhub.project.kesbewa.viewmodels.login.RegistorViewModel ResetBindingView) {
        this.mResetBindingView = ResetBindingView;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.ResetBindingView);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeResetBindingViewEditTextConPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeResetBindingViewEditTextResetPass((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeResetBindingViewEditTextCode((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeResetBindingViewEditTextConPassword(androidx.lifecycle.MutableLiveData<java.lang.String> ResetBindingViewEditTextConPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeResetBindingViewEditTextResetPass(androidx.lifecycle.MutableLiveData<java.lang.String> ResetBindingViewEditTextResetPass, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeResetBindingViewEditTextCode(androidx.lifecycle.MutableLiveData<java.lang.String> ResetBindingViewEditTextCode, int fieldId) {
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
        java.lang.String resetBindingViewEditTextConPasswordGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> resetBindingViewEditTextConPassword = null;
        tkhub.project.kesbewa.viewmodels.login.RegistorViewModel resetBindingView = mResetBindingView;
        androidx.lifecycle.MutableLiveData<java.lang.String> resetBindingViewEditTextResetPass = null;
        java.lang.String resetBindingViewEditTextCodeGetValue = null;
        java.lang.String resetBindingViewEditTextResetPassGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> resetBindingViewEditTextCode = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (resetBindingView != null) {
                        // read ResetBindingView.editTextConPassword
                        resetBindingViewEditTextConPassword = resetBindingView.getEditTextConPassword();
                    }
                    updateLiveDataRegistration(0, resetBindingViewEditTextConPassword);


                    if (resetBindingViewEditTextConPassword != null) {
                        // read ResetBindingView.editTextConPassword.getValue()
                        resetBindingViewEditTextConPasswordGetValue = resetBindingViewEditTextConPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (resetBindingView != null) {
                        // read ResetBindingView.editTextResetPass
                        resetBindingViewEditTextResetPass = resetBindingView.getEditTextResetPass();
                    }
                    updateLiveDataRegistration(1, resetBindingViewEditTextResetPass);


                    if (resetBindingViewEditTextResetPass != null) {
                        // read ResetBindingView.editTextResetPass.getValue()
                        resetBindingViewEditTextResetPassGetValue = resetBindingViewEditTextResetPass.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (resetBindingView != null) {
                        // read ResetBindingView.editTextCode
                        resetBindingViewEditTextCode = resetBindingView.getEditTextCode();
                    }
                    updateLiveDataRegistration(2, resetBindingViewEditTextCode);


                    if (resetBindingViewEditTextCode != null) {
                        // read ResetBindingView.editTextCode.getValue()
                        resetBindingViewEditTextCodeGetValue = resetBindingViewEditTextCode.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittextPw, resetBindingViewEditTextResetPassGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edittextPw, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edittextPwandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edittextPwConfrim, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edittextPwConfrimandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edittextResetCode, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edittextResetCodeandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittextPwConfrim, resetBindingViewEditTextConPasswordGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittextResetCode, resetBindingViewEditTextCodeGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ResetBindingView.editTextConPassword
        flag 1 (0x2L): ResetBindingView.editTextResetPass
        flag 2 (0x3L): ResetBindingView.editTextCode
        flag 3 (0x4L): ResetBindingView
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}