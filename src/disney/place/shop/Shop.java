package disney.place.shop;

import disney.constant.LocationName;
import disney.place.Location;

/**
 * {@code Shop} class 是所有商店的父类
 */
public abstract class Shop extends Location {
    public Shop(LocationName locName) {
        super(locName);
    }
}
