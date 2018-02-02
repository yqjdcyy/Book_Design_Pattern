package decorator.book;

import decorator.book.vo.*;

/**
 * Creator: Yao
 * Date:    2017/12/25
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage = new Whip(new Mocha(new Mocha(new HouseBlend())));
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
