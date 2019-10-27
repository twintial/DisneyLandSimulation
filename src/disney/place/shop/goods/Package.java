package disney.place.shop.goods;

import disney.constant.PackageName;

/**
 * {@code Package} class 是用于包装商品的包装袋父类
 */
public abstract class Package implements Cloneable {
    private PackageName name; // 包装带名字

    public Package(PackageName packageName){
        this.name = packageName;
    }

    @Override
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
}
