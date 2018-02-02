package singleton.basic.work;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class Singleton {

    private static Singleton ins;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (null == ins)
            ins = new Singleton();

        return ins;
    }
}
