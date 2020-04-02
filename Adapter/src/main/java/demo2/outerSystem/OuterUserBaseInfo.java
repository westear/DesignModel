package demo2.outerSystem;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo {
    
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "outerUserName");
        baseInfoMap.put("mobileNumber", "15500000000");
        return baseInfoMap;
    }
}
