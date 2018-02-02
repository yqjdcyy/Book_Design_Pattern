package iterator.java.vo;


import java.util.Iterator;

/**
 * Creator: Yao
 * Date:    2018/1/3
 * For:
 * Other:
 */
public class LunchIterator implements Iterator {

    private int idx;
    private MenuItem[] items;

    public LunchIterator(MenuItem[] items) {
        this.items = items;
        idx = 0;
    }


    @Override
    public boolean hasNext() {
        return items.length > idx;
    }

    @Override
    public Object next() {

        return items[idx++];
    }

    @Override
    public void remove() {

        // init
        int size = items.length;

        // check
        if (idx < 0 || idx >= size)
            throw new IllegalStateException(String.format("unSupport index[%s] on array[%s]", idx, size));

        // move
        for (int i = idx; i < (size - 2); i++) {
            items[idx] = items[idx + 1];
        }
        items[size - 1] = null;
    }
}
