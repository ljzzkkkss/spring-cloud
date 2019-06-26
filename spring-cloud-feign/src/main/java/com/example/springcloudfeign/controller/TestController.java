package com.example.springcloudfeign.controller;

import com.example.springcloudfeign.service.SchedualServiceTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private SchedualServiceTest schedualServiceTest;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return "service-feign:" + schedualServiceTest.sayHiFromClientOne( name );
    }
}
