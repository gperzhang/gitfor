package com.mall.order.controller;

import com.mall.order.domain.User;
import com.mall.order.service.CustomFieldRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author acai
 * @date 2020/9/18
 **/
@RestController
@RequestMapping("/cache")
public class CacheController {
    @Resource
    private CustomFieldRepository customFieldRepository;

    @GetMapping("/find")
    public User find (@RequestParam("id") Integer id){
        return  customFieldRepository.findById(id);
    }

}
