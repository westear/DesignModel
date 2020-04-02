package demo2;

/**
 * 抽象建造类
 */
public abstract class Builder {

    //设置零件组装
    public abstract void setPart();

    public abstract Product buildProduct();
}
