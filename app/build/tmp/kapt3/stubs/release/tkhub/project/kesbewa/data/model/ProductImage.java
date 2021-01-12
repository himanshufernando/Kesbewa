package tkhub.project.kesbewa.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00c6\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\bH\u00d6\u0001J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012\u00a8\u0006&"}, d2 = {"Ltkhub/project/kesbewa/data/model/ProductImage;", "", "img_id", "", "img_url", "", "pro_id", "item_count", "", "item_tot_count", "(JLjava/lang/String;Ljava/lang/String;II)V", "getImg_id", "()J", "setImg_id", "(J)V", "getImg_url", "()Ljava/lang/String;", "setImg_url", "(Ljava/lang/String;)V", "getItem_count", "()I", "setItem_count", "(I)V", "getItem_tot_count", "setItem_tot_count", "getPro_id", "setPro_id", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
@com.google.firebase.database.IgnoreExtraProperties()
public final class ProductImage {
    @com.google.gson.annotations.SerializedName(value = "img_id")
    private long img_id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "img_url")
    private java.lang.String img_url;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "pro_id")
    private java.lang.String pro_id;
    @com.google.gson.annotations.SerializedName(value = "item_count")
    private int item_count;
    @com.google.gson.annotations.SerializedName(value = "item_tot_count")
    private int item_tot_count;
    
    public final long getImg_id() {
        return 0L;
    }
    
    public final void setImg_id(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImg_url() {
        return null;
    }
    
    public final void setImg_url(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPro_id() {
        return null;
    }
    
    public final void setPro_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getItem_count() {
        return 0;
    }
    
    public final void setItem_count(int p0) {
    }
    
    public final int getItem_tot_count() {
        return 0;
    }
    
    public final void setItem_tot_count(int p0) {
    }
    
    public ProductImage(long img_id, @org.jetbrains.annotations.NotNull()
    java.lang.String img_url, @org.jetbrains.annotations.NotNull()
    java.lang.String pro_id, int item_count, int item_tot_count) {
        super();
    }
    
    public ProductImage() {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.ProductImage copy(long img_id, @org.jetbrains.annotations.NotNull()
    java.lang.String img_url, @org.jetbrains.annotations.NotNull()
    java.lang.String pro_id, int item_count, int item_tot_count) {
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