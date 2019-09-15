package com.wudepeng.consumer.controller;

import com.wudepeng.inter.bean.UserAddress;
import com.wudepeng.inter.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description
 * @Author wudepeng
 * @Date 2019/4/12 14:07
 **/
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    @RequestMapping("/order/{id}")
    public List<UserAddress> orders(@PathVariable("id") String id) {
        List<UserAddress> userAddresses = orderService.initOrder(id);
        return userAddresses;
    }

}
