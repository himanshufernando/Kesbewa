package tkhub.project.kesbewa.data.responsmodel

import tkhub.project.kesbewa.data.model.NetworkError


sealed  class VersionResult <out T : Any>{
     class Continue<out T : Any>(val data: T) : VersionResult<T>()
     class ShowSpecialNote<out T : Any>(val data: T) : VersionResult<T>()
     class ShowVersionMismatchDialog<out T : Any>(val data: T) : VersionResult<T>()


     sealed class ExceptionError(val exception: Exception) : VersionResult<Nothing>() {
          class ExError(exception: Exception) : ExceptionError(exception)
     }
     sealed class LogicError(val exception: NetworkError) : VersionResult<Nothing>() {
          class LogError(exception: NetworkError) : LogicError(exception)
     }
}