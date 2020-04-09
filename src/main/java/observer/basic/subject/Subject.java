package observer.basic.subject;

import observer.basic.observer.Observer;

/**
 * 提供者
 *
 * @author qingju.yao
 * @date 2020/4/9
 */
public interface Subject {

    /**
     * 注册观察者
     *
     * @param observer
     * @return void
     * @author qingju.yao
     * @date 2020/4/9
     */
    void register(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer
     * @return void
     * @author qingju.yao
     * @date 2020/4/9
     */
    void remove(Observer observer);

    /**
     * 通知
     *
     * @return void
     * @author qingju.yao
     * @date 2020/4/9
     */
    void notice();
}
