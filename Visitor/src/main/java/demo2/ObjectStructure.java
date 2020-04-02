package demo2;

import java.util.Random;

public class ObjectStructure {

    //对象生成器，通过工厂方式模拟
    public static Element createElement() {
        Random random = new Random();
        if(random.nextInt(100) > 50) {
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }
}
