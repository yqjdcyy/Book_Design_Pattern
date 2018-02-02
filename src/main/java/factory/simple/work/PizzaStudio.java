package factory.simple.work;

import factory.simple.factory.PizzaFactory;
import factory.simple.vo.Pizza;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class PizzaStudio {

    PizzaFactory factory;

    public PizzaStudio() {
        factory = new PizzaFactory();
    }

    public void make(String type) {

        Pizza pizza = factory.initPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
