package factory.simple;

import factory.simple.work.PizzaStudio;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        PizzaStudio studio = new PizzaStudio();
        studio.make("CheesePizza");
        studio.make("VeggiePizza");
    }
}
