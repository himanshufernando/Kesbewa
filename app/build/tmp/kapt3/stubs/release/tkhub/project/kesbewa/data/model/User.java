package tkhub.project.kesbewa.data.model;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b6\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u008b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0014J\u000b\u00108\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u00104J\u000b\u0010:\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010;\u001a\u00020\u0004H\u00c6\u0003J\t\u0010<\u001a\u00020\u0012H\u00c6\u0003J\t\u0010=\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u00b0\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0002\u0010GJ\t\u0010H\u001a\u00020IH\u00d6\u0001J\u0013\u0010J\u001a\u00020\u00122\b\u0010K\u001a\u0004\u0018\u00010LH\u00d6\u0003J\t\u0010M\u001a\u00020IH\u00d6\u0001J\t\u0010N\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020IH\u00d6\u0001R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0018R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b3\u00104\"\u0004\b5\u00106\u00a8\u0006T"}, d2 = {"Ltkhub/project/kesbewa/data/model/User;", "Landroid/os/Parcelable;", "()V", "user_id", "", "user_code", "user_name", "user_phone", "user_email", "user_nic", "user_login", "user_pro_pic", "user_android_id", "user_type", "", "push_id", "user_confirm_password", "user_google", "", "user_google_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getPush_id", "()Ljava/lang/String;", "setPush_id", "(Ljava/lang/String;)V", "getUser_android_id", "setUser_android_id", "getUser_code", "setUser_code", "getUser_confirm_password", "setUser_confirm_password", "getUser_email", "setUser_email", "getUser_google", "()Z", "setUser_google", "(Z)V", "getUser_google_id", "setUser_google_id", "getUser_id", "setUser_id", "getUser_login", "setUser_login", "getUser_name", "setUser_name", "getUser_nic", "setUser_nic", "getUser_phone", "setUser_phone", "getUser_pro_pic", "setUser_pro_pic", "getUser_type", "()Ljava/lang/Long;", "setUser_type", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ltkhub/project/kesbewa/data/model/User;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"})
public final class User implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String user_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String user_code;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String user_name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String user_phone;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String user_email;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String user_nic;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String user_login;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String user_pro_pic;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String user_android_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long user_type;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String push_id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String user_confirm_password;
    private boolean user_google;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String user_google_id;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser_id() {
        return null;
    }
    
    public final void setUser_id(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser_code() {
        return null;
    }
    
    public final void setUser_code(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser_name() {
        return null;
    }
    
    public final void setUser_name(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser_phone() {
        return null;
    }
    
    public final void setUser_phone(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser_email() {
        return null;
    }
    
    public final void setUser_email(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser_nic() {
        return null;
    }
    
    public final void setUser_nic(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser_login() {
        return null;
    }
    
    public final void setUser_login(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser_pro_pic() {
        return null;
    }
    
    public final void setUser_pro_pic(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser_android_id() {
        return null;
    }
    
    public final void setUser_android_id(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getUser_type() {
        return null;
    }
    
    public final void setUser_type(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPush_id() {
        return null;
    }
    
    public final void setPush_id(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUser_confirm_password() {
        return null;
    }
    
    public final void setUser_confirm_password(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getUser_google() {
        return false;
    }
    
    public final void setUser_google(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUser_google_id() {
        return null;
    }
    
    public final void setUser_google_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public User(@org.jetbrains.annotations.Nullable()
    java.lang.String user_id, @org.jetbrains.annotations.Nullable()
    java.lang.String user_code, @org.jetbrains.annotations.Nullable()
    java.lang.String user_name, @org.jetbrains.annotations.Nullable()
    java.lang.String user_phone, @org.jetbrains.annotations.Nullable()
    java.lang.String user_email, @org.jetbrains.annotations.Nullable()
    java.lang.String user_nic, @org.jetbrains.annotations.Nullable()
    java.lang.String user_login, @org.jetbrains.annotations.Nullable()
    java.lang.String user_pro_pic, @org.jetbrains.annotations.Nullable()
    java.lang.String user_android_id, @org.jetbrains.annotations.Nullable()
    java.lang.Long user_type, @org.jetbrains.annotations.Nullable()
    java.lang.String push_id, @org.jetbrains.annotations.NotNull()
    java.lang.String user_confirm_password, boolean user_google, @org.jetbrains.annotations.NotNull()
    java.lang.String user_google_id) {
        super();
    }
    
    public User() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
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
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    public final boolean component13() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.User copy(@org.jetbrains.annotations.Nullable()
    java.lang.String user_id, @org.jetbrains.annotations.Nullable()
    java.lang.String user_code, @org.jetbrains.annotations.Nullable()
    java.lang.String user_name, @org.jetbrains.annotations.Nullable()
    java.lang.String user_phone, @org.jetbrains.annotations.Nullable()
    java.lang.String user_email, @org.jetbrains.annotations.Nullable()
    java.lang.String user_nic, @org.jetbrains.annotations.Nullable()
    java.lang.String user_login, @org.jetbrains.annotations.Nullable()
    java.lang.String user_pro_pic, @org.jetbrains.annotations.Nullable()
    java.lang.String user_android_id, @org.jetbrains.annotations.Nullable()
    java.lang.Long user_type, @org.jetbrains.annotations.Nullable()
    java.lang.String push_id, @org.jetbrains.annotations.NotNull()
    java.lang.String user_confirm_password, boolean user_google, @org.jetbrains.annotations.NotNull()
    java.lang.String user_google_id) {
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