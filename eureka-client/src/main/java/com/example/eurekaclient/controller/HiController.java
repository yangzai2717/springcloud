package com.example.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 庞洋洋
 * @Date: 2018/10/30 20:25
 * @Description:
 */
@RestController
public class HiController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String home(@RequestParam("name")String name){
        return "hi :" + name + "i, am port" + port;
    }
}
