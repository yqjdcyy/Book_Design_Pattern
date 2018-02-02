package bridge;

import bridge.abstraction.BallPoint;
import bridge.abstraction.Pencil;
import bridge.component.Blue;
import bridge.component.Red;

/**
 * Creator: Yao
 * Date:    2018/1/23
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {
        new Pencil(new Blue()).write("I'm Pencil");
        new BallPoint(new Red()).write("I'm BallPoint");
    }
}
