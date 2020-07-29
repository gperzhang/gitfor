package com.mall.order.service;

/**
 * @author acai
 * @date 2020/7/29
 **/
public interface OrderService {
    void handler(String orderId);
    void request(String orderId);
}
