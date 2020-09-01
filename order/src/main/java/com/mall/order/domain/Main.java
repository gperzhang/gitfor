package com.mall.order.domain;

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
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person();
        person1.setName("zj1");
        person1.setAge(11);
        Person person2 = new Person();
        person2.setName("zj2");
        person2.setAge(22);
        personList.add(person1);
        personList.add(person2);

        Map<String, Person> collect = personList.stream().collect(Collectors.toMap(Person::getName, Function.identity()));

        for (Map.Entry<String, Person> entry : collect.entrySet()) {
            System.out.println(entry.getValue().getName()+"---"+entry.getValue().getAge());
        }


    }


}
