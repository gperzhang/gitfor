package com.mall.order.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author acai
 * @date 2020/8/21
 **/
public class Main {
    public static void main(String[] args) {
        List<person> personList = new ArrayList<>();
        person person1 = new person();
        person1.setName("zj1");
        person1.setAge(11);
        person person2 = new person();
        person2.setName("zj2");
        person2.setAge(22);
        personList.add(person1);
        personList.add(person2);

        Map<String, person> collect = personList.stream().collect(Collectors.toMap(person::getName, Function.identity()));

        for (Map.Entry<String, person> entry : collect.entrySet()) {
            System.out.println(entry.getValue().getName()+"---"+entry.getValue().getAge());
        }


    }


}
