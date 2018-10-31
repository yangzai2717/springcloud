package com.example.eurekaribbonclient.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: 庞洋洋
 * @Date: 2018/10/30 21:35
 * @Description:
 */
@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name){
        return restTemplate.getForObject("http://eureka-client/hi?name="+name, String.class);
    }

    public String hiError(String name){
        return "hi " + name + " ,sorry ,error!";
    }
}
