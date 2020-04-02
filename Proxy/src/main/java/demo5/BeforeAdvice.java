package demo5;

public class BeforeAdvice implements IAdvice {

    @Override
    public void exec() {
        //TODO 前置功能增强
        System.out.println("前置功能增强");
    }
}
