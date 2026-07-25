package com.example.practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class first {

    @RequestMapping("/")
    public String home() {
        return "Hello";
    }
}
