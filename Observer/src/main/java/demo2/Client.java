package demo2;

public class Client {

    public static void main(String[] args) {
        //派出三个观察者
        Observer oneObserver = new OneObserverImpl();
        Observer twoObserver = new TwoObserverImpl();
        Observer threeObserver = new ThreeObserverImpl();

        //指定被监控者
        TargetImpl target = new TargetImpl();

        //注入观察者内部
        target.addObserver(oneObserver);
        target.addObserver(twoObserver);
        target.addObserver(threeObserver);

        //此时被观察者行为
        target.haveFun();
    }
}
