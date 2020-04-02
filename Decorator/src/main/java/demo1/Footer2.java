package demo1;

public class Footer2 extends TicketDecorator {

    public Footer2(Component myComponent) {
        super(myComponent);
    }

    public void prtTicket(){
        super.callTrailer();
        //这里打印页脚2的代码
        System.out.println("打印页脚2......");
    }
}
