package ObserverAndMediator;

/**
 * 产品类
 */
public class Product implements Cloneable {

    private String name;

    //是否可以属性变更
    private boolean canChanged = false;

    public Product(ProductManager productManager, String name) {
        if(productManager.isCreateProduct()) {
            canChanged = true;
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(canChanged) {
            this.name = name;
        }
    }

    @Override
    public Product clone() {
        Product p = null;
        try {
            p = (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
