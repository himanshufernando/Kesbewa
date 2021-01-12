package tkhub.project.kesbewa.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020+H\u0002J\u0010\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020+H\u0002J&\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020+H\u0016J\b\u0010:\u001a\u00020+H\u0016J\u001a\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u0002022\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u0010=\u001a\u00020+H\u0002J\u0018\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020+H\u0002J\b\u0010D\u001a\u00020+H\u0002J\b\u0010E\u001a\u00020+H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010\'\u00a8\u0006F"}, d2 = {"Ltkhub/project/kesbewa/ui/fragment/CartFragment;", "Landroidx/fragment/app/Fragment;", "()V", "activityScope", "Lkotlinx/coroutines/CoroutineScope;", "getActivityScope", "()Lkotlinx/coroutines/CoroutineScope;", "adapter", "Ltkhub/project/kesbewa/ui/adapters/CartItemAdapter;", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "getAlertDialog", "()Landroidx/appcompat/app/AlertDialog;", "setAlertDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "binding", "Ltkhub/project/kesbewa/databinding/FragmentCartBinding;", "getBinding", "()Ltkhub/project/kesbewa/databinding/FragmentCartBinding;", "setBinding", "(Ltkhub/project/kesbewa/databinding/FragmentCartBinding;)V", "dialogStockProductQty", "Landroid/app/Dialog;", "getDialogStockProductQty", "()Landroid/app/Dialog;", "setDialogStockProductQty", "(Landroid/app/Dialog;)V", "selectedCartItem", "Ltkhub/project/kesbewa/data/model/CartItem;", "getSelectedCartItem", "()Ltkhub/project/kesbewa/data/model/CartItem;", "setSelectedCartItem", "(Ltkhub/project/kesbewa/data/model/CartItem;)V", "singUpDialog", "getSingUpDialog", "setSingUpDialog", "viewmodel", "Ltkhub/project/kesbewa/viewmodels/cart/CartViewModel;", "getViewmodel", "()Ltkhub/project/kesbewa/viewmodels/cart/CartViewModel;", "viewmodel$delegate", "Lkotlin/Lazy;", "cartItemsObserver", "", "dialogProductQty", "errorAlertDialog", "networkError", "Ltkhub/project/kesbewa/data/model/NetworkError;", "goToRegistor", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onStop", "onViewCreated", "view", "removeCartObserver", "setWindowFlag", "bits", "", "on", "", "trasperat", "updateCartObserver", "userTypeCheckObserver", "app_release"})
public final class CartFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public tkhub.project.kesbewa.databinding.FragmentCartBinding binding;
    private final kotlin.Lazy viewmodel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog alertDialog;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog singUpDialog;
    private final tkhub.project.kesbewa.ui.adapters.CartItemAdapter adapter = null;
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog dialogStockProductQty;
    @org.jetbrains.annotations.NotNull()
    public tkhub.project.kesbewa.data.model.CartItem selectedCartItem;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope activityScope = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.databinding.FragmentCartBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.databinding.FragmentCartBinding p0) {
    }
    
    private final tkhub.project.kesbewa.viewmodels.cart.CartViewModel getViewmodel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AlertDialog getAlertDialog() {
        return null;
    }
    
    public final void setAlertDialog(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AlertDialog getSingUpDialog() {
        return null;
    }
    
    public final void setSingUpDialog(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Dialog getDialogStockProductQty() {
        return null;
    }
    
    public final void setDialogStockProductQty(@org.jetbrains.annotations.NotNull()
    android.app.Dialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.CartItem getSelectedCartItem() {
        return null;
    }
    
    public final void setSelectedCartItem(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.CartItem p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getActivityScope() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    private final void cartItemsObserver() {
    }
    
    private final void removeCartObserver() {
    }
    
    private final void updateCartObserver() {
    }
    
    private final void userTypeCheckObserver() {
    }
    
    private final void goToRegistor() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void errorAlertDialog(tkhub.project.kesbewa.data.model.NetworkError networkError) {
    }
    
    private final void dialogProductQty() {
    }
    
    private final void trasperat() {
    }
    
    private final void setWindowFlag(int bits, boolean on) {
    }
    
    public CartFragment() {
        super();
    }
}