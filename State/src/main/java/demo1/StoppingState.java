package demo1;

/**
 * 电梯停运
 */
public class StoppingState extends LiftState {

    @Override
    void open() {
        super.context.setLiftState(Context.openingState);
        super.context.getLiftState().open();
    }

    @Override
    void close() {

    }

    @Override
    void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    @Override
    void stop() {
        System.out.println("电梯停止运行......");
    }
}
