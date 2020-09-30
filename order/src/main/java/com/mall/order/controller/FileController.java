package com.mall.order.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author acai
 * @date 2020/9/23
 **/
@RestController
@RequestMapping("/file")
public class FileController {

    @PostMapping("/put")
    public String post(@RequestParam("file") MultipartFile file,@RequestParam("name") String name,
                        @RequestParam("age") Integer age) throws IOException {
        byte[] bytes = file.getBytes();
        System.out.println(bytes.length+"===="+name+"===="+age);
        return null;
    }
}
