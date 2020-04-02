package demo2;

/**
 * 具体元素
 */
public class ConcreteElement2 extends Element {

    @Override
    void doSomething() {
        //TODO 业务处理
    }

    @Override
    void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
