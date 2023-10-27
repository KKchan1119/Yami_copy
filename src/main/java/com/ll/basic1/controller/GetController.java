package com.ll.basic1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getHello(){
        return "Hello World";
    }
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable){
        return variable;
    }
}
