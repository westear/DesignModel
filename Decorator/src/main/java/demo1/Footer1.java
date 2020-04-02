package demo1;

public class Footer1 extends TicketDecorator {

    public Footer1(Component myComponent) {
        super(myComponent);
    }

    public void prtTicket(){
        super.callTrailer();
        //这里打印页脚1的代码
        System.out.println("打印页脚1......");
    }
}
