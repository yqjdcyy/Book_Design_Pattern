package compound.all.factory;

import compound.all.vo.Duck;

/**
 * Creator: Yao
 * Date:    2018/1/20
 * For:
 * Other:
 */
public abstract class AbsstractDuckFactory {

    public abstract Duck createRedDuck();
    public abstract Duck createFakeDuck();
    public abstract Duck createGooseDuck();
}
