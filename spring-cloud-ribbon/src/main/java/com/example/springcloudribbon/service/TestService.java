package com.example.springcloudribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class TestService {
    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return "service-ribbon:" + restTemplate.getForObject("http://SERVICE-CLIENT/hi?name="+name,String.class);
    }

    public String hiError(String name){
        return "hi," + name + ",sorry,error!";
    }
}
