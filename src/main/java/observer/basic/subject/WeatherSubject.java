package observer.basic.subject;

import observer.basic.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气主题提供者
 *
 * @author qingju.yao
 * @date 2020/4/9
 */
public class WeatherSubject implements Subject {

    private static List<Observer> list;

    public WeatherSubject() {
        list = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notice() {

        System.out.println("\nsubject.notice");
        for (Observer p : list) {
            p.update();
        }
    }
}
