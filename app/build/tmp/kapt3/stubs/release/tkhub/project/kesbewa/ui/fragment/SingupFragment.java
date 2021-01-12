package tkhub.project.kesbewa.ui.fragment;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/H\u0016J&\u00100\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020*H\u0016J\u001a\u00108\u001a\u00020*2\u0006\u00109\u001a\u00020/2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u0010:\u001a\u00020*H\u0002J\u0010\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020,H\u0002J\u0018\u0010=\u001a\u00020*2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u001dH\u0002J\b\u0010A\u001a\u00020*H\u0002J\b\u0010B\u001a\u00020*H\u0002J\b\u0010C\u001a\u00020*H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010(\u001a\u0004\b%\u0010&\u00a8\u0006D"}, d2 = {"Ltkhub/project/kesbewa/ui/fragment/SingupFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "()V", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "getAlertDialog", "()Landroidx/appcompat/app/AlertDialog;", "setAlertDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "appPref", "Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "getAppPref", "()Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "setAppPref", "(Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;)V", "binding", "Ltkhub/project/kesbewa/databinding/FragmentSingupBinding;", "getBinding", "()Ltkhub/project/kesbewa/databinding/FragmentSingupBinding;", "setBinding", "(Ltkhub/project/kesbewa/databinding/FragmentSingupBinding;)V", "dialogTermsConditions", "Landroid/app/Dialog;", "getDialogTermsConditions", "()Landroid/app/Dialog;", "setDialogTermsConditions", "(Landroid/app/Dialog;)V", "isConfrimPasswordShow", "", "()Z", "setConfrimPasswordShow", "(Z)V", "isPasswordShow", "setPasswordShow", "viewmodel", "Ltkhub/project/kesbewa/viewmodels/login/RegistorViewModel;", "getViewmodel", "()Ltkhub/project/kesbewa/viewmodels/login/RegistorViewModel;", "viewmodel$delegate", "Lkotlin/Lazy;", "errorUseExisting", "", "networkError", "Ltkhub/project/kesbewa/data/model/NetworkError;", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "onViewCreated", "view", "registerObserver", "setErrorUI", "respond", "setWindowFlag", "bits", "", "on", "showDialogTermsConditions", "trasperat", "userCodeObserver", "app_release"})
public final class SingupFragment extends androidx.fragment.app.Fragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    public tkhub.project.kesbewa.databinding.FragmentSingupBinding binding;
    private final kotlin.Lazy viewmodel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.services.Perfrences.AppPrefs appPref;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog alertDialog;
    private boolean isPasswordShow;
    private boolean isConfrimPasswordShow;
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog dialogTermsConditions;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.databinding.FragmentSingupBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.databinding.FragmentSingupBinding p0) {
    }
    
    private final tkhub.project.kesbewa.viewmodels.login.RegistorViewModel getViewmodel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.services.Perfrences.AppPrefs getAppPref() {
        return null;
    }
    
    public final void setAppPref(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.services.Perfrences.AppPrefs p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AlertDialog getAlertDialog() {
        return null;
    }
    
    public final void setAlertDialog(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    public final boolean isPasswordShow() {
        return false;
    }
    
    public final void setPasswordShow(boolean p0) {
    }
    
    public final boolean isConfrimPasswordShow() {
        return false;
    }
    
    public final void setConfrimPasswordShow(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Dialog getDialogTermsConditions() {
        return null;
    }
    
    public final void setDialogTermsConditions(@org.jetbrains.annotations.NotNull()
    android.app.Dialog p0) {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final void userCodeObserver() {
    }
    
    private final void registerObserver() {
    }
    
    private final void setErrorUI(tkhub.project.kesbewa.data.model.NetworkError respond) {
    }
    
    private final void errorUseExisting(tkhub.project.kesbewa.data.model.NetworkError networkError) {
    }
    
    private final void trasperat() {
    }
    
    private final void setWindowFlag(int bits, boolean on) {
    }
    
    private final void showDialogTermsConditions() {
    }
    
    public SingupFragment() {
        super();
    }
}