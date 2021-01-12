package tkhub.project.kesbewa.data.responsmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b\u00a8\u0006\f"}, d2 = {"Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult;", "T", "", "()V", "ExceptionError", "InProgress", "LogicError", "Success", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult$Success;", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult$InProgress;", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult$ExceptionError;", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult$LogicError;", "app_release"})
public abstract class KesbewaResult<T extends java.lang.Object> {
    
    private KesbewaResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult$Success;", "T", "", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_release"})
    public static final class Success<T extends java.lang.Object> extends tkhub.project.kesbewa.data.responsmodel.KesbewaResult<T> {
        @org.jetbrains.annotations.NotNull()
        private final T data = null;
        
        @org.jetbrains.annotations.NotNull()
        public final T getData() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.NotNull()
        T data) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult$InProgress;", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult;", "", "()V", "app_release"})
    public static final class InProgress extends tkhub.project.kesbewa.data.responsmodel.KesbewaResult {
        public static final tkhub.project.kesbewa.data.responsmodel.KesbewaResult.InProgress INSTANCE = null;
        
        private InProgress() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0013\b\u0002\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u00a2\u0006\u0002\u0010\u0006R\u0015\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0001\n\u00a8\u0006\u000b"}, d2 = {"Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult$ExceptionError;", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult;", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "ExError", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult$ExceptionError$ExError;", "app_release"})
    public static abstract class ExceptionError extends tkhub.project.kesbewa.data.responsmodel.KesbewaResult {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Exception exception = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Exception getException() {
            return null;
        }
        
        private ExceptionError(java.lang.Exception exception) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult$ExceptionError$ExError;", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult$ExceptionError;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "app_release"})
        public static final class ExError extends tkhub.project.kesbewa.data.responsmodel.KesbewaResult.ExceptionError {
            
            public ExError(@org.jetbrains.annotations.NotNull()
            java.lang.Exception exception) {
                super(null);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\t\u00a8\u0006\n"}, d2 = {"Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult$LogicError;", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult;", "", "exception", "Ltkhub/project/kesbewa/data/model/NetworkError;", "(Ltkhub/project/kesbewa/data/model/NetworkError;)V", "getException", "()Ltkhub/project/kesbewa/data/model/NetworkError;", "LogError", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult$LogicError$LogError;", "app_release"})
    public static abstract class LogicError extends tkhub.project.kesbewa.data.responsmodel.KesbewaResult {
        @org.jetbrains.annotations.NotNull()
        private final tkhub.project.kesbewa.data.model.NetworkError exception = null;
        
        @org.jetbrains.annotations.NotNull()
        public final tkhub.project.kesbewa.data.model.NetworkError getException() {
            return null;
        }
        
        private LogicError(tkhub.project.kesbewa.data.model.NetworkError exception) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult$LogicError$LogError;", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult$LogicError;", "exception", "Ltkhub/project/kesbewa/data/model/NetworkError;", "(Ltkhub/project/kesbewa/data/model/NetworkError;)V", "app_release"})
        public static final class LogError extends tkhub.project.kesbewa.data.responsmodel.KesbewaResult.LogicError {
            
            public LogError(@org.jetbrains.annotations.NotNull()
            tkhub.project.kesbewa.data.model.NetworkError exception) {
                super(null);
            }
        }
    }
}