package com.example.springcloudhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
public class SpringCloudHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHystrixApplication.class, args);
    }

}
