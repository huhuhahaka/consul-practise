package com.fruits.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConfigApplicationTests {

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private Integer age;

    @Test
    void contextLoads() {
        System.out.println(name + " " + age);

    }

}
