package tkhub.project.kesbewa.viewmodels.login

import android.content.Context
import android.util.Log
import android.view.View
import androidx.core.os.bundleOf
import androidx.databinding.ObservableField
import androidx.lifecycle.*
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
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

class LoginViewModel(app: Context) : ViewModel() {

    var ctx = app
    var repo = RegisterRepo(ctx)
    var appPref = AppPrefs




    var editTextLoginPassword = MutableLiveData<String>()
    var editTextLoginNumber = MutableLiveData<String>()
    val isLoginVisible = ObservableField<Boolean>()


    private val _loginServiceCall = MutableLiveData<User>()
    val loginServiceCall: LiveData<User> = _loginServiceCall

    private val _passwordResetCodeCall = MutableLiveData<String>()
    val passwordResetCodeCall: LiveData<String> = _passwordResetCodeCall


    init {
        isLoginVisible.set(false)
    }




    fun login() {
        isLoginVisible.set(true)
        var user = User().apply {
            user_phone =   editTextLoginNumber.value.toString()
            user_login = editTextLoginPassword.value.toString()
            user_type = 1
        }
        _loginServiceCall.value=user

        Log.i("Himanshu", user.toString())

    }

    val loginServiceResponse = loginServiceCall.switchMap { id ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {
                var loginRes = repo.loginUser(id)
                loginRes.collect { value ->
                    isLoginVisible.set(false)
                    if (value.errorCode == appPref.SUCCESS_LOGGING) {
                        emit(KesbewaResult.Success(value))
                    } else {
                        emit(KesbewaResult.LogicError.LogError(value))
                    }
                }
            } catch (ex: Exception) {
                isLoginVisible.set(false)
                Log.i("Himanshu","ex : "+ex.toString())
               // emit(KesbewaResult.ExceptionError.ExError(ex))
            }
        }
    }

    fun goToRegistor(view: View) {
        Navigation.findNavController(view).navigate(R.id.fragment_register)
    }

    fun goToGusetUser(view: View) {
        Navigation.findNavController(view).navigate(R.id.fragmentLoginToHome)

    }

    fun password_reset() {
        isLoginVisible.set(true)
        _passwordResetCodeCall.value =editTextLoginNumber.value.toString()
    }

    val passwordResetCodeResponse = passwordResetCodeCall.switchMap { phone ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            try {
                var userRes = repo.passwordResetCode(phone)
                userRes.collect { value ->
                    isLoginVisible.set(false)
                    emit(KesbewaResult.Success(value))
                }
            } catch (ex: Exception) {
                isLoginVisible.set(false)
                emit(KesbewaResult.ExceptionError.ExError(ex))
            }
        }
    }



    object LiveDataVMFactory : ViewModelProvider.Factory {
        var app: Context = Kesbewa.applicationContext()
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return LoginViewModel(app) as T

        }
    }

}