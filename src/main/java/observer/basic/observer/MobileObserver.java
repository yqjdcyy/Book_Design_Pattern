package observer.basic.observer;

/**
 * @author qingju.yao
 * @date 2020/4/9
 */
public class MobileObserver implements Observer {

    @Override
    public void update() {
        System.out.println("\tupdate for mobile");
    }
}
