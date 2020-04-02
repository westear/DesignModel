package demo3;

/**
 * 真实具体的业务类
 */
public class GamePlayer implements IGamePlayer {

    private String name;
    //该类需要的代理类
    private IGamePlayer proxy;

    public GamePlayer(String name) {
        this.name = name;
    }

    //找到自己的代理
    @Override
    public IGamePlayer getProxy() {
        //把自己要传递给代理类
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    @Override
    public void login(String user, String password) {
        if(this.isProxy()) {
            System.out.println("代练登录");
        }else {
            System.out.println("请先找代练");
        }
    }

    @Override
    public void killBoss() {
        if(this.isProxy()) {
            System.out.println("代练打怪");
        }else {
            System.out.println("请先找代练");
        }
    }

    @Override
    public void upgrade() {
        if(this.isProxy()) {
            System.out.println("代练帮你又升一级");
        }else {
            System.out.println("请先找代练");
        }
    }

    //校验是否为代理访问
    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
