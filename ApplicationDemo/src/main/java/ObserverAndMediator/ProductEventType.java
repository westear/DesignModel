package ObserverAndMediator;

/**
 * 事件类型定义
 */
public enum ProductEventType {
    NEW_PRODUCT(1),
    DEL_PRODUCT(2),
    EDIT_PRODUCT(3),
    CLONE_PRODUCT(4)
    ;

    private int value;

    ProductEventType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
