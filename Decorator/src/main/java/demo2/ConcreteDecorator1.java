package demo2;

public class ConcreteDecorator1 extends Decorator {

    //定义被修饰者
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    //定义自己的修饰方法
    public void method1(){
        //TODO 修饰的功能
    }

    //重写父类方法
    @Override
    public void operate(){
        //假设在基础功能之前添加功能
        this.method1();
        super.operate();
    }

}
