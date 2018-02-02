package template.example;

import javax.swing.*;
import java.awt.*;

/**
 * Creator: Yao
 * Date:    2018/1/2
 * For:
 * Other:
 */
public class Frame extends JFrame {

    public Frame(String title) throws HeadlessException {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        String msg = "paint";
        g.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        new Frame("Title");
    }
}
