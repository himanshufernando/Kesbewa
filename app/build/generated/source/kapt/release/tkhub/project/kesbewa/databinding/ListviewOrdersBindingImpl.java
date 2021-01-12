package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListviewOrdersBindingImpl extends ListviewOrdersBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appCompatTextView3, 20);
        sViewsWithIds.put(R.id.appCompatTextView4, 21);
        sViewsWithIds.put(R.id.appCompatTextView6, 22);
        sViewsWithIds.put(R.id.appCompatTextView8, 23);
        sViewsWithIds.put(R.id.appCompatTextView66, 24);
        sViewsWithIds.put(R.id.view_1, 25);
        sViewsWithIds.put(R.id.constraintLayout9, 26);
        sViewsWithIds.put(R.id.guideline_1, 27);
        sViewsWithIds.put(R.id.guideline_2, 28);
        sViewsWithIds.put(R.id.guideline_3, 29);
        sViewsWithIds.put(R.id.imageView2, 30);
    }
    // views
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView1;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView13;
    @NonNull
    private final android.view.View mboundView14;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView16;
    @NonNull
    private final android.view.View mboundView17;
    @NonNull
    private final android.widget.RelativeLayout mboundView18;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView19;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListviewOrdersBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private ListviewOrdersBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[20]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[21]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[22]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[24]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[23]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[26]
            , (androidx.constraintlayout.widget.Guideline) bindings[27]
            , (androidx.constraintlayout.widget.Guideline) bindings[28]
            , (androidx.constraintlayout.widget.Guideline) bindings[29]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[30]
            , (android.widget.ImageView) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[15]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (android.view.View) bindings[25]
            );
        this.appCompatTextView10.setTag(null);
        this.appCompatTextView15.setTag(null);
        this.appCompatTextView155.setTag(null);
        this.appCompatTextView5.setTag(null);
        this.appCompatTextView7.setTag(null);
        this.appCompatTextView77.setTag(null);
        this.appCompatTextView9.setTag(null);
        this.cardViewDealerToVisits.setTag(null);
        this.imageViewCurrentConfirm.setTag(null);
        this.imageViewCurrentDeliverd.setTag(null);
        this.imageViewCurrentPacking.setTag(null);
        this.imageViewCurrentTransit.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatTextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView13 = (androidx.appcompat.widget.AppCompatTextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.view.View) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView16 = (androidx.appcompat.widget.AppCompatTextView) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (android.view.View) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView18 = (android.widget.RelativeLayout) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView19 = (androidx.appcompat.widget.AppCompatTextView) bindings[19];
        this.mboundView19.setTag(null);
        this.recyclerViewOrderItems.setTag(null);
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
        if (BR.orderitems == variableId) {
            setOrderitems((tkhub.project.kesbewa.data.model.OrderRespons) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOrderitems(@Nullable tkhub.project.kesbewa.data.model.OrderRespons Orderitems) {
        this.mOrderitems = Orderitems;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.orderitems);
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
        java.lang.String javaLangStringPayWithOrderitemsOrderPaymentType = null;
        java.lang.String stringValueOfOrderitemsOrderTotalPrice = null;
        java.lang.String stringValueOfOrderitemsOrderStatusNote = null;
        java.util.List<tkhub.project.kesbewa.data.model.CartItem> orderitemsItemlist = null;
        java.lang.String stringValueOfOrderitemsOrderTotalPriceJavaLangStringRS = null;
        int orderitemsOrderTotalQty = 0;
        java.lang.String stringValueOfOrderitemsOrderTotalQty = null;
        java.lang.String orderitemsOrderPaymentType = null;
        int orderitemsOrderStatusCode = 0;
        tkhub.project.kesbewa.data.model.OrderRespons orderitems = mOrderitems;
        android.view.View.OnClickListener clickListener = mClickListener;
        java.lang.String orderitemsOrderCode = null;
        java.lang.String orderitemsOrderDispatchType = null;
        double orderitemsOrderTotalPrice = 0.0;
        java.lang.String orderitemsOrderStatusNote = null;
        long orderitemsOrderDate = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                if (orderitems != null) {
                    // read orderitems.itemlist
                    orderitemsItemlist = orderitems.getItemlist();
                    // read orderitems.order_total_qty
                    orderitemsOrderTotalQty = orderitems.getOrder_total_qty();
                    // read orderitems.order_payment_type
                    orderitemsOrderPaymentType = orderitems.getOrder_payment_type();
                    // read orderitems.order_status_code
                    orderitemsOrderStatusCode = orderitems.getOrder_status_code();
                    // read orderitems.order_code
                    orderitemsOrderCode = orderitems.getOrder_code();
                    // read orderitems.order_dispatch_type
                    orderitemsOrderDispatchType = orderitems.getOrder_dispatch_type();
                    // read orderitems.order_total_price
                    orderitemsOrderTotalPrice = orderitems.getOrder_total_price();
                    // read orderitems.order_status_note
                    orderitemsOrderStatusNote = orderitems.getOrder_status_note();
                    // read orderitems.order_date
                    orderitemsOrderDate = orderitems.getOrder_date();
                }


                // read String.valueOf(orderitems.order_total_qty)
                stringValueOfOrderitemsOrderTotalQty = java.lang.String.valueOf(orderitemsOrderTotalQty);
                // read ("Pay with ") + (orderitems.order_payment_type)
                javaLangStringPayWithOrderitemsOrderPaymentType = ("Pay with ") + (orderitemsOrderPaymentType);
                // read String.valueOf(orderitems.order_total_price)
                stringValueOfOrderitemsOrderTotalPrice = java.lang.String.valueOf(orderitemsOrderTotalPrice);
                // read String.valueOf(orderitems.order_status_note)
                stringValueOfOrderitemsOrderStatusNote = java.lang.String.valueOf(orderitemsOrderStatusNote);


                // read (String.valueOf(orderitems.order_total_price)) + (" RS")
                stringValueOfOrderitemsOrderTotalPriceJavaLangStringRS = (stringValueOfOrderitemsOrderTotalPrice) + (" RS");
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appCompatTextView10, javaLangStringPayWithOrderitemsOrderPaymentType);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.setOrderDispatchDate(this.appCompatTextView15, orderitemsOrderDispatchType);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.setOrderDispatchType(this.appCompatTextView155, orderitems);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.setTimeStampToString(this.appCompatTextView5, orderitemsOrderDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appCompatTextView7, stringValueOfOrderitemsOrderTotalQty);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appCompatTextView77, orderitemsOrderDispatchType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appCompatTextView9, stringValueOfOrderitemsOrderTotalPriceJavaLangStringRS);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.setStatusToConfirm(this.imageViewCurrentConfirm, orderitemsOrderStatusCode);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.setStatusToDelivered(this.imageViewCurrentDeliverd, orderitems);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.setStatusToPacking(this.imageViewCurrentPacking, orderitemsOrderStatusCode);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.setStatusToTransit(this.imageViewCurrentTransit, orderitems);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, orderitemsOrderCode);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.setTextToTransit(this.mboundView13, orderitems);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.setDeliveredView(this.mboundView14, orderitems);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.setTextToDelivered(this.mboundView16, orderitems);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.setDeliveredView(this.mboundView17, orderitems);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.setRejectStatus(this.mboundView18, orderitemsOrderStatusCode);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView19, stringValueOfOrderitemsOrderStatusNote);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.setCurrentItems(this.recyclerViewOrderItems, orderitemsItemlist);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.cardViewDealerToVisits.setOnClickListener(clickListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): orderitems
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}