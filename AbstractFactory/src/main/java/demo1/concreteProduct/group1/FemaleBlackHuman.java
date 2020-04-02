package demo1.concreteProduct.group1;

import demo1.abstractProduct.AbstractBlackHuman;

public class FemaleBlackHuman extends AbstractBlackHuman {

    @Override
    public void getSex() {
        System.out.println("黑种人女性");
    }
}
