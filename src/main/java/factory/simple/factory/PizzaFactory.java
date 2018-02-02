package factory.simple.factory;

import factory.simple.vo.CheesePizza;
import factory.simple.vo.Pizza;
import factory.simple.vo.VeggiePizza;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class PizzaFactory {

    public Pizza initPizza(String type) {

        switch (type) {
            case "CheesePizza":
                return new CheesePizza();
            case "VeggiePizza":
                return new VeggiePizza();
            default:
                throw new RuntimeException("nonsupport type");
        }
    }
}
