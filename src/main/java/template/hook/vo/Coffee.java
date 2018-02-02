package template.hook.vo;

/**
 * Creator: Yao
 * Date:    2017/12/29
 * For:
 * Other:
 */
public class Coffee extends CaffeinHookBehavior {
    @Override
    protected void add() {
        System.out.println("Coffee.add");
    }

    @Override
    protected void brew() {
        System.out.println("Coffee.brew");

    }
}
