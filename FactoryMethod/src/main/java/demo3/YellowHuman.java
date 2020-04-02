package demo3;

/**
 * 黄色人种
 */
public class YellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黄色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("以中国人为例，说汉语");
    }
}
