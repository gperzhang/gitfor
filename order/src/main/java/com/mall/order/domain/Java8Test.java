package com.mall.order.domain;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author acai
 * @date 2020/9/1
 **/
public class Java8Test {
    /**
     * filter
     * distinct
     * groupingBy
     * limit
     * count
     * sort
     * findAny
     * findFirst
     * reduce
     *
     *
     */
    public Java8Test() {
    }
    public static void main(String[] args) {
        //1.类型转换List<Integer>转成List<Long>
        List<Integer> integerList = new ArrayList<>();
        for(int i=0;i<5;i++){
            integerList.add(i);
        }
        LongStream longStream = integerList.stream().mapToLong(e -> e);
        List<Long> collect = longStream.boxed().collect(Collectors.toList());


        //2.将一个list对象转成相应的map
        List<Person> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            Person person = new Person();
            person.setName("acai"+i);
            person.setAge(i);
            list.add(person);
        }
        Stream<Person> personStream = list.stream().filter(t -> t.getAge() > 3);
        List<Map<String, String>> mapList = list.stream().map(item -> {
            Map<String, String> map = new HashMap<>();
            String content = "value的值为" + item.getAge();
            map.put(item.getName(), content);
            return map;
        }).collect(Collectors.toList());

        //map的值还需要重新做一次转换的
        Map<String, Long> collect1 = list.stream().collect(Collectors.toMap(p->p.getName(), p -> Long.valueOf(p.getAge())));
        System.out.println(collect1);

        //3.将一个list bean转成另一个list的bean
        List<User> userList = list.stream().map(item -> {
            User user = new User();
            user.setName(item.getName());
            user.setAge(item.getAge());
            return user;
        }).collect(Collectors.toList());

        //4.分组计数
        List<String> items = Arrays.asList(
                "apple", "apple",
                "orange", "orange", "orange",
                "blueberry",
                "peach", "peach", "peach", "peach"
        );
        Map<String, Long> result = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);


        //5.分组转换
        List<Item> items01 = Arrays.asList(
                new Item("apple", 10, new BigDecimal(23.5)),
                new Item("apple", 20, new BigDecimal(32.5)),
                new Item("orange", 30, new BigDecimal(13.9)),
                new Item("orange", 20, new BigDecimal(32.5)),
                new Item("orange", 10, new BigDecimal(63.5)),
                new Item("orange", 50, new BigDecimal(41.5)),
                new Item("peach", 20, new BigDecimal(26.5)),
                new Item("peach", 30, new BigDecimal(32.5)),
                new Item("peach", 40, new BigDecimal(24.5)),
                new Item("peach", 10, new BigDecimal(12.5))
        );
        Map<BigDecimal, Set<String>> result01 = items01.stream()
                .collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getName, Collectors.toSet())));
        System.out.println(result01);

    }
}
