package memento.example.work;

import memento.example.vo.Node;

import java.util.Stack;

/**
 * Creator: Yao
 * Date:    2018/2/1
 * For:
 * Other:
 */
public class Memento {

    private Stack<Node> nodes;

    public Memento() {
        nodes = new Stack<>();
    }

    public void record(Node node) {
        nodes.push(node);
    }

    public Node extract() {
        return nodes.pop();
    }
}
