package demo1;

import java.util.HashMap;

/**
 * 带对象池的工厂类
 */
public class SignInfoFactory {
    //池容器
    private static HashMap<String, SignInfo> pool = new HashMap<>();

    //报名信息的对象工厂
    @Deprecated
    public static SignInfo getSigInfo() {
        return new SignInfo();
    }

    //从池中获得对象
    public static SignInfo getSignInfo(String key) {
        //设置返回对象
        SignInfo result;
        //池中没有该对象，则建立，并放入池中
        if(!pool.containsKey(key)) {
            System.out.println("建立对象，放入池中=====");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            result = pool.get(key);
            System.out.println(key+"直接从池中获得====");
        }
        return result;
    }
}
