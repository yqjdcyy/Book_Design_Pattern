package decorator.book.vo;

/**
 * Creator: Yao
 * Date:    2017/12/25
 * For:
 * Other:
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
