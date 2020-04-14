package command.basic.vo;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class MediaAirConditioner implements AirConditioner {
    @Override
    public void open() {
        System.out.println("media.open");
    }

    @Override
    public void close() {
        System.out.println("media.close");
    }
}
