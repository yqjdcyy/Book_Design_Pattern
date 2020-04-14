package command.basic.vo;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class SamsungAirConditioner implements AirConditioner {
    @Override
    public void open() {
        System.out.println("Samsung.open");
    }

    @Override
    public void close() {
        System.out.println("Samsung.close");
    }
}
