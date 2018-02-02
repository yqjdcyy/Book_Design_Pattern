package decorator.book.vo;

/**
 * Creator: Yao
 * Date:    2017/12/25
 * For:
 * Other:
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
