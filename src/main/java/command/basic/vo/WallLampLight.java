package command.basic.vo;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class WallLampLight implements Light {
    @Override
    public void on() {
        System.out.println("wall-lamp.on");
    }

    @Override
    public void off() {
        System.out.println("wall-lamp.off");
    }
}
