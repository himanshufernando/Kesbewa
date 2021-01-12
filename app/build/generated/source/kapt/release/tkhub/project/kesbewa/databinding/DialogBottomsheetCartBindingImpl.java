package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogBottomsheetCartBindingImpl extends DialogBottomsheetCartBinding implements tkhub.project.kesbewa.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout, 5);
        sViewsWithIds.put(R.id.constraintLayout_titel, 6);
        sViewsWithIds.put(R.id.textView3, 7);
        sViewsWithIds.put(R.id.constraint_layout, 8);
        sViewsWithIds.put(R.id.recyclerView_product_size, 9);
        sViewsWithIds.put(R.id.constraint_layout_selected_size, 10);
        sViewsWithIds.put(R.id.textview_selected_size, 11);
        sViewsWithIds.put(R.id.textView4, 12);
        sViewsWithIds.put(R.id.constraint_layout_color, 13);
        sViewsWithIds.put(R.id.recyclerView_product_color, 14);
        sViewsWithIds.put(R.id.constraint_layout_parent_selected_color, 15);
        sViewsWithIds.put(R.id.constraint_layout_selected_color, 16);
        sViewsWithIds.put(R.id.textView5, 17);
        sViewsWithIds.put(R.id.constraint_layout_quantity, 18);
        sViewsWithIds.put(R.id.textview_qty_layout, 19);
        sViewsWithIds.put(R.id.textview_addtocart, 20);
    }
    // views
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView1;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView2;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView3;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of productdetailsbottomsheet.textProductQty.get()
            //         is productdetailsbottomsheet.textProductQty.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // productdetailsbottomsheet.textProductQty.get()
            java.lang.String productdetailsbottomsheetTextProductQtyGet = null;
            // productdetailsbottomsheet.textProductQty != null
            boolean productdetailsbottomsheetTextProductQtyJavaLangObjectNull = false;
            // productdetailsbottomsheet != null
            boolean productdetailsbottomsheetJavaLangObjectNull = false;
            // productdetailsbottomsheet.textProductQty
            androidx.databinding.ObservableField<java.lang.String> productdetailsbottomsheetTextProductQty = null;
            // productdetailsbottomsheet
            tkhub.project.kesbewa.viewmodels.home.HomeViewModel productdetailsbottomsheet = mProductdetailsbottomsheet;



            productdetailsbottomsheetJavaLangObjectNull = (productdetailsbottomsheet) != (null);
            if (productdetailsbottomsheetJavaLangObjectNull) {


                productdetailsbottomsheetTextProductQty = productdetailsbottomsheet.getTextProductQty();

                productdetailsbottomsheetTextProductQtyJavaLangObjectNull = (productdetailsbottomsheetTextProductQty) != (null);
                if (productdetailsbottomsheetTextProductQtyJavaLangObjectNull) {




                    productdetailsbottomsheetTextProductQty.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public DialogBottomsheetCartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private DialogBottomsheetCartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[17]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[20]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            );
        this.bottomSheetLayout.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatTextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (androidx.appcompat.widget.AppCompatTextView) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new tkhub.project.kesbewa.generated.callback.OnClickListener(this, 2);
        mCallback3 = new tkhub.project.kesbewa.generated.callback.OnClickListener(this, 1);
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
        if (BR.productdetailsbottomsheet == variableId) {
            setProductdetailsbottomsheet((tkhub.project.kesbewa.viewmodels.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProductdetailsbottomsheet(@Nullable tkhub.project.kesbewa.viewmodels.home.HomeViewModel Productdetailsbottomsheet) {
        this.mProductdetailsbottomsheet = Productdetailsbottomsheet;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.productdetailsbottomsheet);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProductdetailsbottomsheetTextProductQty((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeProductdetailsbottomsheetTotalAmount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProductdetailsbottomsheetTextProductQty(androidx.databinding.ObservableField<java.lang.String> ProductdetailsbottomsheetTextProductQty, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProductdetailsbottomsheetTotalAmount(androidx.databinding.ObservableField<java.lang.String> ProductdetailsbottomsheetTotalAmount, int fieldId) {
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
        java.lang.String productdetailsbottomsheetTotalAmountGet = null;
        androidx.databinding.ObservableField<java.lang.String> productdetailsbottomsheetTextProductQty = null;
        tkhub.project.kesbewa.viewmodels.home.HomeViewModel productdetailsbottomsheet = mProductdetailsbottomsheet;
        androidx.databinding.ObservableField<java.lang.String> productdetailsbottomsheetTotalAmount = null;
        java.lang.String productdetailsbottomsheetTotalAmountJavaLangStringLKR = null;
        java.lang.String productdetailsbottomsheetTextProductQtyGet = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (productdetailsbottomsheet != null) {
                        // read productdetailsbottomsheet.textProductQty
                        productdetailsbottomsheetTextProductQty = productdetailsbottomsheet.getTextProductQty();
                    }
                    updateRegistration(0, productdetailsbottomsheetTextProductQty);


                    if (productdetailsbottomsheetTextProductQty != null) {
                        // read productdetailsbottomsheet.textProductQty.get()
                        productdetailsbottomsheetTextProductQtyGet = productdetailsbottomsheetTextProductQty.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (productdetailsbottomsheet != null) {
                        // read productdetailsbottomsheet.totalAmount
                        productdetailsbottomsheetTotalAmount = productdetailsbottomsheet.getTotalAmount();
                    }
                    updateRegistration(1, productdetailsbottomsheetTotalAmount);


                    if (productdetailsbottomsheetTotalAmount != null) {
                        // read productdetailsbottomsheet.totalAmount.get()
                        productdetailsbottomsheetTotalAmountGet = productdetailsbottomsheetTotalAmount.get();
                    }


                    // read (productdetailsbottomsheet.totalAmount.get()) + (" LKR")
                    productdetailsbottomsheetTotalAmountJavaLangStringLKR = (productdetailsbottomsheetTotalAmountGet) + (" LKR");
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, productdetailsbottomsheetTotalAmountJavaLangStringLKR);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback3);
            this.mboundView3.setOnClickListener(mCallback4);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, productdetailsbottomsheetTextProductQtyGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // productdetailsbottomsheet != null
                boolean productdetailsbottomsheetJavaLangObjectNull = false;
                // productdetailsbottomsheet
                tkhub.project.kesbewa.viewmodels.home.HomeViewModel productdetailsbottomsheet = mProductdetailsbottomsheet;



                productdetailsbottomsheetJavaLangObjectNull = (productdetailsbottomsheet) != (null);
                if (productdetailsbottomsheetJavaLangObjectNull) {


                    productdetailsbottomsheet.quantityPlus();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // productdetailsbottomsheet != null
                boolean productdetailsbottomsheetJavaLangObjectNull = false;
                // productdetailsbottomsheet
                tkhub.project.kesbewa.viewmodels.home.HomeViewModel productdetailsbottomsheet = mProductdetailsbottomsheet;



                productdetailsbottomsheetJavaLangObjectNull = (productdetailsbottomsheet) != (null);
                if (productdetailsbottomsheetJavaLangObjectNull) {


                    productdetailsbottomsheet.quantityMinus();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): productdetailsbottomsheet.textProductQty
        flag 1 (0x2L): productdetailsbottomsheet.totalAmount
        flag 2 (0x3L): productdetailsbottomsheet
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}