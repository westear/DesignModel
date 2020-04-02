package demo2.bridge;

/**
 * IPod也是一种产品，同样需要继承产品类
 */
public class IPod extends Product {

    @Override
    public void beProducted() {
        System.out.println("生产IPod.....");
    }

    @Override
    public void beSelled() {
        System.out.println("销售IPod.....");
    }
}
