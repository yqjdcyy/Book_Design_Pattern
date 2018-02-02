package composite.basic.vo;

/**
 * Creator: Yao
 * Date:    2018/1/4
 * For:
 * Other:
 */
public abstract class MenuComponent {

    // detail.*
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescribe() {
        throw new UnsupportedOperationException();
    }

    public Double getPrice() {
        throw new UnsupportedOperationException();
    }

    // composite.*
    public void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public void get(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}
