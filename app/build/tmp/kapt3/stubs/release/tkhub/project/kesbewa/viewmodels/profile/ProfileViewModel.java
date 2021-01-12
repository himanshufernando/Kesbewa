package tkhub.project.kesbewa.viewmodels.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u00104\u001a\u000205J\u0006\u00106\u001a\u000205R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0004R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070-\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000202010-\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010/\u00a8\u00068"}, d2 = {"Ltkhub/project/kesbewa/viewmodels/profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_updateProfileCall", "Landroidx/lifecycle/MutableLiveData;", "Ltkhub/project/kesbewa/data/model/User;", "appPrefs", "Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "getAppPrefs", "()Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "setAppPrefs", "(Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;)V", "editTextEmail", "", "getEditTextEmail", "()Landroidx/lifecycle/MutableLiveData;", "setEditTextEmail", "(Landroidx/lifecycle/MutableLiveData;)V", "editTextNic", "getEditTextNic", "setEditTextNic", "editTextNumber", "getEditTextNumber", "setEditTextNumber", "editTextUserName", "getEditTextUserName", "setEditTextUserName", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "profileProgessBar", "Landroidx/databinding/ObservableField;", "", "getProfileProgessBar", "()Landroidx/databinding/ObservableField;", "repo", "Ltkhub/project/kesbewa/repo/RegisterRepo;", "getRepo", "()Ltkhub/project/kesbewa/repo/RegisterRepo;", "setRepo", "(Ltkhub/project/kesbewa/repo/RegisterRepo;)V", "updateProfileCall", "Landroidx/lifecycle/LiveData;", "getUpdateProfileCall", "()Landroidx/lifecycle/LiveData;", "updateProfileResponse", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult;", "Ltkhub/project/kesbewa/data/model/NetworkError;", "getUpdateProfileResponse", "setUserDetails", "", "userUpdate", "LiveDataVMFactory", "app_release"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.repo.RegisterRepo repo;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.services.Perfrences.AppPrefs appPrefs;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> editTextUserName;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> editTextNumber;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> editTextEmail;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> editTextNic;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> profileProgessBar = null;
    private final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.User> _updateProfileCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.User> updateProfileCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> updateProfileResponse = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
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
    public final tkhub.project.kesbewa.services.Perfrences.AppPrefs getAppPrefs() {
        return null;
    }
    
    public final void setAppPrefs(@org.jetbrains.annotations.NotNull()
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
    public final androidx.databinding.ObservableField<java.lang.Boolean> getProfileProgessBar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.User> getUpdateProfileCall() {
        return null;
    }
    
    public final void setUserDetails() {
    }
    
    public final void userUpdate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> getUpdateProfileResponse() {
        return null;
    }
    
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\t\u001a\u0002H\n\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016\u00a2\u0006\u0002\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Ltkhub/project/kesbewa/viewmodels/profile/ProfileViewModel$LiveDataVMFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "app", "Landroid/content/Context;", "getApp", "()Landroid/content/Context;", "setApp", "(Landroid/content/Context;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"})
    public static final class LiveDataVMFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        @org.jetbrains.annotations.NotNull()
        private static android.content.Context app;
        public static final tkhub.project.kesbewa.viewmodels.profile.ProfileViewModel.LiveDataVMFactory INSTANCE = null;
        
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