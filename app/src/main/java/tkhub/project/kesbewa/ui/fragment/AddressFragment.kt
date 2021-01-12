package tkhub.project.kesbewa.ui.fragment

import android.Manifest.permission.ACCESS_FINE_LOCATION
import android.annotation.SuppressLint
import android.app.Activity
import android.content.DialogInterface
import android.content.IntentSender
import android.location.Location
import android.os.Bundle
import android.os.Looper
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.PermissionChecker.PERMISSION_GRANTED
import androidx.core.content.PermissionChecker.checkSelfPermission
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.*
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

import com.google.android.gms.tasks.Task

import kotlinx.android.synthetic.main.fragment_address.view.*

import tkhub.project.kesbewa.Kesbewa
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.model.*
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.databinding.FragmentAddressBinding
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.services.Perfrences.LocationSettings
import tkhub.project.kesbewa.services.network.InternetConnection
import tkhub.project.kesbewa.ui.activity.home.HomeActivity
import tkhub.project.kesbewa.ui.adapters.AddressAdapter
import tkhub.project.kesbewa.ui.adapters.AddressSearchAdapter
import tkhub.project.kesbewa.viewmodels.address.AddressViewModel
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class AddressFragment : Fragment(), LocationSettings, View.OnClickListener {


    lateinit var binding: FragmentAddressBinding

    private val viewmodel: AddressViewModel by viewModels { AddressViewModel.LiveDataVMFactory }

   lateinit var mapFragment: SupportMapFragment

    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private var location: Location? = null
    var alertDialog: AlertDialog? = null

    private val adapter = AddressAdapter()
    private val searchAdapter = AddressSearchAdapter()
    lateinit var addresList: ArrayList<DeliveryAddress>

    var newAddressAdded = false
    var isNewAddressAddedCall = false
   lateinit var mapMraker: Marker
    var appPrefs = AppPrefs

    companion object {
        private const val REQUEST_PERMISSIONS_REQUEST_CODE = 34
        const val REQUEST_CHECK_SETTINGS = 35
        const val AUTOCOMPLETE_REQUEST_CODE = 65
    }

    private val locationRequest = LocationRequest.create().apply {
        interval = 10000
        fastestInterval = 5000
        priority = LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY
    }


    private val callback = OnMapReadyCallback { googleMap ->

        googleMap.clear()
        googleMap.setMapStyle(
            MapStyleOptions.loadRawResourceStyle(
                context as Activity,
                R.raw.new_map_style
            )
        )

        val manualLocation =
            AppPrefs.getLocationMaunalKeyValuePrefs(context!!, AppPrefs.KEY_MANUAL_LOCATION)
        val mapLocation: LatLng

        mapLocation = if (manualLocation.manuallatitude == 0.0) {
            LatLng(location!!.latitude, location!!.longitude)
        } else {
            LatLng(manualLocation.manuallatitude, manualLocation.manuallongitude)
        }

        mapMraker =
            googleMap.addMarker(MarkerOptions().position(mapLocation).title("Current Location"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mapLocation, 16f))

        googleMap.setOnCameraIdleListener {
            val coords = googleMap.cameraPosition.target
            AppPrefs.setLocationManualKeyValuePrefs(
                context!!,
                AppPrefs.KEY_MANUAL_LOCATION,
                ManualLocation(coords.latitude, coords.longitude)
            )
        }

        googleMap.setOnCameraMoveListener {
            val coords = googleMap.cameraPosition.target
            val mapMaunalLocation = LatLng(coords!!.latitude, coords.longitude)
            mapMraker.remove()
            mapMraker = googleMap.addMarker(
                MarkerOptions().position(mapMaunalLocation).title("Current Location")
            )

        }
    }


    private val mLocationCallback = object : LocationCallback() {
        override fun onLocationResult(locationResult: LocationResult) {
            if (locationResult != null) {
                setandSaveLocation(locationResult.lastLocation)

            }

        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_address, container, false)
        binding.addressviewmodel = viewmodel
        Kesbewa.setLocationSettingsListener(this)

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(context as Activity)

        (activity as HomeActivity).removeDrawer()


        binding.root.imageview_navigation.setOnClickListener(this)
        binding.root.constraintlayout_1.setOnClickListener(this)
        binding.root.constraintLayout_add_adress.setOnClickListener(this)
        binding.root.textView_btn.setOnClickListener(this)


        binding.root.recyclerView_address.adapter = adapter
        binding.root.recyclerView_search_addresslist.adapter = searchAdapter


        if (!InternetConnection.checkInternetConnection()) {
            Toast.makeText(
                activity,
                "No internet connection, check your connection and try again.",
                Toast.LENGTH_LONG
            ).show()
        }



        adapter.setOnItemClickListener(object : AddressAdapter.ClickListener {
            override fun onClick(deliveryAddress: DeliveryAddress, aView: View) {
                addresList.forEach { u -> u.user_isSelect = false }
                AppPrefs.setSelectAdressManualKeyValuePrefs(
                    context as Activity,
                    AppPrefs.KEY_SELECTED_USER_ADDERSS,
                    deliveryAddress
                )
                deliveryAddress.user_isSelect = true
                adapter.notifyDataSetChanged()
                (context as Activity).onBackPressed()
            }
        })


        searchAdapter.setOnItemClickListener(object : AddressSearchAdapter.ClickListener {
            override fun onClick(googlePlace: GooglePlace, aView: View) {
                (activity as HomeActivity).hideKeyboard()
                if (!viewmodel.addressDetailsSearchResponse.hasObservers()) {
                    addressDetailsSearchObserver()
                }
                viewmodel.getAddressSearchDetails(googlePlace.place_id)
                binding.root.edit_searchaddress.visibility = View.GONE
                binding.root.txt_searchaddress.visibility = View.VISIBLE
                binding.root.edit_searchaddress.setText("")
                binding.root.txt_searchaddress.text = googlePlace.description.toString()

            }
        })
        binding.root.edit_searchaddress.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (!viewmodel.autocompleteAddressSearchResponse.hasObservers()) {
                    autocompleteAddressSearchObserver()
                }
                viewmodel.onTextChangedAddressSearch(s!!, count)
            }
        })






        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        if (!checkPermissions()) {
            requestPermissions()
        } else {
            checkCurrentLocationSetting()
        }
    }

    override fun onResume() {
        if (!viewmodel.cityList.hasObservers()) {
            cityListObserver()
        }
        viewmodel.getCityList()

        if (!viewmodel.userAddressList.hasObservers()) {
            userAddressListObserver()
        }
        viewmodel.getUserAddressList()



        super.onResume()
    }

    override fun onDestroy() {
        fusedLocationClient.removeLocationUpdates(mLocationCallback)
        super.onDestroy()
    }

    override fun onStop() {
        fusedLocationClient.removeLocationUpdates(mLocationCallback)
        viewmodel.userAddressList.removeObservers(viewLifecycleOwner)
        viewmodel.userAddressSave.removeObservers(viewLifecycleOwner)
        viewmodel.cityList.removeObservers(viewLifecycleOwner)
        viewmodel.autocompleteAddressSearchResponse.removeObservers(viewLifecycleOwner)
        viewmodel.addressDetailsSearchResponse.removeObservers(viewLifecycleOwner)

        super.onStop()
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.imageview_navigation ->{
                (context as Activity).onBackPressed()
            }
            R.id.constraintlayout_1 ->{
                binding.root.edit_searchaddress.visibility = View.VISIBLE
                binding.root.txt_searchaddress.visibility = View.GONE
            }

            R.id.constraintLayout_add_adress ->{
                if (!checkPermissions()) {
                    isNewAddressAddedCall = true
                    requestPermissions()
                } else {
                    viewmodel.addAddresClickEvent()
                }
                (activity as HomeActivity).hideKeyboard()
            }

            R.id.textView_btn ->{
                if (!viewmodel.userAddressSave.hasObservers()) {
                    userSaveAddressObserver()
                }
                viewmodel.addAddress()
                (activity as HomeActivity).hideKeyboard()
            }
        }
    }


    private fun cityListObserver() {
        viewmodel.cityList.observe(viewLifecycleOwner, Observer {
            setCitys(it)
        })
    }


    private fun userAddressListObserver() {
        viewmodel.userAddressList.observe(viewLifecycleOwner, Observer {
            when (it) {
                is KesbewaResult.Success -> {
                    addresList = it.data
                    setAddressToUI(addresList)
                }
                is KesbewaResult.ExceptionError.ExError -> {
                    Toast.makeText(
                        activity,
                        it.exception.message,
                        Toast.LENGTH_SHORT
                    ).show()
                }
                is KesbewaResult.LogicError.LogError -> {
                    errorAlertDialog(it.exception)
                }
            }
        })

    }


    private fun userSaveAddressObserver() {
        viewmodel.userAddressSave.observe(viewLifecycleOwner, Observer {
            when (it) {
                is KesbewaResult.Success -> {
                    newAddressAdded = true
                    viewmodel.callGetAddress()
                }
                is KesbewaResult.ExceptionError.ExError -> {
                    Toast.makeText(
                        activity,
                        it.exception.message,
                        Toast.LENGTH_SHORT
                    ).show()
                }
                is KesbewaResult.LogicError.LogError -> {
                    errorAlertDialog(it.exception)
                }
            }
        })
    }


    private fun autocompleteAddressSearchObserver() {
        viewmodel.autocompleteAddressSearchResponse.observe(viewLifecycleOwner, Observer {
            when (it) {
                is KesbewaResult.Success -> {
                    if (it.data.status == AppPrefs.ERROR_INTERNET) {
                        Toast.makeText(
                            activity,
                            "No internet access please check your connection and retry !",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        searchAdapter.submitList(it.data.predictions)
                    }

                }
                is KesbewaResult.ExceptionError.ExError -> {
                    Toast.makeText(activity, it.exception.message, Toast.LENGTH_SHORT).show()
                }
            }
        })
    }


    private fun addressDetailsSearchObserver() {
        viewmodel.addressDetailsSearchResponse.observe(viewLifecycleOwner, Observer {
            when (it) {
                is KesbewaResult.Success -> {
                    if (it.data.status == AppPrefs.ERROR_INTERNET) {
                        Toast.makeText(
                            activity,
                            "No internet access please check your connection and retry !",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        AppPrefs.setLocationManualKeyValuePrefs(
                            context!!,
                            AppPrefs.KEY_MANUAL_LOCATION,
                            ManualLocation(
                                it.data.result.geometry.location.lat,
                                it.data.result.geometry.location.lng
                            )
                        )
                        viewmodel.setSearchedAddressToUI(it.data)
                    //    mapFragment.getMapAsync(callback)
                    }
                }
                is KesbewaResult.ExceptionError.ExError -> {
                    Toast.makeText(activity, it.exception.message, Toast.LENGTH_SHORT).show()
                }

            }
        })
    }


    override fun onLocationSettingsResponse() {
        getLastLocation()
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        when (requestCode) {
            REQUEST_PERMISSIONS_REQUEST_CODE -> {
                if ((grantResults.isNotEmpty() && grantResults[0] == PERMISSION_GRANTED)) {
                    checkCurrentLocationSetting()
                    if (isNewAddressAddedCall) {
                        viewmodel.addAddresClickEvent()
                        isNewAddressAddedCall = false
                    }
                } else {
                    Toast.makeText(context, "Oops! Permission Denied!!", Toast.LENGTH_SHORT).show()
                }
                return
            }
        }
    }


    private fun setAddressToUI(address: ArrayList<DeliveryAddress>) {
        var address = AppPrefs.getSelectAdressMaunalKeyValuePrefs(
            context as Activity,
            AppPrefs.KEY_SELECTED_USER_ADDERSS
        )
        if (address.address_id.equals("") || newAddressAdded) {
            addresList.forEach { u -> u.user_isSelect = false }
            addresList.last().user_isSelect = true
            AppPrefs.setSelectAdressManualKeyValuePrefs(
                context as Activity,
                AppPrefs.KEY_SELECTED_USER_ADDERSS,
                addresList.last()
            )
        } else {
            for ((index, value) in addresList.withIndex()) {
                addresList[index].user_isSelect = value.address_id.equals(address.address_id)
            }
        }
        adapter.submitList(addresList)
    }

    private fun errorAlertDialog(networkError: NetworkError) {
        if (alertDialog != null) {
            if (alertDialog!!.isShowing) {
                alertDialog!!.dismiss()
            }
        }
        alertDialog = activity?.let {
            val builder = androidx.appcompat.app.AlertDialog.Builder(it)
            builder.setTitle(networkError.errorTitle)
            builder.setMessage(networkError.errorMessage)
            builder.setCancelable(false)
            builder.apply {
                setPositiveButton(
                    R.string.ok,
                    DialogInterface.OnClickListener { _, _ ->
                        if (networkError.errorCode == AppPrefs.ERROR_EMPTY_CITYLIST) {
                            if (!viewmodel.cityList.hasObservers()) {
                                cityListObserver()
                            }
                            viewmodel.getCityList()
                        } else {
                            return@OnClickListener
                        }

                    })
            }
            builder.create()
            builder.show()

        } ?: throw IllegalStateException("Activity cannot be null")
    }


    private fun setCitys(cityModelList: List<City_v2>) {
        val list = mutableListOf<String>()
        for (item in cityModelList) {
            item.name_en.let { list.add(it) }
        }
        val adapter = ArrayAdapter(
            context as Activity,
            android.R.layout.simple_list_item_1, list
        )
        binding.root.autocompletetextview_city.setAdapter(adapter)
    }


    private fun checkPermissions() =
        checkSelfPermission(context as Activity, ACCESS_FINE_LOCATION) == PERMISSION_GRANTED


    private fun requestPermissions() {
        requestPermissions(
            arrayOf(ACCESS_FINE_LOCATION),
            REQUEST_PERMISSIONS_REQUEST_CODE
        )
    }


    private fun checkCurrentLocationSetting() {
        val builder = LocationSettingsRequest.Builder().addLocationRequest(locationRequest)
        val client: SettingsClient = LocationServices.getSettingsClient(context as Activity)
        val task: Task<LocationSettingsResponse> = client.checkLocationSettings(builder.build())

       builder.setAlwaysShow(true)

        task.addOnSuccessListener {
            getLastLocation()
        }
        task.addOnFailureListener { exception ->
            if (exception is ResolvableApiException) {
                try {
                    exception.startResolutionForResult(this.activity, REQUEST_CHECK_SETTINGS)
                } catch (sendEx: IntentSender.SendIntentException) {
                }
            }
        }

    }

    @SuppressLint("MissingPermission")
    private fun getLastLocation() {
        fusedLocationClient.lastLocation.addOnCompleteListener(context as Activity) { task ->
            if (location == null) {
                requestNewLocationData()
            } else {
                setandSaveLocation(task.result!!)
            }
        }
    }


    @SuppressLint("MissingPermission")
    private fun requestNewLocationData() {
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(context as Activity)
        fusedLocationClient.requestLocationUpdates(
            locationRequest, mLocationCallback, Looper.myLooper()
        )
    }


    fun setandSaveLocation(loc: Location) {
        location = loc
        viewmodel.currentLocation.value = location
        var locationModel = CurrentLocation(loc.latitude, loc.longitude)

        AppPrefs.setLocationKeyValuePrefs(context!!, AppPrefs.KEY_CURRENT_LOCATION, locationModel)


        if (binding.root.constraintLayout_map.isVisible) {
            binding.root.constraintLayout_map.visibility = View.GONE
        }



        mapFragment.getMapAsync(callback)
    }


}
