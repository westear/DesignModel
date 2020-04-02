package demo1;

/**
 * 妇女婚姻状况，行为接口类
 */
public interface IWomen {

    /**
     * 获得婚姻家庭状况:
     *  1.未婚
     *  2.已婚
     *  3.夫死
     * @return int
     */
    int getType();

    /**
     * 获得行为申请结果
     * @return String
     */
    String getRequest();
}
