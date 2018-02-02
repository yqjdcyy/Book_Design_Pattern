package mediator.basic.vo;

/**
 * Creator: Yao
 * Date:    2018/1/31
 * For:
 * Other:
 */
public interface Colleague {

    void receive(String msg);

    void send(int key, String msg);
}
