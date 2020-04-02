package demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.通过遍历所有元素
 * 2.每个员工对象都定义了一个访问者
 * 3.员工对象把自己作为一个参数调用访问者visit方法
 * 4.访问者调用自己内部的计算逻辑，计算出对应的数据和表格元素
 * 5.访问者打印出报表和数据
 */

public class Client {

    public static void main(String[] args) {
        IVisitor visitor = new Visitor();

        for (Employee employee : mockEmployee()) {
            employee.accept(visitor);
        }

        System.out.println("本公司的月工资总额是: " + visitor.getTotalSalary());
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
