package demo1;

/**
 * 宝马模型代码
 */
public class BMWModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("宝马车启动......");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停车......");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车喇叭声......");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车引擎声......");
    }
}
