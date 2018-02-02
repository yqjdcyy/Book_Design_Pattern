package factory.abstraction;

import factory.abstraction.work.CheesePizzaStudio;
import factory.abstraction.work.PizzaStudio;
import factory.abstraction.work.VeggiePizzaStudio;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        PizzaStudio studio = new CheesePizzaStudio();
        studio.orderPizza("");

        studio = new VeggiePizzaStudio();
        studio.orderPizza("");
    }
}
