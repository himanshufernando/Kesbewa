package tkhub.project.kesbewa.ui.activity.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0002J\u0012\u0010%\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\b\u0010(\u001a\u00020\u001fH\u0014J\b\u0010)\u001a\u00020\u001fH\u0014J\b\u0010*\u001a\u00020\u001fH\u0014J\u0018\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0002J\b\u00101\u001a\u00020\u001fH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b\u00a8\u00062"}, d2 = {"Ltkhub/project/kesbewa/ui/activity/splash/SplashActivity;", "Landroidx/fragment/app/FragmentActivity;", "()V", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "getAlertDialog", "()Landroidx/appcompat/app/AlertDialog;", "setAlertDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "alertVersionDialog", "getAlertVersionDialog", "setAlertVersionDialog", "dialogSpecNote", "Landroid/app/Dialog;", "getDialogSpecNote", "()Landroid/app/Dialog;", "setDialogSpecNote", "(Landroid/app/Dialog;)V", "imageLoader", "Lcoil/ImageLoader;", "getImageLoader", "()Lcoil/ImageLoader;", "setImageLoader", "(Lcoil/ImageLoader;)V", "viewmodel", "Ltkhub/project/kesbewa/viewmodels/splash/SplashViewModel;", "getViewmodel", "()Ltkhub/project/kesbewa/viewmodels/splash/SplashViewModel;", "viewmodel$delegate", "Lkotlin/Lazy;", "errorAlertDialog", "", "networkError", "Ltkhub/project/kesbewa/data/model/NetworkError;", "errorAlertVersionMismatchDialog", "versionRespons", "Ltkhub/project/kesbewa/data/model/VersionRespons;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onStop", "setWindowFlag", "bits", "", "on", "", "specNote", "trasperat", "app_release"})
public final class SplashActivity extends androidx.fragment.app.FragmentActivity {
    private final kotlin.Lazy viewmodel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog alertDialog;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog alertVersionDialog;
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog dialogSpecNote;
    @org.jetbrains.annotations.NotNull()
    public coil.ImageLoader imageLoader;
    private java.util.HashMap _$_findViewCache;
    
    private final tkhub.project.kesbewa.viewmodels.splash.SplashViewModel getViewmodel() {
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
    public final androidx.appcompat.app.AlertDialog getAlertVersionDialog() {
        return null;
    }
    
    public final void setAlertVersionDialog(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Dialog getDialogSpecNote() {
        return null;
    }
    
    public final void setDialogSpecNote(@org.jetbrains.annotations.NotNull()
    android.app.Dialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final coil.ImageLoader getImageLoader() {
        return null;
    }
    
    public final void setImageLoader(@org.jetbrains.annotations.NotNull()
    coil.ImageLoader p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void trasperat() {
    }
    
    private final void setWindowFlag(int bits, boolean on) {
    }
    
    private final void errorAlertVersionMismatchDialog(tkhub.project.kesbewa.data.model.VersionRespons versionRespons) {
    }
    
    private final void errorAlertDialog(tkhub.project.kesbewa.data.model.NetworkError networkError) {
    }
    
    private final void specNote(tkhub.project.kesbewa.data.model.VersionRespons versionRespons) {
    }
    
    public SplashActivity() {
        super();
    }
}