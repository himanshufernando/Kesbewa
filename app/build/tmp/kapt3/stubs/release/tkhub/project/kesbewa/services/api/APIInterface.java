package tkhub.project.kesbewa.services.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Ltkhub/project/kesbewa/services/api/APIInterface;", "", "getPlaces", "Ltkhub/project/kesbewa/data/model/Predictions;", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlacesDetails", "Ltkhub/project/kesbewa/data/model/googlePlaceDetails/GooglePlaceDetails;", "Companion", "app_release"})
public abstract interface APIInterface {
    public static final tkhub.project.kesbewa.services.api.APIInterface.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET()
    public abstract java.lang.Object getPlaces(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super tkhub.project.kesbewa.data.model.Predictions> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET()
    public abstract java.lang.Object getPlacesDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super tkhub.project.kesbewa.data.model.googlePlaceDetails.GooglePlaceDetails> p1);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Ltkhub/project/kesbewa/services/api/APIInterface$Companion;", "", "()V", "baseUrl", "", "getBaseUrl", "()Ljava/lang/String;", "create", "Ltkhub/project/kesbewa/services/api/APIInterface;", "httpUrl", "Lokhttp3/HttpUrl;", "app_release"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String baseUrl = "https://maps.googleapis.com/maps/api/place/";
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBaseUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final tkhub.project.kesbewa.services.api.APIInterface create() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final tkhub.project.kesbewa.services.api.APIInterface create(@org.jetbrains.annotations.NotNull()
        okhttp3.HttpUrl httpUrl) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}