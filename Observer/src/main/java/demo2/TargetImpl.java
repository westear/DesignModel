package demo2;

import java.util.ArrayList;

/**
 * 具体被观察者，观察目标允许观察者聚集，以及允许被观察到的行为有哪些，
 * 所以同时需要实现 观察行为接口(Observer)、观察者管理接口(Observable)
 */
public class TargetImpl implements Target, Observable {

    //定义一个变长数组，存放所有观察者
    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for(Observer observer : observers) {
            observer.fetchInformation(context);
        }
    }

    @Override
    public void haveBreakFast() {
        System.out.println("被观察者正在吃饭......");
        this.notifyObservers("---> 被观察者正在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("被观察者正在娱乐......");
        this.notifyObservers("---> 被观察者正在娱乐");
    }
}
