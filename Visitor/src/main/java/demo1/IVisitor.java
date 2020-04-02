package demo1;

/**
 * 访问者接口
 */
public interface IVisitor {

    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);
}
