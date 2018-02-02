package facade;

import facade.vo.BWSound;
import facade.vo.SonySound;
import facade.vo.WallLampLLight;
import facade.work.Cinema;

/**
 * Creator: Yao
 * Date:    2017/12/29
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        Cinema cinema = new Cinema();
        cinema.add(new WallLampLLight(), new BWSound(), new SonySound());
        cinema.start();
        cinema.stop();
    }
}
