package com.mall.order.mapper;

import com.mall.order.domain.User;

/**
 * @author acai
 * @date 2020/8/7
 **/
public interface UserMapper {
    User selectUserById(int id);

    int insertSelective(User user);
}
