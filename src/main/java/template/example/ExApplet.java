package template.example;

import java.applet.Applet;
import java.awt.*;

/**
 * Creator: Yao
 * Date:    2018/1/2
 * For:
 * Other:
 */
public class ExApplet extends Applet {

    String msg;

    @Override
    public void init() {
        msg = "init";
        repaint();
    }

    @Override
    public void start() {
        msg = "start";
        repaint();
    }

    @Override
    public void stop() {
        msg = "stop";
        repaint();
    }

    @Override
    public void destroy() {
        //
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, 5, 15);
    }
}
