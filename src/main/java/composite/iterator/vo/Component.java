package composite.iterator.vo;


import java.util.Iterator;

/**
 * Creator: Yao
 * Date:    2018/1/5
 * For:
 * Other:
 */
public abstract class Component implements Iterator{


    // detail.*
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public Double getPrice() {
        throw new UnsupportedOperationException();
    }

    // composite.*
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    public void get(int i) {
        throw new UnsupportedOperationException();
    }

    // common.*
    public abstract void print();
}
