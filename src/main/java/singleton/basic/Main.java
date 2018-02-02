package singleton.basic;

import singleton.basic.work.Singleton;
import singleton.vola.work.VolatileSingleton;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        Singleton ins = Singleton.getInstance();
        System.out.println(ins.hashCode());
        ins = Singleton.getInstance();
        System.out.println(ins.hashCode());

        VolatileSingleton volatileIns = VolatileSingleton.getInstance();
        System.out.println(volatileIns.hashCode());
        volatileIns = VolatileSingleton.getInstance();
        System.out.println(volatileIns.hashCode());
    }
}
