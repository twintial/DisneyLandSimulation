package disney.place.shop.goods;

import disney.constant.PackageName;
import java.util.HashMap;

//用到的设计模式有 原型模式

/**
 * {@PackageFactory} class 是用于创建包装袋的方法
 */
public class PackageFactory {
    public static HashMap<PackageName, Package> packageMap;
    static {
        //initiate packageMap
    }
    public static Package getPackage(PackageName packageName){
        return (Package) packageMap.get(packageName).clone();
    }
}
