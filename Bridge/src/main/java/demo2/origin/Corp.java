package demo2.origin;

/**
 * 公司
 */
public abstract class Corp {
    /**
     * 公司生产产品
     */
    protected abstract void produce();

    /**
     * 销售渠道
     */
    protected abstract void sell();

    /**
     * 赚钱
     */
    public void makeMoney() {
        this.produce();
        this.sell();
    }
}
