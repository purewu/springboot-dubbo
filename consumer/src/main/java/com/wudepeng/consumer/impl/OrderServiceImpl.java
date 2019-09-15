package com.wudepeng.consumer.impl;


import com.alibaba.dubbo.config.annotation.Reference;
import com.wudepeng.inter.bean.UserAddress;
import com.wudepeng.inter.service.OrderService;
import com.wudepeng.inter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author wudepeng
 * @Date 2019/3/30 15:20
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        List<UserAddress> list = userService.getUserAdressList(userId);
        return list;
    }
}
