package com.mall.order.service.impl;

import com.mall.order.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author acai
 * @date 2020/7/26
 **/
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(Long status,String title,int age,Boolean flag) {
        return "dev01:"+title+"--age:"+age;
    }

    @Override
    public String sayBye(String name) {
        return "sayBye:"+name;
    }

    @Override
    public int sayInt(int age) {
        System.out.println("djjsf");
        return 12;
    }
}
