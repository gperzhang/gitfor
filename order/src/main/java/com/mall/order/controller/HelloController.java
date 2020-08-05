package com.mall.order.controller;

import com.mall.order.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author acai
 * @date 2020/7/26
 **/
@Controller
public class HelloController {
    @Resource
    private HelloService helloService;

    @GetMapping("/test")
    @ResponseBody
    public String testMock(@RequestParam(value = "name") String name){
        String result = helloService.sayBye(name);
        return result;
    }
}
