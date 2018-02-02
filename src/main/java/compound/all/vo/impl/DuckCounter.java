package compound.all.vo.impl;

import compound.all.vo.Duck;

/**
 * Creator: Yao
 * Date:    2018/1/20
 * For:
 * Other:
 */
public class DuckCounter implements Duck {

    Duck duck;
    static int count;

    public DuckCounter(Duck duck) {
        this.duck = duck;
        count = 0;
    }

    @Override
    public void quack() {
        duck.quack();
        count++;
    }

    public static int getCount() {
        return count;
    }
}
