package disney.observe;

import java.util.Date;
import java.util.Vector;

public class TimeObservable {
    private Vector<TimeObserver> obs;
    private Date nowDate;
    private static TimeObservable singleton = new TimeObservable();
    private TimeObservable(){
        obs = new Vector<>();
        //系统初始时间
        nowDate = new Date();
    }
    public static TimeObservable getInstance(){
        return singleton;
    }
    public boolean addObserver(TimeObserver o){
        return obs.add(o);
    }
    public boolean deleteObserver(TimeObserver o){
        return obs.remove(o);
    }
    public void notifyObservers(Date date){
        for (TimeObserver o:obs) {
            o.update(date);
        }
    }
}
