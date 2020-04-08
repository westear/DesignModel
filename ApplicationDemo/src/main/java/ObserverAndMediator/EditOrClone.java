package ObserverAndMediator;

/**
 * 删除级别的处理者
 */
public class EditOrClone extends EventCustomer {

    public EditOrClone() {
        super(EventCustomerType.DEL);
        super.addCustomerType(EventCustomerType.CLONE);
    }

    @Override
    public void exec(ProductEvent event) {
        //事件的源头
        Product product = event.getSource();
        //事件类型
        ProductEventType type = event.getEventType();
        if (type.getValue() == EventCustomerType.CLONE.getValue()) {
            System.out.println("处理者EditOrClone处理事件 CLONE: " + product.getName() + "事件类型: " + type);
        } else {
            System.out.println("处理者EditOrClone处理事件 EDIT: " + product.getName() + "事件类型: " + type);
        }

    }
}
