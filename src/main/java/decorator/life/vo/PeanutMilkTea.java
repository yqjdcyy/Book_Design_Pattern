package decorator.life.vo;

/**
 * Creator: Yao
 * Date:    2017/12/23
 * For:
 * Other:
 */
public class PeanutMilkTea extends MilkTea {

    public PeanutMilkTea(Component component) {
        this.component = component;
    }

    @Override
    public void pre() {
        System.out.println(this.prefix() + "PeanutMilkTea.pre");
    }

    @Override
    public void done() {
        System.out.println(this.prefix() + "PeanutMilkTea.done");
    }
}
