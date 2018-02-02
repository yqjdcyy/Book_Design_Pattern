package template.hook.vo;

/**
 * Creator: Yao
 * Date:    2017/12/29
 * For:
 * Other:
 */
public abstract class CaffeinHookBehavior {

    public void doIt() {
        boil();
        brew();
        pour();
        add();
        hook();
        System.out.println();
    }

    protected void hook() {
    }

    protected abstract void add();

    protected void pour() {
        System.out.println("CaffeinHookBehavior.pour");
    }

    protected abstract void brew();

    private void boil() {
        System.out.println("CaffeinHookBehavior.boil");
    }
}
