package com.mall.order.controller;

import com.mall.order.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author acai
 * @date 2020/8/4
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    OrderService orderService;

    @GetMapping("/list")
    public String order(@RequestParam(value = "id") String id){
        String handler = orderService.handler(id);
        return handler;
    }
}
