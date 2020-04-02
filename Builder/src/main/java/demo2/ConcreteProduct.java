package demo2;

/**
 * 具体建造者
 */
public class ConcreteProduct extends Builder {

    Product product = new Product();

    //设置产品零件
    @Override
    public void setPart() {
        //TODO 组装顺序
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
