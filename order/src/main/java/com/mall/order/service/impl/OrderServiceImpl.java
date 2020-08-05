package com.mall.order.service.impl;

import com.mall.order.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author acai
 * @date 2020/7/29
 **/
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String handler(String orderId) {
        System.out.println("orderId:"+orderId);
        return "orderId:"+orderId;
    }
}
