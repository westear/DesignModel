package demo2;

public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    //定义自己的修饰方法
    public void method2() {
        //TODO 附加功能
    }

    //重写父类方法
    @Override
    public void operate() {
        super.operate();
        //假设在基础功能之后添加功能
        this.method2();
    }
}
