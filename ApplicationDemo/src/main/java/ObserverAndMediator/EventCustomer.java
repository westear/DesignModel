package ObserverAndMediator;

import java.util.Vector;

/**
 * 抽象事件处理者
 */
public abstract class EventCustomer {

    //容纳每个消费者能够处理的级别
    private Vector<EventCustomerType> customerTypes = new Vector<>();

    //每个消费者都要声明自己处理哪个级别的事件
    public EventCustomer(EventCustomerType customerType) {
        addCustomerType(customerType);
    }

    //每个消费者可以消费多个事件
    public void addCustomerType(EventCustomerType customerType) {
        customerTypes.add(customerType);
    }

    //得到自己的处理级别
    public Vector<EventCustomerType> getCustomerTypes() {
        return customerTypes;
    }

    //每个事件都要对事件进行声明式消费
    public abstract void exec(ProductEvent event);
}
