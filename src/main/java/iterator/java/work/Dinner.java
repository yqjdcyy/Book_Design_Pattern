package iterator.java.work;

import iterator.java.vo.DinnerIterator;
import iterator.java.vo.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Creator: Yao
 * Date:    2018/1/3
 * For:
 * Other:
 */
public class Dinner extends Menu {

    private List<MenuItem> list;

    public Dinner() {
        list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(new MenuItem("Dinner-" + i, (double) i));
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinnerIterator(list);
    }
}
