package prototype;

import prototype.config.CacheTypeEnum;
import prototype.work.ShapeCache;

/**
 * Creator: Yao
 * Date:    2018/2/1
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        ShapeCache.initCache();
        System.out.println(ShapeCache.getShape(CacheTypeEnum.Circle.getType()).getType());
        System.out.println(ShapeCache.getShape(CacheTypeEnum.Rectangle.getType()).getType());
    }
}
