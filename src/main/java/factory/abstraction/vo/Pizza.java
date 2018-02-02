package factory.abstraction.vo;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public abstract class Pizza {

    String name;

    public void prepare() {
        System.out.println("\tPizza.prepare");
    }
    public void bake() {
        System.out.println("\tPizza.bake");
    }
    public void cut() {
        System.out.println("\tPizza.cut");
    }
    public void box() {
        System.out.println("\tPizza.box");
    }

    public String getName() {
        return name;
    }
}
