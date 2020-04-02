package demo1;

import java.util.Iterator;

public class Client {

    public static void main(String[] args) {

        //声明出容器
        Aggregate aggregate = new ConcreteAggregate();

        //产生对象数据放进去
        aggregate.add("abc");
        aggregate.add("aaa");
        aggregate.add("1234");

        //遍历一下
        Iterator<Object> iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
