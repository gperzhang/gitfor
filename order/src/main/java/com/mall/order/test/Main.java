package com.mall.order.test;

import com.mall.order.domain.Item;
import com.mall.order.domain.User;
import org.apache.commons.lang3.StringUtils;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author acai
 * @date 2020/9/4
 **/
public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
//        String s = "1标签组1123(xinde )";
//        String labelGroup = s.split("\\(")[0];
//
//        String regex = "[^0-9]";
//        Pattern compile = Pattern.compile(regex);
//        String indexStr = compile.matcher(labelGroup).replaceAll("").trim();
//
//        Integer index = Integer.valueOf(indexStr);
//
//        System.out.println(index);

//        List<User> array = new ArrayList<>();
//        User user1 = new User();
//        user1.setName("zhangjie");
//        user1.setAge(17);
//
//        User user2 = new User();
//        user2.setName("acai");
//        user2.setAge(5);
//        array.add(user1);
//        array.add(user2);
//
//        List<String> collect = Stream.iterate(0, i -> i + 1).limit(array.size()).map(i -> {
//            String name = "标签组" + (i+1) + "（" + array.get(i).getName() + "）";
//            return name;
//        }).collect(Collectors.toList());
//
//
//        collect.forEach(item-> System.out.println(item));



//        List<String> list = new ArrayList<>();
//        list.add("123");
//        list.add("456");
//
//        list.forEach(item->{
//            if(item.equals("123")){
//                System.out.println("if:"+item);
//                return;
//            }
//            System.out.println(item);
//        });

        String s = "";
        System.out.println(StringUtils.isEmpty(s));
    }
}
