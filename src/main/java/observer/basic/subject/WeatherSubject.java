package observer.basic.subject;

import observer.basic.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Creator: Yao
 * Date:    2017/12/23
 * For:
 * Other:
 */
public class WeatherSubject implements Subject {

    private static List<Observer> list;

    public WeatherSubject() {
        list = new ArrayList<Observer>();
    }

    public void register(Observer observer) {
        list.add(observer);
    }

    public void remove(Observer observer) {
        list.remove(observer);
    }

    public void notice() {

        System.out.println("\nsubject.notice");
        for (Observer p : list) {
            p.update();
        }
    }
}
