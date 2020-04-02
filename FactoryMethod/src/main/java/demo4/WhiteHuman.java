package demo4;

/**
 * 白种人
 */
public class WhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("皮肤白色");
    }

    @Override
    public void talk() {
        System.out.println("主流语言为英语");
    }
}
