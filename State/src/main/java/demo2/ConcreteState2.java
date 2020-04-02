package demo2;

/**
 * 环境角色2
 */
public class ConcreteState2 extends State {

    @Override
    public void handle1() {
        //设置当前状态为state1
        super.context.setCurrentState(Context.STATE1);
        //过渡到state1状态，由Context实现
        super.context.getCurrentState().handle1();
    }

    @Override
    public void handle2() {

    }
}
