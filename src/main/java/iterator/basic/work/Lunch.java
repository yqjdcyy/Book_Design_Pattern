package iterator.basic.work;

import iterator.basic.vo.Iterator;
import iterator.basic.vo.LunchIterator;
import iterator.basic.vo.MenuItem;

/**
 * Creator: Yao
 * Date:    2018/1/3
 * For:
 * Other:
 */
public class Lunch extends Menu {

    private static final int MAX_SIZE = 6;
    private MenuItem[] items;

    public Lunch() {
        items = new MenuItem[MAX_SIZE];
        for (int i = 0; i < MAX_SIZE; i++) {
            items[i] = new MenuItem("Lunch-" + i, (double) i);
        }
    }

    @Override
    public Iterator createIterator() {
        return new LunchIterator(items);
    }
}
