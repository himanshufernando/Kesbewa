package tkhub.project.kesbewa.data.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\u0014\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\u0015\u001a\u00020\u0016H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J \u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0016H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Ltkhub/project/kesbewa/data/db/OrderDao;", "", "checkItemAlreadyAdded", "", "proid", "", "proSize", "", "proColour", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCart", "item", "Ltkhub/project/kesbewa/data/model/CartItem;", "(Ltkhub/project/kesbewa/data/model/CartItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCartCount", "getCartItems", "", "getQuantityTotal", "getSubTotal", "", "insertCart", "cart", "selctAll", "updateCart", "updateTour", "tid", "qty", "price", "app_release"})
public abstract interface OrderDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertCart(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.CartItem cart, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT COUNT(pro_id) FROM carttable WHERE pro_id = :proid AND pro_size = :proSize AND pro_colour_code = :proColour AND cartStatus = 1")
    public abstract java.lang.Object checkItemAlreadyAdded(long proid, @org.jetbrains.annotations.NotNull()
    java.lang.String proSize, @org.jetbrains.annotations.NotNull()
    java.lang.String proColour, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p3);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM carttable ")
    public abstract java.lang.Object selctAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<tkhub.project.kesbewa.data.model.CartItem>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT COUNT(pro_id) FROM carttable WHERE cartStatus = 1")
    public abstract java.lang.Object getCartCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM carttable where cartStatus = 1")
    public abstract java.lang.Object getCartItems(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<tkhub.project.kesbewa.data.model.CartItem>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateCart(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.CartItem item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @androidx.room.Query(value = "UPDATE carttable SET pro_total_qty = :qty, pro_total_price = :price  WHERE cart_id = :tid")
    public abstract int updateTour(long tid, int qty, double price);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteCart(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.CartItem item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT COALESCE(sum(pro_total_price),0.0) FROM carttable WHERE cartStatus = 1")
    public abstract java.lang.Object getSubTotal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT COALESCE(sum(pro_total_qty),0) FROM carttable WHERE cartStatus = 1")
    public abstract java.lang.Object getQuantityTotal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM carttable")
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
}