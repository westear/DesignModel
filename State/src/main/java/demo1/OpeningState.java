package demo1;

/**
 * 敞门状态
 */
public class OpeningState extends LiftState {

    @Override
    void open() {
        System.out.println("电梯门开启......");
    }

    @Override
    void close() {
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState().close();
    }

    @Override
    void run() {

    }

    @Override
    void stop() {

    }
}
