package demo2;

/**
 * 抽象元素
 */
public abstract class Element {

    abstract void doSomething();

    //允许谁来访问
    abstract void accept(IVisitor visitor);
}
