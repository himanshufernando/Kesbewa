package tkhub.project.kesbewa.data.responsmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ltkhub/project/kesbewa/data/responsmodel/CartResult;", "", "()V", "Empty", "Success", "Ltkhub/project/kesbewa/data/responsmodel/CartResult$Success;", "Ltkhub/project/kesbewa/data/responsmodel/CartResult$Empty;", "app_release"})
public abstract class CartResult {
    
    private CartResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Ltkhub/project/kesbewa/data/responsmodel/CartResult$Success;", "Ltkhub/project/kesbewa/data/responsmodel/CartResult;", "data", "", "Ltkhub/project/kesbewa/data/model/CartItem;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "app_release"})
    public static final class Success extends tkhub.project.kesbewa.data.responsmodel.CartResult {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<tkhub.project.kesbewa.data.model.CartItem> data = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<tkhub.project.kesbewa.data.model.CartItem> getData() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.NotNull()
        java.util.List<tkhub.project.kesbewa.data.model.CartItem> data) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ltkhub/project/kesbewa/data/responsmodel/CartResult$Empty;", "Ltkhub/project/kesbewa/data/responsmodel/CartResult;", "()V", "app_release"})
    public static final class Empty extends tkhub.project.kesbewa.data.responsmodel.CartResult {
        
        public Empty() {
            super();
        }
    }
}