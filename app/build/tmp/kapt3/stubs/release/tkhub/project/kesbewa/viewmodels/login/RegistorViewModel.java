package tkhub.project.kesbewa.viewmodels.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001tB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020RJ\u000e\u0010j\u001a\u00020h2\u0006\u0010i\u001a\u00020RJ\u000e\u0010k\u001a\u00020h2\u0006\u0010i\u001a\u00020RJ\u000e\u0010l\u001a\u00020h2\u0006\u0010i\u001a\u00020RJ\u0006\u0010m\u001a\u00020hJ\u000e\u0010n\u001a\u00020h2\u0006\u0010o\u001a\u00020\u0019J\u0006\u0010p\u001a\u00020hJ\u000e\u0010q\u001a\u00020h2\u0006\u0010i\u001a\u00020RJ\u000e\u0010r\u001a\u00020h2\u0006\u0010s\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR \u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00190\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR \u00100\u001a\b\u0012\u0004\u0012\u00020\u00190\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR \u00103\u001a\b\u0012\u0004\u0012\u00020\u00190\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR \u00106\u001a\b\u0012\u0004\u0012\u00020\u00190\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dR \u00109\u001a\b\u0012\u0004\u0012\u00020\u00190\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001dR\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\t0=\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR!\u0010E\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bF\u0010\u001bR\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020\t0=\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010?R\u001d\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0L0=\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010?R\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020B0A\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010DR\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020B0A\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010DR\u001a\u0010Q\u001a\u00020RX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020\t0=\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010?R\u001d\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0L0=\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010?R\u001a\u0010[\u001a\u00020\\X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0017\u0010a\u001a\b\u0012\u0004\u0012\u00020\t0=\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010?R\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020\t0=\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010?R\u001d\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0L0=\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010?\u00a8\u0006u"}, d2 = {"Ltkhub/project/kesbewa/viewmodels/login/RegistorViewModel;", "Landroidx/lifecycle/ViewModel;", "dataDao", "Ltkhub/project/kesbewa/data/db/OrderDao;", "app", "Landroid/content/Context;", "(Ltkhub/project/kesbewa/data/db/OrderDao;Landroid/content/Context;)V", "_generateUserCode", "Landroidx/lifecycle/MutableLiveData;", "Ltkhub/project/kesbewa/data/model/User;", "_googleUserRegisterCall", "_passwordResetCall", "_userResponse", "appPref", "Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "getAppPref", "()Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "setAppPref", "(Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;)V", "ctx", "getCtx", "()Landroid/content/Context;", "setCtx", "(Landroid/content/Context;)V", "editTextCode", "", "getEditTextCode", "()Landroidx/lifecycle/MutableLiveData;", "setEditTextCode", "(Landroidx/lifecycle/MutableLiveData;)V", "editTextConPassword", "getEditTextConPassword", "setEditTextConPassword", "editTextEmail", "getEditTextEmail", "setEditTextEmail", "editTextGoogleNic", "getEditTextGoogleNic", "setEditTextGoogleNic", "editTextGoogleNumber", "getEditTextGoogleNumber", "setEditTextGoogleNumber", "editTextNic", "getEditTextNic", "setEditTextNic", "editTextNumber", "getEditTextNumber", "setEditTextNumber", "editTextPassword", "getEditTextPassword", "setEditTextPassword", "editTextResetConPass", "getEditTextResetConPass", "setEditTextResetConPass", "editTextResetPass", "getEditTextResetPass", "setEditTextResetPass", "editTextUserName", "getEditTextUserName", "setEditTextUserName", "generateUserCode", "Landroidx/lifecycle/LiveData;", "getGenerateUserCode", "()Landroidx/lifecycle/LiveData;", "googleSignInProgress", "Landroidx/databinding/ObservableField;", "", "getGoogleSignInProgress", "()Landroidx/databinding/ObservableField;", "googleUserDetails", "getGoogleUserDetails", "googleUserDetails$delegate", "Lkotlin/Lazy;", "googleUserRegisterCall", "getGoogleUserRegisterCall", "googleUserRegisterResponse", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult;", "Ltkhub/project/kesbewa/data/model/NetworkError;", "getGoogleUserRegisterResponse", "isLoginVisible", "isRegstorVisible", "layoutView", "Landroid/view/View;", "getLayoutView", "()Landroid/view/View;", "setLayoutView", "(Landroid/view/View;)V", "passwordResetCall", "getPasswordResetCall", "passwordResetResponse", "getPasswordResetResponse", "repo", "Ltkhub/project/kesbewa/repo/RegisterRepo;", "getRepo", "()Ltkhub/project/kesbewa/repo/RegisterRepo;", "setRepo", "(Ltkhub/project/kesbewa/repo/RegisterRepo;)V", "userCode", "getUserCode", "userResponse", "getUserResponse", "userSaveResponse", "getUserSaveResponse", "backFromGoogleRegistorToLogin", "", "view", "backFromRegistorToLogin", "goToGoogleUser", "goToGusetUser", "googlesignin", "passwordReset", "userid", "register", "registorToLogin", "userRegister", "user", "LiveDataVMFactory", "app_release"})
public final class RegistorViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context ctx;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.repo.RegisterRepo repo;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.services.Perfrences.AppPrefs appPref;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> editTextUserName;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> editTextNumber;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> editTextEmail;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> editTextNic;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> editTextPassword;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> editTextConPassword;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> editTextGoogleNumber;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> editTextGoogleNic;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> isRegstorVisible = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> isLoginVisible = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> googleSignInProgress = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> editTextCode;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> editTextResetConPass;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> editTextResetPass;
    private final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.User> _userResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.User> userResponse = null;
    private final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.User> _generateUserCode = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.User> generateUserCode = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy googleUserDetails$delegate = null;
    private final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.User> _googleUserRegisterCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.User> googleUserRegisterCall = null;
    private final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.User> _passwordResetCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.User> passwordResetCall = null;
    @org.jetbrains.annotations.NotNull()
    public android.view.View layoutView;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.User> userCode = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> userSaveResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> googleUserRegisterResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> passwordResetResponse = null;
    
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
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEditTextUserName() {
        return null;
    }
    
    public final void setEditTextUserName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEditTextNumber() {
        return null;
    }
    
    public final void setEditTextNumber(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEditTextEmail() {
        return null;
    }
    
    public final void setEditTextEmail(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEditTextNic() {
        return null;
    }
    
    public final void setEditTextNic(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEditTextPassword() {
        return null;
    }
    
    public final void setEditTextPassword(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEditTextConPassword() {
        return null;
    }
    
    public final void setEditTextConPassword(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEditTextGoogleNumber() {
        return null;
    }
    
    public final void setEditTextGoogleNumber(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEditTextGoogleNic() {
        return null;
    }
    
    public final void setEditTextGoogleNic(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isRegstorVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isLoginVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> getGoogleSignInProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEditTextCode() {
        return null;
    }
    
    public final void setEditTextCode(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEditTextResetConPass() {
        return null;
    }
    
    public final void setEditTextResetConPass(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEditTextResetPass() {
        return null;
    }
    
    public final void setEditTextResetPass(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.User> getUserResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.User> getGenerateUserCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.User> getGoogleUserDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.User> getGoogleUserRegisterCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.User> getPasswordResetCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getLayoutView() {
        return null;
    }
    
    public final void setLayoutView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    public final void register() {
    }
    
    public final void userRegister(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.User user) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.User> getUserCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> getUserSaveResponse() {
        return null;
    }
    
    public final void registorToLogin(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void backFromGoogleRegistorToLogin(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void backFromRegistorToLogin(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void goToGusetUser(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void goToGoogleUser(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void googlesignin() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> getGoogleUserRegisterResponse() {
        return null;
    }
    
    public final void passwordReset(@org.jetbrains.annotations.NotNull()
    java.lang.String userid) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> getPasswordResetResponse() {
        return null;
    }
    
    public RegistorViewModel(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.db.OrderDao dataDao, @org.jetbrains.annotations.NotNull()
    android.content.Context app) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u000b\u001a\u0002H\f\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Ltkhub/project/kesbewa/viewmodels/login/RegistorViewModel$LiveDataVMFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "app", "Landroid/content/Context;", "getApp", "()Landroid/content/Context;", "setApp", "(Landroid/content/Context;)V", "dataDAO", "Ltkhub/project/kesbewa/data/db/OrderDao;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"})
    public static final class LiveDataVMFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        @org.jetbrains.annotations.NotNull()
        private static android.content.Context app;
        private static final tkhub.project.kesbewa.data.db.OrderDao dataDAO = null;
        public static final tkhub.project.kesbewa.viewmodels.login.RegistorViewModel.LiveDataVMFactory INSTANCE = null;
        
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