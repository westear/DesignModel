package demo2;

/**
 * 具体的观察者
 */
public class TwoObserverImpl implements Observer {

    @Override
    public void fetchInformation(String context) {
        System.out.println("TwoObserverImpl 获得监控信息:" + context);
    }
}
