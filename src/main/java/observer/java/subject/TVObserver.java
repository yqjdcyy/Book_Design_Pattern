package observer.java.subject;

import java.util.Observable;
import java.util.Observer;

/**
 * Creator: Yao
 * Date:    2017/12/23
 * For:
 * Other:
 */
public class TVObserver implements Observer {

    public TVObserver(Observable observable) {

        if (null == observable)
            return;

        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {

        System.out.println(
                String.format("\tTVObserver: change= %s, args= %s", o.hasChanged(), arg.toString()));
    }
}
