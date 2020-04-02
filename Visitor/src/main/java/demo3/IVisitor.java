package demo3;

/**
 * 访问者接口
 */
public interface IVisitor {

    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);

    /**
     * 统计所有员工工资总和
     * @return 工资总和
     */
    int getTotalSalary();
}
