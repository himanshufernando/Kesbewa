package tkhub.project.kesbewa.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\u0012\u0010&\u001a\u00020\"2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010/\u001a\u00020\"H\u0016J\u0010\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020$H\u0002J\b\u00102\u001a\u00020\"H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e\u00a8\u00063"}, d2 = {"Ltkhub/project/kesbewa/ui/fragment/SingupGoogleFragment;", "Landroidx/fragment/app/Fragment;", "()V", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "getAlertDialog", "()Landroidx/appcompat/app/AlertDialog;", "setAlertDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "binding", "Ltkhub/project/kesbewa/databinding/FragmentSingupGoogleBinding;", "getBinding", "()Ltkhub/project/kesbewa/databinding/FragmentSingupGoogleBinding;", "setBinding", "(Ltkhub/project/kesbewa/databinding/FragmentSingupGoogleBinding;)V", "dialogTermsConditions", "Landroid/app/Dialog;", "getDialogTermsConditions", "()Landroid/app/Dialog;", "setDialogTermsConditions", "(Landroid/app/Dialog;)V", "user", "Ltkhub/project/kesbewa/data/model/User;", "getUser", "()Ltkhub/project/kesbewa/data/model/User;", "setUser", "(Ltkhub/project/kesbewa/data/model/User;)V", "viewmodel", "Ltkhub/project/kesbewa/viewmodels/login/RegistorViewModel;", "getViewmodel", "()Ltkhub/project/kesbewa/viewmodels/login/RegistorViewModel;", "viewmodel$delegate", "Lkotlin/Lazy;", "errorUseLogin", "", "networkError", "Ltkhub/project/kesbewa/data/model/NetworkError;", "googleUserRegisterObserver", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStop", "setErrorUI", "respond", "showDialogTermsConditions", "app_release"})
public final class SingupGoogleFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public tkhub.project.kesbewa.databinding.FragmentSingupGoogleBinding binding;
    private final kotlin.Lazy viewmodel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog alertDialog;
    @org.jetbrains.annotations.NotNull()
    public tkhub.project.kesbewa.data.model.User user;
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog dialogTermsConditions;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.databinding.FragmentSingupGoogleBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.databinding.FragmentSingupGoogleBinding p0) {
    }
    
    private final tkhub.project.kesbewa.viewmodels.login.RegistorViewModel getViewmodel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AlertDialog getAlertDialog() {
        return null;
    }
    
    public final void setAlertDialog(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.User p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Dialog getDialogTermsConditions() {
        return null;
    }
    
    public final void setDialogTermsConditions(@org.jetbrains.annotations.NotNull()
    android.app.Dialog p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    public void onStop() {
    }
    
    private final void googleUserRegisterObserver() {
    }
    
    private final void setErrorUI(tkhub.project.kesbewa.data.model.NetworkError respond) {
    }
    
    private final void errorUseLogin(tkhub.project.kesbewa.data.model.NetworkError networkError) {
    }
    
    private final void showDialogTermsConditions() {
    }
    
    public SingupGoogleFragment() {
        super();
    }
}