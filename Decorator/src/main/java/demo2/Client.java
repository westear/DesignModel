package demo2;

public class Client {

    public static void main(String[] args) {
        //但对象调用链总是终于基础功能的对象类
        Component component = new ConcreteDecorator1(new ConcreteDecorator2(new ConcreteComponent()));
        component.operate();
    }
}
