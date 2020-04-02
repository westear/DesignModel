package demo1;

import java.util.ArrayList;
import java.util.Random;

public class Client {

    public static void main(String[] args) {
        //随机生成数据
        Random random = new Random();
        ArrayList<IWomen> womenArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            womenArrayList.add(new Women(random.nextInt(4),"要出去逛街"));
        }
        //定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        //设置请示顺序
        father.setNext(husband);
        husband.setNext(son);

        for (IWomen women : womenArrayList) {
            father.handlerMessage(women);
        }
    }
}
