package tkhub.project.kesbewa.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002BU\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0010J\t\u0010*\u001a\u00020\u0004H\u00c6\u0003J\t\u0010+\u001a\u00020\bH\u00c6\u0003J\t\u0010,\u001a\u00020\u0004H\u00c6\u0003J\t\u0010-\u001a\u00020\u0004H\u00c6\u0003J\t\u0010.\u001a\u00020\bH\u00c6\u0003J\t\u0010/\u001a\u00020\bH\u00c6\u0003J\t\u00100\u001a\u00020\u000bH\u00c6\u0003J\t\u00101\u001a\u00020\u0004H\u00c6\u0003J\t\u00102\u001a\u00020\u0004H\u00c6\u0003J\t\u00103\u001a\u00020\bH\u00c6\u0003Jm\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u00c6\u0001J\u0013\u00105\u001a\u00020\u000b2\b\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u000208H\u00d6\u0001J\t\u00109\u001a\u00020\u0004H\u00d6\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b\'\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014\u00a8\u0006:"}, d2 = {"Ltkhub/project/kesbewa/data/model/VersionRespons;", "", "()V", "app_url", "", "version", "version_message", "version_code", "", "critical", "is_version_validate", "", "special_image", "special_note", "special_note_critical", "special_note_availability", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;JJ)V", "getApp_url", "()Ljava/lang/String;", "setApp_url", "(Ljava/lang/String;)V", "getCritical", "()J", "setCritical", "(J)V", "()Z", "set_version_validate", "(Z)V", "getSpecial_image", "setSpecial_image", "getSpecial_note", "setSpecial_note", "getSpecial_note_availability", "setSpecial_note_availability", "getSpecial_note_critical", "setSpecial_note_critical", "getVersion", "setVersion", "getVersion_code", "setVersion_code", "getVersion_message", "setVersion_message", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_release"})
public final class VersionRespons {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String app_url;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String version;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String version_message;
    private long version_code;
    private long critical;
    private boolean is_version_validate;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String special_image;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String special_note;
    private long special_note_critical;
    private long special_note_availability;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApp_url() {
        return null;
    }
    
    public final void setApp_url(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersion() {
        return null;
    }
    
    public final void setVersion(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersion_message() {
        return null;
    }
    
    public final void setVersion_message(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getVersion_code() {
        return 0L;
    }
    
    public final void setVersion_code(long p0) {
    }
    
    public final long getCritical() {
        return 0L;
    }
    
    public final void setCritical(long p0) {
    }
    
    public final boolean is_version_validate() {
        return false;
    }
    
    public final void set_version_validate(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSpecial_image() {
        return null;
    }
    
    public final void setSpecial_image(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSpecial_note() {
        return null;
    }
    
    public final void setSpecial_note(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getSpecial_note_critical() {
        return 0L;
    }
    
    public final void setSpecial_note_critical(long p0) {
    }
    
    public final long getSpecial_note_availability() {
        return 0L;
    }
    
    public final void setSpecial_note_availability(long p0) {
    }
    
    public VersionRespons(@org.jetbrains.annotations.NotNull()
    java.lang.String app_url, @org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    java.lang.String version_message, long version_code, long critical, boolean is_version_validate, @org.jetbrains.annotations.NotNull()
    java.lang.String special_image, @org.jetbrains.annotations.NotNull()
    java.lang.String special_note, long special_note_critical, long special_note_availability) {
        super();
    }
    
    public VersionRespons() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    public final long component9() {
        return 0L;
    }
    
    public final long component10() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.VersionRespons copy(@org.jetbrains.annotations.NotNull()
    java.lang.String app_url, @org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    java.lang.String version_message, long version_code, long critical, boolean is_version_validate, @org.jetbrains.annotations.NotNull()
    java.lang.String special_image, @org.jetbrains.annotations.NotNull()
    java.lang.String special_note, long special_note_critical, long special_note_availability) {
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