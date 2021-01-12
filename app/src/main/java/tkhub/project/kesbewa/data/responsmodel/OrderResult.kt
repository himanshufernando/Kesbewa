package tkhub.project.kesbewa.data.responsmodel

import tkhub.orderject.kesbewa.data.model.Order
import tkhub.project.kesbewa.data.model.NetworkError

sealed  class OrderResult {
     class Success(val data: Order) : OrderResult()
     class Failure(val error: NetworkError) : OrderResult()
}