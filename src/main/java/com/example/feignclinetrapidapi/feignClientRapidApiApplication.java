package com.example.feignclinetrapidapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class feignClientRapidApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(feignClientRapidApiApplication.class, args);
    }

}
