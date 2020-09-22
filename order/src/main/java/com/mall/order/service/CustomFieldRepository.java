package com.mall.order.service;

import com.mall.order.domain.User;

/**
 * @author acai
 * @date 2020/9/18
 **/
public interface CustomFieldRepository {
    /**
     * 通过id查找user
     * @param id
     * @return
     */
    User findById(Integer id);
}
