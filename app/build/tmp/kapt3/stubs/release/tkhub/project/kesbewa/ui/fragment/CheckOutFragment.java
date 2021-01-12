package tkhub.project.kesbewa.ui.fragment;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020-H\u0002J\b\u00100\u001a\u00020-H\u0002J\u0010\u00101\u001a\u00020-2\u0006\u00102\u001a\u000203H\u0002J&\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u00020-H\u0016J\b\u0010=\u001a\u00020-H\u0016J\b\u0010>\u001a\u00020-H\u0002J\b\u0010?\u001a\u00020-H\u0002J\b\u0010@\u001a\u00020-H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001b\u0010&\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)\u00a8\u0006A"}, d2 = {"Ltkhub/project/kesbewa/ui/fragment/CheckOutFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Ltkhub/project/kesbewa/ui/adapters/CheckouttemAdapter;", "alertDialogError", "Landroidx/appcompat/app/AlertDialog;", "getAlertDialogError", "()Landroidx/appcompat/app/AlertDialog;", "setAlertDialogError", "(Landroidx/appcompat/app/AlertDialog;)V", "alertDialogSuccess", "getAlertDialogSuccess", "setAlertDialogSuccess", "appPrefs", "Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "getAppPrefs", "()Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "setAppPrefs", "(Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;)V", "binding", "Ltkhub/project/kesbewa/databinding/FragmentCheckOutBinding;", "getBinding", "()Ltkhub/project/kesbewa/databinding/FragmentCheckOutBinding;", "setBinding", "(Ltkhub/project/kesbewa/databinding/FragmentCheckOutBinding;)V", "dialogAddNote", "Landroid/app/Dialog;", "getDialogAddNote", "()Landroid/app/Dialog;", "setDialogAddNote", "(Landroid/app/Dialog;)V", "dispatch", "", "getDispatch", "()Ljava/lang/String;", "setDispatch", "(Ljava/lang/String;)V", "viewmodel", "Ltkhub/project/kesbewa/viewmodels/checkout/CheckoutViewModel;", "getViewmodel", "()Ltkhub/project/kesbewa/viewmodels/checkout/CheckoutViewModel;", "viewmodel$delegate", "Lkotlin/Lazy;", "addNote", "", "calculateFinalTotalCallResponseObserver", "cartItemscheckOutObserver", "deliveryChargesObserver", "errorAlertDialog", "networkError", "Ltkhub/project/kesbewa/data/model/NetworkError;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onStop", "orderProcessObserver", "successAlertDialog", "userDeliveryAddressObserver", "app_release"})
public final class CheckOutFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public tkhub.project.kesbewa.databinding.FragmentCheckOutBinding binding;
    private final kotlin.Lazy viewmodel$delegate = null;
    private final tkhub.project.kesbewa.ui.adapters.CheckouttemAdapter adapter = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog alertDialogError;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog alertDialogSuccess;
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog dialogAddNote;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.services.Perfrences.AppPrefs appPrefs;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String dispatch;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.databinding.FragmentCheckOutBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.databinding.FragmentCheckOutBinding p0) {
    }
    
    private final tkhub.project.kesbewa.viewmodels.checkout.CheckoutViewModel getViewmodel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AlertDialog getAlertDialogError() {
        return null;
    }
    
    public final void setAlertDialogError(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AlertDialog getAlertDialogSuccess() {
        return null;
    }
    
    public final void setAlertDialogSuccess(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Dialog getDialogAddNote() {
        return null;
    }
    
    public final void setDialogAddNote(@org.jetbrains.annotations.NotNull()
    android.app.Dialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.services.Perfrences.AppPrefs getAppPrefs() {
        return null;
    }
    
    public final void setAppPrefs(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.services.Perfrences.AppPrefs p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDispatch() {
        return null;
    }
    
    public final void setDispatch(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    
    private final void cartItemscheckOutObserver() {
    }
    
    private final void calculateFinalTotalCallResponseObserver() {
    }
    
    private final void orderProcessObserver() {
    }
    
    private final void userDeliveryAddressObserver() {
    }
    
    private final void deliveryChargesObserver() {
    }
    
    private final void successAlertDialog() {
    }
    
    private final void errorAlertDialog(tkhub.project.kesbewa.data.model.NetworkError networkError) {
    }
    
    private final void addNote() {
    }
    
    public CheckOutFragment() {
        super();
    }
}