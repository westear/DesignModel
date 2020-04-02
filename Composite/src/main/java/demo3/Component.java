package demo3;

/**
 * 抽象构件
 */
public abstract class Component {

    //个体和整体都具有的行为或者属性
    private String attr;

    public Component() {

    }

    public Component(String attr) {
        this.attr = attr;
    }

    public void doSomething(){
        //TODO
    }
}
