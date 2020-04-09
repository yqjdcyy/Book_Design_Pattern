package observer.java.observer;

import java.util.Observable;

/**
 * 天气主题提供者
 *
 * @author qingju.yao
 * @date 2020/4/9
 */
public class WeatherSubject extends Observable {

    public void notice() {

        setChanged();
        System.out.println("\nObservable.notifyObservers()");
        this.notifyObservers();
    }

    public void notice(Object arg) {

        if (null == arg) {
            notice();
        }

        setChanged();
        System.out.println(String.format("\nObservable.notifyObservers(%s)", arg.toString()));
        this.notifyObservers(arg);
    }
}
