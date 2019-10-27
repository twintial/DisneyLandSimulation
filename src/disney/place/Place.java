package disney.place;

// 用到的设计模式有 组合模式

/**
 * {@code Place} class 是{@link Location}和{@link Area}的父类
 */
public abstract class Place {
    public abstract String getName();
    public void addLocation(Place p){
        //需要抛出一个异常
    };
}
