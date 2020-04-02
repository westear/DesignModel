package demo1;

/**
 * 有处理请求权的人员接口
 */
public abstract class Handler {

    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    //能处理的级别
    private int level = 0;

    //责任传递,下一个责任人是谁
    private Handler nextHandler;

    //每个类都要说明一下自己能处理的请求
    public Handler(int level) {
        this.level = level;
    }

    //请求处理逻辑
    public final void handlerMessage(IWomen women) {
        if(women.getType() == this.level) {
            this.response(women);
        } else {
            if(this.nextHandler != null) {
                this.nextHandler.handlerMessage(women);
            } else {
                System.out.println("没有后续处理人");
            }
        }
    }

    //设置当前节点的下一级节点
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    protected abstract void response(IWomen women);
}
