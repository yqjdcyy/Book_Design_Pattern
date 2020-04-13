package strategy.basic;

import strategy.basic.object.Duck;
import strategy.basic.object.GreenDuck;
import strategy.basic.object.RedDuck;

/**
 * Creator: Yao
 * Date:    2017/12/21
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        Duck duck = new RedDuck();
        duck.fly();
        duck.quack();

        duck = new GreenDuck();
        duck.fly();
        duck.quack();
    }
}
