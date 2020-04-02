package demo2;

/**
 * 观察者接口类
 */
public interface Observer {

    /**
     * 获取被观察者信息
     * @param context 信息
     */
    void fetchInformation(String context);
}
