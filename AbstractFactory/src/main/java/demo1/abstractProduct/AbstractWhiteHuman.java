package demo1.abstractProduct;

import demo1.Human;

public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("皮肤白色");
    }

    @Override
    public void talk() {
        System.out.println("主流语言为英语");
    }

}
