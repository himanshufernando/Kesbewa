package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProductDetailBindingImpl extends FragmentProductDetailBinding implements tkhub.project.kesbewa.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(27);
        sIncludes.setIncludes(0, 
            new String[] {"dialog_bottomsheet_cart"},
            new int[] {12},
            new int[] {tkhub.project.kesbewa.R.layout.dialog_bottomsheet_cart});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout2, 13);
        sViewsWithIds.put(R.id.imageView55, 14);
        sViewsWithIds.put(R.id.imageview_navigation, 15);
        sViewsWithIds.put(R.id.constraintLayout, 16);
        sViewsWithIds.put(R.id.recyclerView_product_large_images, 17);
        sViewsWithIds.put(R.id.cl_pro_image_right, 18);
        sViewsWithIds.put(R.id.cl_pro_image_left, 19);
        sViewsWithIds.put(R.id.recyclerView_product_images, 20);
        sViewsWithIds.put(R.id.guideline_bottom, 21);
        sViewsWithIds.put(R.id.scrollView, 22);
        sViewsWithIds.put(R.id.rl_1, 23);
        sViewsWithIds.put(R.id.rl_2, 24);
        sViewsWithIds.put(R.id.youtube_player_view, 25);
        sViewsWithIds.put(R.id.divider3, 26);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @Nullable
    private final tkhub.project.kesbewa.databinding.DialogBottomsheetCartBinding mboundView01;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener appCompatTextView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of product_details.textProductDetails.get()
            //         is product_details.textProductDetails.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(appCompatTextView2);
            // localize variables for thread safety
            // product_details.textProductDetails.get()
            java.lang.String productDetailsTextProductDetailsGet = null;
            // product_details
            tkhub.project.kesbewa.viewmodels.home.HomeViewModel productDetails = mProductDetails;
            // product_details.textProductDetails != null
            boolean productDetailsTextProductDetailsJavaLangObjectNull = false;
            // product_details != null
            boolean productDetailsJavaLangObjectNull = false;
            // product_details.textProductDetails
            androidx.databinding.ObservableField<java.lang.String> productDetailsTextProductDetails = null;



            productDetailsJavaLangObjectNull = (productDetails) != (null);
            if (productDetailsJavaLangObjectNull) {


                productDetailsTextProductDetails = productDetails.getTextProductDetails();

                productDetailsTextProductDetailsJavaLangObjectNull = (productDetailsTextProductDetails) != (null);
                if (productDetailsTextProductDetailsJavaLangObjectNull) {




                    productDetailsTextProductDetails.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener appCompatTextView333androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of product.pro_note
            //         is product.setPro_note((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(appCompatTextView333);
            // localize variables for thread safety
            // product
            tkhub.project.kesbewa.data.model.Products product = mProduct;
            // product.pro_note
            java.lang.String productProNote = null;
            // product != null
            boolean productJavaLangObjectNull = false;



            productJavaLangObjectNull = (product) != (null);
            if (productJavaLangObjectNull) {




                product.setPro_note(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener textViewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of product.pro_name
            //         is product.setPro_name((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(textView);
            // localize variables for thread safety
            // product.pro_name
            java.lang.String productProName = null;
            // product
            tkhub.project.kesbewa.data.model.Products product = mProduct;
            // product != null
            boolean productJavaLangObjectNull = false;



            productJavaLangObjectNull = (product) != (null);
            if (productJavaLangObjectNull) {




                product.setPro_name(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentProductDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private FragmentProductDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (android.view.View) bindings[26]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[10]
            , (androidx.constraintlayout.widget.Guideline) bindings[21]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[20]
            , (androidx.recyclerview.widget.RecyclerView) bindings[17]
            , (android.widget.RelativeLayout) bindings[23]
            , (android.widget.RelativeLayout) bindings[24]
            , (androidx.core.widget.NestedScrollView) bindings[22]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (com.robinhood.ticker.TickerView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView) bindings[25]
            );
        this.appCompatTextView.setTag(null);
        this.appCompatTextView12.setTag(null);
        this.appCompatTextView2.setTag(null);
        this.appCompatTextView333.setTag(null);
        this.constraintLayoutLoadingGuestusersave.setTag(null);
        this.fabCart.setTag(null);
        this.imageViewCart.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (tkhub.project.kesbewa.databinding.DialogBottomsheetCartBinding) bindings[12];
        setContainedBinding(this.mboundView01);
        this.mboundView2 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.textView.setTag(null);
        this.textViewCartCount.setTag(null);
        this.textviewProCode.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new tkhub.project.kesbewa.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        mboundView01.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView01.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.product == variableId) {
            setProduct((tkhub.project.kesbewa.data.model.Products) variable);
        }
        else if (BR.product_details == variableId) {
            setProductDetails((tkhub.project.kesbewa.viewmodels.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProduct(@Nullable tkhub.project.kesbewa.data.model.Products Product) {
        this.mProduct = Product;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.product);
        super.requestRebind();
    }
    public void setProductDetails(@Nullable tkhub.project.kesbewa.viewmodels.home.HomeViewModel ProductDetails) {
        this.mProductDetails = ProductDetails;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.product_details);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView01.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProductDetailsIsCartVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeProductDetailsTextCartCount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeProductDetailsTextProductDetails((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeProductDetailsIsProductDetailsLoaderVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProductDetailsIsCartVisible(androidx.databinding.ObservableField<java.lang.Boolean> ProductDetailsIsCartVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProductDetailsTextCartCount(androidx.databinding.ObservableField<java.lang.String> ProductDetailsTextCartCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProductDetailsTextProductDetails(androidx.databinding.ObservableField<java.lang.String> ProductDetailsTextProductDetails, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProductDetailsIsProductDetailsLoaderVisible(androidx.databinding.ObservableField<java.lang.Boolean> ProductDetailsIsProductDetailsLoaderVisible, int fieldId) {
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
        java.lang.String productDetailsTextProductDetailsGet = null;
        java.lang.Boolean productDetailsIsCartVisibleGet = null;
        tkhub.project.kesbewa.data.model.Products product = mProduct;
        java.lang.Boolean productDetailsIsProductDetailsLoaderVisibleGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxProductDetailsIsProductDetailsLoaderVisibleGet = false;
        java.lang.String productProCode = null;
        androidx.databinding.ObservableField<java.lang.Boolean> productDetailsIsCartVisible = null;
        java.lang.String productProName = null;
        java.lang.String doubleToStringProductProPrice = null;
        androidx.databinding.ObservableField<java.lang.String> productDetailsTextCartCount = null;
        androidx.databinding.ObservableField<java.lang.String> productDetailsTextProductDetails = null;
        double productProPrice = 0.0;
        int productDetailsIsCartVisibleViewVISIBLEViewGONE = 0;
        tkhub.project.kesbewa.viewmodels.home.HomeViewModel productDetails = mProductDetails;
        java.lang.String productProNote = null;
        androidx.databinding.ObservableField<java.lang.Boolean> productDetailsIsProductDetailsLoaderVisible = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxProductDetailsIsCartVisibleGet = false;
        int productDetailsIsProductDetailsLoaderVisibleViewGONEViewVISIBLE = 0;
        java.lang.String productDetailsTextCartCountGet = null;
        int productDetailsIsProductDetailsLoaderVisibleViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x50L) != 0) {



                if (product != null) {
                    // read product.pro_code
                    productProCode = product.getPro_code();
                    // read product.pro_name
                    productProName = product.getPro_name();
                    // read product.pro_price
                    productProPrice = product.getPro_price();
                    // read product.pro_note
                    productProNote = product.getPro_note();
                }


                // read Double.toString(product.pro_price)
                doubleToStringProductProPrice = java.lang.Double.toString(productProPrice);
        }
        if ((dirtyFlags & 0x6fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (productDetails != null) {
                        // read product_details.isCartVisible
                        productDetailsIsCartVisible = productDetails.isCartVisible();
                    }
                    updateRegistration(0, productDetailsIsCartVisible);


                    if (productDetailsIsCartVisible != null) {
                        // read product_details.isCartVisible.get()
                        productDetailsIsCartVisibleGet = productDetailsIsCartVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(product_details.isCartVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxProductDetailsIsCartVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(productDetailsIsCartVisibleGet);
                if((dirtyFlags & 0x61L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxProductDetailsIsCartVisibleGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(product_details.isCartVisible.get()) ? View.VISIBLE : View.GONE
                    productDetailsIsCartVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxProductDetailsIsCartVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (productDetails != null) {
                        // read product_details.textCartCount
                        productDetailsTextCartCount = productDetails.getTextCartCount();
                    }
                    updateRegistration(1, productDetailsTextCartCount);


                    if (productDetailsTextCartCount != null) {
                        // read product_details.textCartCount.get()
                        productDetailsTextCartCountGet = productDetailsTextCartCount.get();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (productDetails != null) {
                        // read product_details.textProductDetails
                        productDetailsTextProductDetails = productDetails.getTextProductDetails();
                    }
                    updateRegistration(2, productDetailsTextProductDetails);


                    if (productDetailsTextProductDetails != null) {
                        // read product_details.textProductDetails.get()
                        productDetailsTextProductDetailsGet = productDetailsTextProductDetails.get();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (productDetails != null) {
                        // read product_details.isProductDetailsLoaderVisible
                        productDetailsIsProductDetailsLoaderVisible = productDetails.isProductDetailsLoaderVisible();
                    }
                    updateRegistration(3, productDetailsIsProductDetailsLoaderVisible);


                    if (productDetailsIsProductDetailsLoaderVisible != null) {
                        // read product_details.isProductDetailsLoaderVisible.get()
                        productDetailsIsProductDetailsLoaderVisibleGet = productDetailsIsProductDetailsLoaderVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(product_details.isProductDetailsLoaderVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxProductDetailsIsProductDetailsLoaderVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(productDetailsIsProductDetailsLoaderVisibleGet);
                if((dirtyFlags & 0x68L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxProductDetailsIsProductDetailsLoaderVisibleGet) {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(product_details.isProductDetailsLoaderVisible.get()) ? View.GONE : View.VISIBLE
                    productDetailsIsProductDetailsLoaderVisibleViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxProductDetailsIsProductDetailsLoaderVisibleGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(product_details.isProductDetailsLoaderVisible.get()) ? View.VISIBLE : View.GONE
                    productDetailsIsProductDetailsLoaderVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxProductDetailsIsProductDetailsLoaderVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x50L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appCompatTextView, productProName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appCompatTextView12, doubleToStringProductProPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appCompatTextView333, productProNote);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, productProName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textviewProCode, productProCode);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appCompatTextView2, productDetailsTextProductDetailsGet);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.appCompatTextView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, appCompatTextView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.appCompatTextView333, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, appCompatTextView333androidTextAttrChanged);
            this.imageViewCart.setOnClickListener(mCallback2);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.textView, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, textViewandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            this.constraintLayoutLoadingGuestusersave.setVisibility(productDetailsIsProductDetailsLoaderVisibleViewVISIBLEViewGONE);
            this.fabCart.setVisibility(productDetailsIsProductDetailsLoaderVisibleViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.mboundView01.setProductdetailsbottomsheet(productDetails);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(productDetailsIsCartVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            this.textViewCartCount.setText(productDetailsTextCartCountGet);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // product_details
        tkhub.project.kesbewa.viewmodels.home.HomeViewModel productDetails = mProductDetails;
        // product_details != null
        boolean productDetailsJavaLangObjectNull = false;



        productDetailsJavaLangObjectNull = (productDetails) != (null);
        if (productDetailsJavaLangObjectNull) {



            productDetails.goToCartUi(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): product_details.isCartVisible
        flag 1 (0x2L): product_details.textCartCount
        flag 2 (0x3L): product_details.textProductDetails
        flag 3 (0x4L): product_details.isProductDetailsLoaderVisible
        flag 4 (0x5L): product
        flag 5 (0x6L): product_details
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(product_details.isCartVisible.get()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(product_details.isCartVisible.get()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(product_details.isProductDetailsLoaderVisible.get()) ? View.GONE : View.VISIBLE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(product_details.isProductDetailsLoaderVisible.get()) ? View.GONE : View.VISIBLE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(product_details.isProductDetailsLoaderVisible.get()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(product_details.isProductDetailsLoaderVisible.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}