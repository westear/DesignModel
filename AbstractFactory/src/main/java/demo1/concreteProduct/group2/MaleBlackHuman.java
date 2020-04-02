package demo1.concreteProduct.group2;

import demo1.abstractProduct.AbstractBlackHuman;

public class MaleBlackHuman extends AbstractBlackHuman {

    @Override
    public void getSex() {
        System.out.println("黑种人男性");
    }
}
