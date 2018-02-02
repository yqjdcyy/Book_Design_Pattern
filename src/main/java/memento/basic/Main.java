package memento.basic;

/**
 * Creator: Yao
 * Date:    2018/2/1
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        Originator originator = new Originator();
        originator.setState("state-1");
        System.out.printf("origin.state= %s\n", originator.getState());
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.getMemento());
        originator.setState("state-2");
        System.out.printf("change.state= %s\n", originator.getState());
        originator.setMemento(caretaker.getMemento());
        System.out.printf("recover.state= %s\n", originator.getState());
    }
}
