package command.vo;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class PhoneLight implements Light {
    @Override
    public void on() {
        System.out.println("phone.on");
    }

    @Override
    public void off() {

        System.out.println("phone.off");
    }
}
