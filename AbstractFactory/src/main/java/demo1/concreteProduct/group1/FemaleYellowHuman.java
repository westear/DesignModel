package demo1.concreteProduct.group1;

import demo1.abstractProduct.AbstractYellowHuman;

public class FemaleYellowHuman extends AbstractYellowHuman {

    @Override
    public void getSex() {
        System.out.println("黄种人女性");
    }
}
