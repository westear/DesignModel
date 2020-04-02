package demo2.invoker;

import demo2.innerSystem.IUserInfo;
import demo2.innerSystemTransfer.OuterUserInfoV2;
import demo2.outerSystem.*;

public class ClientV2 {
    
    public static void main(String[] args) {
        //外部系统用户信息
        IOuterUserBaseInfo outerUserBaseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo outerUserHomeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo outerUserOfficeInfo = new OuterUserOfficeInfo();
        
        //传递三个对象
        IUserInfo outerUserInfo = new OuterUserInfoV2(outerUserBaseInfo, outerUserHomeInfo, outerUserOfficeInfo);
        
        //假设从数据库查询数据
        outerUserInfo.getUserName();
        outerUserInfo.getMobileNumber();
    }
}
