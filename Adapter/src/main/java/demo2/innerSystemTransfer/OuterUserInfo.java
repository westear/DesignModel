package demo2.innerSystemTransfer;

import demo2.innerSystem.IUserInfo;
import demo2.outerSystem.OuterUser;

import java.util.Map;
import java.util.Objects;

/**
 * 将外部系统用户信息转换成内部系统用户信息的转换类
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {
    
    private Map baseInfo = getUserBaseInfo();
    private Map homeInfo = getUserHomeInfo();
    private Map officeInfo = getUserOfficeInfo();

    @Override
    public Map getUserBaseInfo() {
        return super.getUserBaseInfo();
    }

    @Override
    public Map getUserOfficeInfo() {
        return super.getUserOfficeInfo();
    }

    @Override
    public Map getUserHomeInfo() {
        return super.getUserHomeInfo();
    }

    @Override
    public String getUserName() {
        return Objects.nonNull(baseInfo.get("userName")) ? baseInfo.get("userName").toString() : "";
    }

    @Override
    public String getHomeAddress() {
        return Objects.nonNull(homeInfo.get("homeAddress")) ? homeInfo.get("homeAddress").toString() : "";
    }

    @Override
    public String getMobileNumber() {
        return Objects.nonNull(baseInfo.get("mobileNumber")) ? baseInfo.get("mobileNumber").toString() : "";
    }

    @Override
    public String getOfficeTelNumber() {
        return Objects.nonNull(officeInfo.get("officeTelNumber")) ? officeInfo.get("officeTelNumber").toString() : "";
    }

    @Override
    public String getJobPosition() {
        return Objects.nonNull(officeInfo.get("jobPosition")) ? officeInfo.get("jobPosition").toString() : "";
    }

    @Override
    public String getHomeTelNumber() {
        return Objects.nonNull(homeInfo.get("homeTelNumber")) ? homeInfo.get("homeTelNumber").toString() : "";
    }
}
