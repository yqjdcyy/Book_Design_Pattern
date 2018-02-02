package factory.simple.vo;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class VeggiePizza implements Pizza {
    public void prepare() {
        System.out.println("VegglePizza.prepare");
    }

    public void bake() {
        System.out.println("VegglePizza.bake");
    }

    public void cut() {
        System.out.println("VegglePizza.cut");
    }

    public void box() {
        System.out.println("VegglePizza.box");
    }
}
