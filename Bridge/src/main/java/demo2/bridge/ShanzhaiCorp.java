package demo2.bridge;

/**
 * 假设是一个多品类的山寨公司（产品线）
 */
public class ShanzhaiCorp extends Corp {
    //此时并不知道生产什么产品，所以还是传入产品的基类,等到被调用了才知道
    public ShanzhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("生产什么都赚钱");
    }
}
