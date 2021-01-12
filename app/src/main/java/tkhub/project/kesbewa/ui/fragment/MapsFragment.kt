package tkhub.project.kesbewa.ui.fragment

import android.app.Activity
import android.location.Location
import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions


import kotlinx.android.synthetic.main.fragment_maps.view.*
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.model.CurrentLocation
import tkhub.project.kesbewa.data.model.ManualLocation
import tkhub.project.kesbewa.databinding.FragmentMapsBindingImpl
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.ui.activity.home.HomeActivity
import tkhub.project.kesbewa.viewmodels.cart.CartViewModel

class MapsFragment : Fragment() {

    lateinit var binding: FragmentMapsBindingImpl
    private val viewmodel: CartViewModel by viewModels { CartViewModel.LiveDataVMFactory }

    lateinit var currentLocation : CurrentLocation
    lateinit var mapMraker : Marker
    lateinit var manualLocation : ManualLocation

   private val callback = OnMapReadyCallback { googleMap ->

        googleMap.setMapStyle(
            MapStyleOptions.loadRawResourceStyle(
                context as Activity,
                R.raw.new_map_style
            )
        );
        val mLocation =AppPrefs.getLocationMaunalKeyValuePrefs(context!!, AppPrefs.KEY_MANUAL_LOCATION)
       currentLocation= AppPrefs.getLocationKeyValuePrefs(context!!, AppPrefs.KEY_CURRENT_LOCATION)

        val mapLocation : LatLng

        mapLocation = if(mLocation.manuallatitude==0.0){
            LatLng(currentLocation!!.currentlatitude, currentLocation!!.currentlongitude)
        }else{
            LatLng(mLocation!!.manuallatitude, mLocation!!.manuallongitude)
        }

        mapMraker= googleMap.addMarker(MarkerOptions().position(mapLocation).title("Current Location"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mapLocation, 17f));

        googleMap.setOnCameraIdleListener {
            val coords = googleMap.cameraPosition.target
            manualLocation = ManualLocation(coords.latitude,coords.longitude)
            AppPrefs.setLocationManualKeyValuePrefs(context!!, AppPrefs.KEY_MANUAL_LOCATION, manualLocation)
        }

        googleMap.setOnCameraMoveListener {
            val coords = googleMap.cameraPosition.target

            val mapMaunalLocation = LatLng(coords!!.latitude, coords!!.longitude)
            mapMraker.remove()
            mapMraker= googleMap.addMarker(MarkerOptions().position(mapMaunalLocation).title("Current Location"))

        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_maps, container, false)
        binding.mapBindingView = viewmodel


        binding.root.imageview_navigation.setOnClickListener {
            activity?.onBackPressed()
        }



        (activity as HomeActivity).removeDrawer()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}