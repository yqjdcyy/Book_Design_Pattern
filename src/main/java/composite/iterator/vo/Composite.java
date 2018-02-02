package composite.iterator.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * Creator: Yao
 * Date:    2018/1/5
 * For:
 * Other:
 */
public class Composite extends Component {

    private String name;
    private List<Component> list;
    private int idx;

    public Composite(String name) {
        this.name = name;
        list = new ArrayList<>();
        idx = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.printf("Composite[%s]\n", name);
        for (Component p : list) {
            p.print();
        }
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void get(int i) {
        list.get(i);
    }

    @Override
    public boolean hasNext() {
        return idx + 1 <= list.size();
    }

    @Override
    public Object next() {
        return list.get(idx++);
    }
}
