package adapter.vo;

/**
 * Creator: Yao
 * Date:    2017/12/27
 * For:
 * Other:
 */
public class HotTurky implements Turky {
    @Override
    public void gobble() {
        System.out.println("HotTurky.gobble");
    }

    @Override
    public void fly() {
        System.out.println("HotTurky.fly");
    }
}
