package tkhub.project.kesbewa.viewmodels.address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0087\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010r\u001a\u00020sJ\u0006\u0010t\u001a\u00020sJ\u0006\u0010u\u001a\u00020sJ\u000e\u0010v\u001a\u00020s2\u0006\u0010w\u001a\u00020\u000bJ\u0006\u0010.\u001a\u00020sJ\u0006\u0010n\u001a\u00020sJ.\u0010x\u001a\u00020s2\f\u0010y\u001a\b\u0012\u0002\b\u0003\u0018\u00010z2\b\u0010{\u001a\u0004\u0018\u00010|2\u0006\u0010}\u001a\u00020\u00102\u0006\u0010~\u001a\u00020\u007fJ\u001a\u0010\u0080\u0001\u001a\u00020s2\b\u0010\u0081\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u0010J\u000f\u0010\u0084\u0001\u001a\u00020s2\u0006\u0010{\u001a\u00020|J\u0010\u0010\u0085\u0001\u001a\u00020s2\u0007\u0010\u0086\u0001\u001a\u00020\u0018R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010 R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0015R\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00170\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0015R\u001d\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0015R\'\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b2\u00103\u001a\u0004\b0\u00101R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0015R!\u00106\u001a\b\u0012\u0004\u0012\u0002070\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b9\u00103\u001a\u0004\b8\u00101R \u0010:\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001e\"\u0004\b<\u0010 R \u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u0010 R \u0010@\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u0010 R \u0010C\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001e\"\u0004\bE\u0010 R\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010\u0015R \u0010H\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001e\"\u0004\bI\u0010 R \u0010J\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u001e\"\u0004\bK\u0010 R \u0010L\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u001e\"\u0004\bM\u0010 R \u0010N\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u001e\"\u0004\bO\u0010 R \u0010P\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u001e\"\u0004\bQ\u0010 R\u001a\u0010R\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR!\u0010W\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bY\u00103\u001a\u0004\bX\u00101R\u001a\u0010Z\u001a\u00020[X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001a\u0010`\u001a\u00020aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR!\u0010f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bh\u00103\u001a\u0004\bg\u00101R!\u0010i\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bk\u00103\u001a\u0004\bj\u00101R#\u0010l\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0m0\u00170\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010\u0015R\u001d\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020p0\u00170\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010\u0015\u00a8\u0006\u0088\u0001"}, d2 = {"Ltkhub/project/kesbewa/viewmodels/address/AddressViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "dataDao", "Ltkhub/project/kesbewa/data/db/OrderDao;", "client", "Ltkhub/project/kesbewa/services/api/APIInterface;", "(Landroid/content/Context;Ltkhub/project/kesbewa/data/db/OrderDao;Ltkhub/project/kesbewa/services/api/APIInterface;)V", "_addressDetailsSearchCall", "Landroidx/lifecycle/MutableLiveData;", "", "_addressSaveCall", "Ltkhub/project/kesbewa/data/model/DeliveryAddress;", "_autocompleteAddressSearchCall", "_cityListUpdateStatus", "", "_getAddressCall", "addressDetailsSearchCall", "Landroidx/lifecycle/LiveData;", "getAddressDetailsSearchCall", "()Landroidx/lifecycle/LiveData;", "addressDetailsSearchResponse", "Ltkhub/project/kesbewa/data/responsmodel/KesbewaResult;", "Ltkhub/project/kesbewa/data/model/googlePlaceDetails/GooglePlaceDetails;", "getAddressDetailsSearchResponse", "addressFetchingProgress", "Landroidx/databinding/ObservableField;", "", "getAddressFetchingProgress", "()Landroidx/databinding/ObservableField;", "setAddressFetchingProgress", "(Landroidx/databinding/ObservableField;)V", "addressSaveCall", "getAddressSaveCall", "addressSearchListVisibility", "getAddressSearchListVisibility", "setAddressSearchListVisibility", "autocompleteAddressSearchCall", "getAutocompleteAddressSearchCall", "autocompleteAddressSearchResponse", "Ltkhub/project/kesbewa/data/model/Predictions;", "getAutocompleteAddressSearchResponse", "cityList", "", "Ltkhub/project/kesbewa/data/model/City_v2;", "getCityList", "cityListFromJson", "getCityListFromJson", "()Landroidx/lifecycle/MutableLiveData;", "cityListFromJson$delegate", "Lkotlin/Lazy;", "cityListUpdateStatus", "getCityListUpdateStatus", "currentLocation", "Landroid/location/Location;", "getCurrentLocation", "currentLocation$delegate", "editTextNumber", "getEditTextNumber", "setEditTextNumber", "editTextStreetAddress", "getEditTextStreetAddress", "setEditTextStreetAddress", "editTextStreetAddressTwo", "getEditTextStreetAddressTwo", "setEditTextStreetAddressTwo", "editTextZipCode", "getEditTextZipCode", "setEditTextZipCode", "getAddressCall", "getGetAddressCall", "isAddressAddLayoutVisible", "setAddressAddLayoutVisible", "isAddressListVisible", "setAddressListVisible", "isAddressSaveVisible", "setAddressSaveVisible", "isBtnVisible", "setBtnVisible", "isNoAddressLayoutVisible", "setNoAddressLayoutVisible", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "province", "getProvince", "province$delegate", "repo", "Ltkhub/project/kesbewa/repo/CartRepo;", "getRepo", "()Ltkhub/project/kesbewa/repo/CartRepo;", "setRepo", "(Ltkhub/project/kesbewa/repo/CartRepo;)V", "repoAddress", "Ltkhub/project/kesbewa/repo/AddressRepo;", "getRepoAddress", "()Ltkhub/project/kesbewa/repo/AddressRepo;", "setRepoAddress", "(Ltkhub/project/kesbewa/repo/AddressRepo;)V", "selectedCity", "getSelectedCity", "selectedCity$delegate", "selectedDistrict", "getSelectedDistrict", "selectedDistrict$delegate", "userAddressList", "Ljava/util/ArrayList;", "getUserAddressList", "userAddressSave", "Ltkhub/project/kesbewa/data/model/NetworkError;", "getUserAddressSave", "addAddresClickEvent", "", "addAddress", "callGetAddress", "getAddressSearchDetails", "pid", "onCityItemSelected", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "position", "id", "", "onTextChangedAddressSearch", "s", "", "count", "setLocationOnMap", "setSearchedAddressToUI", "data", "LiveDataVMFactory", "app_release"})
public final class AddressViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.repo.CartRepo repo;
    @org.jetbrains.annotations.NotNull()
    private tkhub.project.kesbewa.repo.AddressRepo repoAddress;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> editTextStreetAddress;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> editTextStreetAddressTwo;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> editTextZipCode;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> editTextNumber;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> isAddressSaveVisible;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> isAddressAddLayoutVisible;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> isAddressListVisible;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> isBtnVisible;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> isNoAddressLayoutVisible;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> addressSearchListVisibility;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> addressFetchingProgress;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _getAddressCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> getAddressCall = null;
    private final androidx.lifecycle.MutableLiveData<tkhub.project.kesbewa.data.model.DeliveryAddress> _addressSaveCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.DeliveryAddress> addressSaveCall = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _cityListUpdateStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> cityListUpdateStatus = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _autocompleteAddressSearchCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> autocompleteAddressSearchCall = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _addressDetailsSearchCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> addressDetailsSearchCall = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy cityListFromJson$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<java.util.ArrayList<tkhub.project.kesbewa.data.model.DeliveryAddress>>> userAddressList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<tkhub.project.kesbewa.data.model.City_v2>> cityList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy currentLocation$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy selectedDistrict$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy province$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy selectedCity$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> userAddressSave = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.Predictions>> autocompleteAddressSearchResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.googlePlaceDetails.GooglePlaceDetails>> addressDetailsSearchResponse = null;
    
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
    public final tkhub.project.kesbewa.repo.AddressRepo getRepoAddress() {
        return null;
    }
    
    public final void setRepoAddress(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.repo.AddressRepo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getEditTextStreetAddress() {
        return null;
    }
    
    public final void setEditTextStreetAddress(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getEditTextStreetAddressTwo() {
        return null;
    }
    
    public final void setEditTextStreetAddressTwo(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getEditTextZipCode() {
        return null;
    }
    
    public final void setEditTextZipCode(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getEditTextNumber() {
        return null;
    }
    
    public final void setEditTextNumber(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isAddressSaveVisible() {
        return null;
    }
    
    public final void setAddressSaveVisible(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isAddressAddLayoutVisible() {
        return null;
    }
    
    public final void setAddressAddLayoutVisible(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isAddressListVisible() {
        return null;
    }
    
    public final void setAddressListVisible(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isBtnVisible() {
        return null;
    }
    
    public final void setBtnVisible(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isNoAddressLayoutVisible() {
        return null;
    }
    
    public final void setNoAddressLayoutVisible(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> getAddressSearchListVisibility() {
        return null;
    }
    
    public final void setAddressSearchListVisibility(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> getAddressFetchingProgress() {
        return null;
    }
    
    public final void setAddressFetchingProgress(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getGetAddressCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.model.DeliveryAddress> getAddressSaveCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getCityListUpdateStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getAutocompleteAddressSearchCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getAddressDetailsSearchCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<tkhub.project.kesbewa.data.model.City_v2>> getCityListFromJson() {
        return null;
    }
    
    public final void getCityList() {
    }
    
    public final void getUserAddressList() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<java.util.ArrayList<tkhub.project.kesbewa.data.model.DeliveryAddress>>> getUserAddressList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<tkhub.project.kesbewa.data.model.City_v2>> getCityList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<android.location.Location> getCurrentLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSelectedDistrict() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getProvince() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSelectedCity() {
        return null;
    }
    
    public final void onCityItemSelected(@org.jetbrains.annotations.Nullable()
    android.widget.AdapterView<?> parent, @org.jetbrains.annotations.Nullable()
    android.view.View view, int position, long id) {
    }
    
    public final void setLocationOnMap(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void addAddresClickEvent() {
    }
    
    public final void addAddress() {
    }
    
    public final void callGetAddress() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.NetworkError>> getUserAddressSave() {
        return null;
    }
    
    public final void onTextChangedAddressSearch(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence s, int count) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.Predictions>> getAutocompleteAddressSearchResponse() {
        return null;
    }
    
    public final void getAddressSearchDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String pid) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<tkhub.project.kesbewa.data.responsmodel.KesbewaResult<tkhub.project.kesbewa.data.model.googlePlaceDetails.GooglePlaceDetails>> getAddressDetailsSearchResponse() {
        return null;
    }
    
    public final void setSearchedAddressToUI(@org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.googlePlaceDetails.GooglePlaceDetails data) {
    }
    
    public AddressViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.db.OrderDao dataDao, @org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.services.api.APIInterface client) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\r\u001a\u0002H\u000e\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0016\u00a2\u0006\u0002\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Ltkhub/project/kesbewa/viewmodels/address/AddressViewModel$LiveDataVMFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "app", "Landroid/content/Context;", "getApp", "()Landroid/content/Context;", "setApp", "(Landroid/content/Context;)V", "dataDAO", "Ltkhub/project/kesbewa/data/db/OrderDao;", "dataSource", "Ltkhub/project/kesbewa/services/api/APIInterface;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"})
    public static final class LiveDataVMFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        @org.jetbrains.annotations.NotNull()
        private static android.content.Context app;
        private static final tkhub.project.kesbewa.services.api.APIInterface dataSource = null;
        private static final tkhub.project.kesbewa.data.db.OrderDao dataDAO = null;
        public static final tkhub.project.kesbewa.viewmodels.address.AddressViewModel.LiveDataVMFactory INSTANCE = null;
        
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