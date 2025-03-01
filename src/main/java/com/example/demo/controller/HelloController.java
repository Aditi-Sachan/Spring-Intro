package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }





        @GetMapping("/hello/query")
        public String sayHello(@RequestParam String name) {
            return "Hello " + name + " from BridgeLabz";
        }
    }


