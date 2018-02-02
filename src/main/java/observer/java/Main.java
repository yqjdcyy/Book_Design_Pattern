package observer.java;

import observer.java.observer.WeatherSubject;
import observer.java.subject.MobileObserver;
import observer.java.subject.TVObserver;

import java.util.Observer;

/**
 * Creator: Yao
 * Date:    2017/12/23
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        WeatherSubject subject = new WeatherSubject();
        subject.notice();

        Observer observer = new TVObserver(subject);
        subject.notice("add TVObserver");

        observer = new MobileObserver(subject);
        subject.notice("add MobileObserver");

        subject.deleteObserver(observer);
        subject.notice("del MobileObserver");
    }
}
