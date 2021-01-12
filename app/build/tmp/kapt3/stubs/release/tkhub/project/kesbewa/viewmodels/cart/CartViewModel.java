package tkhub.project.kesbewa.viewmodels.cart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u00a4\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001J\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001J\u0007\u0010!\u001a\u00030\u0097\u0001J\u0012\u0010\u0099\u0001\u001a\u00030\u0097\u00012\b\u0010\u009a\u0001\u001a\u00030\u009b\u0001J\u0011\u0010\u009c\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u0014J\b\u0010\u009e\u0001\u001a\u00030\u0097\u0001J\u0011\u0010\u009f\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u0014J\u0011\u0010\u00a0\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u00a1\u0001\u001a\u000209J\u0011\u0010\u00a2\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u00a3\u0001\u001a\u00020\fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0&0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\"R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R&\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0&0\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010-R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R!\u00108\u001a\b\u0012\u0004\u0012\u0002090\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b:\u0010;R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\f0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010\"R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010CR\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\f0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010\"R\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\f0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010\"R\u001a\u0010H\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u0010M\u001a\u0004\u0018\u00010NX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\t0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010\"R\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010\"R \u0010W\u001a\b\u0012\u0004\u0012\u00020B0AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010C\"\u0004\bY\u0010ZR \u0010[\u001a\b\u0012\u0004\u0012\u00020B0AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010C\"\u0004\b]\u0010ZR\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010\"R\u001a\u0010`\u001a\u00020aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00140\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00140\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010h\u001a\b\u0012\u0004\u0012\u0002090\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010\"R\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020\f0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010\"R \u0010l\u001a\b\u0012\u0004\u0012\u00020\t0AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010C\"\u0004\bn\u0010ZR \u0010o\u001a\b\u0012\u0004\u0012\u00020\t0AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010C\"\u0004\bq\u0010ZR \u0010r\u001a\b\u0012\u0004\u0012\u00020\t0AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010C\"\u0004\bt\u0010ZR \u0010u\u001a\b\u0012\u0004\u0012\u00020\t0AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010C\"\u0004\bw\u0010ZR \u0010x\u001a\b\u0012\u0004\u0012\u00020\t0AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010C\"\u0004\bz\u0010ZR \u0010{\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010;\"\u0004\b}\u0010~R\"\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\t0AX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010C\"\u0005\b\u0081\u0001\u0010ZR#\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\t0AX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010C\"\u0005\b\u0084\u0001\u0010ZR#\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\t0AX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010C\"\u0005\b\u0087\u0001\u0010ZR#\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\t0AX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010C\"\u0005\b\u008a\u0001\u0010ZR$\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u0002090\b8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u008d\u0001\u0010=\u001a\u0005\b\u008c\u0001\u0010;R\u0019\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010\"R%\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u0091\u00010\b8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0093\u0001\u0010=\u001a\u0005\b\u0092\u0001\u0010;R\u0019\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u001f\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010\"\u00a8\u0006\u00a5\u0001"}, d2 = {"Ltkhub/project/kesbewa/viewmodels/cart/CartViewModel;", "Landroidx/lifecycle/ViewModel;", "dataDao", "Ltkhub/project/kesbewa/data/db/OrderDao;", "context", "Landroid/content/Context;", "(Ltkhub/project/kesbewa/data/db/OrderDao;Landroid/content/Context;)V", "_checkPromocodeCall", "Landroidx/lifecycle/MutableLiveData;", "", "_checkPromocodeUseageCall", "_cityListUpdateStatus", "", "_deliveryAddresUpdateStatus", "Ltkhub/project/kesbewa/data/model/NetworkError;", "_getCartItem", "_itemCountUpdateStatus", "_noteUpdateStatus", "_orderUpdateStatus", "_setRemoveCartItem", "Ltkhub/project/kesbewa/data/model/CartItem;", "_setUpdateCartItem", "_subtotalUpdateStatus", "_userTypeCheckStatus", "cart", "", "getCart", "()Ljava/util/List;", "setCart", "(Ljava/util/List;)V", "cartItems", "Landroidx/lifecycle/LiveData;", "Ltkhub/project/kesbewa/data/responsmodel/CartResult;", "getCartItems", "()Landroidx/lifecycle/LiveData;", "checkPromocodeCall", "getCheckPromocodeCall", "checkPromocodeResponse", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult;", "getCheckPromocodeResponse", "checkPromocodeUseageCall", "getCheckPromocodeUseageCall", "checkPromocodeUseageResponse", "getCheckPromocodeUseageResponse", "setCheckPromocodeUseageResponse", "(Landroidx/lifecycle/LiveData;)V", "cityListUpdateStatus", "getCityListUpdateStatus", "database", "Lcom/google/firebase/database/FirebaseDatabase;", "getDatabase", "()Lcom/google/firebase/database/FirebaseDatabase;", "setDatabase", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "deliveryAddresUpdateStatus", "getDeliveryAddresUpdateStatus", "deliveryCharges", "", "getDeliveryCharges", "()Landroidx/lifecycle/MutableLiveData;", "deliveryCharges$delegate", "Lkotlin/Lazy;", "getCartItem", "getGetCartItem", "isUserSaveVisible", "Landroidx/databinding/ObservableField;", "", "()Landroidx/databinding/ObservableField;", "itemCount", "getItemCount", "itemCountUpdateStatus", "getItemCountUpdateStatus", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "myRef", "Lcom/google/firebase/database/DatabaseReference;", "getMyRef", "()Lcom/google/firebase/database/DatabaseReference;", "setMyRef", "(Lcom/google/firebase/database/DatabaseReference;)V", "noteUpdateStatus", "getNoteUpdateStatus", "orderUpdateStatus", "getOrderUpdateStatus", "promocodeBtnVisibility", "getPromocodeBtnVisibility", "setPromocodeBtnVisibility", "(Landroidx/databinding/ObservableField;)V", "promocodeProgress", "getPromocodeProgress", "setPromocodeProgress", "removeCartItem", "getRemoveCartItem", "repo", "Ltkhub/project/kesbewa/repo/CartRepo;", "getRepo", "()Ltkhub/project/kesbewa/repo/CartRepo;", "setRepo", "(Ltkhub/project/kesbewa/repo/CartRepo;)V", "setRemoveCartItem", "setUpdateCartItem", "subtotal", "getSubtotal", "subtotalUpdateStatus", "getSubtotalUpdateStatus", "textCheckOutItemCount", "getTextCheckOutItemCount", "setTextCheckOutItemCount", "textDelivery", "getTextDelivery", "setTextDelivery", "textDiscount", "getTextDiscount", "setTextDiscount", "textItemCount", "getTextItemCount", "setTextItemCount", "textNeedToPay", "getTextNeedToPay", "setTextNeedToPay", "textPromoCode", "getTextPromoCode", "setTextPromoCode", "(Landroidx/lifecycle/MutableLiveData;)V", "textPromotions", "getTextPromotions", "setTextPromotions", "textSelectedAddress", "getTextSelectedAddress", "setTextSelectedAddress", "textSubTotal", "getTextSubTotal", "setTextSubTotal", "textcheckoutsubtotal", "getTextcheckoutsubtotal", "setTextcheckoutsubtotal", "totalvalue", "getTotalvalue", "totalvalue$delegate", "updateCartItem", "getUpdateCartItem", "userCode", "", "getUserCode", "userCode$delegate", "userTypeCheckStatus", "getUserTypeCheckStatus", "checkPromoCode", "", "checkPromoCodeUse", "goToCheckOut", "view", "Landroid/view/View;", "removeCart", "cartItem", "setPromoTypeToUI", "updateCart", "updateSubTotalUI", "tot", "updateitemCountUI", "count", "LiveDataVMFactory", "app_release"})
public final class CartViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.repo.CartRepo repo;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference myRef;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.FirebaseDatabase database;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> textItemCount;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> textSubTotal;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _getCartItem = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> getCartItem = null;
    private final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.CartItem> _setRemoveCartItem = null;
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.CartItem> setRemoveCartItem = null;
    private final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.CartItem> _setUpdateCartItem = null;
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.CartItem> setUpdateCartItem = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _itemCountUpdateStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> itemCountUpdateStatus = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _subtotalUpdateStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> subtotalUpdateStatus = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _cityListUpdateStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> cityListUpdateStatus = null;
    private final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.NetworkError> _deliveryAddresUpdateStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.NetworkError> deliveryAddresUpdateStatus = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _noteUpdateStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> noteUpdateStatus = null;
    private final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.NetworkError> _orderUpdateStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.NetworkError> orderUpdateStatus = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _checkPromocodeCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> checkPromocodeCall = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _checkPromocodeUseageCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> checkPromocodeUseageCall = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> promocodeProgress;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> promocodeBtnVisibility;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy deliveryCharges$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy totalvalue$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> textSelectedAddress;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> textDelivery;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> textcheckoutsubtotal;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> textDiscount;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> textNeedToPay;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> textCheckOutItemCount;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> textPromoCode;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> textPromotions;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy userCode$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> isUserSaveVisible = null;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<tkhub.project.kesbewa.data.model.CartItem> cart;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.CartResult> cartItems = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.NetworkError> removeCartItem = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.NetworkError> updateCartItem = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> itemCount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Double> subtotal = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _userTypeCheckStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> userTypeCheckStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> checkPromocodeResponse = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> checkPromocodeUseageResponse;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.repo.CartRepo getRepo() {
        return null;
    }
    
    public final void setRepo(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.repo.CartRepo p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.DatabaseReference getMyRef() {
        return null;
    }
    
    public final void setMyRef(@org.jetbrains.annotations.Nullable()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.FirebaseDatabase getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.Nullable()
    com.google.firebase.database.FirebaseDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTextItemCount() {
        return null;
    }
    
    public final void setTextItemCount(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTextSubTotal() {
        return null;
    }
    
    public final void setTextSubTotal(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getGetCartItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getItemCountUpdateStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getSubtotalUpdateStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getCityListUpdateStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.NetworkError> getDeliveryAddresUpdateStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getNoteUpdateStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.NetworkError> getOrderUpdateStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCheckPromocodeCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCheckPromocodeUseageCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> getPromocodeProgress() {
        return null;
    }
    
    public final void setPromocodeProgress(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> getPromocodeBtnVisibility() {
        return null;
    }
    
    public final void setPromocodeBtnVisibility(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Double> getDeliveryCharges() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Double> getTotalvalue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTextSelectedAddress() {
        return null;
    }
    
    public final void setTextSelectedAddress(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTextDelivery() {
        return null;
    }
    
    public final void setTextDelivery(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTextcheckoutsubtotal() {
        return null;
    }
    
    public final void setTextcheckoutsubtotal(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTextDiscount() {
        return null;
    }
    
    public final void setTextDiscount(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTextNeedToPay() {
        return null;
    }
    
    public final void setTextNeedToPay(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTextCheckOutItemCount() {
        return null;
    }
    
    public final void setTextCheckOutItemCount(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTextPromoCode() {
        return null;
    }
    
    public final void setTextPromoCode(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTextPromotions() {
        return null;
    }
    
    public final void setTextPromotions(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getUserCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isUserSaveVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<tkhub.project.kesbewa.data.model.CartItem> getCart() {
        return null;
    }
    
    public final void setCart(@org.jetbrains.annotations.NotNull()
    java.util.List<tkhub.project.kesbewa.data.model.CartItem> p0) {
    }
    
    public final void getCartItems() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.CartResult> getCartItems() {
        return null;
    }
    
    public final void removeCart(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.CartItem cartItem) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.NetworkError> getRemoveCartItem() {
        return null;
    }
    
    public final void updateCart(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.CartItem cartItem) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.NetworkError> getUpdateCartItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getItemCount() {
        return null;
    }
    
    public final void updateitemCountUI(int count) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Double> getSubtotal() {
        return null;
    }
    
    public final void updateSubTotalUI(double tot) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getUserTypeCheckStatus() {
        return null;
    }
    
    public final void goToCheckOut(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void checkPromoCode() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> getCheckPromocodeResponse() {
        return null;
    }
    
    public final void checkPromoCodeUse() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> getCheckPromocodeUseageResponse() {
        return null;
    }
    
    public final void setCheckPromocodeUseageResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> p0) {
    }
    
    public final void setPromoTypeToUI() {
    }
    
    public CartViewModel(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.db.OrderDao dataDao, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u000b\u001a\u0002H\f\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Ltkhub/project/kesbewa/viewmodels/cart/CartViewModel$LiveDataVMFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "app", "Landroid/content/Context;", "getApp", "()Landroid/content/Context;", "setApp", "(Landroid/content/Context;)V", "dataDAO", "Ltkhub/project/kesbewa/data/db/OrderDao;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"})
    public static final class LiveDataVMFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        @org.jetbrains.annotations.NotNull()
        private static android.content.Context app;
        private static final tkhub.project.kesbewa.data.db.OrderDao dataDAO = null;
        public static final tkhub.project.kesbewa.viewmodels.cart.CartViewModel.LiveDataVMFactory INSTANCE = null;
        
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