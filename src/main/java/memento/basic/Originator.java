package memento.basic;

/**
 * Creator: Yao
 * Date:    2018/2/1
 * For:
 * Other:
 */
public class Originator {

    private String state;

    public Memento getMemento() {
        return new Memento(this.getState());
    }

    public void setMemento(Memento memento) {
        this.setState(memento.getState());
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
