package demo1;

public class Client {
    public static void main(String[] args) {
        Factory myFactory;
        myFactory = new Factory();
        Component myComponent = myFactory.getComponent();
        myComponent.prtTicket();

        System.out.println("============");

        /**
         * 假如需要打印如下顺序的内容：
         * Header1
         * Header2
         * SalesTicket
         * Footer1
         */
        Component myComponent2 = new Header1(new Header2(new Footer1(new SalesTicket())));
        myComponent2.prtTicket();
    }
}
