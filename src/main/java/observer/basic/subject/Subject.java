package observer.basic.subject;

import observer.basic.observer.Observer;

/**
 * Creator: Yao
 * Date:    2017/12/23
 * For:
 * Other:
 */
public interface Subject {

    void register(Observer observer);

    void remove(Observer observer);

    void notice();
}
