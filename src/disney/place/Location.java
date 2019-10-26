package disney.place;

import disney.charactor.Staff;
import disney.charactor.Visitor;
import disney.constant.LocationName;

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
