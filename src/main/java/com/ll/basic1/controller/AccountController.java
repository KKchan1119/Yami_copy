package com.ll.basic1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @PostMapping("/login")
    public String PostTest(@RequestBody String msg){
        return "post success" + msg;
    }
}
