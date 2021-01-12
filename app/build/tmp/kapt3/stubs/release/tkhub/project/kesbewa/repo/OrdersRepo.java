package tkhub.project.kesbewa.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Ltkhub/project/kesbewa/repo/OrdersRepo;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appPref", "Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "getAppPref", "()Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "setAppPref", "(Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;)V", "database", "Lcom/google/firebase/database/FirebaseDatabase;", "getDatabase", "()Lcom/google/firebase/database/FirebaseDatabase;", "setDatabase", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "orderRef", "Lcom/google/firebase/database/DatabaseReference;", "getOrderRef", "()Lcom/google/firebase/database/DatabaseReference;", "setOrderRef", "(Lcom/google/firebase/database/DatabaseReference;)V", "getUserOrders", "Lkotlinx/coroutines/flow/Flow;", "Ljava/util/ArrayList;", "Ltkhub/project/kesbewa/data/model/OrderRespons;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class OrdersRepo {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.FirebaseDatabase database;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference orderRef;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.services.Perfrences.AppPrefs appPref;
    
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
    public final com.google.firebase.database.DatabaseReference getOrderRef() {
        return null;
    }
    
    public final void setOrderRef(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Object getUserOrders(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.ArrayList<tkhub.project.kesbewa.data.model.OrderRespons>>> p0) {
        return null;
    }
    
    public OrdersRepo(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}