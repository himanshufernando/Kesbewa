package tkhub.project.kesbewa.data.responsmodel

import tkhub.project.kesbewa.data.model.NetworkError


sealed  class KesbewaResult <out T : Any>{
     class Success<out T : Any>(val data: T) : KesbewaResult<T>()
     object InProgress : KesbewaResult<Nothing>()
     sealed class ExceptionError(val exception: Exception) : KesbewaResult<Nothing>() {
          class ExError(exception: Exception) : ExceptionError(exception)
     }
     sealed class LogicError(val exception: NetworkError) : KesbewaResult<Nothing>() {
          class LogError(exception: NetworkError) : LogicError(exception)
     }
}