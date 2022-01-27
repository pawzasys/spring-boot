package com.wazir.springbootex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("/getname")
    public String getName(){
        return "Wazir Zubaid Ahamed";
    }

}
