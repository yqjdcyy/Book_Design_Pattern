package compound.mvc;

import compound.mvc.controller.BeatController;
import compound.mvc.model.BeatModel;

/**
 * Creator: Yao
 * Date:    2018/1/23
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        new BeatController(new BeatModel());
    }
}
