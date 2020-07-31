package com.mall.order.controller;

import com.mall.order.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author acai
 * @date 2020/7/26
 **/
@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;

    public static void main(){
        System.out.println(HelloService.class);
    }
    public String get(){
        return "123";
    }
}
