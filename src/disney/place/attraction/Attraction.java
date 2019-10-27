package disney.place.attraction;


import disney.constant.LocationName;
import disney.place.Location;

/**
 * {@code Attraction} class 是所有游乐设施的父类
 */
public abstract class Attraction extends Location {
    public Attraction(LocationName locName) {
        super(locName);
    }
}
