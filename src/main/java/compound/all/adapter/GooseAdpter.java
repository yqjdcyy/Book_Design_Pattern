package compound.all.adapter;

import compound.all.vo.Duck;
import compound.all.vo.Goose;

/**
 * Creator: Yao
 * Date:    2018/1/20
 * For:
 * Other:
 */
public class GooseAdpter implements Duck {

    Goose goose;

    public GooseAdpter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
