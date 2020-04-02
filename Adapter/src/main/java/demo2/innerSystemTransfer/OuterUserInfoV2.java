package demo2.innerSystemTransfer;

import demo2.innerSystem.IUserInfo;
import demo2.outerSystem.IOuterUserBaseInfo;
import demo2.outerSystem.IOuterUserHomeInfo;
import demo2.outerSystem.IOuterUserOfficeInfo;

import java.util.Map;
import java.util.Objects;

/**
 * 如果外部系统的用户信息接口式分散的，多个的，因为java不支持多继承，所以可以采用组合的形式，关联外部系统接口
 * 但仍要实现内部系统的对应接口
 */
public class OuterUserInfoV2 implements IUserInfo {
    
    public OuterUserInfoV2(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
        //数据处理
        this.baseInfoMap = baseInfo.getUserBaseInfo();
        this.homeInfoMap = homeInfo.getUserHomeInfo();
        this.officeInfoMap = officeInfo.getUserOfficeInfo();
    }
    
    private Map baseInfoMap;
    private Map homeInfoMap;
    private Map officeInfoMap;
    
    @Override
    public String getUserName() {
        return Objects.nonNull(baseInfoMap.get("userName")) ? baseInfoMap.get("userName").toString() : "";
    }

    @Override
    public String getHomeAddress() {
        return Objects.nonNull(homeInfoMap.get("homeAddress")) ? homeInfoMap.get("homeAddress").toString() : "";
    }

    @Override
    public String getMobileNumber() {
        return Objects.nonNull(baseInfoMap.get("mobileNumber")) ? baseInfoMap.get("mobileNumber").toString() : "";
    }

    @Override
    public String getOfficeTelNumber() {
        return Objects.nonNull(officeInfoMap.get("officeTelNumber")) ? officeInfoMap.get("officeTelNumber").toString() : "";
    }

    @Override
    public String getJobPosition() {
        return Objects.nonNull(officeInfoMap.get("jobPosition")) ? officeInfoMap.get("jobPosition").toString() : "";
    }

    @Override
    public String getHomeTelNumber() {
        return Objects.nonNull(homeInfoMap.get("homeTelNumber")) ? homeInfoMap.get("homeTelNumber").toString() : "";
    }
}
