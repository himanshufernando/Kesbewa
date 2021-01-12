package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding implements tkhub.project.kesbewa.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView55, 4);
        sViewsWithIds.put(R.id.imageview_navigation, 5);
        sViewsWithIds.put(R.id.textView, 6);
        sViewsWithIds.put(R.id.constraintlayout_1, 7);
        sViewsWithIds.put(R.id.autoCompleteTextView, 8);
        sViewsWithIds.put(R.id.relativelayout_serach, 9);
        sViewsWithIds.put(R.id.imageView_search_icon, 10);
        sViewsWithIds.put(R.id.recyclerView_products, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.appcompat.widget.AppCompatEditText) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (android.widget.RelativeLayout) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (com.robinhood.ticker.TickerView) bindings[2]
            );
        this.constraintLayoutCartHome.setTag(null);
        this.constraintLayoutLoadingGuestusersave.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewCartCount.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new tkhub.project.kesbewa.generated.callback.OnClickListener(this, 1);
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
        if (BR.products == variableId) {
            setProducts((tkhub.project.kesbewa.viewmodels.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProducts(@Nullable tkhub.project.kesbewa.viewmodels.home.HomeViewModel Products) {
        this.mProducts = Products;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.products);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProductsTextCartCount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeProductsIsProductLoaderVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeProductsIsCartVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProductsTextCartCount(androidx.databinding.ObservableField<java.lang.String> ProductsTextCartCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProductsIsProductLoaderVisible(androidx.databinding.ObservableField<java.lang.Boolean> ProductsIsProductLoaderVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProductsIsCartVisible(androidx.databinding.ObservableField<java.lang.Boolean> ProductsIsCartVisible, int fieldId) {
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
        androidx.databinding.ObservableField<java.lang.String> productsTextCartCount = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxProductsIsProductLoaderVisibleGet = false;
        tkhub.project.kesbewa.viewmodels.home.HomeViewModel products = mProducts;
        int productsIsCartVisibleViewVISIBLEViewGONE = 0;
        java.lang.Boolean productsIsProductLoaderVisibleGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> productsIsProductLoaderVisible = null;
        int productsIsProductLoaderVisibleViewVISIBLEViewGONE = 0;
        java.lang.Boolean productsIsCartVisibleGet = null;
        java.lang.String productsTextCartCountGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> productsIsCartVisible = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxProductsIsCartVisibleGet = false;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (products != null) {
                        // read products.textCartCount
                        productsTextCartCount = products.getTextCartCount();
                    }
                    updateRegistration(0, productsTextCartCount);


                    if (productsTextCartCount != null) {
                        // read products.textCartCount.get()
                        productsTextCartCountGet = productsTextCartCount.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (products != null) {
                        // read products.isProductLoaderVisible
                        productsIsProductLoaderVisible = products.isProductLoaderVisible();
                    }
                    updateRegistration(1, productsIsProductLoaderVisible);


                    if (productsIsProductLoaderVisible != null) {
                        // read products.isProductLoaderVisible.get()
                        productsIsProductLoaderVisibleGet = productsIsProductLoaderVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(products.isProductLoaderVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxProductsIsProductLoaderVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(productsIsProductLoaderVisibleGet);
                if((dirtyFlags & 0x1aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxProductsIsProductLoaderVisibleGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(products.isProductLoaderVisible.get()) ? View.VISIBLE : View.GONE
                    productsIsProductLoaderVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxProductsIsProductLoaderVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (products != null) {
                        // read products.isCartVisible
                        productsIsCartVisible = products.isCartVisible();
                    }
                    updateRegistration(2, productsIsCartVisible);


                    if (productsIsCartVisible != null) {
                        // read products.isCartVisible.get()
                        productsIsCartVisibleGet = productsIsCartVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(products.isCartVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxProductsIsCartVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(productsIsCartVisibleGet);
                if((dirtyFlags & 0x1cL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxProductsIsCartVisibleGet) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(products.isCartVisible.get()) ? View.VISIBLE : View.GONE
                    productsIsCartVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxProductsIsCartVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.constraintLayoutCartHome.setOnClickListener(mCallback8);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.constraintLayoutCartHome.setVisibility(productsIsCartVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.constraintLayoutLoadingGuestusersave.setVisibility(productsIsProductLoaderVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.textViewCartCount.setText(productsTextCartCountGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // products != null
        boolean productsJavaLangObjectNull = false;
        // products
        tkhub.project.kesbewa.viewmodels.home.HomeViewModel products = mProducts;



        productsJavaLangObjectNull = (products) != (null);
        if (productsJavaLangObjectNull) {



            products.goToCartUi(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): products.textCartCount
        flag 1 (0x2L): products.isProductLoaderVisible
        flag 2 (0x3L): products.isCartVisible
        flag 3 (0x4L): products
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(products.isCartVisible.get()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(products.isCartVisible.get()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(products.isProductLoaderVisible.get()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(products.isProductLoaderVisible.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}