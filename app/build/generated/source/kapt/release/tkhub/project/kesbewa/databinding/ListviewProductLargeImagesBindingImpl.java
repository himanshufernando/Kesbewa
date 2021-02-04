package tkhub.project.kesbewa.databinding;
import tkhub.project.kesbewa.R;
import tkhub.project.kesbewa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListviewProductLargeImagesBindingImpl extends ListviewProductLargeImagesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mkloader_itemproduct, 3);
        sViewsWithIds.put(R.id.txt_1, 4);
        sViewsWithIds.put(R.id.cl_pro_image_right, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListviewProductLargeImagesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ListviewProductLargeImagesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (com.tuyenmonkey.mkloader.MKLoader) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            );
        this.imageViewProductImage.setTag(null);
        this.imageViewProductImageBackground.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.item == variableId) {
            setItem((tkhub.project.kesbewa.data.model.ProductImage) variable);
        }
        else if (BR.scrollChangeListener == variableId) {
            setScrollChangeListener((android.view.View.OnScrollChangeListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setItem(@Nullable tkhub.project.kesbewa.data.model.ProductImage Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setScrollChangeListener(@Nullable android.view.View.OnScrollChangeListener ScrollChangeListener) {
        this.mScrollChangeListener = ScrollChangeListener;
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
        android.view.View.OnClickListener clickListener = mClickListener;
        tkhub.project.kesbewa.data.model.ProductImage item = mItem;
        java.lang.String itemImgUrl = null;

        if ((dirtyFlags & 0x9L) != 0) {
        }
        if ((dirtyFlags & 0xaL) != 0) {



                if (item != null) {
                    // read item.img_url
                    itemImgUrl = item.getImg_url();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.img_url(this.imageViewProductImage, itemImgUrl);
            tkhub.project.kesbewa.ui.adapters.CustomBindingAdapter.img_url_cover(this.imageViewProductImageBackground, itemImgUrl);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(clickListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clickListener
        flag 1 (0x2L): item
        flag 2 (0x3L): scrollChangeListener
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}