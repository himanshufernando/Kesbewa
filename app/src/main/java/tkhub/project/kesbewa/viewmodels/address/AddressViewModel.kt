package tkhub.project.kesbewa.viewmodels.address


import android.content.Context
import android.location.Location
import android.view.View
import android.widget.AdapterView
import androidx.databinding.ObservableField
import androidx.lifecycle.*
import androidx.navigation.Navigation
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import tkhub.project.kesbewa.Kesbewa
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.db.AppDatabase
import tkhub.project.kesbewa.data.db.OrderDao
import tkhub.project.kesbewa.data.model.City_v2
import tkhub.project.kesbewa.data.model.DeliveryAddress
import tkhub.project.kesbewa.data.model.googlePlaceDetails.GooglePlaceDetails
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.repo.AddressRepo
import tkhub.project.kesbewa.repo.CartRepo
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.services.api.APIInterface

class AddressViewModel(context: Context, dataDao: OrderDao,client: APIInterface) : ViewModel() {


    var mContext = context
    var repo = CartRepo(dataDao, mContext)


    var repoAddress = AddressRepo(mContext,client)


    var editTextStreetAddress = ObservableField<String>()
    var editTextStreetAddressTwo = ObservableField<String>()
    var editTextZipCode = ObservableField<String>()
    var editTextNumber = ObservableField<String>()

    var isAddressSaveVisible = ObservableField<Boolean>()
    var isAddressAddLayoutVisible = ObservableField<Boolean>()
    var isAddressListVisible = ObservableField<Boolean>()
    var isBtnVisible = ObservableField<Boolean>()
    var isNoAddressLayoutVisible = ObservableField<Boolean>()

    var addressSearchListVisibility = ObservableField<Boolean>()

    var addressFetchingProgress = ObservableField<Boolean>()


    private val _getAddressCall = MutableLiveData<Int>()
    val getAddressCall: LiveData<Int> = _getAddressCall

    private val _addressSaveCall = MutableLiveData<DeliveryAddress>()
    val addressSaveCall: LiveData<DeliveryAddress> = _addressSaveCall


    private val _cityListUpdateStatus = MutableLiveData<Int>()
    val cityListUpdateStatus: LiveData<Int> = _cityListUpdateStatus

    private val _autocompleteAddressSearchCall = MutableLiveData<String>()
    val autocompleteAddressSearchCall: LiveData<String> = _autocompleteAddressSearchCall

    private val _addressDetailsSearchCall = MutableLiveData<String>()
    val addressDetailsSearchCall: LiveData<String> = _addressDetailsSearchCall

    val cityListFromJson: MutableLiveData<List<City_v2>> by lazy {
        MutableLiveData<List<City_v2>>()
    }


    init {
        isAddressListVisible.set(true)
        isAddressSaveVisible.set(false)
        isAddressAddLayoutVisible.set(false)
        isBtnVisible.set(false)
        isNoAddressLayoutVisible.set(false)
        addressSearchListVisibility.set(false)
        addressFetchingProgress.set(false)




    }


    fun getCityList() {
        _cityListUpdateStatus.value = (1..1000).random()
    }

    fun getUserAddressList() {
        _getAddressCall.value = (1..1000).random()
    }


