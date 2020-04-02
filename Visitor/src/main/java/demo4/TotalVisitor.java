package demo4;

public class TotalVisitor implements ITotalVisitor {

    /**
     * 部门经理工资系数是5
     */
    private final static int MANAGER_COEFFICIENT = 5;

    /**
     * 普通员工工资系数是2
     */
    private final static int COMMON_EMPLOYEE_COEFFICIENT = 2;

    /**
     * 部门经理工资总和
     */
    private int commonTotalSalary = 0;

    /**
     * 普通员工工资总和
     */
    private int managerTotalSalary = 0;


    @Override
    public void totalSalary() {
        System.out.println("本公司的月工资总额是：" + (this.commonTotalSalary + this.managerTotalSalary));
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.commonTotalSalary = this.commonTotalSalary + commonEmployee.getSalary() * COMMON_EMPLOYEE_COEFFICIENT;
    }

    @Override
    public void visit(Manager manager) {
        this.managerTotalSalary = this.managerTotalSalary + manager.getSalary() * MANAGER_COEFFICIENT;
    }
}
