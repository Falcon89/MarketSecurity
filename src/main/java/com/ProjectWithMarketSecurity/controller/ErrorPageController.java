package com.ProjectWithMarketSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorPageController {
    @RequestMapping(value ="/404")
    public ModelAndView error404(){
        return new ModelAndView("404");
    }
}
