package com.mall.order.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Service;



/**
 * @author acai
 * @date 2020/9/18
 **/
@Service
public class RedisUtils {

    private  RedisTemplate redisTemplate;
    private SetOperations<String, String> setOps;
    private ZSetOperations<String, String> zSetOps;
    private HashOperations<String, String, String> hashOps;
    private ValueOperations<String, String> valueOps;
    private ListOperations<String, String> listOps;


    @Autowired
    public RedisUtils(RedisTemplate<String, String> redisTemplate) {
        this.setOps = redisTemplate.opsForSet();
        this.zSetOps = redisTemplate.opsForZSet();
        this.hashOps = redisTemplate.opsForHash();
        this.valueOps = redisTemplate.opsForValue();
        this.listOps = redisTemplate.opsForList();
        this.redisTemplate = redisTemplate;
        System.out.println("使用有参构造================");
    }


    public String getKey(String key){
        return valueOps.get(key);
    }




}
