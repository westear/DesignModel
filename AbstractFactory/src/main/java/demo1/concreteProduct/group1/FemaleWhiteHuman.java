package demo1.concreteProduct.group1;

import demo1.abstractProduct.AbstractWhiteHuman;

public class FemaleWhiteHuman extends AbstractWhiteHuman {

    @Override
    public void getSex() {
        System.out.println("白种人女性");
    }
}
