package demo1;

/**
 * 开始监控观察
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        /*
        //定义出被观察者和观察者
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();

        //观察是否吃饭的程序启动
        Watch watchBreakFast = new Watch(hanFeiZi, liSi, "breakfast");
        watchBreakFast.start();

        //观察是否吃饭的程序启动
        Watch watchFun = new Watch(hanFeiZi, liSi, "fun");
        watchFun.start();

        //观察者行为
        Thread.sleep(1000);
        hanFeiZi.haveBreakFast();

        Thread.sleep(1000);
        hanFeiZi.haveFun();
        */

        /*
            以上调用容易造成资源过度被占用, 修改如下:
         */
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.haveBreakFast();;
        hanFeiZi.haveFun();
    }
}
