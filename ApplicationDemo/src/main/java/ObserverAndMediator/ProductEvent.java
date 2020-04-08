package ObserverAndMediator;

import java.util.Observable;
/**
 * 产品事件
 */
public class ProductEvent extends Observable {

    //事件起源
    private Product source;

    //事件类型
    private ProductEventType type;

    public ProductEvent(Product product) {
        this(product, ProductEventType.NEW_PRODUCT);
    }

    public ProductEvent(Product product, ProductEventType type) {
        this.source = product;
        this.type = type;
        //事件触发
        notifyEventDispatch();
    }

    public Product getSource() {
        return source;
    }

    public ProductEventType getEventType() {
        return type;
    }

    private void notifyEventDispatch() {
        super.addObserver(EventDispatch.getEventDispatch());
        super.setChanged();
        super.notifyObservers(source);
    }
}
