package tkhub.project.kesbewa.viewmodels.login

import android.content.Context
import android.view.View
import androidx.core.os.bundleOf
import androidx.databinding.ObservableField
import androidx.lifecycle.*
import androidx.navigation.Navigation
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import tkhub.project.kesbewa.data.model.User
import tkhub.project.kesbewa.Kesbewa
import tkhub.project.kesbewa.data.db.AppDatabase
import tkhub.project.kesbewa.data.db.OrderDao

import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.repo.RegisterRepo
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import java.lang.Exception

class RegistorViewModel(dataDao: OrderDao, app: Context) : ViewModel() {


    var ctx = app
    var repo = RegisterRepo(ctx)
    var appPref = AppPrefs


    var editTextUserName = MutableLiveData<String>()
    var editTextNumber = MutableLiveData<String>()
    var editTextEmail = MutableLiveData<String>()
    var editTextNic = MutableLiveData<String>()
    var editTextPassword = MutableLiveData<String>()
    var editTextConPassword = MutableLiveData<String>()


    var editTextGoogleNumber = MutableLiveData<String>()
    var editTextGoogleNic = MutableLiveData<String>()


    val isRegstorVisible = ObservableField<Boolean>()
    val isLoginVisible = ObservableField<Boolean>()
    val googleSignInProgress = ObservableField<Boolean>()

    var editTextCode = MutableLiveData<String>()
    var editTextResetConPass = MutableLiveData<String>()
    var editTextResetPass = MutableLiveData<String>()


    private val _userResponse = MutableLiveData<User>()
    val userResponse: LiveData<User> = _userResponse


    private val _generateUserCode = MutableLiveData<User>()
    val generateUserCode: LiveData<User> = _generateUserCode

    val googleUserDetails: MutableLiveData<User> by lazy {
        MutableLiveData<User>()
    }
    private val _googleUserRegisterCall = MutableLiveData<User>()
    val googleUserRegisterCall: LiveData<User> = _googleUserRegisterCall

    private val _passwordResetCall = MutableLiveData<User>()
    val passwordResetCall: LiveData<User> = _passwordResetCall


    lateinit var layoutView: View


    init {
        isRegstorVisible.set(false)
        isLoginVisible.set(false)
        googleSignInProgress.set(false)


    }


    fun register() {
        isRegstorVisible.set(true)
        var user = User().apply {
            user_name = editTextUserName.value.toString().trim()
            user_phone = editTextNumber.value.toString()
            user_email = editTextEmail.value.toString()
            user_nic = editTextNic.value.toString()
            user_login = editTextPassword.value.toString()
            user_android_id = AppPrefs.getAndroidid()
            user_type = 1
            user_confirm_password = editTextConPassword.value.toString()
        }

        _generateUserCode.value = user
    }


    fun userRegister(user: User) {
        _userResponse.value = user
    }


    val userCode = generateUserCode.switchMap { _user ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            var userRes = repo.createUserCode(_user)
            userRes.collect { value ->
                emit(value)
            }
        }
    }


    val userSaveResponse = userResponse.switchMap { id ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {
                var userRes = repo.saveUser(id)
                userRes.collect { value ->
                    isRegstorVisible.set(false)
                    emit(KesbewaResult.Success(value))
                }
            } catch (ex: Exception) {
                isRegstorVisible.set(false)
                emit(KesbewaResult.ExceptionError.ExError(ex))
            }
        }
    }


    fun registorToLogin(view: View) {
        Navigation.findNavController(view).navigate(R.id.fragmentRegisterToLogin)

    }


    fun backFromGoogleRegistorToLogin(view: View) {
        Navigation.findNavController(view).navigate(R.id.fragmentRegisterToLogin)
    }

    fun backFromRegistorToLogin(view: View) {
        Navigation.findNavController(view).navigate(R.id.fragmentRegisterToLogin)
    }

    fun goToGusetUser(view: View) {
        Navigation.findNavController(view).navigate(R.id.fragmentLoginToHome)

    }

    fun goToGoogleUser(view: View) {
        Navigation.findNavController(view).navigate(R.id.fragmentLoginToGoogle)

    }


    fun googlesignin() {
        googleSignInProgress.set(true)
        var user = googleUserDetails.value
        user?.user_phone = editTextGoogleNumber.value.toString()
        user?.user_nic = editTextGoogleNic.value.toString()

        _googleUserRegisterCall.value = user

    }

    val googleUserRegisterResponse = googleUserRegisterCall.switchMap { user ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {
                var userRes = repo.saveGoogleUser(user)
                userRes.collect { value ->
                    googleSignInProgress.set(false)
                    emit(KesbewaResult.Success(value))

                }
            } catch (ex: Exception) {
                googleSignInProgress.set(false)
                emit(KesbewaResult.ExceptionError.ExError(ex))
            }
        }
    }

    fun passwordReset(userid: String) {
        var user = User().apply {
            user_id = userid
            user_login = editTextResetPass.value.toString()
            user_confirm_password = editTextConPassword.value.toString()
            user_code = editTextCode.value.toString()
        }
        _passwordResetCall.value = user
    }

    val passwordResetResponse = passwordResetCall.switchMap { user ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {
                var userRes = repo.passwordReset(user)
                userRes.collect { value ->
                    googleSignInProgress.set(false)
                    emit(KesbewaResult.Success(value))

                }
            } catch (ex: Exception) {
                googleSignInProgress.set(false)
                emit(KesbewaResult.ExceptionError.ExError(ex))
            }
        }
    }


    object LiveDataVMFactory : ViewModelProvider.Factory {
        var app: Context = Kesbewa.applicationContext()
        private val dataDAO = AppDatabase.getInstance(app).orderDao()
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return RegistorViewModel(dataDAO, app) as T

        }
    }

}