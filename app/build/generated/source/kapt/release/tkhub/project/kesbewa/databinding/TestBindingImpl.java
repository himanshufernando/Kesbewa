package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TestBindingImpl extends TestBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout2, 15);
        sViewsWithIds.put(R.id.imageview_navigation, 16);
        sViewsWithIds.put(R.id.textView, 17);
        sViewsWithIds.put(R.id.constraintLayout_add_adress, 18);
        sViewsWithIds.put(R.id.appCompatImageView2, 19);
        sViewsWithIds.put(R.id.textview_no_addres, 20);
        sViewsWithIds.put(R.id.constraintLayout_map, 21);
        sViewsWithIds.put(R.id.progressbar, 22);
        sViewsWithIds.put(R.id.constraintLayout5, 23);
        sViewsWithIds.put(R.id.textview_15, 24);
        sViewsWithIds.put(R.id.view_15, 25);
        sViewsWithIds.put(R.id.textview_9, 26);
        sViewsWithIds.put(R.id.view_5, 27);
        sViewsWithIds.put(R.id.textview_10, 28);
        sViewsWithIds.put(R.id.view_6, 29);
        sViewsWithIds.put(R.id.textview_11, 30);
        sViewsWithIds.put(R.id.view_8, 31);
        sViewsWithIds.put(R.id.textview_13, 32);
        sViewsWithIds.put(R.id.view_10, 33);
        sViewsWithIds.put(R.id.view_111, 34);
        sViewsWithIds.put(R.id.txt_searchaddress, 35);
        sViewsWithIds.put(R.id.edit_searchaddress, 36);
        sViewsWithIds.put(R.id.relativelayout_serach, 37);
        sViewsWithIds.put(R.id.imageView_search_icon, 38);
        sViewsWithIds.put(R.id.recyclerView_search_addresslist, 39);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    private OnItemClickListenerImpl mAddressviewmodelOnCityItemSelectedAndroidWidgetAdapterViewOnItemClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edittext10androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of addressviewmodel.editTextStreetAddressTwo.get()
            //         is addressviewmodel.editTextStreetAddressTwo.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edittext10);
            // localize variables for thread safety
            // addressviewmodel.editTextStreetAddressTwo
            androidx.databinding.ObservableField<java.lang.String> addressviewmodelEditTextStreetAddressTwo = null;
            // addressviewmodel.editTextStreetAddressTwo != null
            boolean addressviewmodelEditTextStreetAddressTwoJavaLangObjectNull = false;
            // addressviewmodel != null
            boolean addressviewmodelJavaLangObjectNull = false;
            // addressviewmodel
            tkhub.project.kesbewa.viewmodels.address.AddressViewModel addressviewmodel = mAddressviewmodel;
            // addressviewmodel.editTextStreetAddressTwo.get()
            java.lang.String addressviewmodelEditTextStreetAddressTwoGet = null;



            addressviewmodelJavaLangObjectNull = (addressviewmodel) != (null);
            if (addressviewmodelJavaLangObjectNull) {


                addressviewmodelEditTextStreetAddressTwo = addressviewmodel.getEditTextStreetAddressTwo();

                addressviewmodelEditTextStreetAddressTwoJavaLangObjectNull = (addressviewmodelEditTextStreetAddressTwo) != (null);
                if (addressviewmodelEditTextStreetAddressTwoJavaLangObjectNull) {




                    addressviewmodelEditTextStreetAddressTwo.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edittext13androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of addressviewmodel.editTextZipCode.get()
            //         is addressviewmodel.editTextZipCode.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edittext13);
            // localize variables for thread safety
            // addressviewmodel.editTextZipCode.get()
            java.lang.String addressviewmodelEditTextZipCodeGet = null;
            // addressviewmodel != null
            boolean addressviewmodelJavaLangObjectNull = false;
            // addressviewmodel
            tkhub.project.kesbewa.viewmodels.address.AddressViewModel addressviewmodel = mAddressviewmodel;
            // addressviewmodel.editTextZipCode
            androidx.databinding.ObservableField<java.lang.String> addressviewmodelEditTextZipCode = null;
            // addressviewmodel.editTextZipCode != null
            boolean addressviewmodelEditTextZipCodeJavaLangObjectNull = false;



            addressviewmodelJavaLangObjectNull = (addressviewmodel) != (null);
            if (addressviewmodelJavaLangObjectNull) {


                addressviewmodelEditTextZipCode = addressviewmodel.getEditTextZipCode();

                addressviewmodelEditTextZipCodeJavaLangObjectNull = (addressviewmodelEditTextZipCode) != (null);
                if (addressviewmodelEditTextZipCodeJavaLangObjectNull) {




                    addressviewmodelEditTextZipCode.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edittext15androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of addressviewmodel.editTextNumber.get()
            //         is addressviewmodel.editTextNumber.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edittext15);
            // localize variables for thread safety
            // addressviewmodel.editTextNumber
            androidx.databinding.ObservableField<java.lang.String> addressviewmodelEditTextNumber = null;
            // addressviewmodel.editTextNumber != null
            boolean addressviewmodelEditTextNumberJavaLangObjectNull = false;
            // addressviewmodel.editTextNumber.get()
            java.lang.String addressviewmodelEditTextNumberGet = null;
            // addressviewmodel != null
            boolean addressviewmodelJavaLangObjectNull = false;
            // addressviewmodel
            tkhub.project.kesbewa.viewmodels.address.AddressViewModel addressviewmodel = mAddressviewmodel;



            addressviewmodelJavaLangObjectNull = (addressviewmodel) != (null);
            if (addressviewmodelJavaLangObjectNull) {


                addressviewmodelEditTextNumber = addressviewmodel.getEditTextNumber();

                addressviewmodelEditTextNumberJavaLangObjectNull = (addressviewmodelEditTextNumber) != (null);
                if (addressviewmodelEditTextNumberJavaLangObjectNull) {




                    addressviewmodelEditTextNumber.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edittext9androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of addressviewmodel.editTextStreetAddress.get()
            //         is addressviewmodel.editTextStreetAddress.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edittext9);
            // localize variables for thread safety
            // addressviewmodel.editTextStreetAddress
            androidx.databinding.ObservableField<java.lang.String> addressviewmodelEditTextStreetAddress = null;
            // addressviewmodel != null
            boolean addressviewmodelJavaLangObjectNull = false;
            // addressviewmodel
            tkhub.project.kesbewa.viewmodels.address.AddressViewModel addressviewmodel = mAddressviewmodel;
            // addressviewmodel.editTextStreetAddress != null
            boolean addressviewmodelEditTextStreetAddressJavaLangObjectNull = false;
            // addressviewmodel.editTextStreetAddress.get()
            java.lang.String addressviewmodelEditTextStreetAddressGet = null;



            addressviewmodelJavaLangObjectNull = (addressviewmodel) != (null);
            if (addressviewmodelJavaLangObjectNull) {


                addressviewmodelEditTextStreetAddress = addressviewmodel.getEditTextStreetAddress();

                addressviewmodelEditTextStreetAddressJavaLangObjectNull = (addressviewmodelEditTextStreetAddress) != (null);
                if (addressviewmodelEditTextStreetAddressJavaLangObjectNull) {




                    addressviewmodelEditTextStreetAddress.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public TestBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 40, sIncludes, sViewsWithIds));
    }
    private TestBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 11
            , (com.tuyenmonkey.mkloader.MKLoader) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[19]
            , (androidx.appcompat.widget.AppCompatAutoCompleteTextView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[23]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[36]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[7]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[9]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[5]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[38]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[16]
            , (com.tuyenmonkey.mkloader.MKLoader) bindings[22]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[39]
            , (android.widget.RelativeLayout) bindings[37]
            , (android.widget.ScrollView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[17]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[28]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[30]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[32]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[24]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[26]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[20]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[35]
            , (android.view.View) bindings[33]
            , (android.view.View) bindings[34]
            , (android.view.View) bindings[25]
            , (android.view.View) bindings[27]
            , (android.view.View) bindings[29]
            , (android.view.View) bindings[31]
            );
        this.MKLoader.setTag(null);
        this.autocompletetextviewCity.setTag(null);
        this.clMap.setTag(null);
        this.constraintLayoutLoadingGuestusersave.setTag(null);
        this.constraintLayoutNoaddress.setTag(null);
        this.constraintlayout1.setTag(null);
        this.constraintlayout12.setTag(null);
        this.edittext10.setTag(null);
        this.edittext13.setTag(null);
        this.edittext15.setTag(null);
        this.edittext9.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerViewAddress.setTag(null);
        this.scrollview.setTag(null);
        this.textViewBtn.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1000L;
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
        if (BR.addressviewmodel == variableId) {
            setAddressviewmodel((tkhub.project.kesbewa.viewmodels.address.AddressViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAddressviewmodel(@Nullable tkhub.project.kesbewa.viewmodels.address.AddressViewModel Addressviewmodel) {
        this.mAddressviewmodel = Addressviewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.addressviewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAddressviewmodelIsBtnVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeAddressviewmodelIsAddressSaveVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeAddressviewmodelIsAddressAddLayoutVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeAddressviewmodelEditTextNumber((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeAddressviewmodelIsAddressListVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeAddressviewmodelAddressSearchListVisibility((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeAddressviewmodelEditTextZipCode((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeAddressviewmodelEditTextStreetAddress((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeAddressviewmodelAddressFetchingProgress((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeAddressviewmodelIsNoAddressLayoutVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeAddressviewmodelEditTextStreetAddressTwo((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAddressviewmodelIsBtnVisible(androidx.databinding.ObservableField<java.lang.Boolean> AddressviewmodelIsBtnVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddressviewmodelIsAddressSaveVisible(androidx.databinding.ObservableField<java.lang.Boolean> AddressviewmodelIsAddressSaveVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddressviewmodelIsAddressAddLayoutVisible(androidx.databinding.ObservableField<java.lang.Boolean> AddressviewmodelIsAddressAddLayoutVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddressviewmodelEditTextNumber(androidx.databinding.ObservableField<java.lang.String> AddressviewmodelEditTextNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddressviewmodelIsAddressListVisible(androidx.databinding.ObservableField<java.lang.Boolean> AddressviewmodelIsAddressListVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddressviewmodelAddressSearchListVisibility(androidx.databinding.ObservableField<java.lang.Boolean> AddressviewmodelAddressSearchListVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddressviewmodelEditTextZipCode(androidx.databinding.ObservableField<java.lang.String> AddressviewmodelEditTextZipCode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddressviewmodelEditTextStreetAddress(androidx.databinding.ObservableField<java.lang.String> AddressviewmodelEditTextStreetAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddressviewmodelAddressFetchingProgress(androidx.databinding.ObservableField<java.lang.Boolean> AddressviewmodelAddressFetchingProgress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddressviewmodelIsNoAddressLayoutVisible(androidx.databinding.ObservableField<java.lang.Boolean> AddressviewmodelIsNoAddressLayoutVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddressviewmodelEditTextStreetAddressTwo(androidx.databinding.ObservableField<java.lang.String> AddressviewmodelEditTextStreetAddressTwo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsBtnVisibleGet = false;
        java.lang.Boolean addressviewmodelIsAddressListVisibleGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelAddressSearchListVisibilityGet = false;
        java.lang.String addressviewmodelEditTextNumberGet = null;
        java.lang.String addressviewmodelEditTextStreetAddressGet = null;
        java.lang.Boolean addressviewmodelIsAddressAddLayoutVisibleGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> addressviewmodelIsBtnVisible = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsAddressSaveVisibleGet = false;
        java.lang.Boolean addressviewmodelAddressSearchListVisibilityGet = null;
        java.lang.Boolean addressviewmodelIsBtnVisibleGet = null;
        int addressviewmodelIsBtnVisibleViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> addressviewmodelIsAddressSaveVisible = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelAddressFetchingProgressGet = false;
        tkhub.project.kesbewa.viewmodels.address.AddressViewModel addressviewmodel = mAddressviewmodel;
        androidx.databinding.ObservableField<java.lang.Boolean> addressviewmodelIsAddressAddLayoutVisible = null;
        androidx.databinding.ObservableField<java.lang.String> addressviewmodelEditTextNumber = null;
        int addressviewmodelIsAddressListVisibleViewVISIBLEViewGONE = 0;
        int addressviewmodelIsNoAddressLayoutVisibleViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> addressviewmodelIsAddressListVisible = null;
        android.widget.AdapterView.OnItemClickListener addressviewmodelOnCityItemSelectedAndroidWidgetAdapterViewOnItemClickListener = null;
        java.lang.Boolean addressviewmodelAddressFetchingProgressGet = null;
        int addressviewmodelAddressFetchingProgressViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> addressviewmodelAddressSearchListVisibility = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsAddressAddLayoutVisibleGet = false;
        androidx.databinding.ObservableField<java.lang.String> addressviewmodelEditTextZipCode = null;
        androidx.databinding.ObservableField<java.lang.String> addressviewmodelEditTextStreetAddress = null;
        androidx.databinding.ObservableField<java.lang.Boolean> addressviewmodelAddressFetchingProgress = null;
        java.lang.String addressviewmodelEditTextZipCodeGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsAddressListVisibleGet = false;
        java.lang.Boolean addressviewmodelIsAddressSaveVisibleGet = null;
        int addressviewmodelIsAddressAddLayoutVisibleViewVISIBLEViewGONE = 0;
        int addressviewmodelIsAddressSaveVisibleViewVISIBLEViewGONE = 0;
        java.lang.String addressviewmodelEditTextStreetAddressTwoGet = null;
        java.lang.Boolean addressviewmodelIsNoAddressLayoutVisibleGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> addressviewmodelIsNoAddressLayoutVisible = null;
        androidx.databinding.ObservableField<java.lang.String> addressviewmodelEditTextStreetAddressTwo = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsNoAddressLayoutVisibleGet = false;
        int addressviewmodelAddressSearchListVisibilityViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x1fffL) != 0) {


            if ((dirtyFlags & 0x1801L) != 0) {

                    if (addressviewmodel != null) {
                        // read addressviewmodel.isBtnVisible
                        addressviewmodelIsBtnVisible = addressviewmodel.isBtnVisible();
                    }
                    updateRegistration(0, addressviewmodelIsBtnVisible);


                    if (addressviewmodelIsBtnVisible != null) {
                        // read addressviewmodel.isBtnVisible.get()
                        addressviewmodelIsBtnVisibleGet = addressviewmodelIsBtnVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isBtnVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsBtnVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodelIsBtnVisibleGet);
                if((dirtyFlags & 0x1801L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsBtnVisibleGet) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isBtnVisible.get()) ? View.VISIBLE : View.GONE
                    addressviewmodelIsBtnVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsBtnVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1802L) != 0) {

                    if (addressviewmodel != null) {
                        // read addressviewmodel.isAddressSaveVisible
                        addressviewmodelIsAddressSaveVisible = addressviewmodel.isAddressSaveVisible();
                    }
                    updateRegistration(1, addressviewmodelIsAddressSaveVisible);


                    if (addressviewmodelIsAddressSaveVisible != null) {
                        // read addressviewmodel.isAddressSaveVisible.get()
                        addressviewmodelIsAddressSaveVisibleGet = addressviewmodelIsAddressSaveVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isAddressSaveVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsAddressSaveVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodelIsAddressSaveVisibleGet);
                if((dirtyFlags & 0x1802L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsAddressSaveVisibleGet) {
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isAddressSaveVisible.get()) ? View.VISIBLE : View.GONE
                    addressviewmodelIsAddressSaveVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsAddressSaveVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1804L) != 0) {

                    if (addressviewmodel != null) {
                        // read addressviewmodel.isAddressAddLayoutVisible
                        addressviewmodelIsAddressAddLayoutVisible = addressviewmodel.isAddressAddLayoutVisible();
                    }
                    updateRegistration(2, addressviewmodelIsAddressAddLayoutVisible);


                    if (addressviewmodelIsAddressAddLayoutVisible != null) {
                        // read addressviewmodel.isAddressAddLayoutVisible.get()
                        addressviewmodelIsAddressAddLayoutVisibleGet = addressviewmodelIsAddressAddLayoutVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isAddressAddLayoutVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsAddressAddLayoutVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodelIsAddressAddLayoutVisibleGet);
                if((dirtyFlags & 0x1804L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsAddressAddLayoutVisibleGet) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isAddressAddLayoutVisible.get()) ? View.VISIBLE : View.GONE
                    addressviewmodelIsAddressAddLayoutVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsAddressAddLayoutVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1808L) != 0) {

                    if (addressviewmodel != null) {
                        // read addressviewmodel.editTextNumber
                        addressviewmodelEditTextNumber = addressviewmodel.getEditTextNumber();
                    }
                    updateRegistration(3, addressviewmodelEditTextNumber);


                    if (addressviewmodelEditTextNumber != null) {
                        // read addressviewmodel.editTextNumber.get()
                        addressviewmodelEditTextNumberGet = addressviewmodelEditTextNumber.get();
                    }
            }
            if ((dirtyFlags & 0x1810L) != 0) {

                    if (addressviewmodel != null) {
                        // read addressviewmodel.isAddressListVisible
                        addressviewmodelIsAddressListVisible = addressviewmodel.isAddressListVisible();
                    }
                    updateRegistration(4, addressviewmodelIsAddressListVisible);


                    if (addressviewmodelIsAddressListVisible != null) {
                        // read addressviewmodel.isAddressListVisible.get()
                        addressviewmodelIsAddressListVisibleGet = addressviewmodelIsAddressListVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isAddressListVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsAddressListVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodelIsAddressListVisibleGet);
                if((dirtyFlags & 0x1810L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsAddressListVisibleGet) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isAddressListVisible.get()) ? View.VISIBLE : View.GONE
                    addressviewmodelIsAddressListVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsAddressListVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1800L) != 0) {

                    if (addressviewmodel != null) {
                        // read addressviewmodel::onCityItemSelected
                        addressviewmodelOnCityItemSelectedAndroidWidgetAdapterViewOnItemClickListener = (((mAddressviewmodelOnCityItemSelectedAndroidWidgetAdapterViewOnItemClickListener == null) ? (mAddressviewmodelOnCityItemSelectedAndroidWidgetAdapterViewOnItemClickListener = new OnItemClickListenerImpl()) : mAddressviewmodelOnCityItemSelectedAndroidWidgetAdapterViewOnItemClickListener).setValue(addressviewmodel));
                    }
            }
            if ((dirtyFlags & 0x1820L) != 0) {

                    if (addressviewmodel != null) {
                        // read addressviewmodel.addressSearchListVisibility
                        addressviewmodelAddressSearchListVisibility = addressviewmodel.getAddressSearchListVisibility();
                    }
                    updateRegistration(5, addressviewmodelAddressSearchListVisibility);


                    if (addressviewmodelAddressSearchListVisibility != null) {
                        // read addressviewmodel.addressSearchListVisibility.get()
                        addressviewmodelAddressSearchListVisibilityGet = addressviewmodelAddressSearchListVisibility.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.addressSearchListVisibility.get())
                    androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelAddressSearchListVisibilityGet = androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodelAddressSearchListVisibilityGet);
                if((dirtyFlags & 0x1820L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelAddressSearchListVisibilityGet) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.addressSearchListVisibility.get()) ? View.VISIBLE : View.GONE
                    addressviewmodelAddressSearchListVisibilityViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelAddressSearchListVisibilityGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1840L) != 0) {

                    if (addressviewmodel != null) {
                        // read addressviewmodel.editTextZipCode
                        addressviewmodelEditTextZipCode = addressviewmodel.getEditTextZipCode();
                    }
                    updateRegistration(6, addressviewmodelEditTextZipCode);


                    if (addressviewmodelEditTextZipCode != null) {
                        // read addressviewmodel.editTextZipCode.get()
                        addressviewmodelEditTextZipCodeGet = addressviewmodelEditTextZipCode.get();
                    }
            }
            if ((dirtyFlags & 0x1880L) != 0) {

                    if (addressviewmodel != null) {
                        // read addressviewmodel.editTextStreetAddress
                        addressviewmodelEditTextStreetAddress = addressviewmodel.getEditTextStreetAddress();
                    }
                    updateRegistration(7, addressviewmodelEditTextStreetAddress);


                    if (addressviewmodelEditTextStreetAddress != null) {
                        // read addressviewmodel.editTextStreetAddress.get()
                        addressviewmodelEditTextStreetAddressGet = addressviewmodelEditTextStreetAddress.get();
                    }
            }
            if ((dirtyFlags & 0x1900L) != 0) {

                    if (addressviewmodel != null) {
                        // read addressviewmodel.addressFetchingProgress
                        addressviewmodelAddressFetchingProgress = addressviewmodel.getAddressFetchingProgress();
                    }
                    updateRegistration(8, addressviewmodelAddressFetchingProgress);


                    if (addressviewmodelAddressFetchingProgress != null) {
                        // read addressviewmodel.addressFetchingProgress.get()
                        addressviewmodelAddressFetchingProgressGet = addressviewmodelAddressFetchingProgress.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.addressFetchingProgress.get())
                    androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelAddressFetchingProgressGet = androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodelAddressFetchingProgressGet);
                if((dirtyFlags & 0x1900L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelAddressFetchingProgressGet) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.addressFetchingProgress.get()) ? View.VISIBLE : View.GONE
                    addressviewmodelAddressFetchingProgressViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelAddressFetchingProgressGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1a00L) != 0) {

                    if (addressviewmodel != null) {
                        // read addressviewmodel.isNoAddressLayoutVisible
                        addressviewmodelIsNoAddressLayoutVisible = addressviewmodel.isNoAddressLayoutVisible();
                    }
                    updateRegistration(9, addressviewmodelIsNoAddressLayoutVisible);


                    if (addressviewmodelIsNoAddressLayoutVisible != null) {
                        // read addressviewmodel.isNoAddressLayoutVisible.get()
                        addressviewmodelIsNoAddressLayoutVisibleGet = addressviewmodelIsNoAddressLayoutVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isNoAddressLayoutVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsNoAddressLayoutVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodelIsNoAddressLayoutVisibleGet);
                if((dirtyFlags & 0x1a00L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsNoAddressLayoutVisibleGet) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isNoAddressLayoutVisible.get()) ? View.VISIBLE : View.GONE
                    addressviewmodelIsNoAddressLayoutVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxAddressviewmodelIsNoAddressLayoutVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1c00L) != 0) {

                    if (addressviewmodel != null) {
                        // read addressviewmodel.editTextStreetAddressTwo
                        addressviewmodelEditTextStreetAddressTwo = addressviewmodel.getEditTextStreetAddressTwo();
                    }
                    updateRegistration(10, addressviewmodelEditTextStreetAddressTwo);


                    if (addressviewmodelEditTextStreetAddressTwo != null) {
                        // read addressviewmodel.editTextStreetAddressTwo.get()
                        addressviewmodelEditTextStreetAddressTwoGet = addressviewmodelEditTextStreetAddressTwo.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1900L) != 0) {
            // api target 1

            this.MKLoader.setVisibility(addressviewmodelAddressFetchingProgressViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1800L) != 0) {
            // api target 1

            this.autocompletetextviewCity.setOnItemClickListener(addressviewmodelOnCityItemSelectedAndroidWidgetAdapterViewOnItemClickListener);
        }
        if ((dirtyFlags & 0x1804L) != 0) {
            // api target 1

            this.clMap.setVisibility(addressviewmodelIsAddressAddLayoutVisibleViewVISIBLEViewGONE);
            this.constraintlayout1.setVisibility(addressviewmodelIsAddressAddLayoutVisibleViewVISIBLEViewGONE);
            this.scrollview.setVisibility(addressviewmodelIsAddressAddLayoutVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1802L) != 0) {
            // api target 1

            this.constraintLayoutLoadingGuestusersave.setVisibility(addressviewmodelIsAddressSaveVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1a00L) != 0) {
            // api target 1

            this.constraintLayoutNoaddress.setVisibility(addressviewmodelIsNoAddressLayoutVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1820L) != 0) {
            // api target 1

            this.constraintlayout12.setVisibility(addressviewmodelAddressSearchListVisibilityViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1c00L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittext10, addressviewmodelEditTextStreetAddressTwoGet);
        }
        if ((dirtyFlags & 0x1000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edittext10, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edittext10androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edittext13, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edittext13androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edittext15, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edittext15androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edittext9, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edittext9androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x1840L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittext13, addressviewmodelEditTextZipCodeGet);
        }
        if ((dirtyFlags & 0x1808L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittext15, addressviewmodelEditTextNumberGet);
        }
        if ((dirtyFlags & 0x1880L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edittext9, addressviewmodelEditTextStreetAddressGet);
        }
        if ((dirtyFlags & 0x1810L) != 0) {
            // api target 1

            this.recyclerViewAddress.setVisibility(addressviewmodelIsAddressListVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1801L) != 0) {
            // api target 1

            this.textViewBtn.setVisibility(addressviewmodelIsBtnVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnItemClickListenerImpl implements android.widget.AdapterView.OnItemClickListener{
        private tkhub.project.kesbewa.viewmodels.address.AddressViewModel value;
        public OnItemClickListenerImpl setValue(tkhub.project.kesbewa.viewmodels.address.AddressViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onItemClick(android.widget.AdapterView arg0, android.view.View arg1, int arg2, long arg3) {
            this.value.onCityItemSelected(arg0, arg1, arg2, arg3); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): addressviewmodel.isBtnVisible
        flag 1 (0x2L): addressviewmodel.isAddressSaveVisible
        flag 2 (0x3L): addressviewmodel.isAddressAddLayoutVisible
        flag 3 (0x4L): addressviewmodel.editTextNumber
        flag 4 (0x5L): addressviewmodel.isAddressListVisible
        flag 5 (0x6L): addressviewmodel.addressSearchListVisibility
        flag 6 (0x7L): addressviewmodel.editTextZipCode
        flag 7 (0x8L): addressviewmodel.editTextStreetAddress
        flag 8 (0x9L): addressviewmodel.addressFetchingProgress
        flag 9 (0xaL): addressviewmodel.isNoAddressLayoutVisible
        flag 10 (0xbL): addressviewmodel.editTextStreetAddressTwo
        flag 11 (0xcL): addressviewmodel
        flag 12 (0xdL): null
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isBtnVisible.get()) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isBtnVisible.get()) ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isAddressListVisible.get()) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isAddressListVisible.get()) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isNoAddressLayoutVisible.get()) ? View.VISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isNoAddressLayoutVisible.get()) ? View.VISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.addressFetchingProgress.get()) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.addressFetchingProgress.get()) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isAddressAddLayoutVisible.get()) ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isAddressAddLayoutVisible.get()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isAddressSaveVisible.get()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.isAddressSaveVisible.get()) ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.addressSearchListVisibility.get()) ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(addressviewmodel.addressSearchListVisibility.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}