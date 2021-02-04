package tkhub.project.kesbewa.data.db

import android.content.Context
import androidx.databinding.adapters.Converters
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import tkhub.project.kesbewa.data.model.CartItem


@Database(entities = [CartItem::class], version = 3, exportSchema = false)
    abstract class AppDatabase : RoomDatabase() {

    abstract fun orderDao(): OrderDao
    companion object {
        // For Singleton instantiation
        @Volatile private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }
        val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE carttable ADD COLUMN pro_code TEXT")
            }
        }

        val MIGRATION_1_3 = object : Migration(2, 3) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE carttable ADD COLUMN pro_weight DOUBLE")
                database.execSQL("ALTER TABLE carttable ADD COLUMN pro_stock INTEGER")
            }
        }

        private fun buildDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, "kesbaewadb")
                .addMigrations(MIGRATION_1_3)
                .addCallback(object : RoomDatabase.Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                    }
                })
                .build()
        }
    }
}