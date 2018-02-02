package memento.basic;

import java.util.Stack;

/**
 * Creator: Yao
 * Date:    2018/2/1
 * For:
 * Other:
 */
public class Caretaker {

    private Stack<Memento> stack;

    public Caretaker() {
        stack = new Stack<>();
    }

    public Memento getMemento() {
        return stack.pop();
    }

    public void setMemento(Memento memento) {
        stack.push(memento);
    }
}
