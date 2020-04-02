package demo1;

/**
 * 模拟各国订单的控制类
 */
public class TaskController {

    public void process () {
        //模拟处理任务控制器
        //获取所在国信息
        CalcTax myTax;
        myTax = getTaxRulesForCountry();
        SalesOrder salesOrder = new SalesOrder();
        salesOrder.process(myTax);
    }

    private CalcTax getTaxRulesForCountry() {
        //实际开发中，需要获取到所在国的计税原则
        //也可以放在配置文件中
        return new USTax();
    }
}
