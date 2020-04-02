package demo2;

public abstract class HummerModel {

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    protected void run() {
        this.start();
        this.engineBoom();
        if(this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    //钩子方法
    protected boolean isAlarm() {
        return true;
    }
}
