package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(){
        return "greeting";
    }
}
