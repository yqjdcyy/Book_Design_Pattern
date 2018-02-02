package adapter;

import adapter.vo.Duck;
import adapter.vo.GreenDuck;
import adapter.vo.HotTurky;
import adapter.vo.TurkyAdapter;

/**
 * Creator: Yao
 * Date:    2017/12/27
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        doIt(new GreenDuck());
        doIt(new TurkyAdapter(new HotTurky()));
    }

    private static void doIt(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
