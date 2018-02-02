package compound.mvc.controller;

import compound.mvc.model.IBeatModel;
import compound.mvc.view.DJView;

/**
 * Creator: Yao
 * Date:    2018/1/23
 * For:
 * Other:
 */
public class BeatController implements IController {

    IBeatModel model;
    DJView view;

    public BeatController(IBeatModel model) {
        this.model = model;
        view = new DJView(model, this);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        model.initialize();
    }

    @Override
    public void start() {

        model.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    @Override
    public void stop() {

        model.off();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }

    @Override
    public void setBPM(int bpm) {

        model.setBPM(bpm);
    }

    @Override
    public void increaseBPM() {

        model.setBPM(model.getBPM() + 1);
    }

    @Override
    public void decreaseBPM() {

        model.setBPM(model.getBPM() - 1);
    }
}
