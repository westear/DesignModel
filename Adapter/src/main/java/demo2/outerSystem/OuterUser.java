package demo2.outerSystem;

import java.util.HashMap;
import java.util.Map;

/**
 * @see demo2.outerSystem.IOuterUser 实现类
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "outerUserName");
        baseInfoMap.put("mobileNumber", "15500000000");
        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfoMap = new HashMap();
        officeInfoMap.put("officeTelNumber", "0881-94594769");
        officeInfoMap.put("homeAddress", "Xx Yy");
        return officeInfoMap;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfoMap = new HashMap();
        homeInfoMap.put("jobPosition", "Boss");
        homeInfoMap.put("homeTelNumber", "73433432");
        return homeInfoMap;
    }
}
