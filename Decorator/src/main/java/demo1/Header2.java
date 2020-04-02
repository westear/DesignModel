package demo1;

public class Header2 extends TicketDecorator {

    public Header2(Component myComponent) {
        super(myComponent);
    }

    public void prtTicket() {
        //这里打印表头2的代码
        System.out.println("打印表头2......");
        super.callTrailer();
    }
}
