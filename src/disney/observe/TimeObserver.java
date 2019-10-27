package disney.observe;

import java.util.Date;

/**
 * {@code TimeObserver} class 是一个接口，通过实现这个接口变为观察者
 */
public interface TimeObserver {
    void update(Date date);
}
