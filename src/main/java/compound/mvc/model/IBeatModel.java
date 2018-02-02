package compound.mvc.model;

/**
 * Creator: Yao
 * Date:    2018/1/22
 * For:
 * Other:
 */
public interface IBeatModel {


    // Utils.*
    public void initialize();

    public void on();

    public void off();

    public void setBPM(int bpm);

    public int getBPM();


    // Observer.*
    public void register(IBeatObserver observer);

    public void remove(IBeatObserver observer);

    public void register(IBPMObserver observer);

    public void remove(IBPMObserver observer);
}
