package disney.charactor;

import disney.observe.TimeObservable;
import disney.observe.TimeObserver;
import disney.place.Location;

public abstract class Character implements TimeObserver {
    protected String name;
    protected int age;
    protected boolean isInDisneyLand = false;
    protected Location loc;
    public Character(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void moveTo(Location loc){
        this.loc = loc;
    }
    public void enterLand(TimeObservable timeObs){
        isInDisneyLand = !isInDisneyLand;
        timeObs.addObserver(this);
    }
    public void leaveLand(TimeObservable timeObs){
        isInDisneyLand = !isInDisneyLand;
        timeObs.deleteObserver(this);
    }
}