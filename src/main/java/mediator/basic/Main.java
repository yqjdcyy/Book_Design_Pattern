package mediator.basic;

import mediator.basic.vo.Colleague;
import mediator.basic.vo.ColleagueOne;
import mediator.basic.vo.ColleagueTwo;
import mediator.basic.work.Mediator;
import mediator.basic.work.WorkMediator;

/**
 * Creator: Yao
 * Date:    2018/1/31
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        Mediator mediator = new WorkMediator();
        Colleague one = new ColleagueOne(mediator);
        Colleague two = new ColleagueTwo(mediator);
        mediator.register(1, one);
        mediator.register(2, two);

        one.send(1, "talk to myself");
        one.send(2, "talk to two");
        two.send(1, "talk to one");
    }
}
