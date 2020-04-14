package command.basic.vo;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class SunLight implements Light {
    @Override
    public void on() {
        System.out.println("sun.on");
    }

    @Override
    public void off() {
        System.out.println("sun.off");
    }
}
