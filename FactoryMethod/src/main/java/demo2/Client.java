package demo2;

public class Client {

    public static void main(String[] args) {
        //创建制造工厂
        Creator creator = new ConcreteCreator();

        Product product1 = creator.createProduct(ConcreteProduct1.class);
        //对 product1 进行业务的继续处理
        product1.method1();
        product1.method2();
        product1.method3();

        Product product2 = creator.createProduct(ConcreteProduct2.class);
        //对 product2 进行业务的继续处理
        product2.method1();
        product2.method2();
        product2.method3();
    }
}
