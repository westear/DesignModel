package demo2;

/**
 * 具体的观察者
 */
public class ThreeObserverImpl implements Observer {

    @Override
    public void fetchInformation(String context) {
        System.out.println("ThreeObserverImpl 获得监控信息:" + context);
    }
}
