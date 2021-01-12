package tkhub.project.kesbewa.ui.fragment;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 v2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001vB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010G\u001a\u00020HH\u0002J\b\u0010I\u001a\u00020HH\u0002J\b\u0010J\u001a\u00020HH\u0002J\b\u0010K\u001a\u00020%H\u0002J\b\u0010L\u001a\u00020HH\u0002J\u0010\u0010M\u001a\u00020H2\u0006\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u00020HH\u0003J\u0010\u0010Q\u001a\u00020H2\u0006\u0010R\u001a\u00020SH\u0016J&\u0010T\u001a\u0004\u0018\u00010S2\u0006\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010X2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\b\u0010[\u001a\u00020HH\u0016J\b\u0010\\\u001a\u00020HH\u0016J+\u0010]\u001a\u00020H2\u0006\u0010^\u001a\u00020_2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020b0a2\u0006\u0010c\u001a\u00020dH\u0016\u00a2\u0006\u0002\u0010eJ\b\u0010f\u001a\u00020HH\u0016J\b\u0010g\u001a\u00020HH\u0016J\u001a\u0010h\u001a\u00020H2\u0006\u0010i\u001a\u00020S2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\b\u0010j\u001a\u00020HH\u0003J\b\u0010k\u001a\u00020HH\u0002J\u0016\u0010l\u001a\u00020H2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0016\u0010n\u001a\u00020H2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020q0pH\u0002J\u000e\u0010r\u001a\u00020H2\u0006\u0010s\u001a\u00020*J\b\u0010t\u001a\u00020HH\u0002J\b\u0010u\u001a\u00020HH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010&\"\u0004\b\'\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010+\u001a\n -*\u0004\u0018\u00010,0,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000201X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u000207X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010&\"\u0004\b>\u0010(R\u000e\u0010?\u001a\u00020@X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010A\u001a\u00020B8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bC\u0010D\u00a8\u0006w"}, d2 = {"Ltkhub/project/kesbewa/ui/fragment/AddressFragment;", "Landroidx/fragment/app/Fragment;", "Ltkhub/project/kesbewa/services/Perfrences/LocationSettings;", "Landroid/view/View$OnClickListener;", "()V", "adapter", "Ltkhub/project/kesbewa/ui/adapters/AddressAdapter;", "addresList", "Ljava/util/ArrayList;", "Ltkhub/project/kesbewa/data/model/DeliveryAddress;", "getAddresList", "()Ljava/util/ArrayList;", "setAddresList", "(Ljava/util/ArrayList;)V", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "getAlertDialog", "()Landroidx/appcompat/app/AlertDialog;", "setAlertDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "appPrefs", "Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "getAppPrefs", "()Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "setAppPrefs", "(Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;)V", "binding", "Ltkhub/project/kesbewa/databinding/FragmentAddressBinding;", "getBinding", "()Ltkhub/project/kesbewa/databinding/FragmentAddressBinding;", "setBinding", "(Ltkhub/project/kesbewa/databinding/FragmentAddressBinding;)V", "callback", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "isNewAddressAddedCall", "", "()Z", "setNewAddressAddedCall", "(Z)V", "location", "Landroid/location/Location;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "kotlin.jvm.PlatformType", "mLocationCallback", "Lcom/google/android/gms/location/LocationCallback;", "mapFragment", "Lcom/google/android/gms/maps/SupportMapFragment;", "getMapFragment", "()Lcom/google/android/gms/maps/SupportMapFragment;", "setMapFragment", "(Lcom/google/android/gms/maps/SupportMapFragment;)V", "mapMraker", "Lcom/google/android/gms/maps/model/Marker;", "getMapMraker", "()Lcom/google/android/gms/maps/model/Marker;", "setMapMraker", "(Lcom/google/android/gms/maps/model/Marker;)V", "newAddressAdded", "getNewAddressAdded", "setNewAddressAdded", "searchAdapter", "Ltkhub/project/kesbewa/ui/adapters/AddressSearchAdapter;", "viewmodel", "Ltkhub/project/kesbewa/viewmodels/address/AddressViewModel;", "getViewmodel", "()Ltkhub/project/kesbewa/viewmodels/address/AddressViewModel;", "viewmodel$delegate", "Lkotlin/Lazy;", "addressDetailsSearchObserver", "", "autocompleteAddressSearchObserver", "checkCurrentLocationSetting", "checkPermissions", "cityListObserver", "errorAlertDialog", "networkError", "Ltkhub/project/kesbewa/data/model/NetworkError;", "getLastLocation", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onLocationSettingsResponse", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onStop", "onViewCreated", "view", "requestNewLocationData", "requestPermissions", "setAddressToUI", "address", "setCitys", "cityModelList", "", "Ltkhub/project/kesbewa/data/model/City_v2;", "setandSaveLocation", "loc", "userAddressListObserver", "userSaveAddressObserver", "Companion", "app_release"})
public final class AddressFragment extends androidx.fragment.app.Fragment implements tkhub.project.kesbewa.services.Perfrences.LocationSettings, android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    public tkhub.project.kesbewa.databinding.FragmentAddressBinding binding;
    private final kotlin.Lazy viewmodel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.SupportMapFragment mapFragment;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private android.location.Location location;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog alertDialog;
    private final tkhub.project.kesbewa.ui.adapters.AddressAdapter adapter = null;
    private final tkhub.project.kesbewa.ui.adapters.AddressSearchAdapter searchAdapter = null;
    @org.jetbrains.annotations.NotNull()
    public java.util.ArrayList<tkhub.project.kesbewa.data.model.DeliveryAddress> addresList;
    private boolean newAddressAdded;
    private boolean isNewAddressAddedCall;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.model.Marker mapMraker;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.services.Perfrences.AppPrefs appPrefs;
    private final com.google.android.gms.location.LocationRequest locationRequest = null;
    private final com.google.android.gms.maps.OnMapReadyCallback callback = null;
    private final com.google.android.gms.location.LocationCallback mLocationCallback = null;
    private static final int REQUEST_PERMISSIONS_REQUEST_CODE = 34;
    public static final int REQUEST_CHECK_SETTINGS = 35;
    public static final int AUTOCOMPLETE_REQUEST_CODE = 65;
    public static final tkhub.project.kesbewa.ui.fragment.AddressFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.databinding.FragmentAddressBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.databinding.FragmentAddressBinding p0) {
    }
    
    private final tkhub.project.kesbewa.viewmodels.address.AddressViewModel getViewmodel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.SupportMapFragment getMapFragment() {
        return null;
    }
    
    public final void setMapFragment(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.SupportMapFragment p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AlertDialog getAlertDialog() {
        return null;
    }
    
    public final void setAlertDialog(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<tkhub.project.kesbewa.data.model.DeliveryAddress> getAddresList() {
        return null;
    }
    
    public final void setAddresList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<tkhub.project.kesbewa.data.model.DeliveryAddress> p0) {
    }
    
    public final boolean getNewAddressAdded() {
        return false;
    }
    
    public final void setNewAddressAdded(boolean p0) {
    }
    
    public final boolean isNewAddressAddedCall() {
        return false;
    }
    
    public final void setNewAddressAddedCall(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.Marker getMapMraker() {
        return null;
    }
    
    public final void setMapMraker(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.Marker p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.services.Perfrences.AppPrefs getAppPrefs() {
        return null;
    }
    
    public final void setAppPrefs(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.services.Perfrences.AppPrefs p0) {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final void cityListObserver() {
    }
    
    private final void userAddressListObserver() {
    }
    
    private final void userSaveAddressObserver() {
    }
    
    private final void autocompleteAddressSearchObserver() {
    }
    
    private final void addressDetailsSearchObserver() {
    }
    
    @java.lang.Override()
    public void onLocationSettingsResponse() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void setAddressToUI(java.util.ArrayList<tkhub.project.kesbewa.data.model.DeliveryAddress> address) {
    }
    
    private final void errorAlertDialog(tkhub.project.kesbewa.data.model.NetworkError networkError) {
    }
    
    private final void setCitys(java.util.List<tkhub.project.kesbewa.data.model.City_v2> cityModelList) {
    }
    
    private final boolean checkPermissions() {
        return false;
    }
    
    private final void requestPermissions() {
    }
    
    private final void checkCurrentLocationSetting() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void getLastLocation() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void requestNewLocationData() {
    }
    
    public final void setandSaveLocation(@org.jetbrains.annotations.NotNull()
    android.location.Location loc) {
    }
    
    public AddressFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Ltkhub/project/kesbewa/ui/fragment/AddressFragment$Companion;", "", "()V", "AUTOCOMPLETE_REQUEST_CODE", "", "REQUEST_CHECK_SETTINGS", "REQUEST_PERMISSIONS_REQUEST_CODE", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}