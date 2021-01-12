package tkhub.project.kesbewa.data.responsmodel


import tkhub.project.kesbewa.data.model.CartItem


sealed  class CartResult {
     class Success(val data: List<CartItem>) : CartResult()
     class Empty() : CartResult()
}