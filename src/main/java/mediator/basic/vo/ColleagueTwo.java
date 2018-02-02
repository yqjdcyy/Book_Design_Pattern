package mediator.basic.vo;

import mediator.basic.work.Mediator;

import java.util.Date;

/**
 * Creator: Yao
 * Date:    2018/1/31
 * For:
 * Other:
 */
public class ColleagueTwo implements Colleague {

    Mediator mediator;

    public ColleagueTwo(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void receive(String msg) {

        System.out.printf("\t%s\treceive:\t%s\n", new Date(), msg);
    }

    @Override
    public void send(int key, String msg) {

        System.out.printf("[%s] send [%s] to [%s]\n", this, msg, key);
        this.mediator.operation(key, msg);
    }
}
