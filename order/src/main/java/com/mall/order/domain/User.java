package com.mall.order.domain;

import lombok.Data;

import java.time.LocalDate;
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
    private List<Integer> title;
    private LocalDate gmtCreate;
    private LocalDate gmtModified;
}
