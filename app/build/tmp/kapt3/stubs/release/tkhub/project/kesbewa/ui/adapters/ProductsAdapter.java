package tkhub.project.kesbewa.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Ltkhub/project/kesbewa/ui/adapters/ProductsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Ltkhub/project/kesbewa/data/model/Products;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "mClickListener", "Ltkhub/project/kesbewa/ui/adapters/ProductsAdapter$ClickListener;", "getMClickListener", "()Ltkhub/project/kesbewa/ui/adapters/ProductsAdapter$ClickListener;", "setMClickListener", "(Ltkhub/project/kesbewa/ui/adapters/ProductsAdapter$ClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "aClickListener", "ClickListener", "ProductsViewHolder", "app_release"})
public final class ProductsAdapter extends androidx.recyclerview.widget.ListAdapter<tkhub.project.kesbewa.data.model.Products, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public tkhub.project.kesbewa.ui.adapters.ProductsAdapter.ClickListener mClickListener;
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.ui.adapters.ProductsAdapter.ClickListener getMClickListener() {
        return null;
    }
    
    public final void setMClickListener(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.ui.adapters.ProductsAdapter.ClickListener p0) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.ui.adapters.ProductsAdapter.ClickListener aClickListener) {
    }
    
    public ProductsAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Ltkhub/project/kesbewa/ui/adapters/ProductsAdapter$ClickListener;", "", "onClick", "", "selectedProduct", "Ltkhub/project/kesbewa/data/model/Products;", "aView", "Landroid/view/View;", "app_release"})
    public static abstract interface ClickListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        tkhub.project.kesbewa.data.model.Products selectedProduct, @org.jetbrains.annotations.NotNull()
        android.view.View aView);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Ltkhub/project/kesbewa/ui/adapters/ProductsAdapter$ProductsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Ltkhub/project/kesbewa/databinding/ListviewProductsBinding;", "mClickListener", "Ltkhub/project/kesbewa/ui/adapters/ProductsAdapter$ClickListener;", "(Ltkhub/project/kesbewa/databinding/ListviewProductsBinding;Ltkhub/project/kesbewa/ui/adapters/ProductsAdapter$ClickListener;)V", "getMClickListener", "()Ltkhub/project/kesbewa/ui/adapters/ProductsAdapter$ClickListener;", "setMClickListener", "(Ltkhub/project/kesbewa/ui/adapters/ProductsAdapter$ClickListener;)V", "bind", "", "products", "Ltkhub/project/kesbewa/data/model/Products;", "app_release"})
    public static final class ProductsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final tkhub.project.kesbewa.databinding.ListviewProductsBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private tkhub.project.kesbewa.ui.adapters.ProductsAdapter.ClickListener mClickListener;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        tkhub.project.kesbewa.data.model.Products products) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final tkhub.project.kesbewa.ui.adapters.ProductsAdapter.ClickListener getMClickListener() {
            return null;
        }
        
        public final void setMClickListener(@org.jetbrains.annotations.NotNull()
        tkhub.project.kesbewa.ui.adapters.ProductsAdapter.ClickListener p0) {
        }
        
        public ProductsViewHolder(@org.jetbrains.annotations.NotNull()
        tkhub.project.kesbewa.databinding.ListviewProductsBinding binding, @org.jetbrains.annotations.NotNull()
        tkhub.project.kesbewa.ui.adapters.ProductsAdapter.ClickListener mClickListener) {
            super(null);
        }
    }
}