package facade.vo;

/**
 * Creator: Yao
 * Date:    2017/12/29
 * For:
 * Other:
 */
public class SonySound implements Sound {
    @Override
    public void open() {
        System.out.println("\tSony.open");
    }

    @Override
    public void close() {
        System.out.println("\tSony.close");

    }

    @Override
    public void up() {
        System.out.println("\tSony.up");

    }

    @Override
    public void down() {
        System.out.println("\tSony.down");

    }
}
