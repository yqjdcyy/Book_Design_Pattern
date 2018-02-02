package iterator.basic.work;

import iterator.basic.vo.DinnerIterator;
import iterator.basic.vo.Iterator;
import iterator.basic.vo.MenuItem;

import java.util.ArrayList;
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
