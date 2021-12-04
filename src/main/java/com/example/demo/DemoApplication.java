package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping("/welcome")
    public String welcome() {
        return "nguyen tien dong is coming";
    }

    @GetMapping("/nguyentiendong")
    public String home() {
        return "nguyen tien dong dep trai";
    }

    @GetMapping("/child")
    public String child() {
        return "nguyen thi thu hien";
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
