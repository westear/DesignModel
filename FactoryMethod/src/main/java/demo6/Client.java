package demo6;

import java.util.Objects;

public class Client {

    public static void main(String[] args) throws Exception {

        Product product1 = ProductFactory.createProduct(ConcreteProduct1.class.getSimpleName());
        if(Objects.nonNull(product1)) {
            product1.method1();
            product1.method2();
            product1.method3();
        }

        Product product2 = ProductFactory.createProduct(ConcreteProduct2.class.getSimpleName());
        if(Objects.nonNull(product2)) {
            product2.method1();
            product2.method2();
            product2.method3();
        }
    }
}
