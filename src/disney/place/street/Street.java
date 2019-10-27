package disney.place.street;

import disney.constant.LocationName;
import disney.place.Location;

/**
 * {@code Street} class 是街道的父类
 */
public abstract class Street extends Location {
    public Street(LocationName locName) {
        super(locName);
    }
}
