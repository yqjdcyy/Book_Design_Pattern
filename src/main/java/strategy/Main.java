package strategy;

import strategy.object.Duck;
import strategy.object.GreenDuck;
import strategy.object.RedDuck;

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
