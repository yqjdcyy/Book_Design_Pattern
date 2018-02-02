package template.improve.vo;

/**
 * Creator: Yao
 * Date:    2017/12/29
 * For:
 * Other:
 */
public class Coffee extends template.improve.vo.CaffeinBehavior {
    @Override
    protected void add() {
        System.out.println("Coffee.add");
    }

    @Override
    protected void brew() {
        System.out.println("Coffee.brew");

    }
}
