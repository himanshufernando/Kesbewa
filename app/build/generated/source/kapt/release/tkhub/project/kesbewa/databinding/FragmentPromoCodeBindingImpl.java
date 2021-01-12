package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPromoCodeBindingImpl extends FragmentPromoCodeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageview_navigation, 5);
        sViewsWithIds.put(R.id.textView, 6);
        sViewsWithIds.put(R.id.constraintLayout, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editTextQtyandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of promo_binding_view.textPromoCode.getValue()
            //         is promo_binding_view.textPromoCode.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextQty);
            // localize variables for thread safety
            // promo_binding_view.textPromoCode
            androidx.lifecycle.MutableLiveData<java.lang.String> promoBindingViewTextPromoCode = null;
            // promo_binding_view != null
            boolean promoBindingViewJavaLangObjectNull = false;
            // promo_binding_view
            tkhub.project.kesbewa.viewmodels.cart.CartViewModel promoBindingView = mPromoBindingView;
            // promo_binding_view.textPromoCode != null
            boolean promoBindingViewTextPromoCodeJavaLangObjectNull = false;
            // promo_binding_view.textPromoCode.getValue()
            java.lang.String promoBindingViewTextPromoCodeGetValue = null;



            promoBindingViewJavaLangObjectNull = (promoBindingView) != (null);
            if (promoBindingViewJavaLangObjectNull) {


                promoBindingViewTextPromoCode = promoBindingView.getTextPromoCode();

                promoBindingViewTextPromoCodeJavaLangObjectNull = (promoBindingViewTextPromoCode) != (null);
                if (promoBindingViewTextPromoCodeJavaLangObjectNull) {




                    promoBindingViewTextPromoCode.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentPromoCodeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentPromoCodeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (com.tuyenmonkey.mkloader.MKLoader) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            );
        this.editTextQty.setTag(null);
        this.imageViewBtnAddPromocode.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressbar.setTag(null);
        this.textViewMsg.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.promo_binding_view == variableId) {
            setPromoBindingView((tkhub.project.kesbewa.viewmodels.cart.CartViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPromoBindingView(@Nullable tkhub.project.kesbewa.viewmodels.cart.CartViewModel PromoBindingView) {
        this.mPromoBindingView = PromoBindingView;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.promo_binding_view);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePromoBindingViewTextPromoCode((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangePromoBindingViewPromocodeBtnVisibility((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangePromoBindingViewPromocodeProgress((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangePromoBindingViewTextPromotions((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangePromoBindingViewTextPromoCode(androidx.lifecycle.MutableLiveData<java.lang.String> PromoBindingViewTextPromoCode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePromoBindingViewPromocodeBtnVisibility(androidx.databinding.ObservableField<java.lang.Boolean> PromoBindingViewPromocodeBtnVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePromoBindingViewPromocodeProgress(androidx.databinding.ObservableField<java.lang.Boolean> PromoBindingViewPromocodeProgress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePromoBindingViewTextPromotions(androidx.databinding.ObservableField<java.lang.String> PromoBindingViewTextPromotions, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        androidx.lifecycle.MutableLiveData<java.lang.String> promoBindingViewTextPromoCode = null;
        int promoBindingViewPromocodeBtnVisibilityViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> promoBindingViewPromocodeBtnVisibility = null;
        java.lang.String promoBindingViewTextPromotionsGet = null;
        tkhub.project.kesbewa.viewmodels.cart.CartViewModel promoBindingView = mPromoBindingView;
        int promoBindingViewPromocodeProgressViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxPromoBindingViewPromocodeBtnVisibilityGet = false;
        androidx.databinding.ObservableField<java.lang.Boolean> promoBindingViewPromocodeProgress = null;
        androidx.databinding.ObservableField<java.lang.String> promoBindingViewTextPromotions = null;
        java.lang.Boolean promoBindingViewPromocodeBtnVisibilityGet = null;
        java.lang.String promoBindingViewTextPromoCodeGetValue = null;
        java.lang.Boolean promoBindingViewPromocodeProgressGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxPromoBindingViewPromocodeProgressGet = false;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (promoBindingView != null) {
                        // read promo_binding_view.textPromoCode
                        promoBindingViewTextPromoCode = promoBindingView.getTextPromoCode();
                    }
                    updateLiveDataRegistration(0, promoBindingViewTextPromoCode);


                    if (promoBindingViewTextPromoCode != null) {
                        // read promo_binding_view.textPromoCode.getValue()
                        promoBindingViewTextPromoCodeGetValue = promoBindingViewTextPromoCode.getValue();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (promoBindingView != null) {
                        // read promo_binding_view.promocodeBtnVisibility
                        promoBindingViewPromocodeBtnVisibility = promoBindingView.getPromocodeBtnVisibility();
                    }
                    updateRegistration(1, promoBindingViewPromocodeBtnVisibility);


                    if (promoBindingViewPromocodeBtnVisibility != null) {
                        // read promo_binding_view.promocodeBtnVisibility.get()
                        promoBindingViewPromocodeBtnVisibilityGet = promoBindingViewPromocodeBtnVisibility.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(promo_binding_view.promocodeBtnVisibility.get())
                    androidxDatabindingViewDataBindingSafeUnboxPromoBindingViewPromocodeBtnVisibilityGet = androidx.databinding.ViewDataBinding.safeUnbox(promoBindingViewPromocodeBtnVisibilityGet);
                if((dirtyFlags & 0x32L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxPromoBindingViewPromocodeBtnVisibilityGet) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(promo_binding_view.promocodeBtnVisibility.get()) ? View.VISIBLE : View.GONE
                    promoBindingViewPromocodeBtnVisibilityViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxPromoBindingViewPromocodeBtnVisibilityGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (promoBindingView != null) {
                        // read promo_binding_view.promocodeProgress
                        promoBindingViewPromocodeProgress = promoBindingView.getPromocodeProgress();
                    }
                    updateRegistration(2, promoBindingViewPromocodeProgress);


                    if (promoBindingViewPromocodeProgress != null) {
                        // read promo_binding_view.promocodeProgress.get()
                        promoBindingViewPromocodeProgressGet = promoBindingViewPromocodeProgress.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(promo_binding_view.promocodeProgress.get())
                    androidxDatabindingViewDataBindingSafeUnboxPromoBindingViewPromocodeProgressGet = androidx.databinding.ViewDataBinding.safeUnbox(promoBindingViewPromocodeProgressGet);
                if((dirtyFlags & 0x34L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxPromoBindingViewPromocodeProgressGet) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(promo_binding_view.promocodeProgress.get()) ? View.VISIBLE : View.GONE
                    promoBindingViewPromocodeProgressViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxPromoBindingViewPromocodeProgressGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (promoBindingView != null) {
                        // read promo_binding_view.textPromotions
                        promoBindingViewTextPromotions = promoBindingView.getTextPromotions();
                    }
                    updateRegistration(3, promoBindingViewTextPromotions);


                    if (promoBindingViewTextPromotions != null) {
                        // read promo_binding_view.textPromotions.get()
                        promoBindingViewTextPromotionsGet = promoBindingViewTextPromotions.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextQty, promoBindingViewTextPromoCodeGetValue);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextQty, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextQtyandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.imageViewBtnAddPromocode.setVisibility(promoBindingViewPromocodeBtnVisibilityViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.progressbar.setVisibility(promoBindingViewPromocodeProgressViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewMsg, promoBindingViewTextPromotionsGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): promo_binding_view.textPromoCode
        flag 1 (0x2L): promo_binding_view.promocodeBtnVisibility
        flag 2 (0x3L): promo_binding_view.promocodeProgress
        flag 3 (0x4L): promo_binding_view.textPromotions
        flag 4 (0x5L): promo_binding_view
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(promo_binding_view.promocodeBtnVisibility.get()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(promo_binding_view.promocodeBtnVisibility.get()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(promo_binding_view.promocodeProgress.get()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(promo_binding_view.promocodeProgress.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}