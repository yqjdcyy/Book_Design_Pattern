package mediator.basic.work;

import mediator.basic.vo.Colleague;

/**
 * Creator: Yao
 * Date:    2018/1/31
 * For:
 * Other:
 */
public interface Mediator {

    void operation(int key, String msg);

    void register(int key, Colleague colleague);
}
