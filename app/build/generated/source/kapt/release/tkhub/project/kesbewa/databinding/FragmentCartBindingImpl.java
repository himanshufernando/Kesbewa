package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCartBindingImpl extends FragmentCartBinding implements tkhub.project.kesbewa.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout2, 5);
        sViewsWithIds.put(R.id.imageview_navigation, 6);
        sViewsWithIds.put(R.id.textView, 7);
        sViewsWithIds.put(R.id.textview_titel_1, 8);
        sViewsWithIds.put(R.id.recyclerView_cart_items, 9);
        sViewsWithIds.put(R.id.constraintLayout3, 10);
        sViewsWithIds.put(R.id.divider, 11);
        sViewsWithIds.put(R.id.textview3, 12);
        sViewsWithIds.put(R.id.divider2, 13);
        sViewsWithIds.put(R.id.constraintLayout7, 14);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentCartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            );
        this.constraintLayout6.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textview1.setTag(null);
        this.textview2.setTag(null);
        this.textview5.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new tkhub.project.kesbewa.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.cart_details == variableId) {
            setCartDetails((tkhub.project.kesbewa.viewmodels.cart.CartViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCartDetails(@Nullable tkhub.project.kesbewa.viewmodels.cart.CartViewModel CartDetails) {
        this.mCartDetails = CartDetails;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.cart_details);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCartDetailsTextSubTotal((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeCartDetailsTextItemCount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCartDetailsTextSubTotal(androidx.databinding.ObservableField<java.lang.String> CartDetailsTextSubTotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCartDetailsTextItemCount(androidx.databinding.ObservableField<java.lang.String> CartDetailsTextItemCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        androidx.databinding.ObservableField<java.lang.String> cartDetailsTextSubTotal = null;
        tkhub.project.kesbewa.viewmodels.cart.CartViewModel cartDetails = mCartDetails;
        java.lang.String cartDetailsTextItemCountGet = null;
        androidx.databinding.ObservableField<java.lang.String> cartDetailsTextItemCount = null;
        java.lang.String cartDetailsTextSubTotalGet = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (cartDetails != null) {
                        // read cart_details.textSubTotal
                        cartDetailsTextSubTotal = cartDetails.getTextSubTotal();
                    }
                    updateRegistration(0, cartDetailsTextSubTotal);


                    if (cartDetailsTextSubTotal != null) {
                        // read cart_details.textSubTotal.get()
                        cartDetailsTextSubTotalGet = cartDetailsTextSubTotal.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (cartDetails != null) {
                        // read cart_details.textItemCount
                        cartDetailsTextItemCount = cartDetails.getTextItemCount();
                    }
                    updateRegistration(1, cartDetailsTextItemCount);


                    if (cartDetailsTextItemCount != null) {
                        // read cart_details.textItemCount.get()
                        cartDetailsTextItemCountGet = cartDetailsTextItemCount.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.constraintLayout6.setOnClickListener(mCallback7);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview1, cartDetailsTextItemCountGet);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview2, cartDetailsTextSubTotalGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview5, cartDetailsTextSubTotalGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // cart_details
        tkhub.project.kesbewa.viewmodels.cart.CartViewModel cartDetails = mCartDetails;
        // cart_details != null
        boolean cartDetailsJavaLangObjectNull = false;



        cartDetailsJavaLangObjectNull = (cartDetails) != (null);
        if (cartDetailsJavaLangObjectNull) {



            cartDetails.goToCheckOut(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): cart_details.textSubTotal
        flag 1 (0x2L): cart_details.textItemCount
        flag 2 (0x3L): cart_details
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}