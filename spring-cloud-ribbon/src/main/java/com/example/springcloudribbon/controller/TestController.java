package com.example.springcloudribbon.controller;

import com.example.springcloudribbon.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping("/hi")
    public String hi(@RequestParam String name){
        return testService.hiService(name);
    }
}
