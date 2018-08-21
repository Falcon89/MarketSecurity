package com.ProjectWithMarketSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/","/index"})
    public String index(){
        return "index";
    }

    @GetMapping({"/users"})
    public String users (){
        return "users";
    }

    @GetMapping({"/project"})
    public String project(){
        return "project";
    }

}
