package tkhub.project.kesbewa.ui.fragment;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010F\u001a\u00020G2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020J0IH\u0002J\u0016\u0010K\u001a\u00020G2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020M0IH\u0002J\u0016\u0010N\u001a\u00020G2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020P0IH\u0002J\b\u0010Q\u001a\u00020GH\u0002J\b\u0010R\u001a\u00020GH\u0002J\b\u0010S\u001a\u00020GH\u0002J\u0010\u0010T\u001a\u00020G2\u0006\u0010U\u001a\u00020VH\u0002J\b\u0010W\u001a\u00020GH\u0002J\b\u0010X\u001a\u00020GH\u0002J\b\u0010Y\u001a\u00020GH\u0002J\b\u0010Z\u001a\u00020GH\u0002J&\u0010[\u001a\u0004\u0018\u00010\\2\u0006\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010`2\b\u0010a\u001a\u0004\u0018\u00010bH\u0016J\b\u0010c\u001a\u00020GH\u0016J\b\u0010d\u001a\u00020GH\u0016J\u001a\u0010e\u001a\u00020G2\u0006\u0010f\u001a\u00020\\2\b\u0010a\u001a\u0004\u0018\u00010bH\u0016J\u0018\u0010g\u001a\u00020G2\u0006\u0010h\u001a\u00020&2\u0006\u0010i\u001a\u00020jH\u0002J\b\u0010k\u001a\u00020GH\u0002J\b\u0010l\u001a\u00020GH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u000202X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010=\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0016\"\u0004\b?\u0010\u0018R\u001b\u0010@\u001a\u00020A8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bB\u0010C\u00a8\u0006m"}, d2 = {"Ltkhub/project/kesbewa/ui/fragment/ProductDetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Ltkhub/project/kesbewa/ui/adapters/ProductsImagesAdapter;", "getAdapter", "()Ltkhub/project/kesbewa/ui/adapters/ProductsImagesAdapter;", "adapterColor", "Ltkhub/project/kesbewa/ui/adapters/ProductsColorAdapter;", "getAdapterColor", "()Ltkhub/project/kesbewa/ui/adapters/ProductsColorAdapter;", "adapterLargeImages", "Ltkhub/project/kesbewa/ui/adapters/ProductsLargeImagesAdapter;", "getAdapterLargeImages", "()Ltkhub/project/kesbewa/ui/adapters/ProductsLargeImagesAdapter;", "adapterSize", "Ltkhub/project/kesbewa/ui/adapters/ProductsSizeAdapter;", "getAdapterSize", "()Ltkhub/project/kesbewa/ui/adapters/ProductsSizeAdapter;", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "getAlertDialog", "()Landroidx/appcompat/app/AlertDialog;", "setAlertDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "binding", "Ltkhub/project/kesbewa/databinding/FragmentProductDetailBinding;", "getBinding", "()Ltkhub/project/kesbewa/databinding/FragmentProductDetailBinding;", "setBinding", "(Ltkhub/project/kesbewa/databinding/FragmentProductDetailBinding;)V", "bindingQtyDialog", "Ltkhub/project/kesbewa/databinding/DialogQuantityBinding;", "getBindingQtyDialog", "()Ltkhub/project/kesbewa/databinding/DialogQuantityBinding;", "setBindingQtyDialog", "(Ltkhub/project/kesbewa/databinding/DialogQuantityBinding;)V", "currentImageItem", "", "getCurrentImageItem", "()I", "setCurrentImageItem", "(I)V", "dialogStockProductQty", "Landroid/app/Dialog;", "getDialogStockProductQty", "()Landroid/app/Dialog;", "setDialogStockProductQty", "(Landroid/app/Dialog;)V", "media", "Landroid/widget/MediaController;", "getMedia", "()Landroid/widget/MediaController;", "setMedia", "(Landroid/widget/MediaController;)V", "selectedProdect", "Ltkhub/project/kesbewa/data/model/Products;", "getSelectedProdect", "()Ltkhub/project/kesbewa/data/model/Products;", "setSelectedProdect", "(Ltkhub/project/kesbewa/data/model/Products;)V", "singUpDialog", "getSingUpDialog", "setSingUpDialog", "viewmodel", "Ltkhub/project/kesbewa/viewmodels/home/HomeViewModel;", "getViewmodel", "()Ltkhub/project/kesbewa/viewmodels/home/HomeViewModel;", "viewmodel$delegate", "Lkotlin/Lazy;", "addProductColor", "", "productColorList", "Ljava/util/ArrayList;", "Ltkhub/project/kesbewa/data/model/ProductColor;", "addProductDetailsToUI", "productimageList", "Ltkhub/project/kesbewa/data/model/ProductImage;", "addProductSize", "productSizeList", "Ltkhub/project/kesbewa/data/model/ProductSize;", "addToCartObserver", "animation", "dialogProductQty", "errorAlertDialog", "networkError", "Ltkhub/project/kesbewa/data/model/NetworkError;", "getProductColorObserver", "getProductImagesbserver", "getProductSizeObserver", "goToRegistor", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onStop", "onViewCreated", "view", "setWindowFlag", "bits", "on", "", "trasperat", "userTypeCheckObserver", "app_release"})
public final class ProductDetailFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog alertDialog;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog singUpDialog;
    @org.jetbrains.annotations.NotNull()
    private final tkhub.project.kesbewa.ui.adapters.ProductsImagesAdapter adapter = null;
    @org.jetbrains.annotations.NotNull()
    private final tkhub.project.kesbewa.ui.adapters.ProductsSizeAdapter adapterSize = null;
    @org.jetbrains.annotations.NotNull()
    private final tkhub.project.kesbewa.ui.adapters.ProductsColorAdapter adapterColor = null;
    @org.jetbrains.annotations.NotNull()
    private final tkhub.project.kesbewa.ui.adapters.ProductsLargeImagesAdapter adapterLargeImages = null;
    @org.jetbrains.annotations.NotNull()
    public android.widget.MediaController media;
    @org.jetbrains.annotations.NotNull()
    public tkhub.project.kesbewa.databinding.FragmentProductDetailBinding binding;
    @org.jetbrains.annotations.NotNull()
    public tkhub.project.kesbewa.databinding.DialogQuantityBinding bindingQtyDialog;
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog dialogStockProductQty;
    private final kotlin.Lazy viewmodel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public tkhub.project.kesbewa.data.model.Products selectedProdect;
    private int currentImageItem;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AlertDialog getAlertDialog() {
        return null;
    }
    
    public final void setAlertDialog(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AlertDialog getSingUpDialog() {
        return null;
    }
    
    public final void setSingUpDialog(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.ui.adapters.ProductsImagesAdapter getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.ui.adapters.ProductsSizeAdapter getAdapterSize() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.ui.adapters.ProductsColorAdapter getAdapterColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.ui.adapters.ProductsLargeImagesAdapter getAdapterLargeImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.MediaController getMedia() {
        return null;
    }
    
    public final void setMedia(@org.jetbrains.annotations.NotNull()
    android.widget.MediaController p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.databinding.FragmentProductDetailBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.databinding.FragmentProductDetailBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.databinding.DialogQuantityBinding getBindingQtyDialog() {
        return null;
    }
    
    public final void setBindingQtyDialog(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.databinding.DialogQuantityBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Dialog getDialogStockProductQty() {
        return null;
    }
    
    public final void setDialogStockProductQty(@org.jetbrains.annotations.NotNull()
    android.app.Dialog p0) {
    }
    
    private final tkhub.project.kesbewa.viewmodels.home.HomeViewModel getViewmodel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.Products getSelectedProdect() {
        return null;
    }
    
    public final void setSelectedProdect(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.Products p0) {
    }
    
    public final int getCurrentImageItem() {
        return 0;
    }
    
    public final void setCurrentImageItem(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    private final void addToCartObserver() {
    }
    
    private final void userTypeCheckObserver() {
    }
    
    private final void getProductColorObserver() {
    }
    
    private final void getProductSizeObserver() {
    }
    
    private final void getProductImagesbserver() {
    }
    
    private final void goToRegistor() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void errorAlertDialog(tkhub.project.kesbewa.data.model.NetworkError networkError) {
    }
    
    private final void addProductDetailsToUI(java.util.ArrayList<tkhub.project.kesbewa.data.model.ProductImage> productimageList) {
    }
    
    private final void addProductSize(java.util.ArrayList<tkhub.project.kesbewa.data.model.ProductSize> productSizeList) {
    }
    
    private final void addProductColor(java.util.ArrayList<tkhub.project.kesbewa.data.model.ProductColor> productColorList) {
    }
    
    private final void animation() {
    }
    
    private final void dialogProductQty() {
    }
    
    private final void trasperat() {
    }
    
    private final void setWindowFlag(int bits, boolean on) {
    }
    
    public ProductDetailFragment() {
        super();
    }
}