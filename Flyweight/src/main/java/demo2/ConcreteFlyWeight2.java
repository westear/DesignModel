package demo2;

/**
 * 具体享元角色2
 */
public class ConcreteFlyWeight2 extends FlyWeight {

    //接受外部状态
    public ConcreteFlyWeight2(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        //业务逻辑
    }
}
