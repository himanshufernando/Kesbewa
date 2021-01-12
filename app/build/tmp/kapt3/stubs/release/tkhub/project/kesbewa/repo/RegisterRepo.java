package tkhub.project.kesbewa.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0%2\u0006\u0010*\u001a\u00020)H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u0006\u0010,\u001a\u00020-J\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0%2\u0006\u0010*\u001a\u00020)H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u001f\u00100\u001a\b\u0012\u0004\u0012\u00020/0%2\u0006\u0010*\u001a\u00020)H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u001f\u00101\u001a\b\u0012\u0004\u0012\u00020/0%2\u0006\u00102\u001a\u000203H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J\u001f\u00105\u001a\b\u0012\u0004\u0012\u00020/0%2\u0006\u0010*\u001a\u00020)H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u001f\u00106\u001a\b\u0012\u0004\u0012\u00020/0%2\u0006\u0010*\u001a\u00020)H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u001f\u00107\u001a\b\u0012\u0004\u0012\u00020/0%2\u0006\u0010*\u001a\u00020)H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001c\u0010!\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00068"}, d2 = {"Ltkhub/project/kesbewa/repo/RegisterRepo;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appPref", "Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "getAppPref", "()Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "setAppPref", "(Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;)V", "database", "Lcom/google/firebase/database/FirebaseDatabase;", "getDatabase", "()Lcom/google/firebase/database/FirebaseDatabase;", "setDatabase", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "databaseEmptyRef", "Lcom/google/firebase/database/DatabaseReference;", "getDatabaseEmptyRef", "()Lcom/google/firebase/database/DatabaseReference;", "setDatabaseEmptyRef", "(Lcom/google/firebase/database/DatabaseReference;)V", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "passwordRef", "getPasswordRef", "setPasswordRef", "userRef", "getUserRef", "setUserRef", "versionRef", "getVersionRef", "setVersionRef", "checkVersionMatch", "Lkotlinx/coroutines/flow/Flow;", "Ltkhub/project/kesbewa/data/model/VersionRespons;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createUserCode", "Ltkhub/project/kesbewa/data/model/User;", "user", "(Ltkhub/project/kesbewa/data/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "genarateUniqCode", "", "loginUser", "Ltkhub/project/kesbewa/data/model/NetworkError;", "passwordReset", "passwordResetCode", "number", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveGoogleUser", "saveUser", "updateUser", "app_release"})
@javax.inject.Singleton()
public final class RegisterRepo {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.FirebaseDatabase database;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference userRef;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference versionRef;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference passwordRef;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.services.Perfrences.AppPrefs appPref;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference databaseEmptyRef;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.FirebaseDatabase getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.Nullable()
    com.google.firebase.database.FirebaseDatabase p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.DatabaseReference getUserRef() {
        return null;
    }
    
    public final void setUserRef(@org.jetbrains.annotations.Nullable()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.DatabaseReference getVersionRef() {
        return null;
    }
    
    public final void setVersionRef(@org.jetbrains.annotations.Nullable()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.DatabaseReference getPasswordRef() {
        return null;
    }
    
    public final void setPasswordRef(@org.jetbrains.annotations.Nullable()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.services.Perfrences.AppPrefs getAppPref() {
        return null;
    }
    
    public final void setAppPref(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.services.Perfrences.AppPrefs p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.DatabaseReference getDatabaseEmptyRef() {
        return null;
    }
    
    public final void setDatabaseEmptyRef(@org.jetbrains.annotations.Nullable()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object checkVersionMatch(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<tkhub.project.kesbewa.data.model.VersionRespons>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveUser(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<tkhub.project.kesbewa.data.model.NetworkError>> p1) {
        return null;
    }
    
    public final long genarateUniqCode() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createUserCode(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<tkhub.project.kesbewa.data.model.User>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loginUser(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<tkhub.project.kesbewa.data.model.NetworkError>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateUser(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<tkhub.project.kesbewa.data.model.NetworkError>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveGoogleUser(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<tkhub.project.kesbewa.data.model.NetworkError>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object passwordResetCode(@org.jetbrains.annotations.NotNull()
    java.lang.String number, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<tkhub.project.kesbewa.data.model.NetworkError>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object passwordReset(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<tkhub.project.kesbewa.data.model.NetworkError>> p1) {
        return null;
    }
    
    public RegisterRepo(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}