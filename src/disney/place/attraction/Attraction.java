package disney.place.attraction;


import disney.constant.LocationName;
import disney.place.Location;

public abstract class Attraction extends Location {
    public Attraction(LocationName locName) {
        super(locName);
    }
}
