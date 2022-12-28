package com.example.responsibility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages = {"com.example.responsibility"})
public class ResponsibilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResponsibilityApplication.class, args);
    }

}
