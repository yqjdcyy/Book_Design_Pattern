package iterator.java;

import iterator.java.work.Dinner;
import iterator.java.work.Lunch;

import java.util.Arrays;
import java.util.Iterator;
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
