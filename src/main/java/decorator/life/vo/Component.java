package decorator.life.vo;

/**
 * Creator: Yao
 * Date:    2017/12/23
 * For:
 * Other:
 */
public abstract class Component {

    public Component component;

    public String prefix() {
        return "\t" + (null == component ? "" : component.prefix());
    }

    public abstract void pre();

    public abstract void done();

    public abstract void after();

    public void perform() {

        this.pre();
        if (null != component)
            component.perform();
        this.done();
        this.after();
    }
}
