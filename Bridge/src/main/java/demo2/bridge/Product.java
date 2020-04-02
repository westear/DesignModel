package demo2.bridge;

/**
 * 现在把产品抽象出来，让公司和产品产生联系
 */
public abstract class Product {
    /**
     * 任何产品都有生产制造环境
     */
    public abstract void beProducted();

    /**
     * 生产出来的产品需要被销售出去
     */
    public abstract void beSelled();
}
