package com.mall.order.service.impl;

import com.mall.order.service.OrderService;

/**
 * @author acai
 * @date 2020/7/29
 **/
public class OrderServiceImpl implements OrderService {
    @Override
    public void handler(String orderId) {
        System.out.println("orderId:"+orderId);
    }
}
