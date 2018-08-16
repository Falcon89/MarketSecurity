package com.ProjectWithMarketSecurity.controller;

import com.ProjectWithMarketSecurity.dto.RegisterUserDto;
import com.ProjectWithMarketSecurity.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class RegisterController {
    @Autowired
private  UserService userService;


    @PostMapping(value = "/register")
    public String register(@Valid RegisterUserDto registerUserDto, BindingResult result,
                           @RequestParam String username,@RequestParam String email,
                           @RequestParam String password) {
//        validator next lessons
//        chek user name,email
//        set
        if (registerUserDto.getUsername() == null) {
            return "SignUpForm";
        }
        if (registerUserDto.getEmail() == null) {
            return "SignUpForm";
        } else {
            return "redirect:login";
        }
//        if (result.hasErrors()) {
//            return "SignUpForm";
//        } else {
//            return "Done";
//        }

    }

}
