package demo2;

/**
 * 具体享元角色1
 */
public class ConcreteFlyWeight1 extends FlyWeight {

    //接受外部状态
    public ConcreteFlyWeight1(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        //业务逻辑
    }
}
