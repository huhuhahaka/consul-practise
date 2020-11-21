package com.fruits.provider.controller;

import com.fruits.provider.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("provider")
public class ProviderController {

    @Autowired
    private User user;


    @GetMapping("/test")
    public String test(){
        return "我是提供者 2 " + user.getName();
    }

}
