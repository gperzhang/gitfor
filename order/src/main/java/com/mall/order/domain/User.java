package com.mall.order.domain;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author acai
 * @date 2020/8/7
 **/
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private LocalDate gmtCreate;
    private LocalDate gmtModified;
}
