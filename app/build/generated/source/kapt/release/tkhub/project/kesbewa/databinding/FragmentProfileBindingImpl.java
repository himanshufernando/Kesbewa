package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfileBindingImpl extends FragmentProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageview_navigation, 6);
        sViewsWithIds.put(R.id.textView, 7);
        sViewsWithIds.put(R.id.guideline_bottom, 8);
        sViewsWithIds.put(R.id.scrollView, 9);
        sViewsWithIds.put(R.id.guideline_end, 10);
        sViewsWithIds.put(R.id.guideline_start, 11);
        sViewsWithIds.put(R.id.constraintLayout5, 12);
        sViewsWithIds.put(R.id.imageView_profilelogo, 13);
        sViewsWithIds.put(R.id.textview_guest_name, 14);
        sViewsWithIds.put(R.id.view_1, 15);
        sViewsWithIds.put(R.id.textview_2, 16);
        sViewsWithIds.put(R.id.view_2, 17);
        sViewsWithIds.put(R.id.textview_3, 18);
        sViewsWithIds.put(R.id.view_3, 19);
        sViewsWithIds.put(R.id.textview_4, 20);
        sViewsWithIds.put(R.id.view_4, 21);
        sViewsWithIds.put(R.id.textView_btn_profile_update, 22);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edittext1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profile_view_model.editTextUserName.getValue()
            //         is profile_view_model.editTextUserName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edittext1);
            // localize variables for thread safety
            // profile_view_model
            tkhub.project.kesbewa.viewmodels.profile.ProfileViewModel profileViewModel = mProfileViewModel;
            // profile_view_model.editTextUserName.getValue()
            java.lang.String profileViewModelEditTextUserNameGetValue = null;
            // profile_view_model != null
            boolean profileViewModelJavaLangObjectNull = false;
            // profile_view_model.editTextUserName != null
            boolean profileViewModelEditTextUserNameJavaLangObjectNull = false;
            // profile_view_model.editTextUserName
            androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelEditTextUserName = null;



            profileViewModelJavaLangObjectNull = (profileViewModel) != (null);
            if (profileViewModelJavaLangObjectNull) {


                profileViewModelEditTextUserName = profileViewModel.getEditTextUserName();

                profileViewModelEditTextUserNameJavaLangObjectNull = (profileViewModelEditTextUserName) != (null);
                if (profileViewModelEditTextUserNameJavaLangObjectNull) {




                    profileViewModelEditTextUserName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edittext2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profile_view_model.editTextNumber.getValue()
            //         is profile_view_model.editTextNumber.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edittext2);
            // localize variables for thread safety
            // profile_view_model
            tkhub.project.kesbewa.viewmodels.profile.ProfileViewModel profileViewModel = mProfileViewModel;
            // profile_view_model.editTextNumber
            androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelEditTextNumber = null;
            // profile_view_model.editTextNumber.getValue()
            java.lang.String profileViewModelEditTextNumberGetValue = null;
            // profile_view_model != null
            boolean profileViewModelJavaLangObjectNull = false;
            // profile_view_model.editTextNumber != null
            boolean profileViewModelEditTextNumberJavaLangObjectNull = false;



            profileViewModelJavaLangObjectNull = (profileViewModel) != (null);
            if (profileViewModelJavaLangObjectNull) {


                profileViewModelEditTextNumber = profileViewModel.getEditTextNumber();

                profileViewModelEditTextNumberJavaLangObjectNull = (profileViewModelEditTextNumber) != (null);
                if (profileViewModelEditTextNumberJavaLangObjectNull) {




                    profileViewModelEditTextNumber.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edittext3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profile_view_model.editTextEmail.getValue()
            //         is profile_view_model.editTextEmail.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edittext3);
            // localize variables for thread safety
            // profile_view_model
            tkhub.project.kesbewa.viewmodels.profile.ProfileViewModel profileViewModel = mProfileViewModel;
            // profile_view_model.editTextEmail.getValue()
            java.lang.String profileViewModelEditTextEmailGetValue = null;
            // profile_view_model != null
            boolean profileViewModelJavaLangObjectNull = false;
            // profile_view_model.editTextEmail != null
            boolean profileViewModelEditTextEmailJavaLangObjectNull = false;
            // profile_view_model.editTextEmail
            androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelEditTextEmail = null;



            profileViewModelJavaLangObjectNull = (profileViewModel) != (null);
            if (profileViewModelJavaLangObjectNull) {


                profileViewModelEditTextEmail = profileViewModel.getEditTextEmail();

                profileViewModelEditTextEmailJavaLangObjectNull = (profileViewModelEditTextEmail) != (null);
                if (profileViewModelEditTextEmailJavaLangObjectNull) {




                    profileViewModelEditTextEmail.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edittext4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profile_view_model.editTextNic.getValue()
            //         is profile_view_model.editTextNic.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edittext4);
            // localize variables for thread safety
            // profile_view_model.editTextNic.getValue()
            java.lang.String profileViewModelEditTextNicGetValue = null;
            // profile_view_model
            tkhub.project.kesbewa.viewmodels.profile.ProfileViewModel profileViewModel = mProfileViewModel;
            // profile_view_model != null
            boolean profileViewModelJavaLangObjectNull = false;
            // profile_view_model.editTextNic
            androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelEditTextNic = null;
            // profile_view_model.editTextNic != null
            boolean profileViewModelEditTextNicJavaLangObjectNull = false;



            profileViewModelJavaLangObjectNull = (profileViewModel) != (null);
            if (profileViewModelJavaLangObjectNull) {


                profileViewModelEditTextNic = profileViewModel.getEditTextNic();

                profileViewModelEditTextNicJavaLangObjectNull = (profileViewModelEditTextNic) != (null);
                if (profileViewModelEditTextNicJavaLangObjectNull) {




                    profileViewModelEditTextNic.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private FragmentProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[1]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[2]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[3]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (androidx.constraintlayout.widget.Guideline) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.core.widget.NestedScrollView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[22]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[18]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[20]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[17]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[21]
            );
        this.constraintLayoutLoadingGuestusersave.setTag(null);
        this.edittext1.setTag(null);
        this.edittext2.setTag(null);
        this.edittext3.setTag(null);
        this.edittext4.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.profile_view_model == variableId) {
            setProfileViewModel((tkhub.project.kesbewa.viewmodels.profile.ProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProfileViewModel(@Nullable tkhub.project.kesbewa.viewmodels.profile.ProfileViewModel ProfileViewModel) {
        this.mProfileViewModel = ProfileViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.profile_view_model);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProfileViewModelEditTextNumber((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeProfileViewModelEditTextUserName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeProfileViewModelEditTextEmail((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeProfileViewModelEditTextNic((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeProfileViewModelProfileProgessBar((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProfileViewModelEditTextNumber(androidx.lifecycle.MutableLiveData<java.lang.String> ProfileViewModelEditTextNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProfileViewModelEditTextUserName(androidx.lifecycle.MutableLiveData<java.lang.String> ProfileViewModelEditTextUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProfileViewModelEditTextEmail(androidx.lifecycle.MutableLiveData<java.lang.String> ProfileViewModelEditTextEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProfileViewModelEditTextNic(androidx.lifecycle.MutableLiveData<java.lang.String> ProfileViewModelEditTextNic, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProfileViewModelProfileProgessBar(androidx.databinding.ObservableField<java.lang.Boolean> ProfileViewModelProfileProgessBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        java.lang.String profileViewModelEditTextNicGetValue = null;
        tkhub.project.kesbewa.viewmodels.profile.ProfileViewModel profileViewModel = mProfileViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelEditTextNumber = null;
        java.lang.String profileViewModelEditTextEmailGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelEditTextUserName = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelEditTextEmail = null;
        int profileViewModelProfileProgessBarViewVISIBLEViewGONE = 0;
        java.lang.String profileViewModelEditTextUserNameGetValue = null;
        java.lang.String profileViewModelEditTextNumberGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelEditTextNic = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxProfileViewModelProfileProgessBarGet = false;
        java.lang.Boolean profileViewModelProfileProgessBarGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> profileViewModelProfileProgessBar = null;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (profileViewModel != null) {
                        // read profile_view_model.editTextNumber
                        profileViewModelEditTextNumber = profileViewModel.getEditTextNumber();
                    }
                    updateLiveDataRegistration(0, profileViewModelEditTextNumber);


                    if (profileViewModelEditTextNumber != null) {
                        // read profile_view_model.editTextNumber.getValue()
                        profileViewModelEditTextNumberGetValue = profileViewModelEditTextNumber.getValue();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (profileViewModel != null) {
                        // read profile_view_model.editTextUserName
                        profileViewModelEditTextUserName = profileViewModel.getEditTextUserName();
                    }
                    updateLiveDataRegistration(1, profileViewModelEditTextUserName);


                    if (profileViewModelEditTextUserName != null) {
                        // read profile_view_model.editTextUserName.getValue()
                        profileViewModelEditTextUserNameGetValue = profileViewModelEditTextUserName.getValue();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (profileViewModel != null) {
                        // read profile_view_model.editTextEmail
                        profileViewModelEditTextEmail = profileViewModel.getEditTextEmail();
                    }
                    updateLiveDataRegistration(2, profileViewModelEditTextEmail);


                    if (profileViewModelEditTextEmail != null) {
                        // read profile_view_model.editTextEmail.getValue()
                        profileViewModelEditTextEmailGetValue = profileViewModelEditTextEmail.getValue();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (profileViewModel != null) {
                        // read profile_view_model.editTextNic
                        profileViewModelEditTextNic = profileViewModel.getEditTextNic();
                    }
                    updateLiveDataRegistration(3, profileViewModelEditTextNic);


                    if (profileViewModelEditTextNic != null) {
                        // read profile_view_model.editTextNic.getValue()
                        profileViewModelEditTextNicGetValue = profileViewModelEditTextNic.getValue();
                    }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (profileViewModel != null) {
                        // read profile_view_model.profileProgessBar
                        profileViewModelProfileProgessBar = profileViewModel.getProfileProgessBar();
                    }
                    updateRegistration(4, profileViewModelProfileProgessBar);


                    if (profileViewModelProfileProgessBar != null) {
                        // read profile_view_model.profileProgessBar.get()
                        profileViewModelProfileProgessBarGet = profileViewModelProfileProgessBar.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(profile_view_model.profileProgessBar.get())
                    androidxDatabindingViewDataBindingSafeUnboxProfileViewModelProfileProgessBarGet = androidx.databinding.ViewDataBinding.safeUnbox(profileViewModelProfileProgessBarGet);
                if((dirtyFlags & 0x70L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxProfileViewModelProfileProgessBarGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(profile_view_model.profileProgessBar.get()) ? View.VISIBLE : View.GONE
                    profileViewModelProfileProgessBarViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxProfileViewModelProfileProgessBarGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            this.constraintLayoutLoadingGuestusersave.setVisibility(profileViewModelProfileProgessBarViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittext1, profileViewModelEditTextUserNameGetValue);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edittext1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edittext1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edittext2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edittext2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edittext3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edittext3androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edittext4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edittext4androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittext2, profileViewModelEditTextNumberGetValue);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittext3, profileViewModelEditTextEmailGetValue);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittext4, profileViewModelEditTextNicGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): profile_view_model.editTextNumber
        flag 1 (0x2L): profile_view_model.editTextUserName
        flag 2 (0x3L): profile_view_model.editTextEmail
        flag 3 (0x4L): profile_view_model.editTextNic
        flag 4 (0x5L): profile_view_model.profileProgessBar
        flag 5 (0x6L): profile_view_model
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(profile_view_model.profileProgessBar.get()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(profile_view_model.profileProgessBar.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}