package com.mall.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author acai
 * @date 2020/8/14
 **/
@Aspect
@Slf4j
@Order(1)
@Component
public class TestAspect {

    @Pointcut("execution(* com.mall.order.service.impl.OrderServiceImpl.handler(..))")
    public void mytest(){
    }


    @After("mytest()")
    public void notify(JoinPoint pig){
        System.out.println("进入切面。。。。。");
        Object[] args = pig.getArgs();
        String s = (String) args[0];

        System.out.println("通过切面拿到的参数为"+s);
    }

}
