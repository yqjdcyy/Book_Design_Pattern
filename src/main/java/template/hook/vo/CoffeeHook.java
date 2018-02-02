package template.hook.vo;

/**
 * Creator: Yao
 * Date:    2017/12/29
 * For:
 * Other:
 */
public class CoffeeHook extends CaffeinHookBehavior {
    @Override
    protected void add() {
        System.out.println("CoffeeHook.add");
    }

    @Override
    protected void brew() {
        System.out.println("CoffeeHook.brew");
    }

    @Override
    protected void hook() {
        System.out.println("CoffeeHook.hook");
    }
}
