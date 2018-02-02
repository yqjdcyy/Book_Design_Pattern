package iterator.basic;

import iterator.basic.vo.Iterator;
import iterator.basic.work.Dinner;
import iterator.basic.work.Lunch;

import java.util.Arrays;
import java.util.List;

/**
 * Creator: Yao
 * Date:    2018/1/3
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        List<Iterator> list = Arrays.asList(new Lunch().createIterator(), new Dinner().createIterator());
        for (Iterator p : list) {
            while (p.hasNext()) {
                System.out.println(p.next());
            }
            System.out.println();
        }
    }
}
