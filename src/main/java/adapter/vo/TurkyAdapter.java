package adapter.vo;

/**
 * Creator: Yao
 * Date:    2017/12/27
 * For:
 * Other:
 */
public class TurkyAdapter implements Duck {

    private Turky turky;

    public TurkyAdapter(Turky turky) {
        this.turky = turky;
    }

    @Override
    public void fly() {
        turky.fly();
    }

    @Override
    public void quack() {
        turky.gobble();
    }
}
