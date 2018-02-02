package memento.example;

import memento.example.vo.Node;
import memento.example.work.TimeMachine;
import memento.example.work.YaoMachine;

/**
 * Creator: Yao
 * Date:    2018/2/1
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {
        TimeMachine machine = new YaoMachine(new Node(1989, "晋江"));
        machine.doIt();
        machine.next(2008, "安海");
        machine.doIt();
        machine.next(2011, "泉州");
        machine.doIt();
        machine.back();
        machine.doIt();
        machine.next(2015, "厦门");
        machine.doIt();
    }
}
