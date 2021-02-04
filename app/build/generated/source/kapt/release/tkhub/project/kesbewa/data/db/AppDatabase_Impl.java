package tkhub.project.kesbewa.data.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile OrderDao _orderDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `carttable` (`cart_id` INTEGER, `pro_id` INTEGER, `pro_name` TEXT, `pro_price` REAL, `pro_size` TEXT, `pro_image` TEXT, `pro_colour` TEXT, `pro_colour_code` TEXT, `pro_total_qty` INTEGER, `pro_total_price` REAL, `cartStatus` INTEGER, `pro_code` TEXT, `pro_weight` REAL, `pro_stock` INTEGER, PRIMARY KEY(`cart_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '05de60b4125dda540495c161532f0816')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `carttable`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCarttable = new HashMap<String, TableInfo.Column>(14);
        _columnsCarttable.put("cart_id", new TableInfo.Column("cart_id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCarttable.put("pro_id", new TableInfo.Column("pro_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCarttable.put("pro_name", new TableInfo.Column("pro_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCarttable.put("pro_price", new TableInfo.Column("pro_price", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCarttable.put("pro_size", new TableInfo.Column("pro_size", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCarttable.put("pro_image", new TableInfo.Column("pro_image", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCarttable.put("pro_colour", new TableInfo.Column("pro_colour", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCarttable.put("pro_colour_code", new TableInfo.Column("pro_colour_code", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCarttable.put("pro_total_qty", new TableInfo.Column("pro_total_qty", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCarttable.put("pro_total_price", new TableInfo.Column("pro_total_price", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCarttable.put("cartStatus", new TableInfo.Column("cartStatus", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCarttable.put("pro_code", new TableInfo.Column("pro_code", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCarttable.put("pro_weight", new TableInfo.Column("pro_weight", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCarttable.put("pro_stock", new TableInfo.Column("pro_stock", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCarttable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCarttable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCarttable = new TableInfo("carttable", _columnsCarttable, _foreignKeysCarttable, _indicesCarttable);
        final TableInfo _existingCarttable = TableInfo.read(_db, "carttable");
        if (! _infoCarttable.equals(_existingCarttable)) {
          return new RoomOpenHelper.ValidationResult(false, "carttable(tkhub.project.kesbewa.data.model.CartItem).\n"
                  + " Expected:\n" + _infoCarttable + "\n"
                  + " Found:\n" + _existingCarttable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "05de60b4125dda540495c161532f0816", "fbeb46f893ec5e159f335b2137935741");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "carttable");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `carttable`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public OrderDao orderDao() {
    if (_orderDao != null) {
      return _orderDao;
    } else {
      synchronized(this) {
        if(_orderDao == null) {
          _orderDao = new OrderDao_Impl(this);
        }
        return _orderDao;
      }
    }
  }
}
