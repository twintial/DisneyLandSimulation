package disney.place.shop.goods;

import disney.constant.PackageName;

import java.util.HashMap;

public class PackageFactory {
    public static HashMap<PackageName, Package> packageMap;
    static {
        //initiate packageMap
    }
    public static Package getPackage(PackageName packageName){
        return (Package) packageMap.get(packageName).clone();
    }
}
