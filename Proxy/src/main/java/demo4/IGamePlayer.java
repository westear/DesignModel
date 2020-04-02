package demo4;

/**
 * 游戏玩家接口
 */
public interface IGamePlayer {

    //登录游戏
    void login(String user, String password);

    //杀怪
    void killBoss();

    //升级
    void upgrade();
}
