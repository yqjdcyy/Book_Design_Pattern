package bridge.component;

/**
 * Creator: Yao
 * Date:    2018/1/23
 * For:
 * Other:
 */
public class Blue implements Color {

    String color;

    public Blue() {
        color = "blue";
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void paint() {
        System.out.println("Paint.Blue");
    }
}
