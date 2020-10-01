package com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient//激活EurekaClient，与@EnableDiscoveryClient作用相同
public class ImgApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImgApplication.class,args);
    }
}

