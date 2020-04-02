package demo2;

/**
 * 隐藏了状态的变化过程
 */
public class Client {

    public static void main(String[] args) {
        //定义环境角色
        Context context = new Context();
        //初始化状态
        context.setCurrentState(new ConcreteState1());
        //执行行为
        context.handle1();
        context.handle2();
    }
}
