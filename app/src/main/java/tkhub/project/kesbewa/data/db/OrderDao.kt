package tkhub.project.kesbewa.data.db

import androidx.room.*

import tkhub.project.kesbewa.data.model.CartItem

@Dao
interface OrderDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCart(cart: CartItem)
    
    @Query("SELECT COUNT(pro_id) FROM carttable WHERE pro_id = :proid AND pro_size = :proSize AND pro_colour_code = :proColour AND cartStatus = 1")
    suspend fun checkItemAlreadyAdded(proid: Long,proSize : String,proColour : String): Int

    @Query("SELECT * FROM carttable ")
    suspend fun selctAll(): List<CartItem>

    @Query("SELECT COUNT(pro_id) FROM carttable WHERE cartStatus = 1")
    suspend fun getCartCount(): Int

    @Query("SELECT * FROM carttable where cartStatus = 1")
    suspend fun getCartItems(): List<CartItem>


    @Update
    suspend fun updateCart(item: CartItem)

    @Query("UPDATE carttable SET pro_total_qty = :qty, pro_total_price = :price  WHERE cart_id = :tid")
    fun updateTour(tid :Long, qty : Int,price : Double): Int

    @Delete
    suspend fun deleteCart(item: CartItem)


    @Query("SELECT COALESCE(sum(pro_total_price),0.0) FROM carttable WHERE cartStatus = 1")
    suspend fun getSubTotal(): Double


    @Query("SELECT COALESCE(sum(pro_total_qty),0) FROM carttable WHERE cartStatus = 1")
    suspend fun getQuantityTotal(): Int

    @Query("DELETE FROM carttable")
    suspend fun deleteAll()





}