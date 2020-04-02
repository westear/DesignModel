package demo3;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * 具体被观察者，观察目标允许观察者聚集，以及允许被观察到的行为有哪些，
 * 所以同时需要实现 观察行为接口(Observer)、观察者管理接口(Observable)
 */
public class TargetImpl extends Observable implements Target {

    @Override
    public void haveBreakFast() {
        System.out.println("被观察者正在吃饭......");
        super.setChanged();
        this.notifyObservers("---> 被观察者正在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("被观察者正在娱乐......");
        super.setChanged();
        this.notifyObservers("---> 被观察者正在娱乐");
    }
}
