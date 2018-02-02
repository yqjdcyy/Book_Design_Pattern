package composite.basic;

import composite.basic.vo.MenuComposite;
import composite.basic.vo.MenuLeaf;

/**
 * Creator: Yao
 * Date:    2018/1/4
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        // init
        MenuComposite menu = new MenuComposite("Menu");
        MenuComposite siteA = new MenuComposite("A");
        siteA.add(new MenuLeaf("A-1", 1d));
        siteA.add(new MenuLeaf("A-2", 2d));
        siteA.add(new MenuLeaf("A-3", 3d));
        siteA.add(new MenuComposite("A-4"));
        menu.add(siteA);

        MenuComposite siteB = new MenuComposite("B");
        MenuComposite siteC = new MenuComposite("B-C");
        siteC.add(new MenuLeaf("B-C-1", 1d));
        siteC.add(new MenuLeaf("B-C-2", 2d));
        siteB.add(siteC);
        menu.add(siteB);

        menu.add(new MenuLeaf("D", 5d));

        // print
        menu.print();
    }
}
