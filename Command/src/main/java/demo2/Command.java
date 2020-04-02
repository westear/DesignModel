package demo2;

/**
 * 抽象命令类
 */
public abstract class Command {

    //定义一个子类的全局共享变量, 这样做，使得Client类在应用时，不需要知道具体的Receiver类
    protected final Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    abstract void execute();
}
