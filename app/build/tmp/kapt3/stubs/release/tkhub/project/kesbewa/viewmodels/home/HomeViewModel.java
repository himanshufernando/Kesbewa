package tkhub.project.kesbewa.viewmodels.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0006\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0002\u00b7\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001a\u001a\u00020,J\u0007\u0010\u009c\u0001\u001a\u00020,J\u0010\u0010\u009d\u0001\u001a\u00020,2\u0007\u0010\u009e\u0001\u001a\u00020\u000fJ\u0010\u0010\u009f\u0001\u001a\u00020,2\u0007\u0010\u009e\u0001\u001a\u00020\u000fJ\u0010\u0010\u00a0\u0001\u001a\u00020,2\u0007\u0010\u009e\u0001\u001a\u00020\u000fJ\u0006\u0010%\u001a\u00020,J\u0007\u0010\u00a1\u0001\u001a\u00020,J\u0013\u0010\u00a2\u0001\u001a\u00020,H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00a3\u0001J\u0011\u0010\u00a4\u0001\u001a\u00020,2\b\u0010\u00a5\u0001\u001a\u00030\u00a6\u0001J\u0010\u0010\u00a7\u0001\u001a\u00020,2\u0007\u0010\u00a8\u0001\u001a\u00020\tJ\u0007\u0010\u00a9\u0001\u001a\u00020,J\u0007\u0010\u00aa\u0001\u001a\u00020,J\u0010\u0010\u00ab\u0001\u001a\u00020,2\u0007\u0010\u00ac\u0001\u001a\u00020\u0016J\u0010\u0010\u00ad\u0001\u001a\u00020,2\u0007\u0010\u00ae\u0001\u001a\u000203J\u0007\u0010\u00af\u0001\u001a\u00020,J\u0010\u0010\u00b0\u0001\u001a\u00020,2\u0007\u0010\u00b1\u0001\u001a\u00020\tJ\u0010\u0010\u00b2\u0001\u001a\u00020,2\u0007\u0010\u00b3\u0001\u001a\u00020\u0013J\u0019\u0010\u00b4\u0001\u001a\u00020,2\u0007\u0010\u00b5\u0001\u001a\u00020\u00162\u0007\u0010\u00b6\u0001\u001a\u00020\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u001d\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR&\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020302010\u001b\u00f8\u0001\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001eR#\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000206020(0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001eR#\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209020(0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u001eR#\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000203020(0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u001eR#\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0013020(0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u001eR\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020\t0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\u001eR\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\u001eR\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\u001eR\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010\u001eR\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020I0H\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010JR \u0010K\u001a\b\u0012\u0004\u0012\u00020I0HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010J\"\u0004\bL\u0010MR \u0010N\u001a\b\u0012\u0004\u0012\u00020I0HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010J\"\u0004\bO\u0010MR\u001a\u0010P\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR1\u0010U\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020602j\b\u0012\u0004\u0012\u000206`V0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\bW\u0010XR1\u0010[\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020302j\b\u0012\u0004\u0012\u000203`V0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b]\u0010Z\u001a\u0004\b\\\u0010XR!\u0010^\u001a\b\u0012\u0004\u0012\u0002060\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b`\u0010Z\u001a\u0004\b_\u0010XR!\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00160\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bc\u0010Z\u001a\u0004\bb\u0010XR!\u0010d\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bf\u0010Z\u001a\u0004\be\u0010XR1\u0010g\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001302j\b\u0012\u0004\u0012\u00020\u0013`V0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bi\u0010Z\u001a\u0004\bh\u0010XR\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00130\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010\u001eR\u001a\u0010l\u001a\u00020mX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR!\u0010r\u001a\b\u0012\u0004\u0012\u0002030\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bt\u0010Z\u001a\u0004\bs\u0010XR \u0010u\u001a\b\u0012\u0004\u0012\u00020\u00160HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010J\"\u0004\bw\u0010MR \u0010x\u001a\b\u0012\u0004\u0012\u00020\u00160HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010J\"\u0004\bz\u0010MR \u0010{\u001a\b\u0012\u0004\u0012\u00020\u00160HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010J\"\u0004\b}\u0010MR!\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00160HX\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010J\"\u0005\b\u0080\u0001\u0010MR#\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160HX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010J\"\u0005\b\u0083\u0001\u0010MR#\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160HX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010J\"\u0005\b\u0086\u0001\u0010MR \u0010\u0087\u0001\u001a\u00030\u0088\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R#\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160HX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010J\"\u0005\b\u008f\u0001\u0010MR\u001a\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010\u001b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010\u001eR\u0019\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u001b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010\u001eR\u0019\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010\u001eR\u0019\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u001b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010\u001eR\u0019\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010\u001eR\u001f\u0010\u009a\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u001b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u00b8\u0001"}, d2 = {"Ltkhub/project/kesbewa/viewmodels/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "dataDao", "Ltkhub/project/kesbewa/data/db/OrderDao;", "context", "Landroid/content/Context;", "(Ltkhub/project/kesbewa/data/db/OrderDao;Landroid/content/Context;)V", "_addToCartStatus", "Landroidx/lifecycle/MutableLiveData;", "", "_cartCountUpdateStatus", "_checkPush", "_deleteAllUpdateStatus", "_getProducts", "_getProductsColor", "", "_getProductsImages", "_getProductsSize", "_productSizeUpdate", "Ltkhub/project/kesbewa/data/model/ProductSize;", "_totalQty", "_userPreferencesProducts", "", "_userTypeCheckStatus", "_validateGoogleSignInCall", "Ltkhub/project/kesbewa/data/model/User;", "addToCart", "Landroidx/lifecycle/LiveData;", "Ltkhub/project/kesbewa/data/responsmodel/OrderResult;", "getAddToCart", "()Landroidx/lifecycle/LiveData;", "addToCartStatus", "getAddToCartStatus", "cartCount", "getCartCount", "cartCountUpdateStatus", "getCartCountUpdateStatus", "checkPush", "getCheckPush", "checkPushResponse", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult;", "Ltkhub/project/kesbewa/data/model/NetworkError;", "getCheckPushResponse", "deleteAllItemcheckOut", "", "getDeleteAllItemcheckOut", "deleteAllUpdateStatus", "getDeleteAllUpdateStatus", "filterdProductList", "Lkotlin/Result;", "Ljava/util/ArrayList;", "Ltkhub/project/kesbewa/data/model/Products;", "getFilterdProductList", "getProductColorResponse", "Ltkhub/project/kesbewa/data/model/ProductColor;", "getGetProductColorResponse", "getProductImagesResponse", "Ltkhub/project/kesbewa/data/model/ProductImage;", "getGetProductImagesResponse", "getProductResponse", "getGetProductResponse", "getProductSizeResponse", "getGetProductSizeResponse", "getProducts", "getGetProducts", "getProductsColor", "getGetProductsColor", "getProductsImages", "getGetProductsImages", "getProductsSize", "getGetProductsSize", "isCartVisible", "Landroidx/databinding/ObservableField;", "", "()Landroidx/databinding/ObservableField;", "isProductDetailsLoaderVisible", "setProductDetailsLoaderVisible", "(Landroidx/databinding/ObservableField;)V", "isProductLoaderVisible", "setProductLoaderVisible", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "productColor", "Lkotlin/collections/ArrayList;", "getProductColor", "()Landroidx/lifecycle/MutableLiveData;", "productColor$delegate", "Lkotlin/Lazy;", "productList", "getProductList", "productList$delegate", "productSelectedColor", "getProductSelectedColor", "productSelectedColor$delegate", "productSelectedImage", "getProductSelectedImage", "productSelectedImage$delegate", "productSelectedQty", "getProductSelectedQty", "productSelectedQty$delegate", "productSize", "getProductSize", "productSize$delegate", "productSizeUpdate", "getProductSizeUpdate", "repo", "Ltkhub/project/kesbewa/repo/HomeRepo;", "getRepo", "()Ltkhub/project/kesbewa/repo/HomeRepo;", "setRepo", "(Ltkhub/project/kesbewa/repo/HomeRepo;)V", "selectedProduct", "getSelectedProduct", "selectedProduct$delegate", "textCartCount", "getTextCartCount", "setTextCartCount", "textProductCode", "getTextProductCode", "setTextProductCode", "textProductDetails", "getTextProductDetails", "setTextProductDetails", "textProductName", "getTextProductName", "setTextProductName", "textProductPrice", "getTextProductPrice", "setTextProductPrice", "textProductQty", "getTextProductQty", "setTextProductQty", "totValue", "", "getTotValue", "()D", "setTotValue", "(D)V", "totalAmount", "getTotalAmount", "setTotalAmount", "totalAmountUpdate", "getTotalAmountUpdate", "totalQty", "getTotalQty", "userPreferencesProducts", "getUserPreferencesProducts", "userTypeCheckStatus", "getUserTypeCheckStatus", "validateGoogleSignInCall", "getValidateGoogleSignInCall", "validateGoogleSignInResponse", "getValidateGoogleSignInResponse", "callGetProduct", "callGetProductColor", "proid", "callGetProductImages", "callGetProductSize", "deleteCart", "getOrderConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "goToCartUi", "view", "Landroid/view/View;", "quantityAdd", "qty", "quantityMinus", "quantityPlus", "searchProducts", "serachText", "setProductDetails", "pro", "updateCartCount", "updateCartCountUI", "count", "updateProductSelectedSize", "size", "validateGoogleSignIn", "mail", "id", "LiveDataVMFactory", "app_release"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.repo.HomeRepo repo;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> textProductName;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> textProductPrice;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> textProductDetails;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> textProductQty;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> textProductCode;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> totalAmount;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> textCartCount;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> isCartVisible = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> isProductLoaderVisible;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> isProductDetailsLoaderVisible;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy productSelectedQty$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy selectedProduct$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _userPreferencesProducts = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> userPreferencesProducts = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _totalQty = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> totalQty = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _addToCartStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> addToCartStatus = null;
    private final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.ProductSize> _productSizeUpdate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.ProductSize> productSizeUpdate = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _cartCountUpdateStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> cartCountUpdateStatus = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _userTypeCheckStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> userTypeCheckStatus = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _getProducts = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> getProducts = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _getProductsColor = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Long> getProductsColor = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _getProductsSize = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Long> getProductsSize = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _getProductsImages = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Long> getProductsImages = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _deleteAllUpdateStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> deleteAllUpdateStatus = null;
    private final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.User> _validateGoogleSignInCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.User> validateGoogleSignInCall = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _checkPush = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> checkPush = null;
    private double totValue;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<java.util.ArrayList<tkhub.project.kesbewa.data.model.ProductImage>>> getProductImagesResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<java.util.ArrayList<tkhub.project.kesbewa.data.model.ProductSize>>> getProductSizeResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<java.util.ArrayList<tkhub.project.kesbewa.data.model.ProductColor>>> getProductColorResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<java.util.ArrayList<tkhub.project.kesbewa.data.model.Products>>> getProductResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy productSelectedImage$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy productList$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<kotlin.Result<java.util.ArrayList<tkhub.project.kesbewa.data.model.Products>>> filterdProductList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy productSize$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy productColor$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy productSelectedColor$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Double> totalAmountUpdate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.OrderResult> addToCart = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> cartCount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<kotlin.Unit> deleteAllItemcheckOut = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> validateGoogleSignInResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> checkPushResponse = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.repo.HomeRepo getRepo() {
        return null;
    }
    
    public final void setRepo(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.repo.HomeRepo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTextProductName() {
        return null;
    }
    
    public final void setTextProductName(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTextProductPrice() {
        return null;
    }
    
    public final void setTextProductPrice(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTextProductDetails() {
        return null;
    }
    
    public final void setTextProductDetails(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTextProductQty() {
        return null;
    }
    
    public final void setTextProductQty(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTextProductCode() {
        return null;
    }
    
    public final void setTextProductCode(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTotalAmount() {
        return null;
    }
    
    public final void setTotalAmount(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTextCartCount() {
        return null;
    }
    
    public final void setTextCartCount(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isCartVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isProductLoaderVisible() {
        return null;
    }
    
    public final void setProductLoaderVisible(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isProductDetailsLoaderVisible() {
        return null;
    }
    
    public final void setProductDetailsLoaderVisible(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getProductSelectedQty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.Products> getSelectedProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getUserPreferencesProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getTotalQty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getAddToCartStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.ProductSize> getProductSizeUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getCartCountUpdateStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getUserTypeCheckStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getGetProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getGetProductsColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getGetProductsSize() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getGetProductsImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getDeleteAllUpdateStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.User> getValidateGoogleSignInCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getCheckPush() {
        return null;
    }
    
    public final double getTotValue() {
        return 0.0;
    }
    
    public final void setTotValue(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrderConfig(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    public final void callGetProduct() {
    }
    
    public final void callGetProductColor(long proid) {
    }
    
    public final void callGetProductSize(long proid) {
    }
    
    public final void callGetProductImages(long proid) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<java.util.ArrayList<tkhub.project.kesbewa.data.model.ProductImage>>> getGetProductImagesResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<java.util.ArrayList<tkhub.project.kesbewa.data.model.ProductSize>>> getGetProductSizeResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<java.util.ArrayList<tkhub.project.kesbewa.data.model.ProductColor>>> getGetProductColorResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<java.util.ArrayList<tkhub.project.kesbewa.data.model.Products>>> getGetProductResponse() {
        return null;
    }
    
    public final void setProductDetails(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.Products pro) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getProductSelectedImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<tkhub.project.kesbewa.data.model.Products>> getProductList() {
        return null;
    }
    
    public final void searchProducts(@org.jetbrains.annotations.NotNull()
    java.lang.String serachText) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<java.util.ArrayList<tkhub.project.kesbewa.data.model.Products>>> getFilterdProductList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<tkhub.project.kesbewa.data.model.ProductSize>> getProductSize() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<tkhub.project.kesbewa.data.model.ProductColor>> getProductColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.ProductColor> getProductSelectedColor() {
        return null;
    }
    
    public final void updateProductSelectedSize(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.ProductSize size) {
    }
    
    public final void quantityPlus() {
    }
    
    public final void quantityMinus() {
    }
    
    public final void quantityAdd(int qty) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Double> getTotalAmountUpdate() {
        return null;
    }
    
    public final void addToCart() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.OrderResult> getAddToCart() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getCartCount() {
        return null;
    }
    
    public final void updateCartCountUI(int count) {
    }
    
    public final void updateCartCount() {
    }
    
    public final void goToCartUi(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void deleteCart() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Unit> getDeleteAllItemcheckOut() {
        return null;
    }
    
    public final void validateGoogleSignIn(@org.jetbrains.annotations.NotNull()
    java.lang.String mail, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> getValidateGoogleSignInResponse() {
        return null;
    }
    
    public final void checkPush() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> getCheckPushResponse() {
        return null;
    }
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.db.OrderDao dataDao, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u000b\u001a\u0002H\f\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Ltkhub/project/kesbewa/viewmodels/home/HomeViewModel$LiveDataVMFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "app", "Landroid/content/Context;", "getApp", "()Landroid/content/Context;", "setApp", "(Landroid/content/Context;)V", "dataDAO", "Ltkhub/project/kesbewa/data/db/OrderDao;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"})
    public static final class LiveDataVMFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        @org.jetbrains.annotations.NotNull()
        private static android.content.Context app;
        private static final tkhub.project.kesbewa.data.db.OrderDao dataDAO = null;
        public static final tkhub.project.kesbewa.viewmodels.home.HomeViewModel.LiveDataVMFactory INSTANCE = null;
        
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