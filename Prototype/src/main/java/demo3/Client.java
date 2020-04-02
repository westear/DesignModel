package demo3;

/**
 * 深拷贝测试
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
