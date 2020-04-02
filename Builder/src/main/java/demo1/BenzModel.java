package demo1;

/**
 * 奔驰模型代码
 */
public class BenzModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("奔驰车启动......");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停车......");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车喇叭声......");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车引擎声......");
    }
}
