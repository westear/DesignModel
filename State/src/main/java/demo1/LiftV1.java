package demo1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 电梯实现类
 * 这个程序的问题：
 * 1. 存在大量的switch...case
 * 2.扩展性非常差劲: 如果增加 “通电状态”，“断电状态”，就需要增加 case 项，与开闭原则相违背
 * 3.非常规状态无法实现
 */
public class LiftV1 implements ILift {

    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (this.state) {
            case OPENING_STATE:
                System.out.println(getCurrentDate() + ": 电梯此时已经是开门状态");
                break;
            case CLOSING_STATE:
                System.out.println(getCurrentDate() + ": 电梯此时是关门状态");
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                System.out.println(getCurrentDate() + ": 电梯此时是开门状态，不能运行");
                break;
            case STOPPING_STATE:
                System.out.println(getCurrentDate() + ": 电梯此时是停止状态");
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
        }
    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                this.closeWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                System.out.println(getCurrentDate() + ": 电梯此时已经是关门状态");
                break;
            case RUNNING_STATE:
                System.out.println(getCurrentDate() + ": 电梯此时已经是运行状态");
                break;
            case STOPPING_STATE:
                System.out.println(getCurrentDate() + ": 电梯此时已经是停止状态");
                break;
        }
    }

    @Override
    public void run() {
        switch (this.state) {
            case OPENING_STATE:
                System.out.println(getCurrentDate() + ": 电梯此时已经是开门状态，不能运行");
                break;
            case CLOSING_STATE:
                System.out.println(getCurrentDate() + ": 电梯此时已经是关门状态");
                runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                System.out.println(getCurrentDate() + ": 电梯此时已经是运行状态");
                break;
            case STOPPING_STATE:
                System.out.println(getCurrentDate() + ": 电梯此时已经是停止状态");
                runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
        }
    }

    @Override
    public void stop() {
        switch (this.state) {
            case OPENING_STATE:
                System.out.println(getCurrentDate() + ": 电梯此时已经是开门状态");
                break;
            case CLOSING_STATE:
                System.out.println(getCurrentDate() + ": 电梯此时已经是关门状态");
                this.stopWithoutLogic();
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE:
                System.out.println(getCurrentDate() + ": 电梯此时已经是运行状态");
                this.stopWithoutLogic();
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println(getCurrentDate() + ": 电梯此时已经是停止状态");
                break;
        }
    }

    private String getCurrentDate() {
        long time = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date(time));
    }

    private void closeWithoutLogic() {
        System.out.println(getCurrentDate() + ": 电梯门关闭......");
    }

    private void openWithoutLogic() {
        System.out.println(getCurrentDate() + ": 电梯门打开......");
    }

    private void runWithoutLogic() {
        System.out.println(getCurrentDate() + ": 电梯运行......");
    }

    private void stopWithoutLogic() {
        System.out.println(getCurrentDate() + ": 电梯停止运行......");
    }
}
