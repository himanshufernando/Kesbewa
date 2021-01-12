package tkhub.project.kesbewa.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010,\u001a\u00020-H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u001f\u0010/\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u000203H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J\u001f\u00105\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u000203H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J\b\u00106\u001a\u0004\u0018\u000103J\u0011\u00107\u001a\u000208H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0006\u00109\u001a\u00020:J\u0011\u0010;\u001a\u00020<H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020A0>H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0>J\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020D00H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0019\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F00H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u000e\u0010G\u001a\u0002032\u0006\u0010H\u001a\u000203J\u0011\u0010I\u001a\u00020<H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u000e\u0010J\u001a\u0002032\u0006\u0010K\u001a\u000203J\u0011\u0010L\u001a\u00020DH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\'\u0010M\u001a\b\u0012\u0004\u0012\u000201002\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u000203H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010QJ\u0019\u0010R\u001a\u0002012\u0006\u0010S\u001a\u00020?H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010TJ\u0019\u0010U\u001a\u0002012\u0006\u0010S\u001a\u00020?H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010TJ$\u0010V\u001a\u00020W2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020A0>2\u0006\u00102\u001a\u0002032\u0006\u0010Y\u001a\u000203R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\fR\u001a\u0010\u001e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\n\"\u0004\b%\u0010\fR\u001c\u0010&\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\n\"\u0004\b(\u0010\fR\u001c\u0010)\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\n\"\u0004\b+\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006Z"}, d2 = {"Ltkhub/project/kesbewa/repo/CartRepo;", "", "dataDao", "Ltkhub/project/kesbewa/data/db/OrderDao;", "context", "Landroid/content/Context;", "(Ltkhub/project/kesbewa/data/db/OrderDao;Landroid/content/Context;)V", "addresRef", "Lcom/google/firebase/database/DatabaseReference;", "getAddresRef", "()Lcom/google/firebase/database/DatabaseReference;", "setAddresRef", "(Lcom/google/firebase/database/DatabaseReference;)V", "appPref", "Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "getAppPref", "()Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "setAppPref", "(Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;)V", "getDataDao", "()Ltkhub/project/kesbewa/data/db/OrderDao;", "database", "Lcom/google/firebase/database/FirebaseDatabase;", "getDatabase", "()Lcom/google/firebase/database/FirebaseDatabase;", "setDatabase", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "deliveryrRef", "getDeliveryrRef", "setDeliveryrRef", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "orderRef", "getOrderRef", "setOrderRef", "promoCodeRef", "getPromoCodeRef", "setPromoCodeRef", "promoCodeUseRef", "getPromoCodeUseRef", "setPromoCodeUseRef", "calculateTotal", "Ltkhub/project/kesbewa/data/model/FinalCheckoutAmount;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPromocode", "Lkotlinx/coroutines/flow/Flow;", "Ltkhub/project/kesbewa/data/model/NetworkError;", "code", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPromocodeUseage", "currentDate", "deleteAllCart", "", "genarateUniqCode", "", "getCartCount", "", "getCartItems", "", "Ltkhub/project/kesbewa/data/model/CartItem;", "getCityList", "Ltkhub/project/kesbewa/data/model/City_v2;", "getCitys", "getDelivery", "", "getDeliveryAddress", "Ltkhub/project/kesbewa/data/model/DeliveryAddress;", "getDistrictFromCity", "City", "getItemCount", "getProvinceFromDistricts", "districts", "getSubTotal", "processOrder", "orderDetails", "Ltkhub/project/kesbewa/data/model/OrderRespons;", "promoCodeType", "(Ltkhub/project/kesbewa/data/model/OrderRespons;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeCartItems", "item", "(Ltkhub/project/kesbewa/data/model/CartItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCartItems", "validateZipCode", "", "cityList", "city", "app_release"})
public final class CartRepo {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.FirebaseDatabase database;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference addresRef;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference orderRef;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference deliveryrRef;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference promoCodeRef;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference promoCodeUseRef;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.services.Perfrences.AppPrefs appPref;
    @org.jetbrains.annotations.NotNull()
    private final tkhub.project.kesbewa.data.db.OrderDao dataDao = null;
    
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
    public final com.google.firebase.database.DatabaseReference getAddresRef() {
        return null;
    }
    
    public final void setAddresRef(@org.jetbrains.annotations.Nullable()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.DatabaseReference getOrderRef() {
        return null;
    }
    
    public final void setOrderRef(@org.jetbrains.annotations.Nullable()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.DatabaseReference getDeliveryrRef() {
        return null;
    }
    
    public final void setDeliveryrRef(@org.jetbrains.annotations.Nullable()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.DatabaseReference getPromoCodeRef() {
        return null;
    }
    
    public final void setPromoCodeRef(@org.jetbrains.annotations.Nullable()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.DatabaseReference getPromoCodeUseRef() {
        return null;
    }
    
    public final void setPromoCodeUseRef(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Object getCartItems(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<tkhub.project.kesbewa.data.model.CartItem>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String currentDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object processOrder(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.OrderRespons orderDetails, @org.jetbrains.annotations.NotNull()
    java.lang.String promoCodeType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<tkhub.project.kesbewa.data.model.NetworkError>> p2) {
        return null;
    }
    
    public final long genarateUniqCode() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDeliveryAddress(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<tkhub.project.kesbewa.data.model.DeliveryAddress>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeCartItems(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.CartItem item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super tkhub.project.kesbewa.data.model.NetworkError> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateCartItems(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.CartItem item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super tkhub.project.kesbewa.data.model.NetworkError> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getItemCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSubTotal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCartCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCityList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<tkhub.project.kesbewa.data.model.City_v2>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object calculateTotal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super tkhub.project.kesbewa.data.model.FinalCheckoutAmount> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistrictFromCity(@org.jetbrains.annotations.NotNull()
    java.lang.String City) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProvinceFromDistricts(@org.jetbrains.annotations.NotNull()
    java.lang.String districts) {
        return null;
    }
    
    public final boolean validateZipCode(@org.jetbrains.annotations.NotNull()
    java.util.List<tkhub.project.kesbewa.data.model.City_v2> cityList, @org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    java.lang.String city) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAllCart(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDelivery(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.Double>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object checkPromocode(@org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<tkhub.project.kesbewa.data.model.NetworkError>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object checkPromocodeUseage(@org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<tkhub.project.kesbewa.data.model.NetworkError>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<tkhub.project.kesbewa.data.model.City_v2> getCitys() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.db.OrderDao getDataDao() {
        return null;
    }
    
    public CartRepo(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.db.OrderDao dataDao, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}