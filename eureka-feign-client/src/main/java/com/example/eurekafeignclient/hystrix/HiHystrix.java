package com.example.eurekafeignclient.hystrix;

import com.example.eurekafeignclient.service.EurekaClientFeign;
import org.springframework.stereotype.Component;

/**
 * @Auther: 庞洋洋
 * @Date: 2018/10/31 11:41
 * @Description:
 */
@Component
public class HiHystrix implements EurekaClientFeign{

    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi, " + name + ", sorry error!!";
    }
}
