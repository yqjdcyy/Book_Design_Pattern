package factory.abstraction.vo;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        name = "VeggiePizza";
    }

    @Override
    public void cut() {
        System.out.println("\tVeggiePizza.cut");
    }
}
