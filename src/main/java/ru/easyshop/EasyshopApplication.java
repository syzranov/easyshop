package ru.easyshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EasyshopApplication {
    public static void main(String[] args) {
        SpringApplication.run(EasyshopApplication.class, args);
    }
}
