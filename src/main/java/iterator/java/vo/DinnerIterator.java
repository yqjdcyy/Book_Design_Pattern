package iterator.java.vo;

import java.util.Iterator;

import java.util.List;

/**
 * Creator: Yao
 * Date:    2018/1/3
 * For:
 * Other:
 */
public class DinnerIterator implements Iterator {

    private int idx;
    private List<MenuItem> list;

    public DinnerIterator(List<MenuItem> list) {
        this.list = list;
        idx = 0;
    }

    @Override
    public boolean hasNext() {
        return list.size() > idx;
    }

    @Override
    public Object next() {
        return list.get(idx++);
    }

    @Override
    public void remove() {
        list.remove(idx);
    }
}
