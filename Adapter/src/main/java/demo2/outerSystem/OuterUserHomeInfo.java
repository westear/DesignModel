package demo2.outerSystem;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {

    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfoMap = new HashMap();
        homeInfoMap.put("jobPosition", "Boss");
        homeInfoMap.put("homeTelNumber", "73433432");
        return homeInfoMap;
    }
}
