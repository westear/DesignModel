package demo1.abstractProduct;

import demo1.Human;

public abstract class AbstractBlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黑色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("说土著语");
    }
}
