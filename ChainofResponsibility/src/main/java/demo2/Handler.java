package demo2;

/**
 * 抽象处理者
 */
public abstract class Handler {

    private Handler nextHandler;

    public final Response handlerMessage(Request request) {
        Response response = null;
        //判断是否为自己能够处理的级别
        if(this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {
            //不属于自己的处理级别
            //判断是否有下一个处理者
            if(this.nextHandler != null) {
                response = this.nextHandler.echo(request);
            } else {
                //TODO 没有合适的处理者
            }
        }
        return response;
    }

    //设置下一个处理者
    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return this.nextHandler;
    }

    //处理者的处理级别
    protected abstract Level getHandlerLevel();

    //每个处理者需要实现的处理业务逻辑
    protected  abstract Response echo(Request request);
}
