package demo2;

/**
 * 抽象享元角色
 */
public abstract class FlyWeight {
    //内部状态
    private String intrinsic;
    //外部状态,也可以创建一个描述外部状态的类，但是要重写该类的 hashCode, 否则在 HashMap 中无法成为key
    protected final String extrinsic;

    //要求享元角色必须接受外部状态
    protected FlyWeight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    //定义业务操作
    public abstract void operate();

    //内部状态的 getter/setter
    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
