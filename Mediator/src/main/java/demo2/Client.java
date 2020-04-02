package demo2;

/**
 * 增加一个中介类，分别传递到三个同事类中，三个类具有相同的特性，只负责处理自己的活动行为，与自己无关的丢给中介者处理。
 */
public class Client {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        System.out.println("---------- 采购人员采购电脑 ----------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);
        //销售人员销售电脑
        System.out.println("\n---------- 销售人员销售电脑 ----------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        //库存管理人员管理库存
        System.out.println("\n---------- 库房管理人员清库处理 ----------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
