package demo2;

public class Client {
    public static void main(String[] args) {
        //声明所有处理节点
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        //设置调用链顺序
        handler1.setNextHandler(handler2).setNextHandler(handler3);

        //提交请求，返回结果
        Response response = handler1.handlerMessage(new Request());
    }
}
