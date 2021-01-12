package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListviewOrdersPastBindingImpl extends ListviewOrdersPastBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appCompatTextView3, 7);
        sViewsWithIds.put(R.id.appCompatTextView4, 8);
        sViewsWithIds.put(R.id.appCompatTextView6, 9);
        sViewsWithIds.put(R.id.appCompatTextView8, 10);
        sViewsWithIds.put(R.id.appCompatTextView10, 11);
    }
    // views
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListviewOrdersPastBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ListviewOrdersPastBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            );
        this.appCompatTextView11.setTag(null);
        this.appCompatTextView5.setTag(null);
        this.appCompatTextView7.setTag(null);
        this.appCompatTextView9.setTag(null);
        this.cardViewDealerToVisits.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatTextView) bindings[1];
        this.mboundView1.setTag(null);
        this.recyclerViewOrderItems.setTag(null);
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
        if (BR.pastorderitems == variableId) {
            setPastorderitems((tkhub.project.kesbewa.data.model.OrderRespons) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPastorderitems(@Nullable tkhub.project.kesbewa.data.model.OrderRespons Pastorderitems) {
        this.mPastorderitems = Pastorderitems;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.pastorderitems);
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
        java.lang.String stringValueOfPastorderitemsOrderTotalQty = null;
        long pastorderitemsOrderDate = 0;
        java.util.List<tkhub.project.kesbewa.data.model.CartItem> pastorderitemsItemlist = null;
        tkhub.project.kesbewa.data.model.OrderRespons pastorderitems = mPastorderitems;
        int pastorderitemsOrderTotalQty = 0;
        java.lang.String stringValueOfPastorderitemsOrderTotalPrice = null;
        java.lang.String pastorderitemsOrderPaymentType = null;
        double pastorderitemsOrderTotalPrice = 0.0;
        java.lang.String stringValueOfPastorderitemsOrderPaymentType = null;
        java.lang.String stringValueOfPastorderitemsOrderTotalPriceJavaLangStringRS = null;
        java.lang.String pastorderitemsOrderCode = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (pastorderitems != null) {
                    // read pastorderitems.order_date
                    pastorderitemsOrderDate = pastorderitems.getOrder_date();
                    // read pastorderitems.itemlist
                    pastorderitemsItemlist = pastorderitems.getItemlist();
                    // read pastorderitems.order_total_qty
                    pastorderitemsOrderTotalQty = pastorderitems.getOrder_total_qty();
                    // read pastorderitems.order_payment_type
                    pastorderitemsOrderPaymentType = pastorderitems.getOrder_payment_type();
                    // read pastorderitems.order_total_price
                    pastorderitemsOrderTotalPrice = pastorderitems.getOrder_total_price();
                    // read pastorderitems.order_code
                    pastorderitemsOrderCode = pastorderitems.getOrder_code();
                }


                // read String.valueOf(pastorderitems.order_total_qty)
                stringValueOfPastorderitemsOrderTotalQty = java.lang.String.valueOf(pastorderitemsOrderTotalQty);
                // read String.valueOf(pastorderitems.order_payment_type)
                stringValueOfPastorderitemsOrderPaymentType = java.lang.String.valueOf(pastorderitemsOrderPaymentType);
                // read String.valueOf(pastorderitems.order_total_price)
                stringValueOfPastorderitemsOrderTotalPrice = java.lang.String.valueOf(pastorderitemsOrderTotalPrice);


                // read (String.valueOf(pastorderitems.order_total_price)) + (" RS")
                stringValueOfPastorderitemsOrderTotalPriceJavaLangStringRS = (stringValueOfPastorderitemsOrderTotalPrice) + (" RS");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appCompatTextView11, stringValueOfPastorderitemsOrderPaymentType);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.setTimeStampToString(this.appCompatTextView5, pastorderitemsOrderDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appCompatTextView7, stringValueOfPastorderitemsOrderTotalQty);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appCompatTextView9, stringValueOfPastorderitemsOrderTotalPriceJavaLangStringRS);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, pastorderitemsOrderCode);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.setCurrentItems(this.recyclerViewOrderItems, pastorderitemsItemlist);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): pastorderitems
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}