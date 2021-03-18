package tkhub.project.kesbewa.ui.fragment;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010!\u001a\u00020\u001eJ&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001eH\u0016J\b\u0010+\u001a\u00020\u001eH\u0016J\u001a\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0018\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u001eH\u0002J\u0016\u00104\u001a\u00020\u001e2\f\u00105\u001a\b\u0012\u0004\u0012\u00020706H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u00068"}, d2 = {"Ltkhub/project/kesbewa/ui/fragment/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Ltkhub/project/kesbewa/ui/adapters/ProductsAdapter;", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "getAlertDialog", "()Landroidx/appcompat/app/AlertDialog;", "setAlertDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "binding", "Ltkhub/project/kesbewa/databinding/FragmentHomeBinding;", "getBinding", "()Ltkhub/project/kesbewa/databinding/FragmentHomeBinding;", "setBinding", "(Ltkhub/project/kesbewa/databinding/FragmentHomeBinding;)V", "viewmodel", "Ltkhub/project/kesbewa/viewmodels/home/HomeViewModel;", "getViewmodel", "()Ltkhub/project/kesbewa/viewmodels/home/HomeViewModel;", "viewmodel$delegate", "Lkotlin/Lazy;", "youtubeconnector", "Ltkhub/project/kesbewa/services/Perfrences/YoutubeConnector;", "getYoutubeconnector", "()Ltkhub/project/kesbewa/services/Perfrences/YoutubeConnector;", "setYoutubeconnector", "(Ltkhub/project/kesbewa/services/Perfrences/YoutubeConnector;)V", "errorAlertDialog", "", "networkError", "Ltkhub/project/kesbewa/data/model/NetworkError;", "getProductObserver", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onStop", "onViewCreated", "view", "setWindowFlag", "bits", "", "on", "", "trasperat", "youtubeSearchFragment", "searchlist", "", "Ltkhub/project/kesbewa/data/model/YoutubeVideoItem;", "app_release"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog alertDialog;
    @org.jetbrains.annotations.NotNull()
    public tkhub.project.kesbewa.databinding.FragmentHomeBinding binding;
    private final kotlin.Lazy viewmodel$delegate = null;
    private final tkhub.project.kesbewa.ui.adapters.ProductsAdapter adapter = null;
    @org.jetbrains.annotations.NotNull()
    public tkhub.project.kesbewa.services.Perfrences.YoutubeConnector youtubeconnector;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AlertDialog getAlertDialog() {
        return null;
    }
    
    public final void setAlertDialog(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.databinding.FragmentHomeBinding p0) {
    }
    
    private final tkhub.project.kesbewa.viewmodels.home.HomeViewModel getViewmodel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.services.Perfrences.YoutubeConnector getYoutubeconnector() {
        return null;
    }
    
    public final void setYoutubeconnector(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.services.Perfrences.YoutubeConnector p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void youtubeSearchFragment(java.util.List<tkhub.project.kesbewa.data.model.YoutubeVideoItem> searchlist) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void getProductObserver() {
    }
    
    private final void errorAlertDialog(tkhub.project.kesbewa.data.model.NetworkError networkError) {
    }
    
    private final void trasperat() {
    }
    
    private final void setWindowFlag(int bits, boolean on) {
    }
    
    public HomeFragment() {
        super();
    }
}