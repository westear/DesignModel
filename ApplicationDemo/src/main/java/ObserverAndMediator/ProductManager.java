package ObserverAndMediator;

/**
 * 工厂类,在每个方法中添加了事件产生机制
 */
public class ProductManager {

    private boolean isPermittedCreate = false;

    //建立一个产品,单来源调用，调用者和被调用者是组合关系，两者有相同的生命期
    public Product createProduct(String name) {
        isPermittedCreate = true;
        //创建一个产品
        Product p = new Product(this, name);
        //产生一个创建事件
        new ProductEvent(p, ProductEventType.NEW_PRODUCT);
        return p;
    }

    public boolean isCreateProduct() {
        return isPermittedCreate;
    }

    //废弃一个产品
    public void abandonProduct(Product p) {
        //产生删除事件
        new ProductEvent(p, ProductEventType.DEL_PRODUCT);
        //销毁产品
        p = null;
    }

    //修改一个产品
    public void editProduct(Product p, String name) {
        //修改产品
        p.setName(name);
        //产生修改事件
        new ProductEvent(p, ProductEventType.EDIT_PRODUCT);
    }

    //克隆一个产品
    public Product clone(Product p) {
        //产生克隆事件
        new ProductEvent(p, ProductEventType.CLONE_PRODUCT);
        //克隆产品
        return p.clone();
    }
}
