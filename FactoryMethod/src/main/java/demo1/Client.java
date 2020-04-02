package demo1;

public class Client {
    public static void main(String[] args) {
        //声明制造工厂
        AbstractHumanFactory factory = new HumanFactory();

        //生产黄种人
        System.out.println("======生产黄种人=========");
        Human yellowHuman = factory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

        //生产白种人
        System.out.println("======生产白种人=========");
        Human whiteHuman = factory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        //生产黑种人
        System.out.println("======生产黑种人=========");
        Human blackHuman = factory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
    }
}
