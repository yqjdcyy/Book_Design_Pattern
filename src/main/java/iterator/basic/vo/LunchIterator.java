package iterator.basic.vo;

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
}
