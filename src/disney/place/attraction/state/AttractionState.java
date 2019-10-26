package disney.place.attraction.state;

import disney.charactor.Staff;
import disney.charactor.Visitor;
import disney.place.attraction.Attraction;

public abstract class AttractionState{
    public abstract void doVisit(Attraction attr, Visitor visitor);

    public abstract void doVisit(Attraction attr, Staff staff);
}
