package com.fruits.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("consul-provider")
public interface ITestService {

    @GetMapping("/provider/test")
    String test();

}
