package demo5;

import java.util.Objects;

public class Client {

    public static void main(String[] args) {

        Singleton singleton = SingletonFactory.getSingleton();

        if(Objects.nonNull(singleton)) {
            singleton.doSomething();
        }
    }
}
