package demo4;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        //展示报表访问者
        IShowVisitor showVisitor = new ShowVisitor();
        //汇总表访问者
        ITotalVisitor totalVisitor = new TotalVisitor();

        for (Employee employee : mockEmployee()) {
            employee.accept(showVisitor);
            employee.accept(totalVisitor);
        }

        //展示报表
        showVisitor.report();
        //汇总报表
        totalVisitor.totalSalary();
    }

    public static List<Employee> mockEmployee() {

        List<Employee> employeeList = new ArrayList<>();

        CommonEmployee zhangsan = new CommonEmployee();
        zhangsan.setJob("敲代码");
        zhangsan.setName("张三");
        zhangsan.setSex(Employee.MALE);
        zhangsan.setSalary(1800);
        employeeList.add(zhangsan);

        CommonEmployee lisi = new CommonEmployee();
        lisi.setJob("画图");
        lisi.setName("李四");
        lisi.setSex(Employee.MALE);
        lisi.setSalary(1500);
        employeeList.add(lisi);

        Manager manager = new Manager();
        manager.setName("王五");
        manager.setSex(Employee.MALE);
        manager.setSalary(3000);
        manager.setPerformance("业绩一般");
        employeeList.add(manager);

        return employeeList;
    }
}
