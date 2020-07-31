package com.smart.rest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {
    @GetMapping("/")
    public String member() {
        return "";
    }


    @GetMapping("/list/{page}/{size}")
    public String list(@PathVariable int page, @PathVariable int size) {
        return "";
    }

    @PutMapping("/")
    public String update() {
        return "";
    }

    @DeleteMapping("/")
    public String logout() {
        return "";
    }

}
