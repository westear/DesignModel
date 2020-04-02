package demo3;

/**
 * 通用中介者
 */
public class ConcreteMediator extends Mediator {

    @Override
    protected void doSomething1() {
        //调用同事类方法
        super.concreteColleague1.selfMethod();
        super.concreteColleague2.selfMethod();
    }

    @Override
    protected void doSomething2() {
        //调用同事类方法
        super.concreteColleague1.selfMethod();
        super.concreteColleague2.selfMethod();
    }
}
