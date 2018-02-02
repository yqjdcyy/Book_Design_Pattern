package iterator.java.work;

import iterator.java.vo.LunchIterator;
import iterator.java.vo.MenuItem;

import java.util.Iterator;

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
