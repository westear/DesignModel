package demo1;

/**
 * 简单的报考信息工厂类
 */
public class SimpleSignInfoFactory {
    //报名信息的对象工厂
    public static SignInfo getSigInfo() {
        return new SignInfo();
    }

}
