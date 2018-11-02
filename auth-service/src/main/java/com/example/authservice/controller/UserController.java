package com.example.authservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @Auther: 庞洋洋
 * @Date: 2018/10/31 21:10
 * @Description:
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping(value = "/current", method = RequestMethod.GET)
    public Principal getUer(Principal principal){
        return principal;
    }
}
