package demo2;

public class ConcreteCommand2 extends Command {

    public ConcreteCommand2() {
        super(new ConcreteReceiver2());
    }

    @Override
    void execute() {
        receiver.secondDeal();
        receiver.doSomething();
    }
}
