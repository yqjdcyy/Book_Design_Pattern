package memento.example.work;

/**
 * Creator: Yao
 * Date:    2018/2/1
 * For:
 * Other:
 */
public interface TimeMachine {

    void back();

    void doIt();

    void next(int year, String path);
}
