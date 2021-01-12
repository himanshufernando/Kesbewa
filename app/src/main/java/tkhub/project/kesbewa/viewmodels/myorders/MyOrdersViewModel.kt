package tkhub.project.kesbewa.viewmodels.myorders

import android.content.Context
import androidx.lifecycle.*
import com.google.firebase.database.*
import kotlinx.coroutines.Dispatchers
import tkhub.project.kesbewa.Kesbewa
import kotlinx.coroutines.flow.collect
import tkhub.project.kesbewa.data.model.NetworkError
import tkhub.project.kesbewa.data.model.OrderRespons
import tkhub.project.kesbewa.data.responsmodel.KesbewaResult
import tkhub.project.kesbewa.repo.OrdersRepo
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.services.network.InternetConnection

class MyOrdersViewModel (context: Context) : ViewModel() {


    var mContext = context

    var repo = OrdersRepo(mContext)



    private val _orderCurrent = MutableLiveData<Int>()
    val orderCurrent: LiveData<Int> = _orderCurrent




    init {
        getOrders((1..1000).random())
    }



    fun getOrders(code : Int) {
        _orderCurrent.value=code
    }

  /* val userAddressList = orderCurrent.switchMap { id ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            var currentRes = repo.getUserCurrentOrders()
            try {
                currentRes.collect { value ->
                    if(value==null){
                        emit(KesbewaResult.LogicError.LogError(AppPrefs.errorSomethingWentWrong()))
                    }else{
                        if(value.isEmpty()){
                            isNoAddressLayoutVisible.set(true)
                        }else{
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
    }*/


    val userCurrentOrders = orderCurrent.switchMap { id ->
        liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            var currentRes = repo.getUserOrders()
            try {
                currentRes.collect { value ->
                    if(value==null){
                        emit(KesbewaResult.LogicError.LogError(AppPrefs.errorSomethingWentWrong()))
                    }else{
                        emit(KesbewaResult.Success(value))
                    }
                }
            }catch (ioException: Exception) {
                emit(KesbewaResult.ExceptionError.ExError(ioException))
            }
        }
    }




    object LiveDataVMFactory : ViewModelProvider.Factory {
        var app: Context = Kesbewa.applicationContext()
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return MyOrdersViewModel(app) as T

        }
    }

}