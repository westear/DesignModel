package demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        //定义一个游戏角色
        IGamePlayer gamePlayer = new GamePlayer("westear");
        //定义一个Handler
        InvocationHandler handler = new GamePlayIH(gamePlayer);
        //获得类的 ClassLoader
        ClassLoader cl = gamePlayer.getClass().getClassLoader();
        //动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);

        proxy.login("westear", "123456");
        proxy.killBoss();
        proxy.upgrade();
    }
}
