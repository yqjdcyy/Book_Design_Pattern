package observer.basic;

import observer.basic.observer.MobileObserver;
import observer.basic.subject.WeatherSubject;
import observer.basic.observer.Observer;
import observer.basic.observer.TVObserver;

/**
 *
 *
 * @author qingju.yao
 * @date 2020/4/9
 */
public class Main {

    public static void main(String[] args) {

        WeatherSubject subject = new WeatherSubject();
        subject.notice();

        Observer observer = new TVObserver();
        subject.register(observer);
        subject.notice();

        observer = new MobileObserver();
        subject.register(observer);
        subject.notice();

        subject.remove(observer);
        subject.notice();
    }
}
