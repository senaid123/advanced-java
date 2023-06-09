package com.example.demo4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    static String greeting(@RequestParam(name = "name", required = false, defaultValue = "world") String name,
                           Model model) {

            model.addAttribute("name", name);
            return "greeting";
        }
}
