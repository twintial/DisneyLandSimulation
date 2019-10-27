package disney.charactor;

import disney.observe.TimeObservable;
import disney.observe.TimeObserver;
import disney.place.Location;

// 使用的到的设计模式有 观察者模式

/**
 * {@code Character} class是系统中所有人物类的父类，
 * 实现 {@link TimeObserver} 接口，使每一个人物都可以观察系统的时间变化
 */
public abstract class Character implements TimeObserver {
    protected String name; // 姓名
    protected int age; // 年龄
    protected boolean isInDisneyLand = false; // 是否在园区内
    protected Location loc; // 当前所在的地点
    public Character(String name, int age){
        this.name = name;
        this.age = age;
    }

    /**
     * 将人物移动到另一个{@link Location}地点去
     * @param loc 是人物要移动到的地方
     */
    public void moveTo(Location loc){
        this.loc = loc;
    }

    /**
     * 该方法用于人物进入园区
     * 进入园区需要将此人物添加到全局的TimeObservable中，观察系统的时间变化
     */
    public void enterLand(){
        isInDisneyLand = !isInDisneyLand;
        TimeObservable.getInstance().addObserver(this);
    }

    /**
     * 该方法用于人物离开园区
     * 离开园区需要将此人物从全局的TimeObservable中删去
     */
    public void leaveLand(){
        isInDisneyLand = !isInDisneyLand;
        TimeObservable.getInstance().deleteObserver(this);
    }
}