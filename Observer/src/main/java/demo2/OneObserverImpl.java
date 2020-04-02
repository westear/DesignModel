package demo2;

/**
 * 具体的观察者
 */
public class OneObserverImpl implements Observer {

    @Override
    public void fetchInformation(String context) {
        System.out.println("OneObserverImpl 获得监控信息:" + context);
    }
}
