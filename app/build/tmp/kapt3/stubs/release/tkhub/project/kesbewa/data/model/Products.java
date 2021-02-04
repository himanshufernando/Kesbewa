package tkhub.project.kesbewa.data.model;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\bA\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0016J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0010H\u00c6\u0003J\t\u0010A\u001a\u00020\u0005H\u00c6\u0003J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\t\u0010C\u001a\u00020\u0007H\u00c6\u0003J\t\u0010D\u001a\u00020\u0007H\u00c6\u0003J\t\u0010E\u001a\u00020\u0010H\u00c6\u0003J\t\u0010F\u001a\u00020\u0005H\u00c6\u0003J\t\u0010G\u001a\u00020\u0007H\u00c6\u0003J\t\u0010H\u001a\u00020\u0005H\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\u0005H\u00c6\u0003J\t\u0010K\u001a\u00020\u0005H\u00c6\u0003J\t\u0010L\u001a\u00020\u0005H\u00c6\u0003J\t\u0010M\u001a\u00020\u000eH\u00c6\u0003J\u009f\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u0010H\u00c6\u0001J\t\u0010O\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010P\u001a\u00020\u000e2\b\u0010Q\u001a\u0004\u0018\u00010RH\u00d6\u0003J\t\u0010S\u001a\u00020\u0010H\u00d6\u0001J\t\u0010T\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u0010H\u00d6\u0001R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001e\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00102\"\u0004\b6\u00104R\u001e\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u0010\u001aR\u001e\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>\u00a8\u0006Z"}, d2 = {"Ltkhub/project/kesbewa/data/model/Products;", "Landroid/os/Parcelable;", "pro_id", "", "pro_name", "", "pro_price", "", "pro_make", "pro_description", "pro_cover_img", "pro_catagory", "pro_code", "sold_out", "", "pro_sort", "", "pro_video", "pro_note", "pro_price_regular", "pro_weight", "pro_stock", "(JLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;DDI)V", "getPro_catagory", "()Ljava/lang/String;", "setPro_catagory", "(Ljava/lang/String;)V", "getPro_code", "setPro_code", "getPro_cover_img", "setPro_cover_img", "getPro_description", "setPro_description", "getPro_id", "()J", "setPro_id", "(J)V", "getPro_make", "setPro_make", "getPro_name", "setPro_name", "getPro_note", "setPro_note", "getPro_price", "()D", "setPro_price", "(D)V", "getPro_price_regular", "setPro_price_regular", "getPro_sort", "()I", "setPro_sort", "(I)V", "getPro_stock", "setPro_stock", "getPro_video", "setPro_video", "getPro_weight", "setPro_weight", "getSold_out", "()Z", "setSold_out", "(Z)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"})
@com.google.firebase.database.IgnoreExtraProperties()
public final class Products implements android.os.Parcelable {
    @com.google.gson.annotations.SerializedName(value = "pro_id")
    private long pro_id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "pro_name")
    private java.lang.String pro_name;
    @com.google.gson.annotations.SerializedName(value = "pro_price")
    private double pro_price;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "pro_make")
    private java.lang.String pro_make;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "pro_description")
    private java.lang.String pro_description;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "pro_cover_img")
    private java.lang.String pro_cover_img;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "pro_catagory")
    private java.lang.String pro_catagory;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "pro_code")
    private java.lang.String pro_code;
    @com.google.gson.annotations.SerializedName(value = "sold_out")
    private boolean sold_out;
    @com.google.gson.annotations.SerializedName(value = "pro_sort")
    private int pro_sort;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "pro_video")
    private java.lang.String pro_video;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "pro_note")
    private java.lang.String pro_note;
    @com.google.gson.annotations.SerializedName(value = "pro_price_regular")
    private double pro_price_regular;
    @com.google.gson.annotations.SerializedName(value = "pro_weight")
    private double pro_weight;
    @com.google.gson.annotations.SerializedName(value = "pro_stock")
    private int pro_stock;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    public final long getPro_id() {
        return 0L;
    }
    
    public final void setPro_id(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPro_name() {
        return null;
    }
    
    public final void setPro_name(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getPro_price() {
        return 0.0;
    }
    
    public final void setPro_price(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPro_make() {
        return null;
    }
    
    public final void setPro_make(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPro_description() {
        return null;
    }
    
    public final void setPro_description(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPro_cover_img() {
        return null;
    }
    
    public final void setPro_cover_img(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPro_catagory() {
        return null;
    }
    
    public final void setPro_catagory(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPro_code() {
        return null;
    }
    
    public final void setPro_code(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getSold_out() {
        return false;
    }
    
    public final void setSold_out(boolean p0) {
    }
    
    public final int getPro_sort() {
        return 0;
    }
    
    public final void setPro_sort(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPro_video() {
        return null;
    }
    
    public final void setPro_video(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPro_note() {
        return null;
    }
    
    public final void setPro_note(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getPro_price_regular() {
        return 0.0;
    }
    
    public final void setPro_price_regular(double p0) {
    }
    
    public final double getPro_weight() {
        return 0.0;
    }
    
    public final void setPro_weight(double p0) {
    }
    
    public final int getPro_stock() {
        return 0;
    }
    
    public final void setPro_stock(int p0) {
    }
    
    public Products(long pro_id, @org.jetbrains.annotations.NotNull()
    java.lang.String pro_name, double pro_price, @org.jetbrains.annotations.NotNull()
    java.lang.String pro_make, @org.jetbrains.annotations.NotNull()
    java.lang.String pro_description, @org.jetbrains.annotations.NotNull()
    java.lang.String pro_cover_img, @org.jetbrains.annotations.NotNull()
    java.lang.String pro_catagory, @org.jetbrains.annotations.NotNull()
    java.lang.String pro_code, boolean sold_out, int pro_sort, @org.jetbrains.annotations.NotNull()
    java.lang.String pro_video, @org.jetbrains.annotations.NotNull()
    java.lang.String pro_note, double pro_price_regular, double pro_weight, int pro_stock) {
        super();
    }
    
    public Products() {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final int component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final double component14() {
        return 0.0;
    }
    
    public final int component15() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.Products copy(long pro_id, @org.jetbrains.annotations.NotNull()
    java.lang.String pro_name, double pro_price, @org.jetbrains.annotations.NotNull()
    java.lang.String pro_make, @org.jetbrains.annotations.NotNull()
    java.lang.String pro_description, @org.jetbrains.annotations.NotNull()
    java.lang.String pro_cover_img, @org.jetbrains.annotations.NotNull()
    java.lang.String pro_catagory, @org.jetbrains.annotations.NotNull()
    java.lang.String pro_code, boolean sold_out, int pro_sort, @org.jetbrains.annotations.NotNull()
    java.lang.String pro_video, @org.jetbrains.annotations.NotNull()
    java.lang.String pro_note, double pro_price_regular, double pro_weight, int pro_stock) {
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
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}