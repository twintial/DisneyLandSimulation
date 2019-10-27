package disney.charactor;

import java.util.Date;

/**
 * {@code Staff} class是员工类，此处为了简化系统，不再将员工种类细分
 */
public class Staff extends Character {
    public Staff(String name, int age) {
        super(name, age);
    }

    @Override
    public void update(Date date) {

    }
}
