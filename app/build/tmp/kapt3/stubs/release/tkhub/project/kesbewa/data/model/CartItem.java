package tkhub.project.kesbewa.data.model;

import java.lang.System;

@androidx.room.Entity(tableName = "carttable")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b;\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B}\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010;\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010<\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u0010\u0010=\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010>\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010@\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u00107J\u009e\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00122\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010K\u001a\u00020\u000fH\u00d6\u0001J\t\u0010L\u001a\u00020\u0007H\u00d6\u0001R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\'\u0010\u001b\"\u0004\b(\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010 \"\u0004\b3\u0010\"R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00101\u001a\u0004\b4\u0010.\"\u0004\b5\u00100R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010:\u001a\u0004\b6\u00107\"\u0004\b8\u00109\u00a8\u0006M"}, d2 = {"Ltkhub/project/kesbewa/data/model/CartItem;", "", "()V", "cart_id", "", "pro_id", "pro_name", "", "pro_price", "", "pro_size", "pro_image", "pro_colour", "pro_colour_code", "pro_total_qty", "", "pro_total_price", "cartStatus", "", "pro_code", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)V", "getCartStatus", "()Ljava/lang/Boolean;", "setCartStatus", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getCart_id", "()Ljava/lang/Long;", "setCart_id", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPro_code", "()Ljava/lang/String;", "setPro_code", "(Ljava/lang/String;)V", "getPro_colour", "setPro_colour", "getPro_colour_code", "setPro_colour_code", "getPro_id", "setPro_id", "getPro_image", "setPro_image", "getPro_name", "setPro_name", "getPro_price", "()Ljava/lang/Double;", "setPro_price", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getPro_size", "setPro_size", "getPro_total_price", "setPro_total_price", "getPro_total_qty", "()Ljava/lang/Integer;", "setPro_total_qty", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)Ltkhub/project/kesbewa/data/model/CartItem;", "equals", "other", "hashCode", "toString", "app_release"})
public final class CartItem {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey()
    private java.lang.Long cart_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long pro_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pro_name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double pro_price;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pro_size;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pro_image;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pro_colour;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pro_colour_code;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer pro_total_qty;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double pro_total_price;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean cartStatus;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pro_code;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getCart_id() {
        return null;
    }
    
    public final void setCart_id(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPro_id() {
        return null;
    }
    
    public final void setPro_id(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPro_name() {
        return null;
    }
    
    public final void setPro_name(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPro_price() {
        return null;
    }
    
    public final void setPro_price(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPro_size() {
        return null;
    }
    
    public final void setPro_size(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPro_image() {
        return null;
    }
    
    public final void setPro_image(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPro_colour() {
        return null;
    }
    
    public final void setPro_colour(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPro_colour_code() {
        return null;
    }
    
    public final void setPro_colour_code(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPro_total_qty() {
        return null;
    }
    
    public final void setPro_total_qty(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPro_total_price() {
        return null;
    }
    
    public final void setPro_total_price(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getCartStatus() {
        return null;
    }
    
    public final void setCartStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPro_code() {
        return null;
    }
    
    public final void setPro_code(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public CartItem(@org.jetbrains.annotations.Nullable()
    java.lang.Long cart_id, @org.jetbrains.annotations.Nullable()
    java.lang.Long pro_id, @org.jetbrains.annotations.Nullable()
    java.lang.String pro_name, @org.jetbrains.annotations.Nullable()
    java.lang.Double pro_price, @org.jetbrains.annotations.Nullable()
    java.lang.String pro_size, @org.jetbrains.annotations.Nullable()
    java.lang.String pro_image, @org.jetbrains.annotations.Nullable()
    java.lang.String pro_colour, @org.jetbrains.annotations.Nullable()
    java.lang.String pro_colour_code, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pro_total_qty, @org.jetbrains.annotations.Nullable()
    java.lang.Double pro_total_price, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean cartStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String pro_code) {
        super();
    }
    
    public CartItem() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.CartItem copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long cart_id, @org.jetbrains.annotations.Nullable()
    java.lang.Long pro_id, @org.jetbrains.annotations.Nullable()
    java.lang.String pro_name, @org.jetbrains.annotations.Nullable()
    java.lang.Double pro_price, @org.jetbrains.annotations.Nullable()
    java.lang.String pro_size, @org.jetbrains.annotations.Nullable()
    java.lang.String pro_image, @org.jetbrains.annotations.Nullable()
    java.lang.String pro_colour, @org.jetbrains.annotations.Nullable()
    java.lang.String pro_colour_code, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pro_total_qty, @org.jetbrains.annotations.Nullable()
    java.lang.Double pro_total_price, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean cartStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String pro_code) {
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