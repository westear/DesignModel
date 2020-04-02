package demo2;

public class ConcreteCommand1 extends Command {

    public ConcreteCommand1() {
        super(new ConcreteReceiver1());
    }

    @Override
    void execute() {
        receiver.doSomething();
        receiver.secondDeal();
    }
}
