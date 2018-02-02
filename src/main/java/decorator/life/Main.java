package decorator.life;


import decorator.life.vo.MilkTea;
import decorator.life.vo.PeanutMilkTea;

/**
 * Creator: Yao
 * Date:    2017/12/23
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        new PeanutMilkTea(new MilkTea(null)).perform();
        System.out.println();
        new PeanutMilkTea(new PeanutMilkTea(new MilkTea(null))).perform();
        System.out.println();
        new MilkTea(new PeanutMilkTea(new PeanutMilkTea(new MilkTea(null)))).perform();
    }
}
