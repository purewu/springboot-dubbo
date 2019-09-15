package com.wudepeng.inter.service;

import com.wudepeng.inter.bean.UserAddress;

import java.util.List;

/**
 * @Description 初始化订单
 * @Author wudepeng
 * @Date 2019/3/30 15:16
 **/
public interface OrderService {

    List<UserAddress> initOrder(String userId);


}
