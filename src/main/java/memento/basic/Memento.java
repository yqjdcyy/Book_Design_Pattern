package memento.basic;

/**
 * Creator: Yao
 * Date:    2018/2/1
 * For:
 * Other:
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
