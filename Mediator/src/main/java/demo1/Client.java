package demo1;

/**
 * 三个业务类相互关联，相互耦合
 * 违反根据迪米特原则（每个类只跟朋友类交流）
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("---------- 采购人员采购电脑 ----------");
        Purchase purchase = new Purchase();
        purchase.buyIBMComputer(100);
        //销售人员销售电脑
        System.out.println("\n---------- 销售人员销售电脑 ----------");
        Sale sale = new Sale();
        sale.sellIBMComputer(1);
        //库存管理人员管理库存
        System.out.println("\n---------- 库房管理人员清库处理 ----------");
        Stock stock = new Stock();
        stock.clearStock();
    }
}
