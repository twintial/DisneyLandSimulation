package disney.charactor;

import java.util.Date;

/**
 * {@code Visitor} class 是游客类
 */
public class Visitor extends Character {
    public Visitor(String name, int age) {
        super(name, age);
    }

    @Override
    public void update(Date date) {

    }
}
