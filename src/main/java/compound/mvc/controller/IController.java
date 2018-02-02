package compound.mvc.controller;

/**
 * Creator: Yao
 * Date:    2018/1/23
 * For:
 * Other:
 */
public interface IController {

    void start();

    void stop();

    void setBPM(int bpm);

    void increaseBPM();

    void decreaseBPM();
}
