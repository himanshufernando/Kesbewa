package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListviewCartitemsBindingImpl extends ListviewCartitemsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.divider, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListviewCartitemsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ListviewCartitemsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (android.view.View) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            );
        this.appCompatTextView13.setTag(null);
        this.imgCartProduct.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textview1.setTag(null);
        this.textview2.setTag(null);
        this.textview22.setTag(null);
        this.textview3.setTag(null);
        this.textviewBtnAddmore.setTag(null);
        this.textviewBtnRemove.setTag(null);
        this.textviewSelectedQty.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.cartitem == variableId) {
            setCartitem((tkhub.project.kesbewa.data.model.CartItem) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCartitem(@Nullable tkhub.project.kesbewa.data.model.CartItem Cartitem) {
        this.mCartitem = Cartitem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.cartitem);
        super.requestRebind();
    }
    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String doubleToStringCartitemProPriceJavaLangStringLKR = null;
        int androidxDatabindingViewDataBindingSafeUnboxCartitemProTotalQty = 0;
        java.lang.String cartitemProImage = null;
        java.lang.Integer cartitemProTotalQty = null;
        tkhub.project.kesbewa.data.model.CartItem cartitem = mCartitem;
        java.lang.String cartitemProCode = null;
        double androidxDatabindingViewDataBindingSafeUnboxCartitemProPrice = 0.0;
        java.lang.String cartitemProColour = null;
        java.lang.String doubleToStringCartitemProPrice = null;
        java.lang.String cartitemProSize = null;
        java.lang.String cartitemProName = null;
        android.view.View.OnClickListener clickListener = mClickListener;
        java.lang.Double cartitemProPrice = null;
        java.lang.String integerToStringCartitemProTotalQty = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (cartitem != null) {
                    // read cartitem.pro_image
                    cartitemProImage = cartitem.getPro_image();
                    // read cartitem.pro_total_qty
                    cartitemProTotalQty = cartitem.getPro_total_qty();
                    // read cartitem.pro_code
                    cartitemProCode = cartitem.getPro_code();
                    // read cartitem.pro_colour
                    cartitemProColour = cartitem.getPro_colour();
                    // read cartitem.pro_size
                    cartitemProSize = cartitem.getPro_size();
                    // read cartitem.pro_name
                    cartitemProName = cartitem.getPro_name();
                    // read cartitem.pro_price
                    cartitemProPrice = cartitem.getPro_price();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(cartitem.pro_total_qty)
                androidxDatabindingViewDataBindingSafeUnboxCartitemProTotalQty = androidx.databinding.ViewDataBinding.safeUnbox(cartitemProTotalQty);
                // read androidx.databinding.ViewDataBinding.safeUnbox(cartitem.pro_price)
                androidxDatabindingViewDataBindingSafeUnboxCartitemProPrice = androidx.databinding.ViewDataBinding.safeUnbox(cartitemProPrice);


                // read Integer.toString(androidx.databinding.ViewDataBinding.safeUnbox(cartitem.pro_total_qty))
                integerToStringCartitemProTotalQty = java.lang.Integer.toString(androidxDatabindingViewDataBindingSafeUnboxCartitemProTotalQty);
                // read Double.toString(androidx.databinding.ViewDataBinding.safeUnbox(cartitem.pro_price))
                doubleToStringCartitemProPrice = java.lang.Double.toString(androidxDatabindingViewDataBindingSafeUnboxCartitemProPrice);


                // read (Double.toString(androidx.databinding.ViewDataBinding.safeUnbox(cartitem.pro_price))) + (" LKR")
                doubleToStringCartitemProPriceJavaLangStringLKR = (doubleToStringCartitemProPrice) + (" LKR");
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appCompatTextView13, doubleToStringCartitemProPriceJavaLangStringLKR);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.cart_img(this.imgCartProduct, cartitemProImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview1, cartitemProName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview2, cartitemProSize);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview22, cartitemProCode);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview3, cartitemProColour);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textviewSelectedQty, integerToStringCartitemProTotalQty);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.textviewBtnAddmore.setOnClickListener(clickListener);
            this.textviewBtnRemove.setOnClickListener(clickListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): cartitem
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}