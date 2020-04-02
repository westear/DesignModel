package demo1;

/**
 * 儿子处理类
 */
public class Son extends Handler {

    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("母亲向儿子请示");
        System.out.println(women.getRequest());
        System.out.println("同意");
    }
}
