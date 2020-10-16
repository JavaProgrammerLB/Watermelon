package com.yitianyigexiangfa.watermelon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hi")
    public String hi(){
        return "Hello, world";
    }

}
