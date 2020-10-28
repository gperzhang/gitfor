package com.mall.order;

import com.mall.order.domain.User;
import com.mall.order.mapper.UserMapper;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

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
        user.setName("acai09");
        user.setAge(171);

        int i = userMapper.insertSelective(user);
        System.out.println(user.getId());
    }

    @Test
    public void testList(){
        List<User> userList = new ArrayList<>();
        User user1= new User();
        user1.setName("zhangsi");
        user1.setAge(19);
        userList.add(user1);
        User user2 = new User();
        user2.setName("lisan");
        user2.setAge(20);
        userList.add(user2);

        userMapper.insertBatch(userList);
    }

    @Test
    public void testTypeHandler(){
        User user = new User();
        user.setName("zj01");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);

        userMapper.insertSelective(user);
    }
    @Test
    public void testSelect(){
        User user = userMapper.selectUserById(25);

    }

}
