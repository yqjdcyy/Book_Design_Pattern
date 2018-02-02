package flyweight;

import flyweight.work.TreeFactory;

/**
 * Creator: Yao
 * Date:    2018/1/29
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        TreeFactory factory = new TreeFactory();
        factory.create(1, 1);
        factory.create(1, 2);
        factory.create(3, 3);
        factory.create(3, 4);
        factory.create(3, 5);

        factory.show();
    }
}
