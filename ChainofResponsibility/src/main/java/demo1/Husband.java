package demo1;

/**
 * 丈夫处理类
 */
public class Husband extends Handler {

    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }
    @Override
    protected void response(IWomen women) {
        System.out.println("妻子向丈夫请示");
        System.out.println(women.getRequest());
        System.out.println("同意");
    }
}
