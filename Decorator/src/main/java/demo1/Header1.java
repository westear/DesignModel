package demo1;

public class Header1 extends TicketDecorator {

    public Header1(Component myComponent) {
        super(myComponent);
    }

    public void prtTicket() {
        //这里打印表头1的代码
        System.out.println("打印表头1......");
        super.callTrailer();
    }
}
