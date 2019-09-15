
package com.wudepeng.inter.bean;
import java.io.Serializable;

/**
 * @Description 用户地址
 * @Author wudepeng
 * @Date 2019/3/30 14:55
 **/
public class UserAddress implements Serializable {

    private Integer id;
    private String userAdress;
    private String userId;
    private String consignee;
    private String phoneNum;
    private String isDefault;

    public UserAddress(Integer id, String userAdress, String userId, String consignee, String phoneNum, String isDefault) {
        this.id = id;
        this.userAdress = userAdress;
        this.userId = userId;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }

    private UserAddress() {

    }

    public String getUserAdress() {
        return userAdress;
    }

    public void setUserAdress(String userAdress) {
        this.userAdress = userAdress;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
