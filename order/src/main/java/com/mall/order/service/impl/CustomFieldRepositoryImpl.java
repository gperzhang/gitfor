package com.mall.order.service.impl;

import com.mall.order.domain.User;
import com.mall.order.mapper.UserMapper;
import com.mall.order.service.CustomFieldRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;

/**
 * @author acai
 * @date 2020/9/18
 **/
@Repository
@CacheConfig(cacheManager = "cacheManager" , cacheNames = "cache")
@Slf4j
public class CustomFieldRepositoryImpl implements CustomFieldRepository {
    @Resource
    private UserMapper userMapper;
    @Override
    @Cacheable(key = "#id")
    public User findById(Integer id) {
        log.info("查询数据库=====================,id:{}",id);
        return userMapper.selectUserById(id);
    }
}
