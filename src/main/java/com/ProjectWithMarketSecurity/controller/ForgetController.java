package com.ProjectWithMarketSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForgetController {

    @GetMapping("/forget")
    public String forget(){
        return "forget";
    }

}
