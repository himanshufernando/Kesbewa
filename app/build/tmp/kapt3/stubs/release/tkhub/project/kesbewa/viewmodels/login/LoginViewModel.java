package tkhub.project.kesbewa.viewmodels.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u00102\u001a\u0002032\u0006\u00104\u001a\u000205J\u000e\u00106\u001a\u0002032\u0006\u00104\u001a\u000205J\u0006\u00107\u001a\u000203J\u0006\u00108\u001a\u000203R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070!\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0!\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010#R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0!\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0!\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u001a\u0010,\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u00a8\u0006:"}, d2 = {"Ltkhub/project/kesbewa/viewmodels/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "app", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_loginServiceCall", "Landroidx/lifecycle/MutableLiveData;", "Ltkhub/project/kesbewa/data/model/User;", "_passwordResetCodeCall", "", "appPref", "Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "getAppPref", "()Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "setAppPref", "(Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;)V", "ctx", "getCtx", "()Landroid/content/Context;", "setCtx", "editTextLoginNumber", "getEditTextLoginNumber", "()Landroidx/lifecycle/MutableLiveData;", "setEditTextLoginNumber", "(Landroidx/lifecycle/MutableLiveData;)V", "editTextLoginPassword", "getEditTextLoginPassword", "setEditTextLoginPassword", "isLoginVisible", "Landroidx/databinding/ObservableField;", "", "()Landroidx/databinding/ObservableField;", "loginServiceCall", "Landroidx/lifecycle/LiveData;", "getLoginServiceCall", "()Landroidx/lifecycle/LiveData;", "loginServiceResponse", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult;", "Ltkhub/project/kesbewa/data/model/NetworkError;", "getLoginServiceResponse", "passwordResetCodeCall", "getPasswordResetCodeCall", "passwordResetCodeResponse", "getPasswordResetCodeResponse", "repo", "Ltkhub/project/kesbewa/repo/RegisterRepo;", "getRepo", "()Ltkhub/project/kesbewa/repo/RegisterRepo;", "setRepo", "(Ltkhub/project/kesbewa/repo/RegisterRepo;)V", "goToGusetUser", "", "view", "Landroid/view/View;", "goToRegistor", "login", "password_reset", "LiveDataVMFactory", "app_release"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context ctx;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.repo.RegisterRepo repo;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.services.Perfrences.AppPrefs appPref;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> editTextLoginPassword;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> editTextLoginNumber;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> isLoginVisible = null;
    private final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.User> _loginServiceCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.User> loginServiceCall = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _passwordResetCodeCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> passwordResetCodeCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> loginServiceResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> passwordResetCodeResponse = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getCtx() {
        return null;
    }
    
    public final void setCtx(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.repo.RegisterRepo getRepo() {
        return null;
    }
    
    public final void setRepo(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.repo.RegisterRepo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.services.Perfrences.AppPrefs getAppPref() {
        return null;
    }
    
    public final void setAppPref(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.services.Perfrences.AppPrefs p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEditTextLoginPassword() {
        return null;
    }
    
    public final void setEditTextLoginPassword(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEditTextLoginNumber() {
        return null;
    }
    
    public final void setEditTextLoginNumber(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isLoginVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.User> getLoginServiceCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getPasswordResetCodeCall() {
        return null;
    }
    
    public final void login() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> getLoginServiceResponse() {
        return null;
    }
    
    public final void goToRegistor(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void goToGusetUser(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void password_reset() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> getPasswordResetCodeResponse() {
        return null;
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context app) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\t\u001a\u0002H\n\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016\u00a2\u0006\u0002\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Ltkhub/project/kesbewa/viewmodels/login/LoginViewModel$LiveDataVMFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "app", "Landroid/content/Context;", "getApp", "()Landroid/content/Context;", "setApp", "(Landroid/content/Context;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"})
    public static final class LiveDataVMFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        @org.jetbrains.annotations.NotNull()
        private static android.content.Context app;
        public static final tkhub.project.kesbewa.viewmodels.login.LoginViewModel.LiveDataVMFactory INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getApp() {
            return null;
        }
        
        public final void setApp(@org.jetbrains.annotations.NotNull()
        android.content.Context p0) {
        }
        
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        private LiveDataVMFactory() {
            super();
        }
    }
}