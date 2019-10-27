package disney.place.attraction.state;

import disney.charactor.Staff;
import disney.charactor.Visitor;
import disney.place.attraction.Attraction;

// 使用到的设计模式有 状态模式、模版模式

/**
 * {@code AttractionState} class 为游乐设施的状态的父类，
 * 在游乐园不同的状态的时候做出的行为
 */
public abstract class AttractionState{
    public abstract void doVisit(Attraction attr, Visitor visitor);

    public abstract void doVisit(Attraction attr, Staff staff);
}
