package com.ProjectWithMarketSecurity.controller;


import com.ProjectWithMarketSecurity.dto.RegisterUserDto;
import com.ProjectWithMarketSecurity.entity.User;
import com.ProjectWithMarketSecurity.repository.UserRepository;
import com.ProjectWithMarketSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@ControllerAdvice
public class RegisterController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping(value = "/registration")
    public String register(@ModelAttribute("regDto") @Valid RegisterUserDto dto, BindingResult result) {
        User user = userRepository.findByUsername(dto.getUsername());
        if (user != null) {
            return "redirect:/404";
        }
        User newuser = User.builder()
                .username(dto.getUsername())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .enable(true)
                .build();
        userRepository.save(newuser);
        return "/adminpanel";
    }
}
