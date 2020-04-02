package demo3;

/**
 * 简单工厂模式,只有一条 “产品线”, 只需要一个工厂
 */
public class Client {
    public static void main(String[] args) {

        //生产黄种人
        System.out.println("======生产黄种人=========");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

        //生产白种人
        System.out.println("======生产白种人=========");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        //生产黑种人
        System.out.println("======生产黑种人=========");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
    }
}
