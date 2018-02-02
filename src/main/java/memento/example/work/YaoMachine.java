package memento.example.work;

import memento.example.vo.Node;

/**
 * Creator: Yao
 * Date:    2018/2/1
 * For:
 * Other:
 */
public class YaoMachine implements TimeMachine {

    private Node current;
    private Memento memento;

    public YaoMachine(Node current) {
        this.current = current;
        this.memento = new Memento();
    }

    @Override
    public void back() {
        System.out.println("<- TimeMachine work");
        this.current = memento.extract();
    }

    @Override
    public void doIt() {

        System.out.printf("-> In %s, I live in %s\n", current.getYear(), current.getPath());
    }

    @Override
    public void next(int year, String path) {

        this.memento.record(this.current);
        this.current = new Node(year, path);
    }
}
