package com.mall.order;

import com.google.common.collect.Lists;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
        ArrayList<Integer> list = Lists.newArrayList(1,2,3,4,5,6,7,8,9,10,11);


        List<List<Integer>> partition = Lists.partition(list, 3);

    }

}
