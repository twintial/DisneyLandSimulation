package disney.place;

import disney.charactor.Staff;
import disney.charactor.Visitor;
import disney.constant.LocationName;

/**
 * {@code Location} class 是所有地点的父类，包括游乐设施{@link disney.place.attraction.Attraction}、
 * 商店{@link disney.place.shop.Shop}和街道{@link disney.place.street.Street}
 */
public abstract class Location extends Place{
    protected LocationName name;

    public Location(LocationName locName){
        this.name = locName;
    }

    public abstract void visit(Staff staff);

    public abstract void visit(Visitor visit);

    public String getName(){
        return name.toString();
    }

}
