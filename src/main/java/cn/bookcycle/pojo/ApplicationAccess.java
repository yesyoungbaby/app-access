package cn.bookcycle.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author yesyoungbaby
 */
public class ApplicationAccess implements Serializable {
    private Long id;

    private String name;

    private String manufacturer;

    private String deviceType;

    private String deviceModel;

    private String appId;

    private String appSecret;

    private String iotAppName;

    private String iotAppId;

    private String iotAppSecret;

    private String subscribeUrl;

    private Long userId;

    private Date createTime;

    private Date updateTime;

    private Short state;

    private Integer deviceNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel == null ? null : deviceModel.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret == null ? null : appSecret.trim();
    }

    public String getIotAppName() {
        return iotAppName;
    }

    public void setIotAppName(String iotAppName) {
        this.iotAppName = iotAppName == null ? null : iotAppName.trim();
    }

    public String getIotAppId() {
        return iotAppId;
    }

    public void setIotAppId(String iotAppId) {
        this.iotAppId = iotAppId == null ? null : iotAppId.trim();
    }

    public String getIotAppSecret() {
        return iotAppSecret;
    }

    public void setIotAppSecret(String iotAppSecret) {
        this.iotAppSecret = iotAppSecret == null ? null : iotAppSecret.trim();
    }

    public String getSubscribeUrl() {
        return subscribeUrl;
    }

    public void setSubscribeUrl(String subscribeUrl) {
        this.subscribeUrl = subscribeUrl == null ? null : subscribeUrl.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Integer getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(Integer deviceNum) {
        this.deviceNum = deviceNum;
    }

    @Override
    public String toString() {
        return "ApplicationAccess{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", deviceModel='" + deviceModel + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", iotAppName='" + iotAppName + '\'' +
                ", iotAppId='" + iotAppId + '\'' +
                ", iotAppSecret='" + iotAppSecret + '\'' +
                ", subscribeUrl='" + subscribeUrl + '\'' +
                ", userId=" + userId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", state=" + state +
                ", deviceNum=" + deviceNum +
                '}';
    }
}