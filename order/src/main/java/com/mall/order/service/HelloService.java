package com.mall.order.service;

import org.springframework.stereotype.Service;

/**
 * @author acai
 * @date 2020/7/26
 **/
@Service
public interface HelloService {
    String sayHello(Long status,String title,int age,Boolean flag);

    String sayBye(String name);
}
