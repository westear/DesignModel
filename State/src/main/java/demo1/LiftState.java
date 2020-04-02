package demo1;

public abstract class LiftState {

    //定义一个环境角色，也就是封装状态的变化引擎的功能变化
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //首先电梯门开启动作
    abstract void open();

    //电梯门关闭
    abstract void close();

    //电梯运行
    abstract void run();

    //电梯停运
    abstract  void stop();
}
