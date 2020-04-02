package demo3;

/**
 * 强制代理的代理类
 */
public class GamePlayerProxy implements IGamePlayer, IProxy {

    private IGamePlayer gamePlayer;

    //构造函数传递业务类
    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        //添加升级费用
        this.count();
    }

    @Override
    public void count() {
        System.out.println("升一级150元");
    }

    //代理类的代理暂时没有，所以返回自己,代理类可以再次被代理
    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
