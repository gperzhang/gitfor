package com.mall.order.domain;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author acai
 * @date 2020/8/7
 **/
@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
