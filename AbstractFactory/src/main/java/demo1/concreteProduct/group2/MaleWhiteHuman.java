package demo1.concreteProduct.group2;

import demo1.abstractProduct.AbstractWhiteHuman;

public class MaleWhiteHuman extends AbstractWhiteHuman {

    @Override
    public void getSex() {
        System.out.println("白种人男性");
    }
}
