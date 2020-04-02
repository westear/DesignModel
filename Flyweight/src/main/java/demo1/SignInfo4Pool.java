package demo1;

/**
 * 带对象池的报考信息
 */
public class SignInfo4Pool extends SignInfo {

    //定义一个对象池提取的KEY值,唯一确定一个对象
    private String key;

    //构造函数获得相同标志, 享元角色必须接受外部状态
    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
