package demo5;

/**
 * 具体的主题
 */
public class RealSubject implements Subject {

    @Override
    public void doSomething(String args) {
        //TODO
        System.out.println(args);
    }
}
