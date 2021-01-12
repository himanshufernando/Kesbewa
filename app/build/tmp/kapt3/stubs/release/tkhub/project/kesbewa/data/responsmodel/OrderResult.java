package tkhub.project.kesbewa.data.responsmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ltkhub/project/kesbewa/data/responsmodel/OrderResult;", "", "()V", "Failure", "Success", "Ltkhub/project/kesbewa/data/responsmodel/OrderResult$Success;", "Ltkhub/project/kesbewa/data/responsmodel/OrderResult$Failure;", "app_release"})
public abstract class OrderResult {
    
    private OrderResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Ltkhub/project/kesbewa/data/responsmodel/OrderResult$Success;", "Ltkhub/project/kesbewa/data/responsmodel/OrderResult;", "data", "Ltkhub/orderject/kesbewa/data/model/Order;", "(Ltkhub/orderject/kesbewa/data/model/Order;)V", "getData", "()Ltkhub/orderject/kesbewa/data/model/Order;", "app_release"})
    public static final class Success extends tkhub.project.kesbewa.data.responsmodel.OrderResult {
        @org.jetbrains.annotations.NotNull()
        private final tkhub.orderject.kesbewa.data.model.Order data = null;
        
        @org.jetbrains.annotations.NotNull()
        public final tkhub.orderject.kesbewa.data.model.Order getData() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.NotNull()
        tkhub.orderject.kesbewa.data.model.Order data) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Ltkhub/project/kesbewa/data/responsmodel/OrderResult$Failure;", "Ltkhub/project/kesbewa/data/responsmodel/OrderResult;", "error", "Ltkhub/project/kesbewa/data/model/NetworkError;", "(Ltkhub/project/kesbewa/data/model/NetworkError;)V", "getError", "()Ltkhub/project/kesbewa/data/model/NetworkError;", "app_release"})
    public static final class Failure extends tkhub.project.kesbewa.data.responsmodel.OrderResult {
        @org.jetbrains.annotations.NotNull()
        private final tkhub.project.kesbewa.data.model.NetworkError error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final tkhub.project.kesbewa.data.model.NetworkError getError() {
            return null;
        }
        
        public Failure(@org.jetbrains.annotations.NotNull()
        tkhub.project.kesbewa.data.model.NetworkError error) {
            super();
        }
    }
}