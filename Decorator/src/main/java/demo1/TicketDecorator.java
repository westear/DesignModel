package demo1;

/**
 * 票据装饰类
 */
public class TicketDecorator extends Component {

    private Component myTrailer;

    public TicketDecorator(Component myComponent) {
        myTrailer = myComponent;
    }

    public void callTrailer() {
        if(myTrailer != null) {
            myTrailer.prtTicket();
        }
    }

    @Override
    public void prtTicket() {
        myTrailer.prtTicket();
    }
}
