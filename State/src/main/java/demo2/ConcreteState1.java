package demo2;

/**
 * 环境角色1
 */
public class ConcreteState1 extends State {

    @Override
    public void handle1() {

    }

    @Override
    public void handle2() {
        //设置当前状态为state2
        super.context.setCurrentState(Context.STATE2);
        //过渡到state2状态，由Context实现
        super.context.getCurrentState().handle2();
    }
}
