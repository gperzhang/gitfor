package com.mall.order.controller;

import com.mall.order.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author acai
 * @date 2020/8/17
 **/
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/insert")
    public String insertUser(){
        userService.insertUser();
        return "sucessful";
    }

}
