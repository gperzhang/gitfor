package com.mall.order.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.SingleServerConfig;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.redisson.config.Config;
import javax.annotation.Resource;

/**
 * @author acai
 * @date 2020/9/21
 **/
@Configuration
public class RedissonAutoConfiguration {

    @Resource
    private RedisProperties redisProperties;

    @Bean
    public RedissonClient redissonClient(){
        Config config = new Config();
        SingleServerConfig singleServerConfig = config.useSingleServer();
        String schema = redisProperties.isSsl() ? "rediss://" : "redis://";
        System.out.println(schema);
        singleServerConfig.setAddress(schema+redisProperties.getHost()+":"+redisProperties.getPort());
        singleServerConfig.setPassword(redisProperties.getPassword());
        return Redisson.create(config);
    }

}
