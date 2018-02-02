package bridge.component;

/**
 * Creator: Yao
 * Date:    2018/1/23
 * For:
 * Other:
 */
public class Red implements Color {

    String color;

    public Red() {
        color = "Red";
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void paint() {

        System.out.println("Paint.Red");
    }
}
