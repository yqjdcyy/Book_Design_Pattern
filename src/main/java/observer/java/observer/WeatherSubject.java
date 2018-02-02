package observer.java.observer;

import java.util.Observable;

/**
 * Creator: Yao
 * Date:    2017/12/23
 * For:
 * Other:
 */
public class WeatherSubject extends Observable {

    public void notice() {

        setChanged();
        System.out.println("\nObservable.notifyObservers()");
        this.notifyObservers();
    }

    public void notice(Object arg) {

        if (null == arg)
            this.notice();

        setChanged();
        System.out.println(String.format("\nObservable.notifyObservers(%s)", arg.toString()));
        this.notifyObservers(arg);
    }
}
