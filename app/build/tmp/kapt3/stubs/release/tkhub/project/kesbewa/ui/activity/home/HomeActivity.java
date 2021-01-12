package tkhub.project.kesbewa.ui.activity.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 h2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001hB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010E\u001a\u00020FJ\u0006\u0010G\u001a\u00020FJ\u0006\u0010H\u001a\u00020FJ\u0006\u0010I\u001a\u00020JJ\u0016\u0010K\u001a\u00020F2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00060MH\u0003J\u0006\u0010N\u001a\u00020FJ\u0006\u0010O\u001a\u00020PJ\u0006\u0010Q\u001a\u00020FJ\"\u0010R\u001a\u00020F2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020T2\b\u0010V\u001a\u0004\u0018\u00010WH\u0014J\b\u0010X\u001a\u00020FH\u0016J\u0010\u0010Y\u001a\u00020F2\u0006\u0010Z\u001a\u00020!H\u0016J\u0012\u0010[\u001a\u00020F2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0014J\b\u0010^\u001a\u00020FH\u0016J\b\u0010_\u001a\u00020FH\u0014J\b\u0010`\u001a\u00020FH\u0014J\b\u0010a\u001a\u00020FH\u0014J\u0006\u0010b\u001a\u00020FJ\u000e\u0010c\u001a\u00020F2\u0006\u0010d\u001a\u00020PJ\u0006\u0010e\u001a\u00020FJ\u0006\u0010f\u001a\u00020FJ\u0006\u0010g\u001a\u00020FR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u0002X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u000102X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u000e\u0010=\u001a\u00020>X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010?\u001a\u00020@8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bA\u0010B\u00a8\u0006i"}, d2 = {"Ltkhub/project/kesbewa/ui/activity/home/HomeActivity;", "Landroidx/fragment/app/FragmentActivity;", "Ltkhub/project/kesbewa/services/Perfrences/LocationSettings;", "Landroid/view/View$OnClickListener;", "()V", "account", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "getAccount", "()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "setAccount", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "getAlertDialog", "()Landroidx/appcompat/app/AlertDialog;", "setAlertDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "alertDialogExit", "getAlertDialogExit", "setAlertDialogExit", "appPrefs", "Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "getAppPrefs", "()Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "setAppPrefs", "(Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;)V", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "getDrawerLayout", "()Landroidx/drawerlayout/widget/DrawerLayout;", "setDrawerLayout", "(Landroidx/drawerlayout/widget/DrawerLayout;)V", "frgmentView", "Landroid/view/View;", "getFrgmentView", "()Landroid/view/View;", "setFrgmentView", "(Landroid/view/View;)V", "locationSettings", "getLocationSettings", "()Ltkhub/project/kesbewa/services/Perfrences/LocationSettings;", "setLocationSettings", "(Ltkhub/project/kesbewa/services/Perfrences/LocationSettings;)V", "mGoogleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "getMGoogleSignInClient", "()Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "setMGoogleSignInClient", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;)V", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "navView", "Lcom/google/android/material/navigation/NavigationView;", "getNavView", "()Lcom/google/android/material/navigation/NavigationView;", "setNavView", "(Lcom/google/android/material/navigation/NavigationView;)V", "orderConfigJob", "Lkotlinx/coroutines/Job;", "viewmodel", "Ltkhub/project/kesbewa/viewmodels/home/HomeViewModel;", "getViewmodel", "()Ltkhub/project/kesbewa/viewmodels/home/HomeViewModel;", "viewmodel$delegate", "Lkotlin/Lazy;", "checkPushObserver", "", "closeDrawer", "exitDialog", "genarateUniqCode", "", "handleSignInResult", "completedTask", "Lcom/google/android/gms/tasks/Task;", "hideKeyboard", "isUserSignIn", "", "logout", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onClick", "v", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLocationSettingsResponse", "onPause", "onResume", "onStop", "openDrawer", "progressStatus", "status", "removeDrawer", "setDrawer", "setUiForDrawerOpen", "Companion", "app_release"})
public final class HomeActivity extends androidx.fragment.app.FragmentActivity implements tkhub.project.kesbewa.services.Perfrences.LocationSettings, android.view.View.OnClickListener {
    private final kotlin.Lazy viewmodel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public tkhub.project.kesbewa.services.Perfrences.LocationSettings locationSettings;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.navigation.NavigationView navView;
    @org.jetbrains.annotations.NotNull()
    public androidx.drawerlayout.widget.DrawerLayout drawerLayout;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog alertDialog;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog alertDialogExit;
    @org.jetbrains.annotations.NotNull()
    public android.view.View frgmentView;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.auth.api.signin.GoogleSignInAccount account;
    @org.jetbrains.annotations.Nullable()
    private androidx.navigation.NavController navController;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.services.Perfrences.AppPrefs appPrefs;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.auth.api.signin.GoogleSignInClient mGoogleSignInClient;
    private kotlinx.coroutines.Job orderConfigJob;
    private static final int REQUEST_PERMISSIONS_PHONE_STATE_CODE = 55;
    public static final tkhub.project.kesbewa.ui.activity.home.HomeActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final tkhub.project.kesbewa.viewmodels.home.HomeViewModel getViewmodel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.services.Perfrences.LocationSettings getLocationSettings() {
        return null;
    }
    
    public final void setLocationSettings(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.services.Perfrences.LocationSettings p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.navigation.NavigationView getNavView() {
        return null;
    }
    
    public final void setNavView(@org.jetbrains.annotations.NotNull()
    com.google.android.material.navigation.NavigationView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.drawerlayout.widget.DrawerLayout getDrawerLayout() {
        return null;
    }
    
    public final void setDrawerLayout(@org.jetbrains.annotations.NotNull()
    androidx.drawerlayout.widget.DrawerLayout p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AlertDialog getAlertDialog() {
        return null;
    }
    
    public final void setAlertDialog(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AlertDialog getAlertDialogExit() {
        return null;
    }
    
    public final void setAlertDialogExit(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getFrgmentView() {
        return null;
    }
    
    public final void setFrgmentView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount getAccount() {
        return null;
    }
    
    public final void setAccount(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.auth.api.signin.GoogleSignInAccount p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public final void setNavController(@org.jetbrains.annotations.Nullable()
    androidx.navigation.NavController p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.services.Perfrences.AppPrefs getAppPrefs() {
        return null;
    }
    
    public final void setAppPrefs(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.services.Perfrences.AppPrefs p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.auth.api.signin.GoogleSignInClient getMGoogleSignInClient() {
        return null;
    }
    
    public final void setMGoogleSignInClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.auth.api.signin.GoogleSignInClient p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public final long genarateUniqCode() {
        return 0L;
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    public final void checkPushObserver() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void handleSignInResult(com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> completedTask) {
    }
    
    public final void progressStatus(boolean status) {
    }
    
    @java.lang.Override()
    public void onLocationSettingsResponse() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public final void exitDialog() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public final void setDrawer() {
    }
    
    public final void removeDrawer() {
    }
    
    public final void openDrawer() {
    }
    
    public final void closeDrawer() {
    }
    
    public final void hideKeyboard() {
    }
    
    public final void setUiForDrawerOpen() {
    }
    
    public final boolean isUserSignIn() {
        return false;
    }
    
    public final void logout() {
    }
    
    public HomeActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ltkhub/project/kesbewa/ui/activity/home/HomeActivity$Companion;", "", "()V", "REQUEST_PERMISSIONS_PHONE_STATE_CODE", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}