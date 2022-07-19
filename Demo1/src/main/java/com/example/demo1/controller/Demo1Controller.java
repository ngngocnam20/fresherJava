package com.example.demo1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {
    @GetMapping("/name")
    public String getName()
    {
        return "Ngoc Nam";
    }
}
