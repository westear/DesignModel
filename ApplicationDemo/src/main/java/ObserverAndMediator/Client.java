package ObserverAndMediator;

public class Client {

    public static void main(String[] args) {
        //获得事件分发中心
        EventDispatch dispatch = EventDispatch.getEventDispatch();
        //接收事件处理
        dispatch.registerCustomer(new Delete());
        dispatch.registerCustomer(new New());
        dispatch.registerCustomer(new EditOrClone());

        //建立产品生产工厂
        ProductManager factory = new ProductManager();

        //制造一个产品
        Product product = factory.createProduct("产品1");
        //修改
        factory.editProduct(product, "产品2");
        //克隆
        Product product1 = factory.clone(product);
        //丢弃
        factory.abandonProduct(product1);
    }
}
