package demo2;

/**
 * 抽象装饰类, 继承基础功能的基类
 */
public abstract class Decorator extends Component{

    private Component component;

    //通过构造参数传递被修饰者
    public Decorator(Component component) {
        this.component = component;
    }

    //委托给被修饰者执行
    @Override
    public void operate() {
        this.component.operate();
    }
}
