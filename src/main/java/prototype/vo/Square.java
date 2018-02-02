package prototype.vo;

/**
 * Creator: Yao
 * Date:    2018/2/1
 * For:
 * Other:
 */
public class Square extends Shape {

    public Square() {
        this.type = "Square";
    }

    @Override
    void draw() {
        System.out.printf("draw %s\n", this.getType());
    }
}
