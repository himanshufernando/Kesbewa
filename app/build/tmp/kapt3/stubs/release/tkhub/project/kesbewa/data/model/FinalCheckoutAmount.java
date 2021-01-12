package tkhub.project.kesbewa.data.model;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002BU\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u00101\u001a\u00020\u0004H\u00c6\u0003J\t\u00102\u001a\u00020\u0011H\u00c6\u0003J\t\u00103\u001a\u00020\u0006H\u00c6\u0003J\t\u00104\u001a\u00020\bH\u00c6\u0003J\t\u00105\u001a\u00020\nH\u00c6\u0003J\t\u00106\u001a\u00020\nH\u00c6\u0003J\t\u00107\u001a\u00020\nH\u00c6\u0003J\t\u00108\u001a\u00020\bH\u00c6\u0003J\t\u00109\u001a\u00020\bH\u00c6\u0003J\t\u0010:\u001a\u00020\bH\u00c6\u0003Jm\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\t\u0010<\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@H\u00d6\u0003J\t\u0010A\u001a\u00020\u0006H\u00d6\u0001J\t\u0010B\u001a\u00020\bH\u00d6\u0001J\u0019\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0006H\u00d6\u0001R\u001a\u0010\u000e\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u000f\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R\u001a\u0010\r\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001a\u00a8\u0006H"}, d2 = {"Ltkhub/project/kesbewa/data/model/FinalCheckoutAmount;", "Landroid/os/Parcelable;", "()V", "id", "", "itemCount", "", "discount", "", "deliveryCharges", "", "subtotal", "needtoPay", "promoType", "delivery", "promoCode", "promo", "Ltkhub/project/kesbewa/data/model/PromoCode;", "(JILjava/lang/String;DDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltkhub/project/kesbewa/data/model/PromoCode;)V", "getDelivery", "()Ljava/lang/String;", "setDelivery", "(Ljava/lang/String;)V", "getDeliveryCharges", "()D", "setDeliveryCharges", "(D)V", "getDiscount", "setDiscount", "getId", "()J", "setId", "(J)V", "getItemCount", "()I", "setItemCount", "(I)V", "getNeedtoPay", "setNeedtoPay", "getPromo", "()Ltkhub/project/kesbewa/data/model/PromoCode;", "setPromo", "(Ltkhub/project/kesbewa/data/model/PromoCode;)V", "getPromoCode", "setPromoCode", "getPromoType", "setPromoType", "getSubtotal", "setSubtotal", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"})
public final class FinalCheckoutAmount implements android.os.Parcelable {
    private long id;
    private int itemCount;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String discount;
    private double deliveryCharges;
    private double subtotal;
    private double needtoPay;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String promoType;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String delivery;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String promoCode;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.data.model.PromoCode promo;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    public final int getItemCount() {
        return 0;
    }
    
    public final void setItemCount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDiscount() {
        return null;
    }
    
    public final void setDiscount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getDeliveryCharges() {
        return 0.0;
    }
    
    public final void setDeliveryCharges(double p0) {
    }
    
    public final double getSubtotal() {
        return 0.0;
    }
    
    public final void setSubtotal(double p0) {
    }
    
    public final double getNeedtoPay() {
        return 0.0;
    }
    
    public final void setNeedtoPay(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPromoType() {
        return null;
    }
    
    public final void setPromoType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDelivery() {
        return null;
    }
    
    public final void setDelivery(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPromoCode() {
        return null;
    }
    
    public final void setPromoCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.PromoCode getPromo() {
        return null;
    }
    
    public final void setPromo(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.PromoCode p0) {
    }
    
    public FinalCheckoutAmount(long id, int itemCount, @org.jetbrains.annotations.NotNull()
    java.lang.String discount, double deliveryCharges, double subtotal, double needtoPay, @org.jetbrains.annotations.NotNull()
    java.lang.String promoType, @org.jetbrains.annotations.NotNull()
    java.lang.String delivery, @org.jetbrains.annotations.NotNull()
    java.lang.String promoCode, @org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.PromoCode promo) {
        super();
    }
    
    public FinalCheckoutAmount() {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.PromoCode component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.FinalCheckoutAmount copy(long id, int itemCount, @org.jetbrains.annotations.NotNull()
    java.lang.String discount, double deliveryCharges, double subtotal, double needtoPay, @org.jetbrains.annotations.NotNull()
    java.lang.String promoType, @org.jetbrains.annotations.NotNull()
    java.lang.String delivery, @org.jetbrains.annotations.NotNull()
    java.lang.String promoCode, @org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.PromoCode promo) {
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