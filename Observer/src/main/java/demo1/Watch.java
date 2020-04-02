package demo1;

/**
 * 间谍类，真正获取信息的后台程序, 线程循环监控，消耗大量资源
 */
@Deprecated
public class Watch extends Thread {

    /**
     * 被观察者
     */
    private HanFeiZi hanFeiZi;

    /**
     * 观察者
     */
    private LiSi liSi;

    private String type;

    //通过构造函数传递参数，要监控的是谁？谁来监控？要监控什么？
    public Watch(HanFeiZi hanFeiZi, LiSi liSi, String type) {
        this.hanFeiZi = hanFeiZi;
        this.liSi = liSi;
        this.type = type;
    }

    @Override
    public void run() {
        //TODO: 造成资源占用过度
        while (true) {
            //监控是否在吃早餐
            if(this.type.equals("breakfast")) {
                //如果正在吃饭，则报告观察者
                if(this.hanFeiZi.isHaveBreakFast()) {
                    this.liSi.fetchInformation("被观察者正在吃饭");
                }
            }
            if(this.type.equals("fun")){
                if(this.hanFeiZi.isHaveFun()) {
                    this.liSi.fetchInformation("被观察者正在娱乐");
                }
            }
        }
    }
}
