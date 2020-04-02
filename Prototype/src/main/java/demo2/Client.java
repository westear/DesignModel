package demo2;

/**
 * 浅拷贝：clone 只拷贝本对象，对象内部的数组，引用对象(String类型除外)等都不拷贝，还是指向原生对象的内部元素地址。新旧对象共享一个私有变量
 */
public class Client {

    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("张三");
        //拷贝一个对象
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
        System.out.println(cloneThing.getValue());
    }
}
