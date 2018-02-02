package facade.vo;

/**
 * Creator: Yao
 * Date:    2017/12/29
 * For:
 * Other:
 */
public class BWSound implements Sound {
    @Override
    public void open() {
        System.out.println("\tB&W.open");
    }

    @Override
    public void close() {
        System.out.println("\tB&W.close");

    }

    @Override
    public void up() {
        System.out.println("\tB&W.up");

    }

    @Override
    public void down() {
        System.out.println("\tB&W.down");
    }
}
