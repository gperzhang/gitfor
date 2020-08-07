package com.mall.order;

import com.mall.order.domain.User;
import com.mall.order.mapper.UserMapper;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author acai
 * @date 2020/8/7
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class DbTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void test(){

        User user = userMapper.selectUserById(1);
        System.out.println(user);
    }


    @Test
    public void test01(){
        User user = new User();
        user.setName("acai02");
        user.setAge(171);

        int i = userMapper.insertSelective(user);
        System.out.println(i);
    }

}
