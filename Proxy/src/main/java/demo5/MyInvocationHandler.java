package demo5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的Handler类
 */
public class MyInvocationHandler implements InvocationHandler {
    //被代理的对象
    private Object target;

    //通过构造函数传递一个被代理对象
    public MyInvocationHandler(Object obj) {
        this.target = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行被代理的方法
        Object result = method.invoke(this.target, args);

        if (true) {
            //执行一个后置通知
            (new AfterAdvice()).exec();
        }

        return result;
    }
}
