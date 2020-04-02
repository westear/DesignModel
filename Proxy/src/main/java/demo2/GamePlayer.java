package demo2;

/**
 * 游戏玩家具体实现类
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(IGamePlayer gamePlayer,String name) throws Exception {
        if(gamePlayer == null) {
            throw new Exception("不能创建真实角色！");
        } else {
            this.name = name;
        }
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名为：".concat(this.name));
    }

    @Override
    public void killBoss() {
        System.out.println(this.name.concat("打怪！"));
    }

    @Override
    public void upgrade() {
        System.out.println(this.name.concat("升级！"));
    }
}
