package factory.abstraction.work;

import factory.abstraction.vo.CheesePizza;
import factory.abstraction.vo.Pizza;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class CheesePizzaStudio extends PizzaStudio {
    @Override
    public Pizza initPizza(String type) {
        return new CheesePizza();
    }
}
