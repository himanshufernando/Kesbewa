package tkhub.project.kesbewa.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B-\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\u0018\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\bH\u00d6\u0001R\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR.\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Ltkhub/project/kesbewa/data/model/Predictions;", "", "()V", "predictions", "Ljava/util/ArrayList;", "Ltkhub/project/kesbewa/data/model/GooglePlace;", "Lkotlin/collections/ArrayList;", "status", "", "error_message", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getError_message", "()Ljava/lang/String;", "setError_message", "(Ljava/lang/String;)V", "getPredictions", "()Ljava/util/ArrayList;", "setPredictions", "(Ljava/util/ArrayList;)V", "getStatus", "setStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"})
public final class Predictions {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "predictions")
    private java.util.ArrayList<tkhub.project.kesbewa.data.model.GooglePlace> predictions;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "status")
    private java.lang.String status;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "error_message")
    private java.lang.String error_message;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<tkhub.project.kesbewa.data.model.GooglePlace> getPredictions() {
        return null;
    }
    
    public final void setPredictions(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<tkhub.project.kesbewa.data.model.GooglePlace> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getError_message() {
        return null;
    }
    
    public final void setError_message(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Predictions(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<tkhub.project.kesbewa.data.model.GooglePlace> predictions, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String error_message) {
        super();
    }
    
    public Predictions() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<tkhub.project.kesbewa.data.model.GooglePlace> component1() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.Predictions copy(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<tkhub.project.kesbewa.data.model.GooglePlace> predictions, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String error_message) {
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