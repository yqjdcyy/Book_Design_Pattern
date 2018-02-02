package compound.all.factory;

import compound.all.adapter.GooseAdpter;
import compound.all.vo.Duck;
import compound.all.vo.FakeDuck;
import compound.all.vo.RedDuck;
import compound.all.vo.WhiteGoose;
import compound.all.vo.impl.DuckCounter;

/**
 * Creator: Yao
 * Date:    2018/1/20
 * For:
 * Other:
 */
public class DuckFactory extends AbsstractDuckFactory {
    @Override
    public Duck createRedDuck() {
        return new DuckCounter(new RedDuck());
    }

    @Override
    public Duck createFakeDuck() {
        return new DuckCounter(new FakeDuck());

    }

    @Override
    public Duck createGooseDuck() {
        return new DuckCounter(new GooseAdpter(new WhiteGoose()));
    }
}
