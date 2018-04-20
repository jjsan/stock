package sk.adrian.stockregistry.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import sk.adrian.stockregistry.database.Entity.StockItem;
import sk.adrian.stockregistry.database.Entity.StockItemAttributes;
import sk.adrian.stockregistry.database.dao.StockItemAttributesDao;
import sk.adrian.stockregistry.database.dao.StockItemDao;

@Database(entities = { StockItem.class, StockItemAttributes.class,},
        version = 2, exportSchema = false)

public abstract class StockItemDatabase extends RoomDatabase {

    private static final String DB_NAME = "stockItemDatabase.db";
    private static volatile StockItemDatabase instance;

    // to have one database
    public static synchronized StockItemDatabase getInstance(Context context) {
        if (instance == null) {
            instance = create(context);
        }
        return instance;
    }

    // if does not exist - create
    private static StockItemDatabase create(final Context context) {
        return Room.databaseBuilder(
                context,
                StockItemDatabase.class,
                DB_NAME).build();
    }

    public abstract StockItemDao getStockItemDao();
    public abstract StockItemAttributesDao getStockItemAttributesDao();

}
