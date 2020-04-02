package demo2.invoker;

import demo2.innerSystem.IUserInfo;
import demo2.innerSystem.UserInfo;
import demo2.innerSystemTransfer.OuterUserInfo;

/**
 * 调用的场景类
 */
public class Client {
    public static void main(String[] args) {
        //没有与外部系统连接的时候是只这样写的
        IUserInfo innerUser = new UserInfo();
        //从数据库中查询数据
        innerUser.getUserName();
        innerUser.getMobileNumber();
        
        //如果需要查看外部人员信息
        IUserInfo outerUser = new OuterUserInfo(); //只改了调用的接口类
        outerUser.getUserName();
        outerUser.getMobileNumber();
    }
}
