package demo1;

/**
 * 门面对象
 */
public class Facade {

    //被委托的对象
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    //提供给外部访问的方法
    public void methodA() {
        this.a.doSomethingA();
    }

    public void methodB() {
        this.b.doSomethingB();
    }

    public void methodC() {
        //门面不应该参与子系统内部的业务逻辑。新增一个封装类 Context 来解决
//        this.a.doSomethingA();
        this.c.doSomethingC();
    }
}
