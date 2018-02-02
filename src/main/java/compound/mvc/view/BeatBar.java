package compound.mvc.view;

import javax.swing.*;

/**
 * Creator: Yao
 * Date:    2018/1/23
 * For:
 * Other:
 */
public class BeatBar extends JProgressBar implements Runnable {

    public BeatBar() {
        Thread thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    @Override
    public void run() {
        for (; ; ) {
            setValue((int) (getValue() * 0.75));
            repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }
}
