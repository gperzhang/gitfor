package com.mall.order.mapper;

import com.mall.order.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author acai
 * @date 2020/8/7
 **/
@Component
@Mapper
public interface UserMapper {
    User selectUserById(int id);

    int insertSelective(User user);

    void insertBatch(List<User> list);
}
