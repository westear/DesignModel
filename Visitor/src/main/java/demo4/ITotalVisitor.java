package demo4;

/**
 * 汇总表接口
 */
public interface ITotalVisitor extends IVisitor {

    //统计所有员工工资总和
    void totalSalary();
}
