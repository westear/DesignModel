package demo1;

/**
 * 假设计算美国销售订单的税额类
 */
public class USTax extends CalcTax {

    @Override
    public double taxAmount(long itemSold, double price) {
        System.out.println("美国订单税额");
        return 0.5;
    }
}
