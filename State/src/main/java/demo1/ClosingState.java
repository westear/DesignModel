package demo1;

/**
 * 关闭状态
 */
public class ClosingState extends LiftState {

    @Override
    void open() {
        super.context.setLiftState(Context.openingState);
        super.context.getLiftState().open();
    }

    @Override
    void close() {
        System.out.println("电梯门关闭......");
    }

    @Override
    void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    @Override
    void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
