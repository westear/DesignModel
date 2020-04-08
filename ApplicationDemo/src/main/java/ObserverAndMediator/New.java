package ObserverAndMediator;

/**
 * 删除级别的处理者
 */
public class New extends EventCustomer {

    public New() {
        super(EventCustomerType.NEW);
    }

    @Override
    public void exec(ProductEvent event) {
        //事件的源头
        Product product = event.getSource();
        //事件类型
        ProductEventType type = event.getEventType();
        System.out.println("处理者New处理事件: " + product.getName() + "事件类型: " + type);
    }
}
