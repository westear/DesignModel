package demo2;

/**
 * 具体访问者
 */
public class Visitor implements IVisitor {

    @Override
    public void visit(ConcreteElement1 element1) {
        element1.doSomething();
    }

    @Override
    public void visit(ConcreteElement2 element2) {
        element2.doSomething();
    }
}
