package com.ProjectWithMarketSecurity.controller;




import com.ProjectWithMarketSecurity.entity.User;
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
    private UserService userService;

    @PostMapping(value = "/register")
    public String register(@Valid User user, BindingResult result,
                           @RequestParam String username, @RequestParam String email,
                           @RequestParam String password) {
        userService.save(new User(username,email,password));
        return "redirect:/index";
//        validator next lessons
//        chek user name,email
//        set
//
//        if (user.getUsername() == null) {
//            return "SignUpForm";
//        }
//        if (user.getEmail() == null) {
//            return "SignUpForm";
//        } else {
//            return "redirect:login";
//        }
//
//        userService.save(new User(username,email,password));
//        return "redirect:/index";
//        if (result.hasErrors()) {
//            return "SignUpForm";
//        } else {
//            return "Done";
//        }

    }

}
