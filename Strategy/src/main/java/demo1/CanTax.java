package demo1;

/**
 * 假设计算加拿大销售订单的税额类
 */
public class CanTax extends CalcTax {

    @Override
    public double taxAmount(long itemSold, double price) {
        System.out.println("加拿大订单税额");
        return 0.45;
    }
}
