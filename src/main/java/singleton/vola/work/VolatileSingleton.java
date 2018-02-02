package singleton.vola.work;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class VolatileSingleton {

    // volatile 保证修改的值会立即被更新到主存
    private volatile static VolatileSingleton ins;

    private VolatileSingleton() {
    }

    public static VolatileSingleton getInstance() {

        if (null == ins) {
            synchronized (VolatileSingleton.class) {
                if (null == ins)
                    ins = new VolatileSingleton();
            }
        }

        return ins;
    }
}
