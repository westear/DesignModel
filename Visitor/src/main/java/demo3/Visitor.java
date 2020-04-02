package demo3;

/**
 * 访问者实现
 */
public class Visitor implements IVisitor {

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
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
        calCommonSalary(commonEmployee.getSalary());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
        calManagerSalary(manager.getSalary());
    }

    @Override
    public int getTotalSalary() {
        return this.commonTotalSalary + this.managerTotalSalary;
    }

    private String getBasicInfo(Employee employee) {
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别： " + (employee.getSex() == Employee.FEMALE ? "女" : "男") + "\t";
        info = info + "薪水：" + employee.getSalary() + "\t";
        return info;
    }

    private String getCommonEmployee(CommonEmployee commonEmployee) {
        String baseInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
        return baseInfo + otherInfo;
    }

    private String getManagerInfo(Manager manager) {
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩：" + manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    private void calManagerSalary(int salary) {
        this.managerTotalSalary = this.managerTotalSalary + salary * MANAGER_COEFFICIENT;
    }

    private void calCommonSalary(int salary) {
        this.commonTotalSalary = this.commonTotalSalary + salary * COMMON_EMPLOYEE_COEFFICIENT;
    }
}
