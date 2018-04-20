package sk.adrian.stockregistry.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import sk.adrian.stockregistry.database.Entity.StockItemAttributes;

@Dao
public interface StockItemAttributesDao {
    @Insert
    void insert(StockItemAttributes... stockItemAttributes);

    @Update
    void update(StockItemAttributes... stockItemAttributes);

    @Delete
    void delete(StockItemAttributes... stockItemAttributes);

    @Delete
    void deleteAll(List<StockItemAttributes> stockItemAttributes);

    @Query("SELECT * FROM stockItemAttributes")
    List<StockItemAttributes> getAllstockItemAtributes();

    @Query("SELECT * FROM stockItemAttributes WHERE siaId=:siaId")
    List<StockItemAttributes> findStockItemById(final int siaId);

    @Query("SELECT * FROM stockItemAttributes WHERE location=:location")
    List<StockItemAttributes> findStockItemByLocation(final int location);


}
