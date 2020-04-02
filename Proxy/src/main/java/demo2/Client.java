package demo2;

/**
 * 普通代理：调用者只知代理而不用知道真实的角色是谁，屏蔽了真实角色的变更对高层模块的影响
 */
public class Client {

    public static void main(String[] args) {
        //定义一个代练玩家
        IGamePlayer proxy = new GamePlayerProxy("gamePlayerName");
        //开始打游戏
        System.out.println("开始进入游戏");
        proxy.login("gamePlayerName","123456");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        System.out.println("退出游戏");
    }
}
