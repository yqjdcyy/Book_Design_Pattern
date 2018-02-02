package prototype.vo;

/**
 * Creator: Yao
 * Date:    2018/2/1
 * For:
 * Other:
 */
public class Circle extends Shape {

    public Circle() {
        this.type = "Circle";
    }

    @Override
    void draw() {
        System.out.printf("draw %s\n", this.getType());
    }
}
