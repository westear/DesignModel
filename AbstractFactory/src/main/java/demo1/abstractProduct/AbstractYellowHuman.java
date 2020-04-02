package demo1.abstractProduct;

import demo1.Human;

public abstract class AbstractYellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黄色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("以中国人为例，说汉语");
    }

}
