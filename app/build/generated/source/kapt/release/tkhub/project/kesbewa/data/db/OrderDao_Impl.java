package tkhub.project.kesbewa.data.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import tkhub.project.kesbewa.data.model.CartItem;

@SuppressWarnings({"unchecked", "deprecation"})
public final class OrderDao_Impl implements OrderDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CartItem> __insertionAdapterOfCartItem;

  private final EntityDeletionOrUpdateAdapter<CartItem> __deletionAdapterOfCartItem;

  private final EntityDeletionOrUpdateAdapter<CartItem> __updateAdapterOfCartItem;

  private final SharedSQLiteStatement __preparedStmtOfUpdateTour;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public OrderDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCartItem = new EntityInsertionAdapter<CartItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `carttable` (`cart_id`,`pro_id`,`pro_name`,`pro_price`,`pro_size`,`pro_image`,`pro_colour`,`pro_colour_code`,`pro_total_qty`,`pro_total_price`,`cartStatus`,`pro_code`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CartItem value) {
        if (value.getCart_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getCart_id());
        }
        if (value.getPro_id() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getPro_id());
        }
        if (value.getPro_name() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPro_name());
        }
        if (value.getPro_price() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindDouble(4, value.getPro_price());
        }
        if (value.getPro_size() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPro_size());
        }
        if (value.getPro_image() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPro_image());
        }
        if (value.getPro_colour() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPro_colour());
        }
        if (value.getPro_colour_code() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getPro_colour_code());
        }
        if (value.getPro_total_qty() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getPro_total_qty());
        }
        if (value.getPro_total_price() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindDouble(10, value.getPro_total_price());
        }
        final Integer _tmp;
        _tmp = value.getCartStatus() == null ? null : (value.getCartStatus() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, _tmp);
        }
        if (value.getPro_code() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getPro_code());
        }
      }
    };
    this.__deletionAdapterOfCartItem = new EntityDeletionOrUpdateAdapter<CartItem>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `carttable` WHERE `cart_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CartItem value) {
        if (value.getCart_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getCart_id());
        }
      }
    };
    this.__updateAdapterOfCartItem = new EntityDeletionOrUpdateAdapter<CartItem>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `carttable` SET `cart_id` = ?,`pro_id` = ?,`pro_name` = ?,`pro_price` = ?,`pro_size` = ?,`pro_image` = ?,`pro_colour` = ?,`pro_colour_code` = ?,`pro_total_qty` = ?,`pro_total_price` = ?,`cartStatus` = ?,`pro_code` = ? WHERE `cart_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CartItem value) {
        if (value.getCart_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getCart_id());
        }
        if (value.getPro_id() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getPro_id());
        }
        if (value.getPro_name() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPro_name());
        }
        if (value.getPro_price() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindDouble(4, value.getPro_price());
        }
        if (value.getPro_size() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPro_size());
        }
        if (value.getPro_image() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPro_image());
        }
        if (value.getPro_colour() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPro_colour());
        }
        if (value.getPro_colour_code() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getPro_colour_code());
        }
        if (value.getPro_total_qty() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getPro_total_qty());
        }
        if (value.getPro_total_price() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindDouble(10, value.getPro_total_price());
        }
        final Integer _tmp;
        _tmp = value.getCartStatus() == null ? null : (value.getCartStatus() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, _tmp);
        }
        if (value.getPro_code() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getPro_code());
        }
        if (value.getCart_id() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, value.getCart_id());
        }
      }
    };
    this.__preparedStmtOfUpdateTour = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE carttable SET pro_total_qty = ?, pro_total_price = ?  WHERE cart_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM carttable";
        return _query;
      }
    };
  }

  @Override
  public Object insertCart(final CartItem cart, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCartItem.insert(cart);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteCart(final CartItem item, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCartItem.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateCart(final CartItem item, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfCartItem.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public int updateTour(final long tid, final int qty, final double price) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateTour.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, qty);
    _argIndex = 2;
    _stmt.bindDouble(_argIndex, price);
    _argIndex = 3;
    _stmt.bindLong(_argIndex, tid);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateTour.release(_stmt);
    }
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object checkItemAlreadyAdded(final long proid, final String proSize,
      final String proColour, final Continuation<? super Integer> p3) {
    final String _sql = "SELECT COUNT(pro_id) FROM carttable WHERE pro_id = ? AND pro_size = ? AND pro_colour_code = ? AND cartStatus = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, proid);
    _argIndex = 2;
    if (proSize == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, proSize);
    }
    _argIndex = 3;
    if (proColour == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, proColour);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p3);
  }

  @Override
  public Object selctAll(final Continuation<? super List<CartItem>> p0) {
    final String _sql = "SELECT * FROM carttable ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<CartItem>>() {
      @Override
      public List<CartItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCartId = CursorUtil.getColumnIndexOrThrow(_cursor, "cart_id");
          final int _cursorIndexOfProId = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_id");
          final int _cursorIndexOfProName = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_name");
          final int _cursorIndexOfProPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_price");
          final int _cursorIndexOfProSize = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_size");
          final int _cursorIndexOfProImage = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_image");
          final int _cursorIndexOfProColour = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_colour");
          final int _cursorIndexOfProColourCode = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_colour_code");
          final int _cursorIndexOfProTotalQty = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_total_qty");
          final int _cursorIndexOfProTotalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_total_price");
          final int _cursorIndexOfCartStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "cartStatus");
          final int _cursorIndexOfProCode = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_code");
          final List<CartItem> _result = new ArrayList<CartItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CartItem _item;
            final Long _tmpCart_id;
            if (_cursor.isNull(_cursorIndexOfCartId)) {
              _tmpCart_id = null;
            } else {
              _tmpCart_id = _cursor.getLong(_cursorIndexOfCartId);
            }
            final Long _tmpPro_id;
            if (_cursor.isNull(_cursorIndexOfProId)) {
              _tmpPro_id = null;
            } else {
              _tmpPro_id = _cursor.getLong(_cursorIndexOfProId);
            }
            final String _tmpPro_name;
            _tmpPro_name = _cursor.getString(_cursorIndexOfProName);
            final Double _tmpPro_price;
            if (_cursor.isNull(_cursorIndexOfProPrice)) {
              _tmpPro_price = null;
            } else {
              _tmpPro_price = _cursor.getDouble(_cursorIndexOfProPrice);
            }
            final String _tmpPro_size;
            _tmpPro_size = _cursor.getString(_cursorIndexOfProSize);
            final String _tmpPro_image;
            _tmpPro_image = _cursor.getString(_cursorIndexOfProImage);
            final String _tmpPro_colour;
            _tmpPro_colour = _cursor.getString(_cursorIndexOfProColour);
            final String _tmpPro_colour_code;
            _tmpPro_colour_code = _cursor.getString(_cursorIndexOfProColourCode);
            final Integer _tmpPro_total_qty;
            if (_cursor.isNull(_cursorIndexOfProTotalQty)) {
              _tmpPro_total_qty = null;
            } else {
              _tmpPro_total_qty = _cursor.getInt(_cursorIndexOfProTotalQty);
            }
            final Double _tmpPro_total_price;
            if (_cursor.isNull(_cursorIndexOfProTotalPrice)) {
              _tmpPro_total_price = null;
            } else {
              _tmpPro_total_price = _cursor.getDouble(_cursorIndexOfProTotalPrice);
            }
            final Boolean _tmpCartStatus;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfCartStatus)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfCartStatus);
            }
            _tmpCartStatus = _tmp == null ? null : _tmp != 0;
            final String _tmpPro_code;
            _tmpPro_code = _cursor.getString(_cursorIndexOfProCode);
            _item = new CartItem(_tmpCart_id,_tmpPro_id,_tmpPro_name,_tmpPro_price,_tmpPro_size,_tmpPro_image,_tmpPro_colour,_tmpPro_colour_code,_tmpPro_total_qty,_tmpPro_total_price,_tmpCartStatus,_tmpPro_code);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getCartCount(final Continuation<? super Integer> p0) {
    final String _sql = "SELECT COUNT(pro_id) FROM carttable WHERE cartStatus = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getCartItems(final Continuation<? super List<CartItem>> p0) {
    final String _sql = "SELECT * FROM carttable where cartStatus = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<CartItem>>() {
      @Override
      public List<CartItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCartId = CursorUtil.getColumnIndexOrThrow(_cursor, "cart_id");
          final int _cursorIndexOfProId = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_id");
          final int _cursorIndexOfProName = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_name");
          final int _cursorIndexOfProPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_price");
          final int _cursorIndexOfProSize = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_size");
          final int _cursorIndexOfProImage = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_image");
          final int _cursorIndexOfProColour = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_colour");
          final int _cursorIndexOfProColourCode = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_colour_code");
          final int _cursorIndexOfProTotalQty = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_total_qty");
          final int _cursorIndexOfProTotalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_total_price");
          final int _cursorIndexOfCartStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "cartStatus");
          final int _cursorIndexOfProCode = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_code");
          final List<CartItem> _result = new ArrayList<CartItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CartItem _item;
            final Long _tmpCart_id;
            if (_cursor.isNull(_cursorIndexOfCartId)) {
              _tmpCart_id = null;
            } else {
              _tmpCart_id = _cursor.getLong(_cursorIndexOfCartId);
            }
            final Long _tmpPro_id;
            if (_cursor.isNull(_cursorIndexOfProId)) {
              _tmpPro_id = null;
            } else {
              _tmpPro_id = _cursor.getLong(_cursorIndexOfProId);
            }
            final String _tmpPro_name;
            _tmpPro_name = _cursor.getString(_cursorIndexOfProName);
            final Double _tmpPro_price;
            if (_cursor.isNull(_cursorIndexOfProPrice)) {
              _tmpPro_price = null;
            } else {
              _tmpPro_price = _cursor.getDouble(_cursorIndexOfProPrice);
            }
            final String _tmpPro_size;
            _tmpPro_size = _cursor.getString(_cursorIndexOfProSize);
            final String _tmpPro_image;
            _tmpPro_image = _cursor.getString(_cursorIndexOfProImage);
            final String _tmpPro_colour;
            _tmpPro_colour = _cursor.getString(_cursorIndexOfProColour);
            final String _tmpPro_colour_code;
            _tmpPro_colour_code = _cursor.getString(_cursorIndexOfProColourCode);
            final Integer _tmpPro_total_qty;
            if (_cursor.isNull(_cursorIndexOfProTotalQty)) {
              _tmpPro_total_qty = null;
            } else {
              _tmpPro_total_qty = _cursor.getInt(_cursorIndexOfProTotalQty);
            }
            final Double _tmpPro_total_price;
            if (_cursor.isNull(_cursorIndexOfProTotalPrice)) {
              _tmpPro_total_price = null;
            } else {
              _tmpPro_total_price = _cursor.getDouble(_cursorIndexOfProTotalPrice);
            }
            final Boolean _tmpCartStatus;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfCartStatus)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfCartStatus);
            }
            _tmpCartStatus = _tmp == null ? null : _tmp != 0;
            final String _tmpPro_code;
            _tmpPro_code = _cursor.getString(_cursorIndexOfProCode);
            _item = new CartItem(_tmpCart_id,_tmpPro_id,_tmpPro_name,_tmpPro_price,_tmpPro_size,_tmpPro_image,_tmpPro_colour,_tmpPro_colour_code,_tmpPro_total_qty,_tmpPro_total_price,_tmpCartStatus,_tmpPro_code);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getSubTotal(final Continuation<? super Double> p0) {
    final String _sql = "SELECT COALESCE(sum(pro_total_price),0.0) FROM carttable WHERE cartStatus = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<Double>() {
      @Override
      public Double call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Double _result;
          if(_cursor.moveToFirst()) {
            final Double _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getDouble(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getQuantityTotal(final Continuation<? super Integer> p0) {
    final String _sql = "SELECT COALESCE(sum(pro_total_qty),0) FROM carttable WHERE cartStatus = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
