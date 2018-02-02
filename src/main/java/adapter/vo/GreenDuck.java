package adapter.vo;

/**
 * Creator: Yao
 * Date:    2017/12/27
 * For:
 * Other:
 */
public class GreenDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("GreenDuck.fly");
    }

    @Override
    public void quack() {
        System.out.println("GreenDuck.quack");
    }
}
