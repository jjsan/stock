package sk.adrian.stockregistry.database.Entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(entity = StockItem.class,
        parentColumns = "siId",
        childColumns = "siId",
        onDelete = CASCADE))


public class StockItemAttributes {
    @PrimaryKey(autoGenerate = true)
    public int siaId;

    public final int quantity;
    public final String expire;
    public final String location;

    public final int siId;

    public StockItemAttributes(int quantity, String expire, String location, int siId) {
        this.quantity = quantity;
        this.expire = expire;
        this.location = location;
        this.siId = siId;
    }

}
