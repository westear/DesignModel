package demo2;

/**
 * 具体环境角色
 */
public class Context {

    //定义状态
    public final static State STATE1 = new ConcreteState1();
    public final static State STATE2 = new ConcreteState2();

    //当前状态
    private State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State state) {
        this.currentState = state;
        //切换状态
        this.currentState.setContext(this);
    }

    //行为委托
    public void handle1(){
        this.currentState.handle1();
    }

    public void handle2(){
        this.currentState.handle2();
    }
}
