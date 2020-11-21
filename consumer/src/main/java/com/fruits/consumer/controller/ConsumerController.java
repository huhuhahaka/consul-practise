package com.fruits.consumer.controller;

import com.fruits.consumer.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private ITestService testService;

    @GetMapping("/test")
    public String test(){
        return testService.test();
    }

}
