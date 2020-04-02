package demo1;

/**
 * 具体观察者
 */
public class LiSi implements ILiSi {

    @Override
    public void fetchInformation(String context) {
        System.out.println("汇报观察结果: " + context);
    }
}
