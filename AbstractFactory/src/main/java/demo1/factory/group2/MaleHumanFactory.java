package demo1.factory.group2;

import demo1.Human;
import demo1.concreteProduct.group2.MaleBlackHuman;
import demo1.concreteProduct.group2.MaleWhiteHuman;
import demo1.concreteProduct.group2.MaleYellowHuman;
import demo1.factory.HumanFactory;

public class MaleHumanFactory implements HumanFactory {

    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
