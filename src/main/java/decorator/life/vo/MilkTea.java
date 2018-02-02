package decorator.life.vo;

/**
 * Creator: Yao
 * Date:    2017/12/23
 * For:
 * Other:
 */
public class MilkTea extends Component {
    public MilkTea() {
    }

    public MilkTea(Component component) {
        this.component = component;
    }

    public void pre() {
        System.out.println(this.prefix() + "MilkTea.pre");
    }

    public void done() {
        System.out.println(this.prefix() + "MilkTea.done");
    }

    public void after() {
        System.out.println(this.prefix() + "MilkTea.after");
    }
}
