package demo1;

/**
 * 运行状态
 */
public class RunningState extends LiftState {

    @Override
    void open() {

    }

    @Override
    void close() {

    }

    @Override
    void run() {
        System.out.println("电梯运行......");
    }

    @Override
    void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
