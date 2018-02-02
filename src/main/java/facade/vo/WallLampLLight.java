package facade.vo;

/**
 * Creator: Yao
 * Date:    2017/12/29
 * For:
 * Other:
 */
public class WallLampLLight implements Light {
    @Override
    public void on() {
        System.out.println("\twall-lamp.on");
    }

    @Override
    public void off() {
        System.out.println("\twall-lamp.off");
    }
}
