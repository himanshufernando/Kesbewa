package tkhub.project.kesbewa.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JK\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020.H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J!\u00103\u001a\u0002002\u0006\u0010-\u001a\u00020.2\u0006\u00104\u001a\u000200H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\u001f\u00106\u001a\b\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u00020.H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010:J\u0011\u0010;\u001a\u00020<H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=J\u0006\u0010>\u001a\u00020?J\u0011\u0010@\u001a\u00020.H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=J\u0011\u0010A\u001a\u00020<H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=JG\u0010B\u001a\u0012\u0012\u0004\u0012\u00020(0Cj\b\u0012\u0004\u0012\u00020(`D2\u001c\u0010E\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020(0Cj\b\u0012\u0004\u0012\u00020(`D0F2\u0006\u0010G\u001a\u00020HH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010IJ+\u0010J\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020(\u0018\u00010Cj\n\u0012\u0004\u0012\u00020(\u0018\u0001`D07H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=J3\u0010K\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020,\u0018\u00010Cj\n\u0012\u0004\u0012\u00020,\u0018\u0001`D072\u0006\u0010L\u001a\u00020?H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MJ3\u0010N\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020O\u0018\u00010Cj\n\u0012\u0004\u0012\u00020O\u0018\u0001`D072\u0006\u0010L\u001a\u00020?H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MJ3\u0010P\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020*\u0018\u00010Cj\n\u0012\u0004\u0012\u00020*\u0018\u0001`D072\u0006\u0010L\u001a\u00020?H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MJ\u001f\u0010Q\u001a\b\u0012\u0004\u0012\u000208072\u0006\u0010R\u001a\u00020SH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010TR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006U"}, d2 = {"Ltkhub/project/kesbewa/repo/HomeRepo;", "", "dataDao", "Ltkhub/project/kesbewa/data/db/OrderDao;", "(Ltkhub/project/kesbewa/data/db/OrderDao;)V", "appPref", "Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "getAppPref", "()Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "setAppPref", "(Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;)V", "getDataDao", "()Ltkhub/project/kesbewa/data/db/OrderDao;", "database", "Lcom/google/firebase/database/FirebaseDatabase;", "getDatabase", "()Lcom/google/firebase/database/FirebaseDatabase;", "setDatabase", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "databaseEmptyRef", "Lcom/google/firebase/database/DatabaseReference;", "getDatabaseEmptyRef", "()Lcom/google/firebase/database/DatabaseReference;", "setDatabaseEmptyRef", "(Lcom/google/firebase/database/DatabaseReference;)V", "orderConfigRef", "getOrderConfigRef", "setOrderConfigRef", "productImagesRef", "getProductImagesRef", "setProductImagesRef", "productRef", "getProductRef", "setProductRef", "userRef", "getUserRef", "setUserRef", "addtocart", "Ltkhub/orderject/kesbewa/data/model/Order;", "pro", "Ltkhub/project/kesbewa/data/model/Products;", "proSize", "Ltkhub/project/kesbewa/data/model/ProductSize;", "proColour", "Ltkhub/project/kesbewa/data/model/ProductColor;", "qty", "", "total", "", "actionStatus", "(Ltkhub/project/kesbewa/data/model/Products;Ltkhub/project/kesbewa/data/model/ProductSize;Ltkhub/project/kesbewa/data/model/ProductColor;Ljava/lang/Integer;Ljava/lang/Double;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateTotal", "price", "(IDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPushID", "Lkotlinx/coroutines/flow/Flow;", "Ltkhub/project/kesbewa/data/model/NetworkError;", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllCart", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "genarateUniqCode", "", "getCartCount", "getOrderConfig", "getProductFilter", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "list", "Landroidx/lifecycle/MutableLiveData;", "searchName", "", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "getProductsColor", "proID", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductsImages", "Ltkhub/project/kesbewa/data/model/ProductImage;", "getProductsSize", "validateGoogleDetails", "user", "Ltkhub/project/kesbewa/data/model/User;", "(Ltkhub/project/kesbewa/data/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class HomeRepo {
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.FirebaseDatabase database;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference productRef;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference productImagesRef;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference userRef;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference orderConfigRef;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.services.Perfrences.AppPrefs appPref;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference databaseEmptyRef;
    @org.jetbrains.annotations.NotNull()
    private final tkhub.project.kesbewa.data.db.OrderDao dataDao = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.FirebaseDatabase getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.Nullable()
    com.google.firebase.database.FirebaseDatabase p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.DatabaseReference getProductRef() {
        return null;
    }
    
    public final void setProductRef(@org.jetbrains.annotations.Nullable()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.DatabaseReference getProductImagesRef() {
        return null;
    }
    
    public final void setProductImagesRef(@org.jetbrains.annotations.Nullable()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.DatabaseReference getUserRef() {
        return null;
    }
    
    public final void setUserRef(@org.jetbrains.annotations.Nullable()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.DatabaseReference getOrderConfigRef() {
        return null;
    }
    
    public final void setOrderConfigRef(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Object getOrderConfig(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProductsImages(long proID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.ArrayList<tkhub.project.kesbewa.data.model.ProductImage>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProductsSize(long proID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.ArrayList<tkhub.project.kesbewa.data.model.ProductSize>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProductsColor(long proID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.ArrayList<tkhub.project.kesbewa.data.model.ProductColor>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.ArrayList<tkhub.project.kesbewa.data.model.Products>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProductFilter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<tkhub.project.kesbewa.data.model.Products>> list, @org.jetbrains.annotations.NotNull()
    java.lang.String searchName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<tkhub.project.kesbewa.data.model.Products>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object calculateTotal(int qty, double price, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addtocart(@org.jetbrains.annotations.Nullable()
    tkhub.project.kesbewa.data.model.Products pro, @org.jetbrains.annotations.Nullable()
    tkhub.project.kesbewa.data.model.ProductSize proSize, @org.jetbrains.annotations.Nullable()
    tkhub.project.kesbewa.data.model.ProductColor proColour, @org.jetbrains.annotations.Nullable()
    java.lang.Integer qty, @org.jetbrains.annotations.Nullable()
    java.lang.Double total, int actionStatus, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super tkhub.orderject.kesbewa.data.model.Order> p6) {
        return null;
    }
    
    public final long genarateUniqCode() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCartCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAllCart(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object validateGoogleDetails(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<tkhub.project.kesbewa.data.model.NetworkError>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object checkPushID(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<tkhub.project.kesbewa.data.model.NetworkError>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.db.OrderDao getDataDao() {
        return null;
    }
    
    public HomeRepo(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.db.OrderDao dataDao) {
        super();
    }
}