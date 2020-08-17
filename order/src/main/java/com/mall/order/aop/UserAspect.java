package com.mall.order.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author acai
 * @date 2020/8/17
 **/
@Component
@Aspect
@Order(1)
public class UserAspect {

    @Pointcut("execution(* com.mall.order.service.impl.UserServiceImpl.insertUser(..))")
    public void hand(){

    }


    @After("hand()")
    public void test(JoinPoint pig){
        System.out.println("回滚之后还能执行切面");
    }
}
