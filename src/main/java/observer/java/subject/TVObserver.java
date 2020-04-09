package observer.java.subject;

import java.util.Observable;
import java.util.Observer;

/**
 * @author qingju.yao
 * @date 2020/4/9
 */
public class TVObserver implements Observer {

    public TVObserver(Observable observable) {

        if (null == observable) {
            return;
        }

        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

        System.out.println(
                String.format("\tTVObserver: change= %s, args= %s", o.hasChanged(), arg.toString()));
    }
}
