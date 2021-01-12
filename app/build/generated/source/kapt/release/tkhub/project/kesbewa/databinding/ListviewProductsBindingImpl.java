package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListviewProductsBindingImpl extends ListviewProductsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintlayout_1, 8);
        sViewsWithIds.put(R.id.relativeLayout_coverimage, 9);
        sViewsWithIds.put(R.id.mkloader_itemproduct, 10);
        sViewsWithIds.put(R.id.txt_1, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListviewProductsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ListviewProductsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (com.tuyenmonkey.mkloader.MKLoader) bindings[10]
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            );
        this.cardViewDealerToVisits.setTag(null);
        this.imgHomeTeacher.setTag(null);
        this.textviewDiscount.setTag(null);
        this.textviewHomeCode.setTag(null);
        this.textviewHomePromake.setTag(null);
        this.textviewHomeProname.setTag(null);
        this.textviewHomeRegprice.setTag(null);
        this.textviewHomeTeacherclass.setTag(null);
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
        if (BR.item == variableId) {
            setItem((tkhub.project.kesbewa.data.model.Products) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable tkhub.project.kesbewa.data.model.Products Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
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
        tkhub.project.kesbewa.data.model.Products item = mItem;
        java.lang.String doubleToStringItemProPriceJavaLangStringLKR = null;
        java.lang.String doubleToStringItemProPrice = null;
        android.view.View.OnClickListener clickListener = mClickListener;
        java.lang.String itemProName = null;
        java.lang.String itemProCode = null;
        java.lang.String itemProMake = null;
        double itemProPrice = 0.0;

        if ((dirtyFlags & 0x5L) != 0) {



                if (item != null) {
                    // read item.pro_name
                    itemProName = item.getPro_name();
                    // read item.pro_code
                    itemProCode = item.getPro_code();
                    // read item.pro_make
                    itemProMake = item.getPro_make();
                    // read item.pro_price
                    itemProPrice = item.getPro_price();
                }


                // read Double.toString(item.pro_price)
                doubleToStringItemProPrice = java.lang.Double.toString(itemProPrice);


                // read (Double.toString(item.pro_price)) + (" LKR")
                doubleToStringItemProPriceJavaLangStringLKR = (doubleToStringItemProPrice) + (" LKR");
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.cardViewDealerToVisits.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.pro_cover_img(this.imgHomeTeacher, item);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.setRegularPriceDiscount(this.textviewDiscount, item);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textviewHomeCode, itemProCode);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textviewHomePromake, itemProMake);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textviewHomeProname, itemProName);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.setRegularPrice(this.textviewHomeRegprice, item);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textviewHomeTeacherclass, doubleToStringItemProPriceJavaLangStringLKR);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}