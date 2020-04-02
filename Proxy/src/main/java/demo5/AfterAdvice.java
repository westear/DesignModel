package demo5;

/**
 * 后置通功能现
 */
public class AfterAdvice implements IAdvice {

    @Override
    public void exec() {
        //TODO
        System.out.println("后置功能增强");
    }
}
