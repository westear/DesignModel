package demo1.factory.group1;

import demo1.Human;
import demo1.concreteProduct.group1.FemaleBlackHuman;
import demo1.concreteProduct.group1.FemaleWhiteHuman;
import demo1.concreteProduct.group1.FemaleYellowHuman;
import demo1.factory.HumanFactory;

public class FemaleHumanFactory implements HumanFactory {

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
