package demo1;

/**
 * 电梯接口
 */
public interface ILift {

    /**
     * 敞门状态
     */
    int OPENING_STATE = 1;

    /**
     * 闭门状态
     */
    int CLOSING_STATE = 2;

    /**
     * 运行状态
     */
    int RUNNING_STATE = 3;

    /**
     * 停止状态
     */
    int STOPPING_STATE = 4;

    //设置电梯状态
    void setState(int state);

    //门开启动作
    void open();

    //门关闭动作
    void close();

    //运行动作
    void run();

    //停下来的动作
    void stop();
}
