package demo1;

import java.util.ArrayList;

/**
 * 树枝（组长或者经理）接口
 */
public interface IBranch extends ICorp {

    //能够新增小兵或者经理
    void addSubordinate(ICorp corp);

    //还能够获取下属的信息
    ArrayList<ICorp> getSubordinate();
}
