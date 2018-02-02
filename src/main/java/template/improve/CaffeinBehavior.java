package template.improve.vo;

/**
 * Creator: Yao
 * Date:    2017/12/29
 * For:
 * Other:
 */
public abstract class CaffeinBehavior {

    public void doIt() {
        boil();
        brew();
        pour();
        add();
    }

    protected abstract void add();

    private void pour() {
        System.out.println("CaffeinBehavior.pour");
    }

    protected abstract void brew();

    private void boil() {
        System.out.println("CaffeinBehavior.boil");
    }
}
