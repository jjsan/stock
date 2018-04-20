package sk.adrian.stockregistry.database.Entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class StockItem {
    @PrimaryKey (autoGenerate = true)
    public int siId;

    public String stockItemLabel;
    public String stockItemDescription;

    public StockItem() {
    }

    public StockItem(String stockItemLabel, String stockItemDescription) {
        this.stockItemLabel = stockItemLabel;
        this.stockItemDescription = stockItemDescription;
    }

    public StockItem(int siId, String stockItemLabel, String stockItemDescription) {
        this.siId = siId;
        this.stockItemLabel = stockItemLabel;
        this.stockItemDescription = stockItemDescription;
    }

    // what to return on toString call on StockItem
    @Override
    public String toString() {
        return stockItemLabel +  " (" + stockItemDescription + ")";
    }
}