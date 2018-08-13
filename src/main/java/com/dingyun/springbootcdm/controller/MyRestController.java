package com.dingyun.springbootcdm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

}