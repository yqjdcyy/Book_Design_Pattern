package observer.java.subject;

import java.util.Observable;
import java.util.Observer;

/**
 * @author qingju.yao
 * @date 2020/4/9
 */
public class MobileObserver implements Observer {

    public MobileObserver(Observable observable) {

        if (null == observable) {
            return;
        }

        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

        System.out.println(
                String.format("\tMobileObserver: change= %s, args= %s", o.hasChanged(), arg.toString()));
    }
}
