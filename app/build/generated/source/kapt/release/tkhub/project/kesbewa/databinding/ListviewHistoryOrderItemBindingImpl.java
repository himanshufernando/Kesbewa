package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListviewHistoryOrderItemBindingImpl extends ListviewHistoryOrderItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textview2, 8);
        sViewsWithIds.put(R.id.textview4, 9);
        sViewsWithIds.put(R.id.textview6, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListviewHistoryOrderItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ListviewHistoryOrderItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            );
        this.appCompatTextView14.setTag(null);
        this.imgCartProduct.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textview1.setTag(null);
        this.textview11.setTag(null);
        this.textview3.setTag(null);
        this.textview5.setTag(null);
        this.textview7.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.orderitem == variableId) {
            setOrderitem((tkhub.project.kesbewa.data.model.CartItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOrderitem(@Nullable tkhub.project.kesbewa.data.model.CartItem Orderitem) {
        this.mOrderitem = Orderitem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.orderitem);
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
        java.lang.String orderitemProName = null;
        java.lang.Double orderitemProTotalPrice = null;
        java.lang.String orderitemProSize = null;
        java.lang.String doubleToStringOrderitemProTotalPrice = null;
        int androidxDatabindingViewDataBindingSafeUnboxOrderitemProTotalQty = 0;
        double androidxDatabindingViewDataBindingSafeUnboxOrderitemProTotalPrice = 0.0;
        java.lang.String doubleToStringOrderitemProTotalPriceJavaLangStringLKR = null;
        java.lang.String orderitemProImage = null;
        java.lang.String integerToStringOrderitemProTotalQty = null;
        java.lang.String orderitemProCode = null;
        tkhub.project.kesbewa.data.model.CartItem orderitem = mOrderitem;
        java.lang.Integer orderitemProTotalQty = null;
        java.lang.String orderitemProColour = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (orderitem != null) {
                    // read orderitem.pro_name
                    orderitemProName = orderitem.getPro_name();
                    // read orderitem.pro_total_price
                    orderitemProTotalPrice = orderitem.getPro_total_price();
                    // read orderitem.pro_size
                    orderitemProSize = orderitem.getPro_size();
                    // read orderitem.pro_image
                    orderitemProImage = orderitem.getPro_image();
                    // read orderitem.pro_code
                    orderitemProCode = orderitem.getPro_code();
                    // read orderitem.pro_total_qty
                    orderitemProTotalQty = orderitem.getPro_total_qty();
                    // read orderitem.pro_colour
                    orderitemProColour = orderitem.getPro_colour();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(orderitem.pro_total_price)
                androidxDatabindingViewDataBindingSafeUnboxOrderitemProTotalPrice = androidx.databinding.ViewDataBinding.safeUnbox(orderitemProTotalPrice);
                // read androidx.databinding.ViewDataBinding.safeUnbox(orderitem.pro_total_qty)
                androidxDatabindingViewDataBindingSafeUnboxOrderitemProTotalQty = androidx.databinding.ViewDataBinding.safeUnbox(orderitemProTotalQty);


                // read Double.toString(androidx.databinding.ViewDataBinding.safeUnbox(orderitem.pro_total_price))
                doubleToStringOrderitemProTotalPrice = java.lang.Double.toString(androidxDatabindingViewDataBindingSafeUnboxOrderitemProTotalPrice);
                // read Integer.toString(androidx.databinding.ViewDataBinding.safeUnbox(orderitem.pro_total_qty))
                integerToStringOrderitemProTotalQty = java.lang.Integer.toString(androidxDatabindingViewDataBindingSafeUnboxOrderitemProTotalQty);


                // read (Double.toString(androidx.databinding.ViewDataBinding.safeUnbox(orderitem.pro_total_price))) + (" LKR")
                doubleToStringOrderitemProTotalPriceJavaLangStringLKR = (doubleToStringOrderitemProTotalPrice) + (" LKR");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appCompatTextView14, doubleToStringOrderitemProTotalPriceJavaLangStringLKR);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.setOrderHistoryItemImage(this.imgCartProduct, orderitemProImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview1, orderitemProName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview11, orderitemProCode);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview3, orderitemProSize);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview5, orderitemProColour);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview7, integerToStringOrderitemProTotalQty);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): orderitem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}