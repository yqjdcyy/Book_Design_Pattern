package bridge.abstraction;

import bridge.component.Color;

/**
 * Creator: Yao
 * Date:    2018/1/23
 * For:
 * Other:
 */
public class Pencil extends Pen {
    public Pencil(Color color) {
        super(color);
    }

    @Override
    protected void prepare() {
        System.out.println("Prepare.Pencil");
    }
}
