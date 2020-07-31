package com.smart.rest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @PostMapping("/login")
    public String login() {
        return "";
    }

    public String register() {
        return "";
    }
}
