package bridge.abstraction;

import bridge.component.Color;

/**
 * Creator: Yao
 * Date:    2018/1/23
 * For:
 * Other:
 */
public abstract class Pen {

    Color color;

    public Pen(Color color) {
        this.color = color;
    }


    public void write(String text) {

        color.paint();
        prepare();
        System.out.println("Pen.write: " + text);
    }

    protected abstract void prepare();
}
