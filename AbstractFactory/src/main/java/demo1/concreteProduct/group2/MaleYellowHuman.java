package demo1.concreteProduct.group2;

import demo1.abstractProduct.AbstractYellowHuman;

public class MaleYellowHuman extends AbstractYellowHuman {

    @Override
    public void getSex() {
        System.out.println("黄种人男性");
    }
}
