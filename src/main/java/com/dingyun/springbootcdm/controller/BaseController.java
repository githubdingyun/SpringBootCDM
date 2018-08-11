package com.dingyun.springbootcdm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class BaseController {



    @RequestMapping("admin")
    public String admin(){
        return "login";
    }


      @RequestMapping("购物车")
    public String admin1(){
        return "login";
    }


}


