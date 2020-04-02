package demo5;

/**
 * Role实现类, 引入访问者模式
 */
public class KungFuRole implements Role {

    @Override
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}
