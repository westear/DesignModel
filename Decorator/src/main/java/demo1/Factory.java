package demo1;

public class Factory {
    /**
     * 打印内容:
     * Header1
     * SalesTicket
     * Footer1
     * @return Component
     */
    public Component getComponent() {
        Component myComponent;
        myComponent = new SalesTicket();
        myComponent = new Footer1(myComponent);
        myComponent = new Header1(myComponent);
        return myComponent;
    }


}
