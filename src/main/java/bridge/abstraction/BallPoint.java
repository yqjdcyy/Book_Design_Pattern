package bridge.abstraction;


import bridge.component.Color;

/**
 * Creator: Yao
 * Date:    2018/1/23
 * For:
 * Other:
 */
public class BallPoint extends Pen {

    public BallPoint(Color color) {
        super(color);
    }

    @Override
    protected void prepare() {
        System.out.println("Prepare.BallPoint");
    }
}
