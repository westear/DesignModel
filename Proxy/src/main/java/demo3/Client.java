package demo3;

public class Client {

    public static void main(String[] args) {
        //定义一个游戏角色
        IGamePlayer gamePlayer = new GamePlayer("westear");
        gamePlayer.login("westear","123456");
        gamePlayer.killBoss();
        gamePlayer.upgrade();

        System.out.println("访问代理类=======");

        //定义一个游戏角色
        IGamePlayer gamePlayer1 = new GamePlayer("westear");
        //定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy(gamePlayer1);
        proxy.login("westear","123456");
        proxy.killBoss();
        proxy.upgrade();

        System.out.println("=======还是不能访问，因为不是真实角色的指定对象，这个代理对象是自己 new 出来的， 所以不能访问");

        //定义一个游戏角色
        IGamePlayer gamePlayer2 = new GamePlayer("westear");
        //获得指定代理
        IGamePlayer proxy1 = gamePlayer2.getProxy();
        proxy1.login("westear","123456");
        proxy1.killBoss();
        proxy1.upgrade();

    }
}
