package demo5;

import java.lang.reflect.Constructor;

public class SingletonFactory {

    private static Singleton singleton;

    static {
        try {
            Class cls = Class.forName(Singleton.class.getName());
            //获得无参构造
            Constructor constructor = cls.getDeclaredConstructor();
            //设置无参构造是可以访问的
            constructor.setAccessible(true);
            //产生一个实例对象
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            //TODO 异常处理
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
