package facade.work;

import facade.vo.Sound;
import command.vo.Light;

import java.util.ArrayList;
import java.util.List;

/**
 * Creator: Yao
 * Date:    2017/12/29
 * For:
 * Other:
 */
public class Cinema {

    private List<Light> lightList;
    private List<Sound> soundList;

    public Cinema() {
        lightList = new ArrayList<>();
        soundList = new ArrayList<>();
    }

    public void add(Object... objects) {

        if (null == objects || objects.length <= 0)
            return;

        for (Object p : objects) {
            if (p instanceof Light) {
                lightList.add((Light) p);
            } else if (p instanceof Sound) {
                soundList.add((Sound) p);
            }
        }
    }

    public void start() {
        System.out.println("Cinema.start");
        for (Light p : lightList) {
            p.on();
        }
        for (Sound p : soundList) {
            p.open();
            p.up();
        }
        System.out.println();
    }

    public void stop() {

        System.out.println("Cinema.stop");
        for (Sound p : soundList) {
            p.down();
            p.close();
        }
        for (Light p : lightList) {
            p.off();
        }
    }
}
