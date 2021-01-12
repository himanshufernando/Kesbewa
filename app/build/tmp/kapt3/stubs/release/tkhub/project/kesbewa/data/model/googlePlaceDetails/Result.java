package tkhub.project.kesbewa.data.model.googlePlaceDetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003J-\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0007H\u00d6\u0001R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006!"}, d2 = {"Ltkhub/project/kesbewa/data/model/googlePlaceDetails/Result;", "", "()V", "address_components", "", "Ltkhub/project/kesbewa/data/model/googlePlaceDetails/AddressComponent;", "formatted_address", "", "geometry", "Ltkhub/project/kesbewa/data/model/googlePlaceDetails/Geometry;", "(Ljava/util/List;Ljava/lang/String;Ltkhub/project/kesbewa/data/model/googlePlaceDetails/Geometry;)V", "getAddress_components", "()Ljava/util/List;", "setAddress_components", "(Ljava/util/List;)V", "getFormatted_address", "()Ljava/lang/String;", "setFormatted_address", "(Ljava/lang/String;)V", "getGeometry", "()Ltkhub/project/kesbewa/data/model/googlePlaceDetails/Geometry;", "setGeometry", "(Ltkhub/project/kesbewa/data/model/googlePlaceDetails/Geometry;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"})
public final class Result {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "address_components")
    private java.util.List<tkhub.project.kesbewa.data.model.googlePlaceDetails.AddressComponent> address_components;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "formatted_address")
    private java.lang.String formatted_address;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "geometry")
    private tkhub.project.kesbewa.data.model.googlePlaceDetails.Geometry geometry;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<tkhub.project.kesbewa.data.model.googlePlaceDetails.AddressComponent> getAddress_components() {
        return null;
    }
    
    public final void setAddress_components(@org.jetbrains.annotations.NotNull()
    java.util.List<tkhub.project.kesbewa.data.model.googlePlaceDetails.AddressComponent> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormatted_address() {
        return null;
    }
    
    public final void setFormatted_address(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.googlePlaceDetails.Geometry getGeometry() {
        return null;
    }
    
    public final void setGeometry(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.googlePlaceDetails.Geometry p0) {
    }
    
    public Result(@org.jetbrains.annotations.NotNull()
    java.util.List<tkhub.project.kesbewa.data.model.googlePlaceDetails.AddressComponent> address_components, @org.jetbrains.annotations.NotNull()
    java.lang.String formatted_address, @org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.googlePlaceDetails.Geometry geometry) {
        super();
    }
    
    public Result() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<tkhub.project.kesbewa.data.model.googlePlaceDetails.AddressComponent> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.googlePlaceDetails.Geometry component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.googlePlaceDetails.Result copy(@org.jetbrains.annotations.NotNull()
    java.util.List<tkhub.project.kesbewa.data.model.googlePlaceDetails.AddressComponent> address_components, @org.jetbrains.annotations.NotNull()
    java.lang.String formatted_address, @org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.googlePlaceDetails.Geometry geometry) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}