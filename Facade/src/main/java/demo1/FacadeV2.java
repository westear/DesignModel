package demo1;

/**
 * 门面对象
 * 门面不应该参与子系统内部的业务逻辑. methodC
 */
public class FacadeV2 {

    //被委托的对象
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();
    private Context context = new Context();

    //提供给外部访问的方法
    public void methodA() {
        this.a.doSomethingA();
    }

    public void methodB() {
        this.b.doSomethingB();
    }

    public void methodC() {
        this.context.complexMethod();
    }
}
