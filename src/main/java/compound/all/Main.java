package compound.all;

import compound.all.factory.DuckFactory;
import compound.all.vo.Duck;
import compound.all.vo.impl.DuckCounter;

import java.util.Arrays;
import java.util.List;

/**
 * Creator: Yao
 * Date:    2018/1/19
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        DuckFactory factory = new DuckFactory();
        List<Duck> list = Arrays.asList(
                factory.createRedDuck(),
                factory.createFakeDuck(),
                factory.createGooseDuck());
        for (Duck p : list) {
            p.quack();
        }
        System.out.println(((DuckCounter)list.get(0)).getCount());
    }
}
