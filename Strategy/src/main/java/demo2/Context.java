package demo2;

/**
 * 封装类，将具体策略封装到一起
 */
public class Context {

    //构造函数，放入需要使用的策略
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    //使用策略
    public void operate() {
        this.strategy.operate();
    }
}
