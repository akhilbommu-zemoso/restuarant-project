package com.akhil.springproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class LoginController {

    @GetMapping("")
    public String showHomePage(){
        return "homepage";
    }
}
