package disney.place.shop.goods;

import disney.constant.PackageName;

/**
 * {@code Figure} class 是所有模型商品的父类
 */
public abstract class Figure {
    private Package _package; // 包装此模型的包装袋

    public void setPackage(PackageName packageName){
        _package = PackageFactory.getPackage(packageName);
    }

    public Package getPackage(){
        return _package;
    }
}