    val userAddressList = getAddressCall.switchMap { id ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            var addressRespo = repoAddress.getUserAddress()
            try {
                addressRespo.collect { value ->
                    if (value == null) {
                        emit(KesbewaResult.LogicError.LogError(AppPrefs.errorSomethingWentWrong()))
                    } else {
                        if (value.isEmpty()) {
                            isNoAddressLayoutVisible.set(true)
                        } else {
                            isNoAddressLayoutVisible.set(false)
                            emit(KesbewaResult.Success(value))
                        }
                    }

                }
                isAddressListVisible.set(false)
            } catch (ioException: Exception) {
                isAddressListVisible.set(true)
                emit(KesbewaResult.ExceptionError.ExError(ioException))
            }

        }
    }



    val cityList = cityListUpdateStatus.switchMap { _ ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            emit(repo.getCityList())
        }
    }


    val currentLocation: MutableLiveData<Location> by lazy {
        MutableLiveData<Location>()
    }

    val selectedDistrict: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    val province: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    val selectedCity: MutableLiveData<String> by lazy {
        MutableLiveData<String>()

    }


    fun onCityItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        selectedCity.value = parent!!.getItemAtPosition(position).toString()
        selectedDistrict.value =repo.getDistrictFromCity(selectedCity.value!!)
        province.value = repo.getProvinceFromDistricts(selectedDistrict.value!!)

    }


    fun setLocationOnMap(view: View) {
        Navigation.findNavController(view!!).navigate(R.id.fragmentAddressToMap)
    }

    fun addAddresClickEvent() {
        if (isAddressListVisible.get()!!) {
            isAddressListVisible.set(false)
        }
        if (!isAddressAddLayoutVisible.get()!!) {
            isAddressAddLayoutVisible.set(true)
        }
        if (!isBtnVisible.get()!!) {
            isBtnVisible.set(true)
        }

    }


    fun addAddress() {
        isAddressSaveVisible.set(true)

        var user = AppPrefs.getUserPrefs(mContext!!, AppPrefs.KEY_USER)

        var address = DeliveryAddress(
            "", user.user_id,
            user.user_code, currentLocation.value?.latitude,
            currentLocation.value?.longitude,
            editTextNumber.get().toString(),
            editTextStreetAddress.get().toString(),
            editTextStreetAddressTwo.get().toString(),
            selectedCity.value.toString(),
            selectedDistrict.value.toString(),
            province.value.toString(),
            editTextZipCode.get().toString()
        )

        _addressSaveCall.value =address

    }

    fun callGetAddress() {
        _getAddressCall.value = (1..1000).random()

    }


    val userAddressSave = addressSaveCall.switchMap { id ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            var addressRespo = repoAddress.saveUserAddress(id,currentLocation.value,cityList.value)
            try {
                addressRespo.collect { value ->
                    if(value==null){
                        isAddressSaveVisible.set(false)
                        emit(KesbewaResult.LogicError.LogError(AppPrefs.errorSomethingWentWrong()))
                    }else{
                        if(value.errorCode==AppPrefs.SUCCESS_ADDRESS_SAVE_SUCCESSFULLY){
                            emit(KesbewaResult.Success(value))
                            isAddressSaveVisible.set(false)
                            isAddressListVisible.set(true)
                            isAddressAddLayoutVisible.set(false)
                            isBtnVisible.set(false)

                        }else{
                            isAddressSaveVisible.set(false)
                            emit(KesbewaResult.LogicError.LogError(value))
                        }

                    }
                }
            } catch (ioException: Exception) {
                emit(KesbewaResult.ExceptionError.ExError(ioException))
            }
        }
    }

    fun onTextChangedAddressSearch(s: CharSequence, count: Int) {
        if(count==0){
            addressFetchingProgress.set(false)
             addressSearchListVisibility.set(false)
         }else{
            addressFetchingProgress.set(true)
            _autocompleteAddressSearchCall.value  = s.toString()
        }

    }




    val autocompleteAddressSearchResponse = autocompleteAddressSearchCall.switchMap { query ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            var response = repoAddress.getplaces(query)
            try {

                if(response.predictions.isEmpty()){
                    addressSearchListVisibility.set(false)
                }else{
                    addressSearchListVisibility.set(true)
                }
                emit(KesbewaResult.Success(response))
                addressFetchingProgress.set(false)
            } catch (ioException: Exception) {
                addressFetchingProgress.set(false)
                emit(KesbewaResult.ExceptionError.ExError(ioException))
            }
        }
    }

    //_addressDetailsSearchCall

    fun getAddressSearchDetails(pid : String){
        addressSearchListVisibility.set(false)
        if(!pid.isNullOrEmpty()){
            _addressDetailsSearchCall.value = pid
        }
    }


    val addressDetailsSearchResponse = addressDetailsSearchCall.switchMap { pid ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            var response = repoAddress.getplacesDetails(pid)
            try {
                emit(KesbewaResult.Success(response))
            } catch (ioException: Exception) {
                emit(KesbewaResult.ExceptionError.ExError(ioException))
            }
        }
    }


    fun setSearchedAddressToUI(data : GooglePlaceDetails){
        if(!data.result.address_components[0].long_name.toString().isNullOrEmpty()){
            editTextNumber.set(data.result.address_components[0].long_name.toString())
        }

        if(!data.result.address_components[1].long_name.toString().isNullOrEmpty()){
            editTextStreetAddress.set(data.result.address_components[1].long_name.toString())
        }

        if(!data.result.address_components[1].long_name.toString().isNullOrEmpty()){
            editTextStreetAddress.set(data.result.address_components[1].long_name.toString())
        }

        if(!data.result.address_components[2].long_name.toString().isNullOrEmpty()){
            editTextStreetAddressTwo.set(data.result.address_components[2].long_name.toString())
        }

    }



    object LiveDataVMFactory : ViewModelProvider.Factory {
        var app: Context = Kesbewa.applicationContext()
        private val dataSource = APIInterface.create()
        private val dataDAO = AppDatabase.getInstance(app).orderDao()
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return AddressViewModel(app, dataDAO,dataSource) as T

        }
    }

}