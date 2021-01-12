package tkhub.project.kesbewa.viewmodels.myorders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R#\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00170\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000f\u00a8\u0006\u001f"}, d2 = {"Ltkhub/project/kesbewa/viewmodels/myorders/MyOrdersViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_orderCurrent", "Landroidx/lifecycle/MutableLiveData;", "", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "orderCurrent", "Landroidx/lifecycle/LiveData;", "getOrderCurrent", "()Landroidx/lifecycle/LiveData;", "repo", "Ltkhub/project/kesbewa/repo/OrdersRepo;", "getRepo", "()Ltkhub/project/kesbewa/repo/OrdersRepo;", "setRepo", "(Ltkhub/project/kesbewa/repo/OrdersRepo;)V", "userCurrentOrders", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult;", "Ljava/util/ArrayList;", "Ltkhub/project/kesbewa/data/model/OrderRespons;", "getUserCurrentOrders", "getOrders", "", "code", "LiveDataVMFactory", "app_release"})
public final class MyOrdersViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.repo.OrdersRepo repo;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _orderCurrent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> orderCurrent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<java.util.ArrayList<tkhub.project.kesbewa.data.model.OrderRespons>>> userCurrentOrders = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.repo.OrdersRepo getRepo() {
        return null;
    }
    
    public final void setRepo(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.repo.OrdersRepo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getOrderCurrent() {
        return null;
    }
    
    public final void getOrders(int code) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<java.util.ArrayList<tkhub.project.kesbewa.data.model.OrderRespons>>> getUserCurrentOrders() {
        return null;
    }
    
    public MyOrdersViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\t\u001a\u0002H\n\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016\u00a2\u0006\u0002\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Ltkhub/project/kesbewa/viewmodels/myorders/MyOrdersViewModel$LiveDataVMFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "app", "Landroid/content/Context;", "getApp", "()Landroid/content/Context;", "setApp", "(Landroid/content/Context;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"})
    public static final class LiveDataVMFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        @org.jetbrains.annotations.NotNull()
        private static android.content.Context app;
        public static final tkhub.project.kesbewa.viewmodels.myorders.MyOrdersViewModel.LiveDataVMFactory INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getApp() {
            return null;
        }
        
        public final void setApp(@org.jetbrains.annotations.NotNull()
        android.content.Context p0) {
        }
        
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        private LiveDataVMFactory() {
            super();
        }
    }
}