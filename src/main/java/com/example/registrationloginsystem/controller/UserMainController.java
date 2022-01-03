package com.example.registrationloginsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserMainController {
    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @GetMapping("/")
    public String homePage(){
        return "index";
    }
}
