package demo2.outerSystem;

import java.util.Map;

/**
 * 外部系统的用户信息接口
 */
public interface IOuterUser {

    Map getUserBaseInfo();

    Map getUserOfficeInfo();

    Map getUserHomeInfo();
}
