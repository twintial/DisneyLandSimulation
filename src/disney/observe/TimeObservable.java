package disney.observe;

import java.util.Date;
import java.util.Vector;

// 使用到的设计模式有 观察者模式、单例模式

/**
 * {@code TimeObservable} class 是Observe设计模式中被观察的对象，
 * 在此系统中用于通知所有观察对象时间的变化
 */
public class TimeObservable {
    private Vector<TimeObserver> obs; // 观察者列表
    private Date nowDate; // 系统当前时间
    private static TimeObservable singleton = new TimeObservable(); //单例
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

    /**
     * 更新当前系统时间，时间不可倒退
     * @param date 更新的时间，不能比nowDate小
     */
    public void notifyObservers(Date date){
        if (date.compareTo(nowDate) < 0){
            return;
        }
        for (TimeObserver o:obs) {
            o.update(date);
        }
    }
}
