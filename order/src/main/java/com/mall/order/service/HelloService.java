package com.mall.order.service;


/**
 * @author acai
 * @date 2020/7/26
 **/
public interface HelloService {
    String sayHello(Long status,String title,int age,Boolean flag);

    String sayBye(String name);

    int sayInt(int age);
}
