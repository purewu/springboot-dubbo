package com.wudepeng.provider.impl;



import com.alibaba.dubbo.config.annotation.Service;
import com.wudepeng.inter.bean.UserAddress;
import com.wudepeng.inter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;

/**
 * @Description 用户服务
 * @Author wudepeng
 * @Date 2019/3/30 15:06
 **/
@Service
@Component
public class UserServiceImpl implements UserService {



    public List<UserAddress> getUserAdressList(String userId) {
        UserAddress userAddress = new UserAddress(1, "江西省赣州市兴国县", "1", "武大郎", "13751400455", "1");
        UserAddress userAddress1 = new UserAddress(2, "江西省赣州市兴国县", "1", "武小狼", "13751400455", "1");
        return Arrays.asList(userAddress, userAddress1);
    }
}
