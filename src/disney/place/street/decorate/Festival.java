package disney.place.street.decorate;

// 用到的设计模式有桥接模式

/**
 * {@code Festival} class 是所用节日装修类的父类，是桥接模式中的一个维度，
 * 对于一条街道不同的节日有不同的装修风格
 */
public interface Festival {
    void decorate();
}
