package demo1;

/**
 * 具体的被观察者
 */
public class HanFeiZi implements IHanFeiZi {

    /**
     * 是否在吃饭
     */
    private boolean isHaveBreakFast = false;

    /**
     * 是否在娱乐
     */
    private boolean isHaveFun = false;

    /**
     * 修改：通过聚集方式把观察者和被观察者绑定
     */
    private LiSi liSi = new LiSi();

    @Override
    public void haveBreakFast() {
        System.out.println("被观察者正在吃饭......");
        this.isHaveBreakFast = true;

        //修改： 通知观察者
        liSi.fetchInformation("报告: 被观察者正在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("被观察者正在娱乐......");
        this.isHaveFun = true;

        //修改： 通知观察者
        liSi.fetchInformation("报告: 被观察者正在娱乐");
    }

    public boolean isHaveBreakFast() {
        return isHaveBreakFast;
    }

    public void setHaveBreakFast(boolean haveBreakFast) {
        isHaveBreakFast = haveBreakFast;
    }

    public boolean isHaveFun() {
        return isHaveFun;
    }

    public void setHaveFun(boolean haveFun) {
        isHaveFun = haveFun;
    }
}
