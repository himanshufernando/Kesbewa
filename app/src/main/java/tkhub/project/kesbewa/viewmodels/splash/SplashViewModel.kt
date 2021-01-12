package tkhub.project.kesbewa.viewmodels.splash

import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.os.Build
import android.view.View
import android.widget.AdapterView
import androidx.databinding.ObservableField
import androidx.lifecycle.*
import androidx.navigation.Navigation
import com.google.firebase.database.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import tkhub.project.kesbewa.data.model.DeliveryAddress
import tkhub.project.kesbewa.Kesbewa
import tkhub.project.kesbewa.data.db.AppDatabase
import tkhub.project.kesbewa.data.db.OrderDao
import tkhub.project.kesbewa.data.model.*
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.data.responsmodel.VersionResult
import tkhub.project.kesbewa.repo.CartRepo
import tkhub.project.kesbewa.repo.RegisterRepo
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.services.network.ConnectivityReceiver
import tkhub.project.kesbewa.services.network.InternetConnection
import java.lang.Exception

class SplashViewModel(context: Context) : ViewModel() {


    var mContext = context
    var repo = RegisterRepo(mContext)



    private val _serverVersion = MutableLiveData<Int>()
    val serverVersion: LiveData<Int> = _serverVersion


    val serverVersionResponse = serverVersion.switchMap { id ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {
                var versionRes = repo.checkVersionMatch()
                versionRes.collect { value ->
                    if (value!!.is_version_validate) {
                        if (value!!.special_note_availability == 1L) {
                            emit(VersionResult.ShowSpecialNote(value!!))
                        }else{
                            emit(VersionResult.Continue(value!!))
                        }
                    }else{
                        if (value!!.critical == 1L) {
                            emit(VersionResult.ShowVersionMismatchDialog(value))
                        }else{
                            if (value.special_note_availability == 1L) {
                                emit(VersionResult.ShowSpecialNote(value))
                            }else{
                                emit(VersionResult.Continue(value!!))
                            }
                        }
                    }
                }
            } catch (ex: Exception) {
                emit(VersionResult.ExceptionError.ExError(ex))
            }
        }
    }


    fun checkVersionMatch(count : Int) {
        _serverVersion.value =count
    }


    object LiveDataVMFactory : ViewModelProvider.Factory {
        var app: Context = Kesbewa.applicationContext()
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return SplashViewModel(app) as T

        }
    }

}