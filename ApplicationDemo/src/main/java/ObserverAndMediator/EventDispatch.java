package ObserverAndMediator;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 * 作用：
 * 1.事件的观察者：接收被观察期望完成的任务
 * 2.事件分发者：分发事件——同时协调各个同事类（也就是事件的处理者）处理事件
 * 3.事件处理者的管理员角色
 */
public class EventDispatch implements Observer {

    //单例模式
    private final static EventDispatch dispatch = new EventDispatch();

    //事件消费者
    private Vector<EventCustomer> customers = new Vector<>();

    //不允许生成新的实例
    private EventDispatch(){

    }

    //获得单例对象
    public static EventDispatch getEventDispatch() {
        return dispatch;
    }

    //事件触发
    @Override
    public void update(Observable observable, Object arg) {
        //事件的源头
        Product product = (Product) arg;
        //事件
        ProductEvent event = (ProductEvent) observable;
        //处理者处理
        for (EventCustomer eventCustomer : customers) {
            //处理级别是否匹配
            for (EventCustomerType type : eventCustomer.getCustomerTypes()) {
                if(type.getValue() == event.getEventType().getValue()) {
                    eventCustomer.exec(event);
                }
            }
        }
    }

    //注册事件处理者
    public void registerCustomer(EventCustomer eventCustomer) {
        customers.add(eventCustomer);
    }
}
