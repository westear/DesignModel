package demo2;

/**
 * 抽象访问者
 */
public interface IVisitor {

    void visit(ConcreteElement1 element1);

    void visit(ConcreteElement2 element2);
}
