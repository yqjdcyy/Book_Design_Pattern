package factory.abstraction.work;

import factory.abstraction.vo.Pizza;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public abstract class PizzaStudio {

    protected abstract Pizza initPizza(String type);

    public void orderPizza(String type) {

        Pizza pizza = initPizza(type);

        System.out.println(pizza.getName());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
