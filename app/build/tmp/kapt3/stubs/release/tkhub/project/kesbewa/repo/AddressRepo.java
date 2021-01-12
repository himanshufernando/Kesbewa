package tkhub.project.kesbewa.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\"\u001a\u00020#J+\u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\'\u0018\u00010&j\n\u0012\u0004\u0012\u00020\'\u0018\u0001`(0%H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020-H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J;\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030%2\u0006\u00104\u001a\u00020\'2\b\u00105\u001a\u0004\u0018\u0001062\u000e\u00107\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010:J$\u0010;\u001a\u00020<2\f\u0010=\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010>\u001a\u00020-2\u0006\u0010?\u001a\u00020-R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006@"}, d2 = {"Ltkhub/project/kesbewa/repo/AddressRepo;", "", "context", "Landroid/content/Context;", "client", "Ltkhub/project/kesbewa/services/api/APIInterface;", "(Landroid/content/Context;Ltkhub/project/kesbewa/services/api/APIInterface;)V", "addresRef", "Lcom/google/firebase/database/DatabaseReference;", "getAddresRef", "()Lcom/google/firebase/database/DatabaseReference;", "setAddresRef", "(Lcom/google/firebase/database/DatabaseReference;)V", "appPrefs", "Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "getAppPrefs", "()Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "setAppPrefs", "(Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;)V", "getClient", "()Ltkhub/project/kesbewa/services/api/APIInterface;", "setClient", "(Ltkhub/project/kesbewa/services/api/APIInterface;)V", "database", "Lcom/google/firebase/database/FirebaseDatabase;", "getDatabase", "()Lcom/google/firebase/database/FirebaseDatabase;", "setDatabase", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "genarateUniqCode", "", "getUserAddress", "Lkotlinx/coroutines/flow/Flow;", "Ljava/util/ArrayList;", "Ltkhub/project/kesbewa/data/model/DeliveryAddress;", "Lkotlin/collections/ArrayList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getplaces", "Ltkhub/project/kesbewa/data/model/Predictions;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getplacesDetails", "Ltkhub/project/kesbewa/data/model/googlePlaceDetails/GooglePlaceDetails;", "placeid", "saveUserAddress", "Ltkhub/project/kesbewa/data/model/NetworkError;", "address", "location", "Landroid/location/Location;", "cltylist", "", "Ltkhub/project/kesbewa/data/model/City_v2;", "(Ltkhub/project/kesbewa/data/model/DeliveryAddress;Landroid/location/Location;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateZipCode", "", "cityList", "code", "city", "app_release"})
public final class AddressRepo {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.FirebaseDatabase database;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference addresRef;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.services.Perfrences.AppPrefs appPrefs;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.services.api.APIInterface client;
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.services.Perfrences.AppPrefs getAppPrefs() {
        return null;
    }
    
    public final void setAppPrefs(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.services.Perfrences.AppPrefs p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveUserAddress(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.DeliveryAddress address, @org.jetbrains.annotations.Nullable()
    android.location.Location location, @org.jetbrains.annotations.Nullable()
    java.util.List<tkhub.project.kesbewa.data.model.City_v2> cltylist, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<tkhub.project.kesbewa.data.model.NetworkError>> p3) {
        return null;
    }
    
    public final long genarateUniqCode() {
        return 0L;
    }
    
    public final boolean validateZipCode(@org.jetbrains.annotations.NotNull()
    java.util.List<tkhub.project.kesbewa.data.model.City_v2> cityList, @org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    java.lang.String city) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserAddress(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.ArrayList<tkhub.project.kesbewa.data.model.DeliveryAddress>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getplaces(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super tkhub.project.kesbewa.data.model.Predictions> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getplacesDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String placeid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super tkhub.project.kesbewa.data.model.googlePlaceDetails.GooglePlaceDetails> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.services.api.APIInterface getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.services.api.APIInterface p0) {
    }
    
    public AddressRepo(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.services.api.APIInterface client) {
        super();
    }
}