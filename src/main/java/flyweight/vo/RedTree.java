package flyweight.vo;

/**
 * Creator: Yao
 * Date:    2018/1/29
 * For:
 * Other:
 */
public class RedTree implements Tree {

    private String color;

    public RedTree() {
        this.color = "Red";
    }

    @Override
    public void show(Position position) {

        System.out.printf("%s-Tree plant on {%s, %s}\n", color, position.getX(), position.getY());
    }
}
