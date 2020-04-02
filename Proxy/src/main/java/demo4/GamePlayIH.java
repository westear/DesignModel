package demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 * 使用了JDK提供的InvocationHandler的动态代理接口，对被代理类的方法进行代理
 */
public class GamePlayIH implements InvocationHandler {

    //被代理的实例
    Object target;
    //我要代理谁
    public GamePlayIH(Object obj) {
        this.target = obj;
    }

    //调用被代理的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(target, args);
        //功能增强
        if(method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人在用我的账户登录!");
        }
        return result;
    }
}
