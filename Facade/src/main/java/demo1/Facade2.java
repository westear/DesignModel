package demo1;

/**
 * 新增门面
 * 一个子系统可以有多个门面
 */
public class Facade2 {
    //引用原有门面
    private Facade facade = new Facade();

    //对外提供唯一的访问子系统的方法
    public void methodB() {
        this.facade.methodB();
    }
}
