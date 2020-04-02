package demo2.bridge;

/**
 * 公司抽象类V2
 */
public abstract class Corp {

    //公司必须有产品
    private Product product;

    //声明该公司生产什么样的产品
    public Corp(Product product) {
        this.product = product;
    }

    /**
     * 公司需要赚钱
     */
    public void makeMoney(){
        this.product.beProducted();
        this.product.beSelled();
    }
}
