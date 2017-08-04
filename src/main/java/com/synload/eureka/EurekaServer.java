package com.synload.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "register-server");
        SpringApplication.run(EurekaServer.class, args);
    }
}