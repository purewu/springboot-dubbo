package com.wudepeng.inter.service;



import com.wudepeng.inter.bean.UserAddress;

import java.util.List;

/**
 * @Description
 * @Author wudepeng
 * @Date 2019/3/30 15:04
 **/
public interface UserService {

    public List<UserAddress> getUserAdressList(String userId);
}
