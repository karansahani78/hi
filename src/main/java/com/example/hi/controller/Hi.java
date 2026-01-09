package com.example.hi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hi {
    @GetMapping
    public String hi(){
        return "Hi there!";
    }
}
