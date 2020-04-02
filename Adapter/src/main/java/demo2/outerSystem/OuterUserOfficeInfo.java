package demo2.outerSystem;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfoMap = new HashMap();
        officeInfoMap.put("officeTelNumber", "0881-94594769");
        officeInfoMap.put("homeAddress", "Xx Yy");
        return officeInfoMap;
    }
}
