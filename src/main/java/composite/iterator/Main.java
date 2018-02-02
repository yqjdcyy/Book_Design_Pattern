package composite.iterator;

import composite.iterator.vo.Composite;
import composite.iterator.vo.Leaf;

/**
 * Creator: Yao
 * Date:    2018/1/5
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        // init
        Composite siteA = new Composite("A");

        Composite siteB = new Composite("B");
        siteB.add(new Leaf("B-1", 1d));
        siteB.add(new Leaf("B-2", 2d));
        siteB.add(new Leaf("B-3", 3d));
        siteA.add(siteB);

        siteA.add(new Leaf("C", 4d));

        // print
        siteA.print();
    }
}
