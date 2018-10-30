package com.example.eurekaribbonclient.controller;

import com.example.eurekaribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 庞洋洋
 * @Date: 2018/10/30 21:37
 * @Description:
 */
@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @GetMapping("/hi")
    public String hi(@RequestParam(required = false, defaultValue = "pyy")String name){
        return ribbonService.hi(name);
    }
}
