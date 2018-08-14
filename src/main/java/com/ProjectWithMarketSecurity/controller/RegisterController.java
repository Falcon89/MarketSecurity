package com.ProjectWithMarketSecurity.controller;

import com.ProjectWithMarketSecurity.dto.RegisterUserDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class RegisterController {

    @PostMapping(value = "/register")
    public String register(@Valid RegisterUserDto registerUserDto){
//        validator next lessons

//        chek user name,email
//        set map
        return "redirect:login" ;
    }

}
