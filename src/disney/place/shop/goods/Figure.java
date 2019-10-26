package disney.place.shop.goods;

import disney.constant.PackageName;

public abstract class Figure {
    private Package _package;

    public void setPackage(PackageName packageName){
        _package = PackageFactory.getPackage(packageName);
    }

    public Package getPackage(){
        return _package;
    }
}
