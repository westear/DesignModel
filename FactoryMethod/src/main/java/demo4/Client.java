package demo4;

/**
 * 多工厂模式,有多条 “产品线”, 需要多个工厂
 */
public class Client {

    public static void main(String[] args) {

        //生产黄种人
        System.out.println("======生产黄种人=========");
        Human yellowHuman = (new YellowHumanFactory()).createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();

        //生产白种人
        System.out.println("======生产白种人=========");
        Human whiteHuman = (new WhiteHumanFactory()).createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        //生产黑种人
        System.out.println("======生产黑种人=========");
        Human blackHuman = (new BlackHumanFactory()).createHuman();
        blackHuman.getColor();
        blackHuman.talk();
    }
}
