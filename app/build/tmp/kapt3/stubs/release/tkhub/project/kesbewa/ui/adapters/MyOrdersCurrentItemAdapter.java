package tkhub.project.kesbewa.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Ltkhub/project/kesbewa/ui/adapters/MyOrdersCurrentItemAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Ltkhub/project/kesbewa/data/model/CartItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "Ltkhub/project/kesbewa/ui/adapters/MyOrdersCurrentItemAdapter$MyOrdersCurrentItemViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "MyOrdersCurrentItemViewHolder", "app_release"})
public final class MyOrdersCurrentItemAdapter extends androidx.recyclerview.widget.ListAdapter<tkhub.project.kesbewa.data.model.CartItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public tkhub.project.kesbewa.ui.adapters.MyOrdersCurrentItemAdapter.MyOrdersCurrentItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public MyOrdersCurrentItemAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Ltkhub/project/kesbewa/ui/adapters/MyOrdersCurrentItemAdapter$MyOrdersCurrentItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Ltkhub/project/kesbewa/databinding/ListviewHistoryOrderItemBinding;", "(Ltkhub/project/kesbewa/databinding/ListviewHistoryOrderItemBinding;)V", "bind", "", "cartItem", "Ltkhub/project/kesbewa/data/model/CartItem;", "app_release"})
    public static final class MyOrdersCurrentItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final tkhub.project.kesbewa.databinding.ListviewHistoryOrderItemBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        tkhub.project.kesbewa.data.model.CartItem cartItem) {
        }
        
        public MyOrdersCurrentItemViewHolder(@org.jetbrains.annotations.NotNull()
        tkhub.project.kesbewa.databinding.ListviewHistoryOrderItemBinding binding) {
            super(null);
        }
    }
}