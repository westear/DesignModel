package demo3;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体的观察者
 */
public class TwoObserverImpl implements Observer {

    @Override
    public void update(Observable observable, Object context) {
        System.out.println("TwoObserverImpl--> " + observable.hasChanged() + " --> 获得监控信息:" + context);
    }
}
