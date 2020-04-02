package demo6;

import java.util.HashMap;
import java.util.Map;

/**
 * 延迟加载的工厂类，类似享元模式
 * 一个对象被消费完毕后，并不立刻释放，工厂类保持其初始状态。
 * ProductFactory负责产品类对象的创建工作，并且通过prMap变量产生一个缓存，对需要再次被重用的对象保留。
 */
public class ProductFactory {

    //缓存结构
    private static final Map<String, Product> prMap = new HashMap<>();

    public static synchronized Product createProduct(String type) throws Exception {
        Product product = null;
        //如果Map中已经有这个对象
        if(prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            if(type.equals(ConcreteProduct1.class.getSimpleName())) {
                product = new ConcreteProduct1();
            }
            if(type.equals(ConcreteProduct2.class.getSimpleName())) {
                product = new ConcreteProduct2();
            }
            //同时把对象放到缓存中
            prMap.put(type, product);
        }
        return product;
    }
}
