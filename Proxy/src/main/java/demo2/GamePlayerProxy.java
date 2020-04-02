package demo2;

/**
 * 玩游戏代理类
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer;

    //通过构造函数传递要对谁进行代练
    public GamePlayerProxy(String name){
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            //TODO 异常处理
        }
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
    }
}
