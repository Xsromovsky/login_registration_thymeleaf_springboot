package com.project.login.registration.login_registration_thymeleaf_springboot.controller;


import com.project.login.registration.login_registration_thymeleaf_springboot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserService userService;

    //constructor
    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }
}
