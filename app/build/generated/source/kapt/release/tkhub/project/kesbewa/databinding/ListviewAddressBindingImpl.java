package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListviewAddressBindingImpl extends ListviewAddressBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListviewAddressBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ListviewAddressBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            );
        this.cardViewDealerToVisits.setTag(null);
        this.constraintLayout10.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.textview1.setTag(null);
        this.textview2.setTag(null);
        this.textview3.setTag(null);
        this.textview4.setTag(null);
        this.textview5.setTag(null);
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
        if (BR.addresItem == variableId) {
            setAddresItem((tkhub.project.kesbewa.data.model.DeliveryAddress) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAddresItem(@Nullable tkhub.project.kesbewa.data.model.DeliveryAddress AddresItem) {
        this.mAddresItem = AddresItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.addresItem);
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
        tkhub.project.kesbewa.data.model.DeliveryAddress addresItem = mAddresItem;
        java.lang.String addresItemUserAddressNumber = null;
        java.lang.String addresItemUserAddressTwo = null;
        java.lang.String addresItemUserAddressCity = null;
        android.view.View.OnClickListener clickListener = mClickListener;
        java.lang.String addresItemUserAddressDistrict = null;
        java.lang.String addresItemUserAddressOne = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (addresItem != null) {
                    // read addresItem.user_address_number
                    addresItemUserAddressNumber = addresItem.getUser_address_number();
                    // read addresItem.user_address_two
                    addresItemUserAddressTwo = addresItem.getUser_address_two();
                    // read addresItem.user_address_city
                    addresItemUserAddressCity = addresItem.getUser_address_city();
                    // read addresItem.user_address_district
                    addresItemUserAddressDistrict = addresItem.getUser_address_district();
                    // read addresItem.user_address_one
                    addresItemUserAddressOne = addresItem.getUser_address_one();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.constraintLayout10.setOnClickListener(clickListener);
            this.mboundView1.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.select_address(this.mboundView3, addresItem);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview1, addresItemUserAddressNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview2, addresItemUserAddressOne);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.user_address_two(this.textview3, addresItemUserAddressTwo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview4, addresItemUserAddressCity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview5, addresItemUserAddressDistrict);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): addresItem
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}