package com.mall.order.service.impl;

import com.mall.order.domain.User;
import com.mall.order.mapper.UserMapper;
import com.mall.order.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author acai
 * @date 2020/8/17
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertUser() {
        User user = new User();
        user.setName("acai");
        user.setAge(17);
        int i = userMapper.insertSelective(user);
//        try {
//            int result = 1/0;
//        }catch (Exception e){
//            throw e;
//        }
        return user.getId();
    }
}
