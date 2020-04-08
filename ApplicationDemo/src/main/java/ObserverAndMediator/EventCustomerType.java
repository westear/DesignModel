package ObserverAndMediator;

/**
 * 消费者处理级别枚举
 */
public enum EventCustomerType {
    NEW(1),
    DEL(2),
    EDIT(3),
    CLONE(4)
    ;

    private int value;

    EventCustomerType(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
