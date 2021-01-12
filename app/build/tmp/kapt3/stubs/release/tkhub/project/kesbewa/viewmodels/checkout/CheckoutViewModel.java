package tkhub.project.kesbewa.viewmodels.checkout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u00ba\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0007\u0010\u00a8\u0001\u001a\u00020/J\u0007\u0010\u00a9\u0001\u001a\u00020/J\u0007\u0010\u00aa\u0001\u001a\u00020/J\u0006\u0010M\u001a\u00020/J\u0007\u0010\u00ab\u0001\u001a\u00020/J\u0010\u0010\u00ac\u0001\u001a\u00020/2\u0007\u0010\u00ad\u0001\u001a\u00020\u0010J\u0010\u0010\u00ae\u0001\u001a\u00020/2\u0007\u0010\u00af\u0001\u001a\u00020^J\u0010\u0010\u00b0\u0001\u001a\u00020/2\u0007\u0010\u00af\u0001\u001a\u00020^J\u0010\u0010\u00b1\u0001\u001a\u00020/2\u0007\u0010\u00af\u0001\u001a\u00020^J\u001a\u0010\u00b2\u0001\u001a\u00020/2\b\u0010\u00b3\u0001\u001a\u00030\u00b4\u00012\u0007\u0010\u00b5\u0001\u001a\u00020\tJ\u001a\u0010\u00b6\u0001\u001a\u00020/2\b\u0010\u00b3\u0001\u001a\u00030\u00b4\u00012\u0007\u0010\u00b5\u0001\u001a\u00020\tJ\u0007\u0010\u00b7\u0001\u001a\u00020/J\u0010\u0010\u00b8\u0001\u001a\u00020/2\u0007\u0010\u00b9\u0001\u001a\u00020\"R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR \u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\t0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR1\u00103\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020504j\b\u0012\u0004\u0012\u000205`60\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b7\u00108R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\t0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010\u001fR\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\u001fR!\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00140\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bF\u00108R!\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00100\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bJ\u0010:\u001a\u0004\bI\u00108R\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020\t0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010\u001fR\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020\t0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010\u001fR \u0010O\u001a\b\u0012\u0004\u0012\u00020=0<X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010?\"\u0004\bP\u0010QR \u0010R\u001a\b\u0012\u0004\u0012\u00020=0<X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010?\"\u0004\bS\u0010QR \u0010T\u001a\b\u0012\u0004\u0012\u00020=0<X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010?\"\u0004\bU\u0010QR\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020=0<\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010?R \u0010W\u001a\b\u0012\u0004\u0012\u00020=0<X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010?\"\u0004\bX\u0010QR \u0010Y\u001a\b\u0012\u0004\u0012\u00020=0<X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010?\"\u0004\bZ\u0010QR\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020\t0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010\u001fR\u001a\u0010]\u001a\u00020^X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010c\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010\u001fR\u001a\u0010j\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0017\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010\u001fR\u001d\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140!0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010\u001fR\u001a\u0010s\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u0017\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00140\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010\u001fR\u001a\u0010z\u001a\u00020{X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR$\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\b8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0082\u0001\u0010:\u001a\u0005\b\u0081\u0001\u00108R\u0019\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020=0<\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010?R\u0019\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u001d\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010\u001fR#\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100<X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010?\"\u0005\b\u0089\u0001\u0010QR#\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100<X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010?\"\u0005\b\u008c\u0001\u0010QR#\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100<X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010?\"\u0005\b\u008f\u0001\u0010QR#\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100<X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010?\"\u0005\b\u0092\u0001\u0010QR#\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100<X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010?\"\u0005\b\u0095\u0001\u0010QR#\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100<X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010?\"\u0005\b\u0098\u0001\u0010QR#\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\t0<X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010?\"\u0005\b\u009b\u0001\u0010QR#\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100<X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010?\"\u0005\b\u009e\u0001\u0010QR#\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100<X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a0\u0001\u0010?\"\u0005\b\u00a1\u0001\u0010QR#\u0010\u00a2\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100<X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a3\u0001\u0010?\"\u0005\b\u00a4\u0001\u0010QR \u0010\u00a5\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00a6\u00010!0\u001d\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a7\u0001\u0010\u001f\u00a8\u0006\u00bb\u0001"}, d2 = {"Ltkhub/project/kesbewa/viewmodels/checkout/CheckoutViewModel;", "Landroidx/lifecycle/ViewModel;", "dataDao", "Ltkhub/project/kesbewa/data/db/OrderDao;", "context", "Landroid/content/Context;", "(Ltkhub/project/kesbewa/data/db/OrderDao;Landroid/content/Context;)V", "_calculateFinalTotalCall", "Landroidx/lifecycle/MutableLiveData;", "", "_deleteAllUpdateStatus", "_deliveryChargesCall", "_getCartItem", "_getDeliveryAddress", "_itemCountUpdateStatus", "_noteUpdateStatus", "", "_orderProcessCall", "Ltkhub/project/kesbewa/data/model/OrderRespons;", "_orderUpdateStatus", "Ltkhub/project/kesbewa/data/model/NetworkError;", "_subtotalUpdateStatus", "appPref", "Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "getAppPref", "()Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "setAppPref", "(Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;)V", "calculateFinalTotalCall", "Landroidx/lifecycle/LiveData;", "getCalculateFinalTotalCall", "()Landroidx/lifecycle/LiveData;", "calculateFinalTotalCallResponse", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult;", "Ltkhub/project/kesbewa/data/model/FinalCheckoutAmount;", "getCalculateFinalTotalCallResponse", "cart", "", "Ltkhub/project/kesbewa/data/model/CartItem;", "getCart", "()Ljava/util/List;", "setCart", "(Ljava/util/List;)V", "cartItemscheckOut", "Ltkhub/project/kesbewa/data/responsmodel/CartResult;", "getCartItemscheckOut", "deleteAllItemcheckOut", "", "getDeleteAllItemcheckOut", "deleteAllUpdateStatus", "getDeleteAllUpdateStatus", "delivery", "Ljava/util/ArrayList;", "Ltkhub/project/kesbewa/data/model/Zone;", "Lkotlin/collections/ArrayList;", "getDelivery", "()Landroidx/lifecycle/MutableLiveData;", "delivery$delegate", "Lkotlin/Lazy;", "deliveryAddressVisible", "Landroidx/databinding/ObservableField;", "", "getDeliveryAddressVisible", "()Landroidx/databinding/ObservableField;", "deliveryChargesCall", "getDeliveryChargesCall", "deliveryChargesResponse", "", "getDeliveryChargesResponse", "dispatchAvailability", "getDispatchAvailability", "dispatchAvailability$delegate", "dispatchType", "getDispatchType", "dispatchType$delegate", "getCartItem", "getGetCartItem", "getDeliveryAddress", "getGetDeliveryAddress", "isDeliveryChargesTextVisible", "setDeliveryChargesTextVisible", "(Landroidx/databinding/ObservableField;)V", "isDeliveryChargesVisible", "setDeliveryChargesVisible", "isDispatchNoteVisible", "setDispatchNoteVisible", "isOrderProcessVisible", "isPromotionTextVisible", "setPromotionTextVisible", "isPromotionVisible", "setPromotionVisible", "itemCountUpdateStatus", "getItemCountUpdateStatus", "layoutView", "Landroid/view/View;", "getLayoutView", "()Landroid/view/View;", "setLayoutView", "(Landroid/view/View;)V", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "noteUpdateStatus", "getNoteUpdateStatus", "orderError", "getOrderError", "()Ltkhub/project/kesbewa/data/model/NetworkError;", "setOrderError", "(Ltkhub/project/kesbewa/data/model/NetworkError;)V", "orderProcessCall", "getOrderProcessCall", "orderProcessResponse", "getOrderProcessResponse", "orderResponse", "getOrderResponse", "()Ltkhub/project/kesbewa/data/model/OrderRespons;", "setOrderResponse", "(Ltkhub/project/kesbewa/data/model/OrderRespons;)V", "orderUpdateStatus", "getOrderUpdateStatus", "repo", "Ltkhub/project/kesbewa/repo/CartRepo;", "getRepo", "()Ltkhub/project/kesbewa/repo/CartRepo;", "setRepo", "(Ltkhub/project/kesbewa/repo/CartRepo;)V", "storeLocation", "getStoreLocation", "storeLocation$delegate", "storeOptionVisible", "getStoreOptionVisible", "subtotalUpdateStatus", "getSubtotalUpdateStatus", "textCheckOutItemCount", "getTextCheckOutItemCount", "setTextCheckOutItemCount", "textDelivery", "getTextDelivery", "setTextDelivery", "textDiscount", "getTextDiscount", "setTextDiscount", "textDispatchNote", "getTextDispatchNote", "setTextDispatchNote", "textNeedToPay", "getTextNeedToPay", "setTextNeedToPay", "textPromoType", "getTextPromoType", "setTextPromoType", "textPromoTypeColor", "getTextPromoTypeColor", "setTextPromoTypeColor", "textSelectedAddress", "getTextSelectedAddress", "setTextSelectedAddress", "textSelectedPromoCode", "getTextSelectedPromoCode", "setTextSelectedPromoCode", "textcheckoutsubtotal", "getTextcheckoutsubtotal", "setTextcheckoutsubtotal", "userDeliveryAddress", "Ltkhub/project/kesbewa/data/model/DeliveryAddress;", "getUserDeliveryAddress", "calculateFinalTotal", "callDeliveryCharges", "clearAllOrderData", "getItemInCart", "getNote", "note", "goToAddAddress", "view", "goToHome", "goToPromoUi", "onDispatchTypeChanged", "radioGroup", "Landroid/widget/RadioGroup;", "id", "onStoreLocationChanged", "orderProcess", "setFinalTotalToUI", "finalCheckoutAmount", "LiveDataVMFactory", "app_release"})
public final class CheckoutViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.repo.CartRepo repo;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<tkhub.project.kesbewa.data.model.CartItem> cart;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _getCartItem = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> getCartItem = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _subtotalUpdateStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> subtotalUpdateStatus = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _itemCountUpdateStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> itemCountUpdateStatus = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _noteUpdateStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> noteUpdateStatus = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _deleteAllUpdateStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> deleteAllUpdateStatus = null;
    private final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.NetworkError> _orderUpdateStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.NetworkError> orderUpdateStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> isOrderProcessVisible = null;
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
    private androidx.databinding.ObservableField<java.lang.String> textSelectedPromoCode;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> textPromoType;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> isDeliveryChargesTextVisible;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> isDeliveryChargesVisible;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> isPromotionTextVisible;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> isPromotionVisible;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Integer> textPromoTypeColor;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> textDispatchNote;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> isDispatchNoteVisible;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.data.model.NetworkError orderError;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _getDeliveryAddress = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> getDeliveryAddress = null;
    private final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.OrderRespons> _orderProcessCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.OrderRespons> orderProcessCall = null;
    @org.jetbrains.annotations.NotNull()
    public android.view.View layoutView;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.data.model.OrderRespons orderResponse;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _deliveryChargesCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> deliveryChargesCall = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy delivery$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dispatchType$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy storeLocation$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> storeOptionVisible = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> deliveryAddressVisible = null;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.services.Perfrences.AppPrefs appPref;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.CartResult> cartItemscheckOut = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.DeliveryAddress>> userDeliveryAddress = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _calculateFinalTotalCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> calculateFinalTotalCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.FinalCheckoutAmount>> calculateFinalTotalCallResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> orderProcessResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<kotlin.Unit> deleteAllItemcheckOut = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Double> deliveryChargesResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dispatchAvailability$delegate = null;
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<tkhub.project.kesbewa.data.model.CartItem> getCart() {
        return null;
    }
    
    public final void setCart(@org.jetbrains.annotations.NotNull()
    java.util.List<tkhub.project.kesbewa.data.model.CartItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getGetCartItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getSubtotalUpdateStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getItemCountUpdateStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getNoteUpdateStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getDeleteAllUpdateStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.NetworkError> getOrderUpdateStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isOrderProcessVisible() {
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
    public final androidx.databinding.ObservableField<java.lang.String> getTextSelectedPromoCode() {
        return null;
    }
    
    public final void setTextSelectedPromoCode(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTextPromoType() {
        return null;
    }
    
    public final void setTextPromoType(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isDeliveryChargesTextVisible() {
        return null;
    }
    
    public final void setDeliveryChargesTextVisible(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isDeliveryChargesVisible() {
        return null;
    }
    
    public final void setDeliveryChargesVisible(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isPromotionTextVisible() {
        return null;
    }
    
    public final void setPromotionTextVisible(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isPromotionVisible() {
        return null;
    }
    
    public final void setPromotionVisible(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Integer> getTextPromoTypeColor() {
        return null;
    }
    
    public final void setTextPromoTypeColor(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTextDispatchNote() {
        return null;
    }
    
    public final void setTextDispatchNote(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isDispatchNoteVisible() {
        return null;
    }
    
    public final void setDispatchNoteVisible(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.NetworkError getOrderError() {
        return null;
    }
    
    public final void setOrderError(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.NetworkError p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getGetDeliveryAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.OrderRespons> getOrderProcessCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getLayoutView() {
        return null;
    }
    
    public final void setLayoutView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.OrderRespons getOrderResponse() {
        return null;
    }
    
    public final void setOrderResponse(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.OrderRespons p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getDeliveryChargesCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<tkhub.project.kesbewa.data.model.Zone>> getDelivery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDispatchType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getStoreLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> getStoreOptionVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> getDeliveryAddressVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.services.Perfrences.AppPrefs getAppPref() {
        return null;
    }
    
    public final void setAppPref(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.services.Perfrences.AppPrefs p0) {
    }
    
    public final void getItemInCart() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.CartResult> getCartItemscheckOut() {
        return null;
    }
    
    public final void getNote(@org.jetbrains.annotations.NotNull()
    java.lang.String note) {
    }
    
    public final void getDeliveryAddress() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.DeliveryAddress>> getUserDeliveryAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getCalculateFinalTotalCall() {
        return null;
    }
    
    public final void calculateFinalTotal() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.FinalCheckoutAmount>> getCalculateFinalTotalCallResponse() {
        return null;
    }
    
    public final void setFinalTotalToUI(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.FinalCheckoutAmount finalCheckoutAmount) {
    }
    
    public final void orderProcess() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> getOrderProcessResponse() {
        return null;
    }
    
    public final void clearAllOrderData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Unit> getDeleteAllItemcheckOut() {
        return null;
    }
    
    public final void goToPromoUi(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void goToAddAddress(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void goToHome(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void callDeliveryCharges() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Double> getDeliveryChargesResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.NetworkError> getDispatchAvailability() {
        return null;
    }
    
    public final void onDispatchTypeChanged(@org.jetbrains.annotations.NotNull()
    android.widget.RadioGroup radioGroup, int id) {
    }
    
    public final void onStoreLocationChanged(@org.jetbrains.annotations.NotNull()
    android.widget.RadioGroup radioGroup, int id) {
    }
    
    public CheckoutViewModel(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.db.OrderDao dataDao, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u000b\u001a\u0002H\f\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Ltkhub/project/kesbewa/viewmodels/checkout/CheckoutViewModel$LiveDataVMFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "app", "Landroid/content/Context;", "getApp", "()Landroid/content/Context;", "setApp", "(Landroid/content/Context;)V", "dataDAO", "Ltkhub/project/kesbewa/data/db/OrderDao;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"})
    public static final class LiveDataVMFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        @org.jetbrains.annotations.NotNull()
        private static android.content.Context app;
        private static final tkhub.project.kesbewa.data.db.OrderDao dataDAO = null;
        public static final tkhub.project.kesbewa.viewmodels.checkout.CheckoutViewModel.LiveDataVMFactory INSTANCE = null;
        
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