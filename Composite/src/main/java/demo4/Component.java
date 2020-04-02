package demo4;

import java.util.ArrayList;

/**
 * 抽象构件
 */
public abstract class Component {

    //个体和整体都具有的共享
    public void doSomething() {
        //TODO 编写业务逻辑
    }

    //增加子节点
    public abstract void add(Component component);

    //删除子节点
    public abstract void remove(Component component);

    //遍历子节点
    public abstract ArrayList<Component> getChildren();
}
