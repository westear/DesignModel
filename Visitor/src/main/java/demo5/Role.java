package demo5;

/**
 * 角色接口, 引入访问者模式
 */
public interface Role {

    void accept(AbsActor actor);
}
