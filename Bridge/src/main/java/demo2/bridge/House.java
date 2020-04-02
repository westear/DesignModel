package demo2.bridge;

/**
 * 房子作为一个产品，需要实现产品基类
 */
public class House extends Product {

    @Override
    public void beProducted() {
        System.out.println("生产房子.....");
    }

    @Override
    public void beSelled() {
        System.out.println("销售房子......");
    }
}
