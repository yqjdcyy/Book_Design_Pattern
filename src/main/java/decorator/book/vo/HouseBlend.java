package decorator.book.vo;

/**
 * Creator: Yao
 * Date:    2017/12/25
 * For:
 * Other:
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
