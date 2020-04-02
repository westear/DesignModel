package demo2;

import java.util.HashMap;

/**
 * 享元工厂， 管理享元对象
 */
public class FlyWeightFactory {
    //定义一个池容器
    private static HashMap<String, FlyWeight> pool = new HashMap<>();

    //享元工厂
    public static FlyWeight getFlyWeight(String extrinsic) {
        //需要返回的对象
        FlyWeight flyWeight;
        if(!pool.containsKey(extrinsic)) {
            flyWeight = pool.get(extrinsic);
        } else {
            flyWeight = new ConcreteFlyWeight1(extrinsic);
            pool.put(extrinsic, flyWeight);
        }
        return flyWeight;
    }
}
