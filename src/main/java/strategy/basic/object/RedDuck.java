package strategy.basic.object;

import strategy.basic.behavior.FlyByWingsBehavior;
import strategy.basic.behavior.QuacByCrykBehavior;

/**
 * Creator: Yao
 * Date:    2017/12/21
 * For:
 * Other:
 */
public class RedDuck extends Duck {

    public RedDuck() {
        this.flyBehavior = new FlyByWingsBehavior();
        this.quackBehavior = new QuacByCrykBehavior();
    }

    void display() {
        System.out.println("Red Duck");
    }
}
