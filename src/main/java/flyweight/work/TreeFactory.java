package flyweight.work;

import flyweight.vo.Position;
import flyweight.vo.RedTree;
import flyweight.vo.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Creator: Yao
 * Date:    2018/1/29
 * For:
 * Other:
 */
public class TreeFactory {

    private List<Position> list;
    private Tree tree;

    public TreeFactory() {

        list = new ArrayList<>();
        tree = new RedTree();
    }

    public void create(double x, double y) {

        list.add(new Position(x, y));
    }

    public void show() {

        if (null == list || 0 == list.size())
            return;

        for (Position p : list) {
            tree.show(p);
        }
    }
}
