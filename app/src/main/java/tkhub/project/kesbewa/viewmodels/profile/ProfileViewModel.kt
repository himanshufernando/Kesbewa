package tkhub.project.kesbewa.viewmodels.profile

import android.content.Context
import android.location.Location
import android.view.View
import android.widget.AdapterView
import androidx.databinding.ObservableField
import androidx.lifecycle.*
import androidx.navigation.Navigation
import com.google.firebase.database.*
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.withContext
import tkhub.project.kesbewa.data.model.DeliveryAddress
import tkhub.project.kesbewa.Kesbewa
import tkhub.project.kesbewa.data.db.AppDatabase
import tkhub.project.kesbewa.data.db.OrderDao
import tkhub.project.kesbewa.data.model.*
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult

import tkhub.project.kesbewa.repo.RegisterRepo
import tkhub.project.kesbewa.services.Perfrences.AppPrefs

import java.lang.Exception

class ProfileViewModel(context: Context) : ViewModel() {

    var mContext = context
    var repo = RegisterRepo(mContext)
    var appPrefs = AppPrefs

    var editTextUserName = MutableLiveData<String>()
    var editTextNumber = MutableLiveData<String>()
    var editTextEmail = MutableLiveData<String>()
    var editTextNic = MutableLiveData<String>()

    val profileProgessBar = ObservableField<Boolean>()


    private val _updateProfileCall = MutableLiveData<User>()
    val  updateProfileCall: LiveData<User> = _updateProfileCall


    init {
        profileProgessBar.set(false)
        setUserDetails()
    }


    fun setUserDetails(){

        var uer= appPrefs.getUserPrefs(mContext,AppPrefs.KEY_USER)
        editTextUserName.value = uer.user_name
        editTextNumber.value = uer.user_phone
        editTextEmail.value = uer.user_email
        editTextNic.value = uer.user_nic

    }


    fun userUpdate() {
        profileProgessBar.set(true)
        var user = User().apply {
            user_name = editTextUserName.value.toString()
            user_email = editTextEmail.value.toString()
            user_nic = editTextNic.value.toString()
            user_id = appPrefs.getUserPrefs(mContext,AppPrefs.KEY_USER).user_id
        }

        _updateProfileCall.value = user


    }

    val updateProfileResponse = updateProfileCall.switchMap { id ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {
                var userRes = repo.updateUser(id)
                userRes.collect { value ->
                    profileProgessBar.set(false)
                    if (value.errorCode == appPrefs.SUCCESS_USER_UPDATE) {
                        emit(KesbewaResult.Success(value))
                    } else {
                        emit(KesbewaResult.LogicError.LogError(value))
                    }
                }
            } catch (ex: Exception) {
                profileProgessBar.set(false)
                emit(KesbewaResult.ExceptionError.ExError(ex))
            }
        }
    }













    object LiveDataVMFactory : ViewModelProvider.Factory {
        var app: Context = Kesbewa.applicationContext()
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return ProfileViewModel(app) as T

        }
    }

}