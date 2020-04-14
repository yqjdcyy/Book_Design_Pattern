package command.basic.vo;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class GreeAirConditioner implements AirConditioner {
    @Override
    public void open() {
        System.out.println("gree.opeen");
    }

    @Override
    public void close() {
        System.out.println("gree.close");
    }
}
