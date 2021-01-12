package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCheckOutBindingImpl extends FragmentCheckOutBinding implements tkhub.project.kesbewa.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout11, 19);
        sViewsWithIds.put(R.id.constraintLayout2, 20);
        sViewsWithIds.put(R.id.imageview_navigation, 21);
        sViewsWithIds.put(R.id.textView, 22);
        sViewsWithIds.put(R.id.textview_titel_44, 23);
        sViewsWithIds.put(R.id.recyclerView_checkout_items, 24);
        sViewsWithIds.put(R.id.textview_titel_2, 25);
        sViewsWithIds.put(R.id.textview_titel_22, 26);
        sViewsWithIds.put(R.id.textview_titel_dipatch_type, 27);
        sViewsWithIds.put(R.id.store, 28);
        sViewsWithIds.put(R.id.delivery, 29);
        sViewsWithIds.put(R.id.textview_titel_store_location, 30);
        sViewsWithIds.put(R.id.negombo, 31);
        sViewsWithIds.put(R.id.textview_titel_666, 32);
        sViewsWithIds.put(R.id.textview_titel_4, 33);
        sViewsWithIds.put(R.id.textview_titel_66, 34);
        sViewsWithIds.put(R.id.textview_titel_41, 35);
        sViewsWithIds.put(R.id.textview_titel_45, 36);
        sViewsWithIds.put(R.id.textview_titel_usernote, 37);
        sViewsWithIds.put(R.id.imageview_note, 38);
        sViewsWithIds.put(R.id.textview_titel_20, 39);
        sViewsWithIds.put(R.id.textview_titel_12, 40);
        sViewsWithIds.put(R.id.textview_titel_15, 41);
        sViewsWithIds.put(R.id.constraintLayout3, 42);
        sViewsWithIds.put(R.id.textview1, 43);
        sViewsWithIds.put(R.id.textview6, 44);
        sViewsWithIds.put(R.id.textview12, 45);
        sViewsWithIds.put(R.id.divider, 46);
        sViewsWithIds.put(R.id.textview3, 47);
        sViewsWithIds.put(R.id.divider2, 48);
        sViewsWithIds.put(R.id.constraintLayout7, 49);
        sViewsWithIds.put(R.id.txt_btn_confirm, 50);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView2;
    @NonNull
    private final android.widget.RadioGroup mboundView3;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    // values
    // listeners
    private OnCheckedChangeListenerImpl mCheckoutOnDispatchTypeChangedAndroidWidgetRadioGroupOnCheckedChangeListener;
    private OnCheckedChangeListenerImpl1 mCheckoutOnStoreLocationChangedAndroidWidgetRadioGroupOnCheckedChangeListener;
    // Inverse Binding Event Handlers

    public FragmentCheckOutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 51, sIncludes, sViewsWithIds));
    }
    private FragmentCheckOutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 18
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[42]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[49]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.appcompat.widget.AppCompatRadioButton) bindings[29]
            , (android.view.View) bindings[46]
            , (android.view.View) bindings[48]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[21]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[38]
            , (androidx.appcompat.widget.AppCompatRadioButton) bindings[31]
            , (android.widget.RadioGroup) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[24]
            , (androidx.appcompat.widget.AppCompatRadioButton) bindings[28]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[22]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[43]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[17]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[45]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[15]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[47]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[44]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[40]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[41]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[25]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[39]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[26]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[33]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[35]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[23]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[36]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[34]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[32]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[27]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[30]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[37]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[50]
            );
        this.appCompatImageView.setTag(null);
        this.clDispatchStore.setTag(null);
        this.constraintLayoutLoadingGuestusersave.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.RadioGroup) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView6 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.radioGroup.setTag(null);
        this.textview10.setTag(null);
        this.textview100.setTag(null);
        this.textview105.setTag(null);
        this.textview13.setTag(null);
        this.textview2.setTag(null);
        this.textview5.setTag(null);
        this.textview8.setTag(null);
        this.textview9.setTag(null);
        this.textview99.setTag(null);
        this.textviewTitel3.setTag(null);
        this.textviewTitel6.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new tkhub.project.kesbewa.generated.callback.OnClickListener(this, 1);
        mCallback12 = new tkhub.project.kesbewa.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80000L;
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
        if (BR.checkout == variableId) {
            setCheckout((tkhub.project.kesbewa.viewmodels.checkout.CheckoutViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCheckout(@Nullable tkhub.project.kesbewa.viewmodels.checkout.CheckoutViewModel Checkout) {
        this.mCheckout = Checkout;
        synchronized(this) {
            mDirtyFlags |= 0x40000L;
        }
        notifyPropertyChanged(BR.checkout);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCheckoutIsOrderProcessVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeCheckoutTextSelectedPromoCode((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeCheckoutTextCheckOutItemCount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeCheckoutIsDispatchNoteVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeCheckoutTextDiscount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeCheckoutStoreOptionVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeCheckoutTextcheckoutsubtotal((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeCheckoutTextPromoTypeColor((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 8 :
                return onChangeCheckoutTextSelectedAddress((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeCheckoutTextDelivery((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeCheckoutDeliveryAddressVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeCheckoutTextPromoType((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 12 :
                return onChangeCheckoutIsDeliveryChargesTextVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 13 :
                return onChangeCheckoutTextNeedToPay((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 14 :
                return onChangeCheckoutIsPromotionTextVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 15 :
                return onChangeCheckoutIsDeliveryChargesVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 16 :
                return onChangeCheckoutTextDispatchNote((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 17 :
                return onChangeCheckoutIsPromotionVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCheckoutIsOrderProcessVisible(androidx.databinding.ObservableField<java.lang.Boolean> CheckoutIsOrderProcessVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckoutTextSelectedPromoCode(androidx.databinding.ObservableField<java.lang.String> CheckoutTextSelectedPromoCode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckoutTextCheckOutItemCount(androidx.databinding.ObservableField<java.lang.String> CheckoutTextCheckOutItemCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckoutIsDispatchNoteVisible(androidx.databinding.ObservableField<java.lang.Boolean> CheckoutIsDispatchNoteVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckoutTextDiscount(androidx.databinding.ObservableField<java.lang.String> CheckoutTextDiscount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckoutStoreOptionVisible(androidx.databinding.ObservableField<java.lang.Boolean> CheckoutStoreOptionVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckoutTextcheckoutsubtotal(androidx.databinding.ObservableField<java.lang.String> CheckoutTextcheckoutsubtotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckoutTextPromoTypeColor(androidx.databinding.ObservableField<java.lang.Integer> CheckoutTextPromoTypeColor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckoutTextSelectedAddress(androidx.databinding.ObservableField<java.lang.String> CheckoutTextSelectedAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckoutTextDelivery(androidx.databinding.ObservableField<java.lang.String> CheckoutTextDelivery, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckoutDeliveryAddressVisible(androidx.databinding.ObservableField<java.lang.Boolean> CheckoutDeliveryAddressVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckoutTextPromoType(androidx.databinding.ObservableField<java.lang.String> CheckoutTextPromoType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckoutIsDeliveryChargesTextVisible(androidx.databinding.ObservableField<java.lang.Boolean> CheckoutIsDeliveryChargesTextVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckoutTextNeedToPay(androidx.databinding.ObservableField<java.lang.String> CheckoutTextNeedToPay, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckoutIsPromotionTextVisible(androidx.databinding.ObservableField<java.lang.Boolean> CheckoutIsPromotionTextVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckoutIsDeliveryChargesVisible(androidx.databinding.ObservableField<java.lang.Boolean> CheckoutIsDeliveryChargesVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckoutTextDispatchNote(androidx.databinding.ObservableField<java.lang.String> CheckoutTextDispatchNote, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckoutIsPromotionVisible(androidx.databinding.ObservableField<java.lang.Boolean> CheckoutIsPromotionVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
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
        androidx.databinding.ObservableField<java.lang.Boolean> checkoutIsOrderProcessVisible = null;
        androidx.databinding.ObservableField<java.lang.String> checkoutTextSelectedPromoCode = null;
        int checkoutIsOrderProcessVisibleViewVISIBLEViewGONE = 0;
        java.lang.String checkoutTextDeliveryGet = null;
        java.lang.Boolean checkoutIsOrderProcessVisibleGet = null;
        java.lang.Boolean checkoutIsPromotionTextVisibleGet = null;
        java.lang.Boolean checkoutIsDeliveryChargesVisibleGet = null;
        int checkoutIsDispatchNoteVisibleViewVISIBLEViewGONE = 0;
        android.widget.RadioGroup.OnCheckedChangeListener checkoutOnDispatchTypeChangedAndroidWidgetRadioGroupOnCheckedChangeListener = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCheckoutIsDeliveryChargesTextVisibleGet = false;
        int checkoutIsDeliveryChargesVisibleViewVISIBLEViewGONE = 0;
        java.lang.String checkoutTextDiscountGet = null;
        int checkoutIsPromotionVisibleViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.String> checkoutTextCheckOutItemCount = null;
        androidx.databinding.ObservableField<java.lang.Boolean> checkoutIsDispatchNoteVisible = null;
        java.lang.String checkoutTextcheckoutsubtotalGet = null;
        java.lang.Boolean checkoutIsDispatchNoteVisibleGet = null;
        java.lang.String checkoutTextSelectedPromoCodeGet = null;
        java.lang.Integer checkoutTextPromoTypeColorGet = null;
        android.widget.RadioGroup.OnCheckedChangeListener checkoutOnStoreLocationChangedAndroidWidgetRadioGroupOnCheckedChangeListener = null;
        tkhub.project.kesbewa.viewmodels.checkout.CheckoutViewModel checkout = mCheckout;
        androidx.databinding.ObservableField<java.lang.String> checkoutTextDiscount = null;
        int checkoutStoreOptionVisibleViewVISIBLEViewGONE = 0;
        java.lang.Boolean checkoutIsPromotionVisibleGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> checkoutStoreOptionVisible = null;
        androidx.databinding.ObservableField<java.lang.String> checkoutTextcheckoutsubtotal = null;
        androidx.databinding.ObservableField<java.lang.Integer> checkoutTextPromoTypeColor = null;
        int checkoutIsPromotionTextVisibleViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxCheckoutIsPromotionVisibleGet = false;
        androidx.databinding.ObservableField<java.lang.String> checkoutTextSelectedAddress = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCheckoutIsDeliveryChargesVisibleGet = false;
        java.lang.String checkoutTextSelectedAddressGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCheckoutIsPromotionTextVisibleGet = false;
        androidx.databinding.ObservableField<java.lang.String> checkoutTextDelivery = null;
        androidx.databinding.ObservableField<java.lang.Boolean> checkoutDeliveryAddressVisible = null;
        androidx.databinding.ObservableField<java.lang.String> checkoutTextPromoType = null;
        int checkoutIsDeliveryChargesTextVisibleViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxCheckoutIsOrderProcessVisibleGet = false;
        java.lang.String checkoutTextNeedToPayGet = null;
        java.lang.String checkoutTextCheckOutItemCountGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCheckoutIsDispatchNoteVisibleGet = false;
        androidx.databinding.ObservableField<java.lang.Boolean> checkoutIsDeliveryChargesTextVisible = null;
        androidx.databinding.ObservableField<java.lang.String> checkoutTextNeedToPay = null;
        int checkoutDeliveryAddressVisibleViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> checkoutIsPromotionTextVisible = null;
        java.lang.Boolean checkoutIsDeliveryChargesTextVisibleGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> checkoutIsDeliveryChargesVisible = null;
        androidx.databinding.ObservableField<java.lang.String> checkoutTextDispatchNote = null;
        androidx.databinding.ObservableField<java.lang.Boolean> checkoutIsPromotionVisible = null;
        java.lang.String checkoutTextDispatchNoteGet = null;
        int androidxDatabindingViewDataBindingSafeUnboxCheckoutTextPromoTypeColorGet = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxCheckoutStoreOptionVisibleGet = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxCheckoutDeliveryAddressVisibleGet = false;
        java.lang.Boolean checkoutStoreOptionVisibleGet = null;
        java.lang.String checkoutTextPromoTypeGet = null;
        java.lang.Boolean checkoutDeliveryAddressVisibleGet = null;

        if ((dirtyFlags & 0xfffffL) != 0) {


            if ((dirtyFlags & 0xc0001L) != 0) {

                    if (checkout != null) {
                        // read checkout.isOrderProcessVisible
                        checkoutIsOrderProcessVisible = checkout.isOrderProcessVisible();
                    }
                    updateRegistration(0, checkoutIsOrderProcessVisible);


                    if (checkoutIsOrderProcessVisible != null) {
                        // read checkout.isOrderProcessVisible.get()
                        checkoutIsOrderProcessVisibleGet = checkoutIsOrderProcessVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(checkout.isOrderProcessVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxCheckoutIsOrderProcessVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(checkoutIsOrderProcessVisibleGet);
                if((dirtyFlags & 0xc0001L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCheckoutIsOrderProcessVisibleGet) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(checkout.isOrderProcessVisible.get()) ? View.VISIBLE : View.GONE
                    checkoutIsOrderProcessVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxCheckoutIsOrderProcessVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc0002L) != 0) {

                    if (checkout != null) {
                        // read checkout.textSelectedPromoCode
                        checkoutTextSelectedPromoCode = checkout.getTextSelectedPromoCode();
                    }
                    updateRegistration(1, checkoutTextSelectedPromoCode);


                    if (checkoutTextSelectedPromoCode != null) {
                        // read checkout.textSelectedPromoCode.get()
                        checkoutTextSelectedPromoCodeGet = checkoutTextSelectedPromoCode.get();
                    }
            }
            if ((dirtyFlags & 0xc0000L) != 0) {

                    if (checkout != null) {
                        // read checkout::onDispatchTypeChanged
                        checkoutOnDispatchTypeChangedAndroidWidgetRadioGroupOnCheckedChangeListener = (((mCheckoutOnDispatchTypeChangedAndroidWidgetRadioGroupOnCheckedChangeListener == null) ? (mCheckoutOnDispatchTypeChangedAndroidWidgetRadioGroupOnCheckedChangeListener = new OnCheckedChangeListenerImpl()) : mCheckoutOnDispatchTypeChangedAndroidWidgetRadioGroupOnCheckedChangeListener).setValue(checkout));
                        // read checkout::onStoreLocationChanged
                        checkoutOnStoreLocationChangedAndroidWidgetRadioGroupOnCheckedChangeListener = (((mCheckoutOnStoreLocationChangedAndroidWidgetRadioGroupOnCheckedChangeListener == null) ? (mCheckoutOnStoreLocationChangedAndroidWidgetRadioGroupOnCheckedChangeListener = new OnCheckedChangeListenerImpl1()) : mCheckoutOnStoreLocationChangedAndroidWidgetRadioGroupOnCheckedChangeListener).setValue(checkout));
                    }
            }
            if ((dirtyFlags & 0xc0004L) != 0) {

                    if (checkout != null) {
                        // read checkout.textCheckOutItemCount
                        checkoutTextCheckOutItemCount = checkout.getTextCheckOutItemCount();
                    }
                    updateRegistration(2, checkoutTextCheckOutItemCount);


                    if (checkoutTextCheckOutItemCount != null) {
                        // read checkout.textCheckOutItemCount.get()
                        checkoutTextCheckOutItemCountGet = checkoutTextCheckOutItemCount.get();
                    }
            }
            if ((dirtyFlags & 0xc0008L) != 0) {

                    if (checkout != null) {
                        // read checkout.isDispatchNoteVisible
                        checkoutIsDispatchNoteVisible = checkout.isDispatchNoteVisible();
                    }
                    updateRegistration(3, checkoutIsDispatchNoteVisible);


                    if (checkoutIsDispatchNoteVisible != null) {
                        // read checkout.isDispatchNoteVisible.get()
                        checkoutIsDispatchNoteVisibleGet = checkoutIsDispatchNoteVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(checkout.isDispatchNoteVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxCheckoutIsDispatchNoteVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(checkoutIsDispatchNoteVisibleGet);
                if((dirtyFlags & 0xc0008L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCheckoutIsDispatchNoteVisibleGet) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(checkout.isDispatchNoteVisible.get()) ? View.VISIBLE : View.GONE
                    checkoutIsDispatchNoteVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxCheckoutIsDispatchNoteVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc0010L) != 0) {

                    if (checkout != null) {
                        // read checkout.textDiscount
                        checkoutTextDiscount = checkout.getTextDiscount();
                    }
                    updateRegistration(4, checkoutTextDiscount);


                    if (checkoutTextDiscount != null) {
                        // read checkout.textDiscount.get()
                        checkoutTextDiscountGet = checkoutTextDiscount.get();
                    }
            }
            if ((dirtyFlags & 0xc0020L) != 0) {

                    if (checkout != null) {
                        // read checkout.storeOptionVisible
                        checkoutStoreOptionVisible = checkout.getStoreOptionVisible();
                    }
                    updateRegistration(5, checkoutStoreOptionVisible);


                    if (checkoutStoreOptionVisible != null) {
                        // read checkout.storeOptionVisible.get()
                        checkoutStoreOptionVisibleGet = checkoutStoreOptionVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(checkout.storeOptionVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxCheckoutStoreOptionVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(checkoutStoreOptionVisibleGet);
                if((dirtyFlags & 0xc0020L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCheckoutStoreOptionVisibleGet) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(checkout.storeOptionVisible.get()) ? View.VISIBLE : View.GONE
                    checkoutStoreOptionVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxCheckoutStoreOptionVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc0040L) != 0) {

                    if (checkout != null) {
                        // read checkout.textcheckoutsubtotal
                        checkoutTextcheckoutsubtotal = checkout.getTextcheckoutsubtotal();
                    }
                    updateRegistration(6, checkoutTextcheckoutsubtotal);


                    if (checkoutTextcheckoutsubtotal != null) {
                        // read checkout.textcheckoutsubtotal.get()
                        checkoutTextcheckoutsubtotalGet = checkoutTextcheckoutsubtotal.get();
                    }
            }
            if ((dirtyFlags & 0xc0080L) != 0) {

                    if (checkout != null) {
                        // read checkout.textPromoTypeColor
                        checkoutTextPromoTypeColor = checkout.getTextPromoTypeColor();
                    }
                    updateRegistration(7, checkoutTextPromoTypeColor);


                    if (checkoutTextPromoTypeColor != null) {
                        // read checkout.textPromoTypeColor.get()
                        checkoutTextPromoTypeColorGet = checkoutTextPromoTypeColor.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(checkout.textPromoTypeColor.get())
                    androidxDatabindingViewDataBindingSafeUnboxCheckoutTextPromoTypeColorGet = androidx.databinding.ViewDataBinding.safeUnbox(checkoutTextPromoTypeColorGet);
            }
            if ((dirtyFlags & 0xc0100L) != 0) {

                    if (checkout != null) {
                        // read checkout.textSelectedAddress
                        checkoutTextSelectedAddress = checkout.getTextSelectedAddress();
                    }
                    updateRegistration(8, checkoutTextSelectedAddress);


                    if (checkoutTextSelectedAddress != null) {
                        // read checkout.textSelectedAddress.get()
                        checkoutTextSelectedAddressGet = checkoutTextSelectedAddress.get();
                    }
            }
            if ((dirtyFlags & 0xc0200L) != 0) {

                    if (checkout != null) {
                        // read checkout.textDelivery
                        checkoutTextDelivery = checkout.getTextDelivery();
                    }
                    updateRegistration(9, checkoutTextDelivery);


                    if (checkoutTextDelivery != null) {
                        // read checkout.textDelivery.get()
                        checkoutTextDeliveryGet = checkoutTextDelivery.get();
                    }
            }
            if ((dirtyFlags & 0xc0400L) != 0) {

                    if (checkout != null) {
                        // read checkout.deliveryAddressVisible
                        checkoutDeliveryAddressVisible = checkout.getDeliveryAddressVisible();
                    }
                    updateRegistration(10, checkoutDeliveryAddressVisible);


                    if (checkoutDeliveryAddressVisible != null) {
                        // read checkout.deliveryAddressVisible.get()
                        checkoutDeliveryAddressVisibleGet = checkoutDeliveryAddressVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(checkout.deliveryAddressVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxCheckoutDeliveryAddressVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(checkoutDeliveryAddressVisibleGet);
                if((dirtyFlags & 0xc0400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCheckoutDeliveryAddressVisibleGet) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(checkout.deliveryAddressVisible.get()) ? View.VISIBLE : View.GONE
                    checkoutDeliveryAddressVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxCheckoutDeliveryAddressVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc0800L) != 0) {

                    if (checkout != null) {
                        // read checkout.textPromoType
                        checkoutTextPromoType = checkout.getTextPromoType();
                    }
                    updateRegistration(11, checkoutTextPromoType);


                    if (checkoutTextPromoType != null) {
                        // read checkout.textPromoType.get()
                        checkoutTextPromoTypeGet = checkoutTextPromoType.get();
                    }
            }
            if ((dirtyFlags & 0xc1000L) != 0) {

                    if (checkout != null) {
                        // read checkout.isDeliveryChargesTextVisible
                        checkoutIsDeliveryChargesTextVisible = checkout.isDeliveryChargesTextVisible();
                    }
                    updateRegistration(12, checkoutIsDeliveryChargesTextVisible);


                    if (checkoutIsDeliveryChargesTextVisible != null) {
                        // read checkout.isDeliveryChargesTextVisible.get()
                        checkoutIsDeliveryChargesTextVisibleGet = checkoutIsDeliveryChargesTextVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(checkout.isDeliveryChargesTextVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxCheckoutIsDeliveryChargesTextVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(checkoutIsDeliveryChargesTextVisibleGet);
                if((dirtyFlags & 0xc1000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCheckoutIsDeliveryChargesTextVisibleGet) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(checkout.isDeliveryChargesTextVisible.get()) ? View.VISIBLE : View.GONE
                    checkoutIsDeliveryChargesTextVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxCheckoutIsDeliveryChargesTextVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc2000L) != 0) {

                    if (checkout != null) {
                        // read checkout.textNeedToPay
                        checkoutTextNeedToPay = checkout.getTextNeedToPay();
                    }
                    updateRegistration(13, checkoutTextNeedToPay);


                    if (checkoutTextNeedToPay != null) {
                        // read checkout.textNeedToPay.get()
                        checkoutTextNeedToPayGet = checkoutTextNeedToPay.get();
                    }
            }
            if ((dirtyFlags & 0xc4000L) != 0) {

                    if (checkout != null) {
                        // read checkout.isPromotionTextVisible
                        checkoutIsPromotionTextVisible = checkout.isPromotionTextVisible();
                    }
                    updateRegistration(14, checkoutIsPromotionTextVisible);


                    if (checkoutIsPromotionTextVisible != null) {
                        // read checkout.isPromotionTextVisible.get()
                        checkoutIsPromotionTextVisibleGet = checkoutIsPromotionTextVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(checkout.isPromotionTextVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxCheckoutIsPromotionTextVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(checkoutIsPromotionTextVisibleGet);
                if((dirtyFlags & 0xc4000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCheckoutIsPromotionTextVisibleGet) {
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(checkout.isPromotionTextVisible.get()) ? View.VISIBLE : View.GONE
                    checkoutIsPromotionTextVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxCheckoutIsPromotionTextVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc8000L) != 0) {

                    if (checkout != null) {
                        // read checkout.isDeliveryChargesVisible
                        checkoutIsDeliveryChargesVisible = checkout.isDeliveryChargesVisible();
                    }
                    updateRegistration(15, checkoutIsDeliveryChargesVisible);


                    if (checkoutIsDeliveryChargesVisible != null) {
                        // read checkout.isDeliveryChargesVisible.get()
                        checkoutIsDeliveryChargesVisibleGet = checkoutIsDeliveryChargesVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(checkout.isDeliveryChargesVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxCheckoutIsDeliveryChargesVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(checkoutIsDeliveryChargesVisibleGet);
                if((dirtyFlags & 0xc8000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCheckoutIsDeliveryChargesVisibleGet) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(checkout.isDeliveryChargesVisible.get()) ? View.VISIBLE : View.GONE
                    checkoutIsDeliveryChargesVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxCheckoutIsDeliveryChargesVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xd0000L) != 0) {

                    if (checkout != null) {
                        // read checkout.textDispatchNote
                        checkoutTextDispatchNote = checkout.getTextDispatchNote();
                    }
                    updateRegistration(16, checkoutTextDispatchNote);


                    if (checkoutTextDispatchNote != null) {
                        // read checkout.textDispatchNote.get()
                        checkoutTextDispatchNoteGet = checkoutTextDispatchNote.get();
                    }
            }
            if ((dirtyFlags & 0xe0000L) != 0) {

                    if (checkout != null) {
                        // read checkout.isPromotionVisible
                        checkoutIsPromotionVisible = checkout.isPromotionVisible();
                    }
                    updateRegistration(17, checkoutIsPromotionVisible);


                    if (checkoutIsPromotionVisible != null) {
                        // read checkout.isPromotionVisible.get()
                        checkoutIsPromotionVisibleGet = checkoutIsPromotionVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(checkout.isPromotionVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxCheckoutIsPromotionVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(checkoutIsPromotionVisibleGet);
                if((dirtyFlags & 0xe0000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCheckoutIsPromotionVisibleGet) {
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(checkout.isPromotionVisible.get()) ? View.VISIBLE : View.GONE
                    checkoutIsPromotionVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxCheckoutIsPromotionVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x80000L) != 0) {
            // api target 1

            this.appCompatImageView.setOnClickListener(mCallback12);
            this.mboundView2.setOnClickListener(mCallback11);
        }
        if ((dirtyFlags & 0xc0020L) != 0) {
            // api target 1

            this.clDispatchStore.setVisibility(checkoutStoreOptionVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc0001L) != 0) {
            // api target 1

            this.constraintLayoutLoadingGuestusersave.setVisibility(checkoutIsOrderProcessVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc0000L) != 0) {
            // api target 1

            androidx.databinding.adapters.RadioGroupBindingAdapter.setListeners(this.mboundView3, (android.widget.RadioGroup.OnCheckedChangeListener)checkoutOnDispatchTypeChangedAndroidWidgetRadioGroupOnCheckedChangeListener, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.RadioGroupBindingAdapter.setListeners(this.radioGroup, (android.widget.RadioGroup.OnCheckedChangeListener)checkoutOnStoreLocationChangedAndroidWidgetRadioGroupOnCheckedChangeListener, (androidx.databinding.InverseBindingListener)null);
        }
        if ((dirtyFlags & 0xc0400L) != 0) {
            // api target 1

            this.mboundView6.setVisibility(checkoutDeliveryAddressVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc0200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview10, checkoutTextDeliveryGet);
        }
        if ((dirtyFlags & 0xc8000L) != 0) {
            // api target 1

            this.textview10.setVisibility(checkoutIsDeliveryChargesVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc0800L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview100, checkoutTextPromoTypeGet);
        }
        if ((dirtyFlags & 0xc0080L) != 0) {
            // api target 1

            this.textview100.setTextColor(androidxDatabindingViewDataBindingSafeUnboxCheckoutTextPromoTypeColorGet);
        }
        if ((dirtyFlags & 0xe0000L) != 0) {
            // api target 1

            this.textview100.setVisibility(checkoutIsPromotionVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xd0000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview105, checkoutTextDispatchNoteGet);
        }
        if ((dirtyFlags & 0xc0008L) != 0) {
            // api target 1

            this.textview105.setVisibility(checkoutIsDispatchNoteVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc0040L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview13, checkoutTextcheckoutsubtotalGet);
        }
        if ((dirtyFlags & 0xc0004L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview2, checkoutTextCheckOutItemCountGet);
        }
        if ((dirtyFlags & 0xc2000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview5, checkoutTextNeedToPayGet);
        }
        if ((dirtyFlags & 0xc0010L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview8, checkoutTextDiscountGet);
        }
        if ((dirtyFlags & 0xc1000L) != 0) {
            // api target 1

            this.textview9.setVisibility(checkoutIsDeliveryChargesTextVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc4000L) != 0) {
            // api target 1

            this.textview99.setVisibility(checkoutIsPromotionTextVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc0002L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textviewTitel3, checkoutTextSelectedPromoCodeGet);
        }
        if ((dirtyFlags & 0xc0100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textviewTitel6, checkoutTextSelectedAddressGet);
        }
    }
    // Listener Stub Implementations
    public static class OnCheckedChangeListenerImpl implements android.widget.RadioGroup.OnCheckedChangeListener{
        private tkhub.project.kesbewa.viewmodels.checkout.CheckoutViewModel value;
        public OnCheckedChangeListenerImpl setValue(tkhub.project.kesbewa.viewmodels.checkout.CheckoutViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onCheckedChanged(android.widget.RadioGroup arg0, int arg1) {
            this.value.onDispatchTypeChanged(arg0, arg1); 
        }
    }
    public static class OnCheckedChangeListenerImpl1 implements android.widget.RadioGroup.OnCheckedChangeListener{
        private tkhub.project.kesbewa.viewmodels.checkout.CheckoutViewModel value;
        public OnCheckedChangeListenerImpl1 setValue(tkhub.project.kesbewa.viewmodels.checkout.CheckoutViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onCheckedChanged(android.widget.RadioGroup arg0, int arg1) {
            this.value.onStoreLocationChanged(arg0, arg1); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // checkout != null
                boolean checkoutJavaLangObjectNull = false;
                // checkout
                tkhub.project.kesbewa.viewmodels.checkout.CheckoutViewModel checkout = mCheckout;



                checkoutJavaLangObjectNull = (checkout) != (null);
                if (checkoutJavaLangObjectNull) {



                    checkout.goToPromoUi(callbackArg_0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // checkout != null
                boolean checkoutJavaLangObjectNull = false;
                // checkout
                tkhub.project.kesbewa.viewmodels.checkout.CheckoutViewModel checkout = mCheckout;



                checkoutJavaLangObjectNull = (checkout) != (null);
                if (checkoutJavaLangObjectNull) {



                    checkout.goToAddAddress(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): checkout.isOrderProcessVisible
        flag 1 (0x2L): checkout.textSelectedPromoCode
        flag 2 (0x3L): checkout.textCheckOutItemCount
        flag 3 (0x4L): checkout.isDispatchNoteVisible
        flag 4 (0x5L): checkout.textDiscount
        flag 5 (0x6L): checkout.storeOptionVisible
        flag 6 (0x7L): checkout.textcheckoutsubtotal
        flag 7 (0x8L): checkout.textPromoTypeColor
        flag 8 (0x9L): checkout.textSelectedAddress
        flag 9 (0xaL): checkout.textDelivery
        flag 10 (0xbL): checkout.deliveryAddressVisible
        flag 11 (0xcL): checkout.textPromoType
        flag 12 (0xdL): checkout.isDeliveryChargesTextVisible
        flag 13 (0xeL): checkout.textNeedToPay
        flag 14 (0xfL): checkout.isPromotionTextVisible
        flag 15 (0x10L): checkout.isDeliveryChargesVisible
        flag 16 (0x11L): checkout.textDispatchNote
        flag 17 (0x12L): checkout.isPromotionVisible
        flag 18 (0x13L): checkout
        flag 19 (0x14L): null
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(checkout.isOrderProcessVisible.get()) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(checkout.isOrderProcessVisible.get()) ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(checkout.isDispatchNoteVisible.get()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(checkout.isDispatchNoteVisible.get()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(checkout.isDeliveryChargesVisible.get()) ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(checkout.isDeliveryChargesVisible.get()) ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(checkout.isPromotionVisible.get()) ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(checkout.isPromotionVisible.get()) ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(checkout.storeOptionVisible.get()) ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(checkout.storeOptionVisible.get()) ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(checkout.isPromotionTextVisible.get()) ? View.VISIBLE : View.GONE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(checkout.isPromotionTextVisible.get()) ? View.VISIBLE : View.GONE
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(checkout.isDeliveryChargesTextVisible.get()) ? View.VISIBLE : View.GONE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(checkout.isDeliveryChargesTextVisible.get()) ? View.VISIBLE : View.GONE
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(checkout.deliveryAddressVisible.get()) ? View.VISIBLE : View.GONE
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(checkout.deliveryAddressVisible.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}