package com.example.crud.CRUD.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/sneha")
    public String printHello(){
        return "hello world";
    }
}
