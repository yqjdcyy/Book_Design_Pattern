package factory.abstraction.work;

import factory.abstraction.vo.Pizza;
import factory.abstraction.vo.VeggiePizza;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class VeggiePizzaStudio extends PizzaStudio {
    @Override
    public Pizza initPizza(String type) {
        return new VeggiePizza();
    }
}
