package prototype.work;

import prototype.config.CacheTypeEnum;
import prototype.vo.Circle;
import prototype.vo.Rectangle;
import prototype.vo.Shape;
import prototype.vo.Square;

import java.util.HashMap;
import java.util.Map;

/**
 * Creator: Yao
 * Date:    2018/2/1
 * For:
 * Other:
 */
public class ShapeCache {

    private static Map<String, Shape> map = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape shape = map.get(shapeId);
        return (Shape) shape.clone();
    }

    public static void initCache() {

        fill(CacheTypeEnum.Circle.getType(), new Circle());
        fill(CacheTypeEnum.Square.getType(), new Square());
        fill(CacheTypeEnum.Rectangle.getType(), new Rectangle());
    }

    private static void fill(String key, Shape shape) {

        shape.setId(key);
        map.put(key, shape);
    }
}
