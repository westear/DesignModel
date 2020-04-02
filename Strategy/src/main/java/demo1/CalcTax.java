package demo1;

/**
 * 计算订单中税额的抽象类
 */
public abstract class CalcTax {

    abstract public double taxAmount(long itemSold, double price);
}
