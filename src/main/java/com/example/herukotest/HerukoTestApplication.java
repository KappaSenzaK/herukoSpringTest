package com.example.herukotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class HerukoTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(HerukoTestApplication.class, args);
    }

}
