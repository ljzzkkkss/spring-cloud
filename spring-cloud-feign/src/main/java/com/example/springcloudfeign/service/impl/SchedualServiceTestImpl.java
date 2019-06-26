package com.example.springcloudfeign.service.impl;

import com.example.springcloudfeign.service.SchedualServiceTest;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceTestImpl implements SchedualServiceTest {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
