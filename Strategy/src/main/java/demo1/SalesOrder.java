package demo1;

/**
 * 模拟订单系统中的订单类
 */
public class SalesOrder {

    public void process (CalcTax taxToUse) {
        long itemNumber = 0;
        double price = 0;

        //创建计税对象
        //......
        double tax = taxToUse.taxAmount(itemNumber, price);
    }
}
