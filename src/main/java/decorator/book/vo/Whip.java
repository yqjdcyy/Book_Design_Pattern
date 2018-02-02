package decorator.book.vo;

/**
 * Creator: Yao
 * Date:    2017/12/25
 * For:
 * Other:
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    public double cost() {
        return .3 + beverage.cost();
    }
}
