package demo3;

public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    //自有方法
    public void selfMethod() {
        //TODO 处理自己的业务处理
    }

    public void dependencyMethod() {
        //TODO 处理业务逻辑
        //自己不能处理的业务逻辑、委托给中介者处理
        super.mediator.doSomething1();
    }
}
