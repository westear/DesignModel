package demo1;

import java.util.ArrayList;

/**
 * 车辆功能模型抽象类
 */
public abstract class CarModel {

    //存储各个方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public final void run() {
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if(actionName.equalsIgnoreCase("start")) {
                this.start();
            }
            if(actionName.equalsIgnoreCase("stop")) {
                this.stop();
            }
            if(actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            }
            if(actionName.equalsIgnoreCase("engine boom")) {
                this.engineBoom();
            }
        }
    }

    public final void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
