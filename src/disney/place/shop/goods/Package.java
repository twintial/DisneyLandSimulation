package disney.place.shop.goods;

import disney.constant.PackageName;

public abstract class Package implements Cloneable {
    private PackageName name;
    private float price;

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getName(){
        return name.toString();
    }

    public float getPrice(){
        return price;
    }
}
