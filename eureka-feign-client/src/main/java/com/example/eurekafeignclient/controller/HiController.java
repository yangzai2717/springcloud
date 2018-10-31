package com.example.eurekafeignclient.controller;

import com.example.eurekafeignclient.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 庞洋洋
 * @Date: 2018/10/31 10:01
 * @Description:
 */
@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(required = false) String name){
        return hiService.sayHi(name);
    }
}
