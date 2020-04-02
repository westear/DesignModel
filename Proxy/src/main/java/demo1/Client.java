package demo1;

public class Client {

    public static void main(String[] args) {
        //定义一个玩家
        IGamePlayer gamePlayer = new GamePlayer("westear");
        //定义一个代练玩家
        IGamePlayer proxy = new GamePlayerProxy(gamePlayer);
        //开始打游戏
        System.out.println("开始进入游戏");
        proxy.login("westear","123456");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        System.out.println("退出游戏");
    }
}
