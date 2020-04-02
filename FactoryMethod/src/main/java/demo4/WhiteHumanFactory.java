package demo4;

/**
 * 具体产品创建的工厂类
 */
public class WhiteHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
